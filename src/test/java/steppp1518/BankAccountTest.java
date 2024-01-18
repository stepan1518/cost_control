package steppp1518;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import steppp1518.database.BankAccount;
import steppp1518.database.BankAccountRepository;
import steppp1518.database.Category;
import steppp1518.database.Waste;
import steppp1518.service.BankAccountService;
import steppp1518.service.WastesService;

import java.math.BigDecimal;
import java.util.Collection;

@SpringBootTest
public class BankAccountTest {
//    @Autowired
//    WastesService wastesService;
//    @Autowired
//    BankAccountService bankAccountService;

//    @Test
//    public void wastesTest() {
//        var accounts = bankAccountService.get_accounts("user").stream().toList();
//
//        for (int i = 0; i < 100; i++) {
//            var waste = new Waste();
//            waste.setCategory(Category.FAST_FOOD);
//            waste.setAccount(accounts.get(2).getId());
//            waste.setEmail("user");
//            waste.setAmount(new BigDecimal(300));
//            wastesService.addWaste(waste);
//        }
//    }
}
