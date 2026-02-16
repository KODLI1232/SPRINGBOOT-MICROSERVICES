package Com.self.SpringBoot.Request;

import java.math.BigDecimal;
import java.util.List;

import Com.self.SpringBoot.Entity.TransactionEntity;

public class AccountRequest {

	private Long id;

    private String username;

    private String password;

    private BigDecimal balance;

  
    private List<TransactionEntity> transactions;

   
    public AccountRequest() {}

    public AccountRequest(String username, String password, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }
    
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<TransactionEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionEntity> transactions) {
        this.transactions = transactions;
    }
}
