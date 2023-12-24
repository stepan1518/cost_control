package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import steppp1518.database.Client;
import steppp1518.database.ClientRepository;

@Controller
@RequestMapping(value = "/")
public class ViewController {
    @Autowired
    private ClientRepository clientRepository;
    @RequestMapping("/")
    public String start_page() {return "redirect:/home";}

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String homePage() {
        clientRepository.deleteAll();
        return "home_page";
    }

    @GetMapping("/registration")
    public String registration_page() {
        return "registration";
    }

    @PostMapping("/registration")
    public String add_client(@ModelAttribute Client client) {
        clientRepository.save(client);
        return "home_page";
    }

    @RequestMapping("/wallet")
    public String wallet() {return "wallet";}
}
