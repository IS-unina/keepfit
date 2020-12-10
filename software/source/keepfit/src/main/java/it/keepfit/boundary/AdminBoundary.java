package it.keepfit.boundary;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import it.keepfit.entity.Abbonato;

@Controller
public interface AdminBoundary {

    public String aggiungiAbbonato(@ModelAttribute("nuovoAbbonato") Abbonato nuovoAbbonato);

    public String rimuoviAbbonato(@PathParam("id") int id);

    @GetMapping("/abbonati")
    public String visualizzaElencoAbbonati(String nome, String cognome, String stato);

    @GetMapping("/abbonati/{id}")
    public String visualizzaDettaglioAbbonato(@PathParam("id") int id);

    public String modificaAbbonato(@ModelAttribute("abbonato") Abbonato abbonato);

    public String promuoviAbbonatoAPremium(@PathParam("id") int id);
}
