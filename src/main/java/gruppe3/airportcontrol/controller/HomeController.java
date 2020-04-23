package gruppe3.airportcontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(Model model) {
        return ("index");
    }

    @GetMapping("/oversigt")
    public String oversigt(Model model) {
        return ("oversigt");
    }
}