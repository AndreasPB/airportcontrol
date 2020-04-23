package gruppe3.airportcontrol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlleren er bare sat op for at kunne lave en demo af hjemmesiden
 * @Andreas
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String login(Model model) {
        return ("login");
    }

    @PostMapping("/login")
    public String login() {

        return "redirect:/ground_crew_oversigt";
    }

    @GetMapping("/ground_crew_oversigt")
    public String oversigtGroundCrew(Model model) {
        return ("ground_crew_oversigt");
    }

    @GetMapping("/ground_crew_aktiviteter_arrival")
    public String aktiviteterA(Model model) {
        return ("ground_crew_aktiviteter_arrival");
    }

    @GetMapping("/ground_crew_aktiviteter_departure")
    public String aktiviteterD(Model model) {
        return ("ground_crew_aktiviteter_departure");
    }

    @GetMapping("/flyleder_jordkontrol_oversigt")
    public String oversigtFlyleder(Model model) {
        return ("flyleder_jordkontrol_oversigt");
    }

    @GetMapping("/flyleder_jordkontrol_aktiviteter")
    public String aktiviteterlyleder(Model model) {
        return ("flyleder_jordkontrol_aktiviteter");
    }
}
