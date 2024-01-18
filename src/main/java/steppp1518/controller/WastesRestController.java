package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import steppp1518.database.Client;
import steppp1518.database.Waste;
import steppp1518.service.WastesService;

import java.util.Collection;

@RestController
@RequestMapping(value = "/client")
public class WastesRestController {
    @Autowired
    @Qualifier("wastesDBService")
    private WastesService wastesService;

    @GetMapping("/get_wastes")
    private Collection<Waste> getWastes(@AuthenticationPrincipal Client client) {
        return wastesService.getWastes(client.getEmail());
    }

    @PostMapping("/add_waste")
    private ResponseEntity addWaste(@RequestBody Waste waste) {
        wastesService.addWaste(waste);
        return ResponseEntity.ok().build();
    }
}
