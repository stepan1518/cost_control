package steppp1518;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import steppp1518.database.Category;
import steppp1518.database.Waste;
import steppp1518.database.WastesRepository;
import steppp1518.service.WastesService;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

@SpringBootTest
public class WastesTest {
    @Autowired
    WastesService wastesService;

//    @Test
//    public void add_waste() {
//        var waste = new Waste();
//        waste.setDate(new Date());
//        waste.setEmail("user");
//        waste.setCategory(Category.STUDY);
//        waste.setAmount(new BigDecimal(200.0));
//
//        wastesRepository.save(waste);
//
//        assert true;
//    }

//    @Test
//    public void get_wastes() {
//        wastesRepository.deleteAll();
//        Collection<Waste> wastes = wastesService.getWastes("abcd");
//        assert wastes.size() == 0;
//    }

    @Test
    public void add_wastes() throws CloneNotSupportedException, InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            var waste1 = new Waste();
//            waste1.setAmount(new BigDecimal(100.0));
//            waste1.setCategory(Category.SUPERMARKETS);
//            waste1.setEmail("abcd");
//
//            var waste2 = new Waste();
//            waste1.setAmount(new BigDecimal(100.0));
//            waste1.setCategory(Category.FAST_FOOD);
//            waste1.setEmail("abcd");
//
//            var waste3 = new Waste();
//            waste1.setAmount(new BigDecimal(100.0));
//            waste1.setCategory(Category.STUDY);
//            waste1.setEmail("abcd");
//
//            new Thread(() -> {wastesService.addWaste(waste1);}).start();
//            new Thread(() -> {wastesService.addWaste(waste2);}).start();
//            new Thread(() -> {wastesService.addWaste(waste3);}).start();
//        }
//        wastesService.removeWastesForEmail("abcd");
    }
}
