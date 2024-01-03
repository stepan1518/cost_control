package steppp1518;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import steppp1518.database.Category;
import steppp1518.database.Waste;
import steppp1518.database.WastesRepository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

@SpringBootTest
public class WastesTest {
    @Autowired
    WastesRepository wastesRepository;

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

    @Test
    public void get_wastes() {
        Collection<Waste> wastes = wastesRepository.findByEmail("user");
        assert wastes.size() == 1;
    }
}
