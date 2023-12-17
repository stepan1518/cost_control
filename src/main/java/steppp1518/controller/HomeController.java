package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import steppp1518.beans.Client;
import steppp1518.beans.User;
import steppp1518.beans.UserService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    @Qualifier("userCollectionService")
    private UserService _user_service;

    @GetMapping
    private User getClient(@RequestBody String email) {
        return _user_service.getUser(email);
    }

    @PostMapping("/add_client")
    private ResponseEntity addClient(@RequestBody Client client) {
        _user_service.addUser(client);
        System.out.print(_user_service.getUser(client.get_email()));
        return ResponseEntity.ok().build();
    }

    @PostMapping("/charge_procent")
    private ResponseEntity chargeProcent() {
        return ResponseEntity.ok().build();
    }
}
