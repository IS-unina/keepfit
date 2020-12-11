package it.keepfit.boundary;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.keepfit.entity.Abbonato;

@Controller
public interface AdminBoundary {

    @GetMapping("/")
    public String viewHomePage();

    @GetMapping("/admin/nuovoAbbonato")
    public String mostraFormNuovoAbbonato();

    @PostMapping("/admin/salvaAbbonato")
    public String aggiungiAbbonato(@ModelAttribute("nuovoAbbonato") Abbonato nuovoAbbonato);

    @DeleteMapping("/admin/abbonati/{id}")
    public String rimuoviAbbonato(@PathParam("id") int id);

    @GetMapping("/admin/abbonati")
    public String visualizzaElencoAbbonati(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
	    @RequestParam("stato") String stato, Model model);

    @GetMapping("/admin/abbonati/{id}")
    public String visualizzaDettaglioAbbonato(@PathParam("id") int id);

    @GetMapping("/admin/modificaAbbonato/{id}")
    public String modificaAbbonato(@PathParam("id") int id, Model model);

    @PutMapping("/admin/creaAccount")
    public String creaAccountPerAbbonato(@ModelAttribute("abbonato") Abbonato abbonato);
}
