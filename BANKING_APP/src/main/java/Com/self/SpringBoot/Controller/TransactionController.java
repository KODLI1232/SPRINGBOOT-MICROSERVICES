package Com.self.SpringBoot.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Com.self.SpringBoot.Dtos.AccountResponseDto;
import Com.self.SpringBoot.Entity.TransactionEntity;
import Com.self.SpringBoot.Service.AccountService;
import Com.self.SpringBoot.Service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private AccountService accountService;

    // Get all transactions for a user
    @GetMapping("/{username}")
    public List<TransactionEntity> getUserTransactions(@PathVariable String username) {

        AccountResponseDto account = accountService.findAccountByUsername(username);
        return transactionService.getTransactionsByAccount(account);
    }

    // Get all transactions (Admin use)
    @GetMapping
    public List<TransactionEntity> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}

