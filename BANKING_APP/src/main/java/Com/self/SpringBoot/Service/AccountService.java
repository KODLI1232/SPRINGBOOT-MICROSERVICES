package Com.self.SpringBoot.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Dtos.AccountRegisterDto;
import Com.self.SpringBoot.Dtos.AccountResponseDto;
import Com.self.SpringBoot.Entity.AccountEntity;
import Com.self.SpringBoot.Entity.CustomerEntity;
import Com.self.SpringBoot.Entity.TransactionEntity;
import Com.self.SpringBoot.Mapper.AccountMapper;
import Com.self.SpringBoot.Repository.AccountRepository;
import Com.self.SpringBoot.Repository.CustomerRepository;
import Com.self.SpringBoot.Repository.TransactionRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private CustomerRepository customerRepository;

    // Register using DTO
    public AccountResponseDto registerAccount(AccountRegisterDto request) {

        CustomerEntity customer = customerRepository.findById(request.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer doesn't exist"));

        if (accountRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new RuntimeException("User Already Exists");
        }

        AccountEntity account = new AccountEntity();
        account.setUsername(request.getUsername());
        account.setPassword(request.getPassword());
        account.setBalance(BigDecimal.ZERO);
        account.setCustomerEntity(customer);

        AccountEntity saved = accountRepository.save(account);
        return AccountMapper.toDto(saved);
    }

    public AccountResponseDto findAccountByUsername(String username) {
        AccountEntity entity = accountRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Account Not Found"));
        return AccountMapper.toDto(entity);
    }

    public void deposit(String username, BigDecimal amount) {
        AccountEntity account = accountRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Account Not Found"));

        account.setBalance(account.getBalance().add(amount));
        accountRepository.save(account);

        transactionRepository.save(new TransactionEntity(amount, "Deposit", LocalDateTime.now(), account));
    }

    public void withdraw(String username, BigDecimal amount) {
        AccountEntity account = accountRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Account Not Found"));

        if (account.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient Funds");
        }

        account.setBalance(account.getBalance().subtract(amount));
        accountRepository.save(account);

        transactionRepository.save(new TransactionEntity(amount, "Withdraw", LocalDateTime.now(), account));
    }
}
