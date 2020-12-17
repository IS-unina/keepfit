/*
 * 
 */
package it.keepfit.boundary.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import it.keepfit.boundary.AdminBoundary;
import it.keepfit.control.AdminController;
import it.keepfit.entity.Abbonamento;
import it.keepfit.entity.Abbonato;

/**
 * The Class AdminBoundaryImpl.
 */
@Component
public class AdminBoundaryImpl implements AdminBoundary {

    /** The logger. */
    private static Logger LOGGER = LoggerFactory.getLogger(AdminBoundaryImpl.class);

    /** The admin controller. */
    @Autowired
    private AdminController adminController;

    /**
     * View home page.
     *
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String viewHomePage() {
	LOGGER.info("carico la home page dell'admin..");
	return "index";
    }

    /**
     * Salva abbonato.
     *
     * @param nuovoAbbonato the nuovo abbonato
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String salvaAbbonato(Abbonato nuovoAbbonato, Model model) {
	nuovoAbbonato.getAbbonamento().setAbbonato(nuovoAbbonato);
	String page = "redirect:/admin/abbonati?nome=&cognome=&stato=";
	try {
	    adminController.aggiungiAbbonato(nuovoAbbonato);
	} catch (RuntimeException e) {
	    page = "errore";
	    model.addAttribute("messaggioErrore", e.getMessage());
	}
	return page;
    }

    /**
     * Rimuovi abbonato.
     *
     * @param id id abbonato
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String rimuoviAbbonato(long id) {
	adminController.eliminaAbbonato(id);
	return "redirect:/admin/abbonati?nome=&cognome=&stato=";
    }

    /**
     * Visualizza elenco abbonati.
     *
     * @param nome    nome
     * @param cognome cognome
     * @param stato   stato abbonamento
     * @param model   il model
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String visualizzaElencoAbbonati(String nome, String cognome, String stato, Model model) {
	LOGGER.info("cerco gli abbonati..");
	List<Abbonato> abbonati = adminController.ricercaAbbonati(nome, cognome, stato);
	Boolean elencoEmpty;
	if (abbonati == null || abbonati.isEmpty()) {
	    elencoEmpty = true;
	} else {
	    elencoEmpty = false;
	}
	model.addAttribute("elencoEmpty", elencoEmpty);
	model.addAttribute("abbonati", abbonati);
	LOGGER.info("carico elenco abbonati..");
	return "elencoAbbonati";
    }

    /**
     * Visualizza dettaglio abbonato.
     *
     * @param id    id abbonato
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String visualizzaDettaglioAbbonato(int id, Model model) {
	LOGGER.info("recupero l'abbonato..");
	Abbonato trovato = adminController.ricercaAbbonato(id);
	LOGGER.info(trovato.toString());
	model.addAttribute("abb", trovato);
	return "dettaglioAbbonato";
    }

    /**
     * Modifica abbonato.
     *
     * @param id    id abbonato
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String modificaAbbonato(long id, Model model) {
	LOGGER.info("recupero l'abbonato..");
	Abbonato trovato = adminController.ricercaAbbonato(id);
	LOGGER.info(trovato.toString());
	model.addAttribute("abbonatoTrovato", trovato);
	return "modificaAbbonato";
    }

    /**
     * Crea account per abbonato.
     *
     * @param abbonato the abbonato
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String creaAccountPerAbbonato(Abbonato abbonato) {
	// TODO Auto-generated method stub
	return "";
    }

    /**
     * Mostra form nuovo abbonato.
     *
     * @param model il model
     * @return il nome della pagina html da renderizzare
     */
    @Override
    public String mostraFormNuovoAbbonato(Model model) {
	Abbonato nuovoAbbonato = new Abbonato();
	nuovoAbbonato.setAbbonamento(new Abbonamento());
	model.addAttribute("nuovoAbbonato", nuovoAbbonato);
	return "nuovoAbbonato";
    }

}
