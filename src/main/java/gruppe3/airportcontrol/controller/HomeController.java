package gruppe3.airportcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(Model model) {
        return ("ground_crew_all");
    }

    @GetMapping("/ground_crew_aktiviteter")
    public String oversigt(Model model) {
        return ("ground_crew_aktiviteter");
    }
}