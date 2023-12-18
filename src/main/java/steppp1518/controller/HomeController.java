package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import steppp1518.beans.Client;
import steppp1518.beans.User;
import steppp1518.beans.UserService;
import steppp1518.beans.Waste;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    @Qualifier("userCollectionService")
    private UserService _user_service;

    @GetMapping("/get_client")
    private User getClient(@RequestBody String email) {
        return _user_service.getUser(email);
    }

    @PostMapping("/add_client")
    private ResponseEntity addClient(@RequestBody Client client) {
        _user_service.addUser(client);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add_waste")
    private ResponseEntity addWaste(@RequestBody Waste waste) {
        _user_service.addWaste(waste);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_wastes")
    private List<Waste> getWaste(@RequestBody String email) {
        return _user_service.getWastes(email);
    }
}
