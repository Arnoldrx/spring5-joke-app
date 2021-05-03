package guru.springframework.spring5jokeapp.controllers;

import guru.springframework.spring5jokeapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    private final JokesService jokesService;

    public QuotesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showQuotes(Model model) {

        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
