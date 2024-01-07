package steppp1518;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import steppp1518.database.Category;
import steppp1518.database.Waste;
import steppp1518.service.WastesService;

import java.math.BigDecimal;

@SpringBootTest
public class WastesTest {
    @Autowired
    WastesService wastesService;

//    @Test
//    public void add_waste() {
//        entityManager.clear();
//    }

//    @Test
//    public void get_wastes() {
//        wastesRepository.deleteAll();
//        Collection<Waste> wastes = wastesService.getWastes("abcd");
//        assert wastes.size() == 0;
//    }

//    @Test
//    public void add_wastes() throws CloneNotSupportedException, InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            var waste1 = new Waste();
//            waste1.setAmount(new BigDecimal(100.0));
//            waste1.setCategory(Category.SUPERMARKETS);
//            waste1.setEmail("abcd");
//
//            var waste2 = new Waste();
//            waste2.setAmount(new BigDecimal(100.0));
//            waste2.setCategory(Category.FAST_FOOD);
//            waste2.setEmail("abcd");
//
//            var waste3 = new Waste();
//            waste3.setAmount(new BigDecimal(100.0));
//            waste3.setCategory(Category.STUDY);
//            waste3.setEmail("abcd");
//
//            new Thread(() -> {wastesService.addWaste(waste1);}).start();
//            new Thread(() -> {wastesService.addWaste(waste2);}).start();
//            new Thread(() -> {wastesService.addWaste(waste3);}).start();
//        }
//        Thread.sleep(3000);
//    }
}
