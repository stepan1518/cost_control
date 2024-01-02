package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import steppp1518.database.Category;
import steppp1518.database.Client;
import steppp1518.database.Waste;
import steppp1518.database.WastesRepository;
import steppp1518.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientRestController {
    @Autowired
    private WastesRepository wastesRepository;

    @PostMapping("/get_wastes")
    private List<Waste> getWastes(@RequestBody String email) {
        List<Waste> wastes = new ArrayList<>();
        wastesRepository.findAll().forEach(waste -> wastes.add(waste));
        return wastes;
    }
}
