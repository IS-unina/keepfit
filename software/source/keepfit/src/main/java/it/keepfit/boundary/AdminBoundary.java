/*
 * 
 */
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

/**
 * Interfaccia boundary per le operazioni dell'admin.
 */
@Controller
public interface AdminBoundary {

    /**
     * View home page.
     *
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/")
    public String viewHomePage();

    /**
     * Mostra form nuovo abbonato.
     *
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/admin/nuovoAbbonato")
    public String mostraFormNuovoAbbonato(Model model);

    /**
     * Salva abbonato.
     *
     * @param nuovoAbbonato the nuovo abbonato
     * @return il nome della pagina html da renderizzare
     */
    @PostMapping("/admin/salvaAbbonato")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String salvaAbbonato(@ModelAttribute("nuovoAbbonato") Abbonato nuovoAbbonato, Model model);

    /**
     * Rimuovi abbonato.
     *
     * @param id id dell'abbonato
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/admin/rimuoviAbbonato/{id}")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String rimuoviAbbonato(@PathVariable("id") long id);

    /**
     * Visualizza elenco abbonati.
     *
     * @param nome    nome
     * @param cognome cognome
     * @param stato   stato abbonamento
     * @param model   model
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/admin/abbonati")
    public String visualizzaElencoAbbonati(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome,
	    @RequestParam("stato") String stato, Model model);

    /**
     * Visualizza dettaglio abbonato.
     *
     * @param id    id abbonato
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/admin/abbonati/{id}")
    public String visualizzaDettaglioAbbonato(@PathVariable("id") int id, Model model);

    /**
     * Modifica abbonato.
     *
     * @param id    id abbonato
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @GetMapping("/admin/modificaAbbonato/{id}")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String modificaAbbonato(@PathVariable("id") long id, Model model);

    /**
     * Crea account per abbonato.
     *
     * @param abbonato l'abbonato
     * @return il nome della pagina html da renderizzare
     */
    @PutMapping("/admin/creaAccount")
    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    public String creaAccountPerAbbonato(@ModelAttribute("abbonato") Abbonato abbonato);
}
