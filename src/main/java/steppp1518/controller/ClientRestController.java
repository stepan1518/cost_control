package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import steppp1518.database.Waste;
import steppp1518.service.WastesService;

import java.util.Collection;

@RestController
@RequestMapping(value = "/client")
public class ClientRestController {
    @Autowired
    @Qualifier("wastesDBService")
    private WastesService wastesService;

    @PostMapping("/get_wastes")
    private Collection<Waste> getWastes(@RequestBody String email) {
        return wastesService.getWastes(email);
    }
}
