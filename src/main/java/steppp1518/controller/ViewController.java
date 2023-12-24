package steppp1518.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import steppp1518.database.Client;
import steppp1518.database.ClientRepository;
import steppp1518.service.UserService;

@Controller
@RequestMapping(value = "/")
public class ViewController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String start_page() {return "redirect:/home";}

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String homePage() {
        return "home_page";
    }

    @GetMapping("/registration")
    public String registration_page() {
        return "registration";
    }

    @PostMapping("/registration")
    public String add_client(@ModelAttribute Client client) {
        boolean response = userService.addUser(client);
        if (!response) return "registration";
        return "login";
    }

    @RequestMapping("/wallet")
    public String wallet() {return "wallet";}
}
