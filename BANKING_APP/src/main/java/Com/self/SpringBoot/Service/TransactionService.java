package Com.self.SpringBoot.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Dtos.AccountResponseDto;
import Com.self.SpringBoot.Entity.TransactionEntity;
import Com.self.SpringBoot.Repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // Save a transaction
    public TransactionEntity save(TransactionEntity transaction) {
        return transactionRepository.save(transaction);
    }

    //Get all transactions by Account
    public List<TransactionEntity> getTransactionsByAccount(AccountResponseDto account) {
        return transactionRepository.findByAccountEntity_Id(account.getId());
    }

    // Get all transactions
    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

	
}

