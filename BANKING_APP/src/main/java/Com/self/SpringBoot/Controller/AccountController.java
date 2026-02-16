package Com.self.SpringBoot.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.self.SpringBoot.Dtos.AccountRegisterDto;
import Com.self.SpringBoot.Dtos.AccountResponseDto;
import Com.self.SpringBoot.Service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public String register(@RequestBody AccountRegisterDto request) {
         accountService.registerAccount(request);
         return "Customer Registered successfully: "+request.getUsername();
    }

    @GetMapping("/{username}")
    public AccountResponseDto getAccount(@PathVariable String username) {
        return accountService.findAccountByUsername(username);
    }

    @PostMapping("/{username}/deposit")
    public String deposit(@PathVariable String username,
                          @RequestParam BigDecimal amount) {
        accountService.deposit(username, amount);
        return "Deposit successful. Amount: " + amount;
    }

    @PostMapping("/{username}/withdraw")
    public String withdraw(@PathVariable String username,
                           @RequestParam BigDecimal amount) {
        accountService.withdraw(username, amount);
        return "Withdraw successful. Amount: " + amount;
    }
}
