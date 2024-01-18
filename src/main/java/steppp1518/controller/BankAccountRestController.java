package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import steppp1518.database.BankAccount;
import steppp1518.database.Client;
import steppp1518.service.BankAccountService;

import java.util.Collection;

@RestController
@RequestMapping("/client")
public class BankAccountRestController {
    @Autowired
    @Qualifier("bankAccountDBService")
    BankAccountService bankAccountService;

    @GetMapping("/get_bank_accounts")
    private Collection<BankAccount> getBankAccounts(@AuthenticationPrincipal Client client) {
        return bankAccountService.get_accounts(client.getEmail());
    }
}
