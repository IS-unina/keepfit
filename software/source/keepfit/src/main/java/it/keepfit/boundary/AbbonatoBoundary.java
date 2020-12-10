package it.keepfit.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public interface AbbonatoBoundary {

    @GetMapping("/esercizi")
    public String visualizzaElencoEsercizi();

    @GetMapping("esercizi/{id}")
    public String visualizzaDettaglioEsercizio(@PathVariable("id") int id);
}
