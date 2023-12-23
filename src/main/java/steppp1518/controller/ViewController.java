package steppp1518.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import steppp1518.service.Client;

@Controller
@RequestMapping(value = "/")
public class ViewController {
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
        System.out.println(client.getEmail());
        return "home_page";
    }

    @RequestMapping("/wallet")
    public String wallet() {return "wallet";}
}
