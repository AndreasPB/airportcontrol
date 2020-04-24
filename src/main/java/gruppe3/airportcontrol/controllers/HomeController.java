package gruppe3.airportcontrol.controllers;

import gruppe3.airportcontrol.models.Ankomst_afgang;
import gruppe3.airportcontrol.models.Fly_model;
import gruppe3.airportcontrol.models.Fly_stoerrelse;
import gruppe3.airportcontrol.models.Selskab;
import gruppe3.airportcontrol.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Controlleren er bare sat op for at kunne lave en demo af hjemmesiden
 * @Andreas
 */

@Controller
public class HomeController
{
    @Autowired
    private AnkomstAfgangService ankomstAfgangService;

    @Autowired
    private SelskabService selskabService;

    @Autowired
    private TaxiAktivitetService taxiAktivitetService;

    @Autowired
    private Fly_modelService fly_modelService;

    @Autowired
    private FlyStoerrelseService flyStoerrelseService;


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
    public String oversigtFlyleder(Model model)
    {
        model.addAttribute("ankomstAfgang", ankomstAfgangService.findAll());
        /*
        model.addAttribute("selskab", selskabService.findAll());
        model.addAttribute("taxiAktivitet", taxiAktivitetService.findAll());
        model.addAttribute("modelNavn", fly_modelService.findAll());
        model.addAttribute("flyStoerrelse", flyStoerrelseService.findAll());

         */
        return ("flyleder_jordkontrol_oversigt");
    }

    @GetMapping("/flyleder_jordkontrol_aktiviteter")
    public String aktiviteterlyleder(Model model) {
        return ("flyleder_jordkontrol_aktiviteter");
    }
}
