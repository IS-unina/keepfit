package it.keepfit.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.keepfit.entity.Abbonato;

@Controller
public interface AdminBoundary {

    @GetMapping("/")
    public String viewHomePage();

    @GetMapping("/admin/nuovoAbbonato")
    public String mostraFormNuovoAbbonato(Model model);

    @PostMapping("/admin/salvaAbbonato")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String salvaAbbonato(@ModelAttribute("nuovoAbbonato") Abbonato nuovoAbbonato);

    @GetMapping("/admin/rimuoviAbbonato/{id}")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String rimuoviAbbonato(@PathVariable("id") long id);

    @GetMapping("/admin/abbonati")
    public String visualizzaElencoAbbonati(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
	    @RequestParam("stato") String stato, Model model);

    @GetMapping("/admin/abbonati/{id}")
    public String visualizzaDettaglioAbbonato(@PathVariable("id") int id);

    @GetMapping("/admin/modificaAbbonato/{id}")
    public String modificaAbbonato(@PathVariable("id") long id, Model model);

    @PutMapping("/admin/creaAccount")
    public String creaAccountPerAbbonato(@ModelAttribute("abbonato") Abbonato abbonato);
}
