package spring.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value="/", method= {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model) {
        model.addAttribute("hello", "Hello World!!!!");
        return "index";
    }

}