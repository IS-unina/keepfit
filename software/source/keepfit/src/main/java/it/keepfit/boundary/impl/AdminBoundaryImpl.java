package it.keepfit.boundary.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import it.keepfit.boundary.AdminBoundary;
import it.keepfit.control.AdminController;
import it.keepfit.entity.Abbonato;

@Component
public class AdminBoundaryImpl implements AdminBoundary {

    private static Logger LOGGER = LoggerFactory.getLogger(AdminBoundaryImpl.class);

    @Autowired
    private AdminController adminController;

    @Override
    public String viewHomePage() {
	LOGGER.info("carico la home page dell'admin..");
	return "index";
    }

    @Override
    public String aggiungiAbbonato(Abbonato nuovoAbbonato) {
	adminController.aggiungiAbbonato(nuovoAbbonato);
	return "redirect:/admin/abbonati";
    }

    @Override
    public String rimuoviAbbonato(int id) {
	// TODO Auto-generated method stub
	return "";
    }

    @Override
    public String visualizzaElencoAbbonati(String nome, String cognome, String stato, Model model) {
	LOGGER.info("cerco gli abbonati..");
	List<Abbonato> abbonati = adminController.ricercaAbbonati(nome, cognome, stato);
	model.addAttribute("abbonati", abbonati);
	LOGGER.info("carico elenco abbonati..");
	return "elencoAbbonati";
    }

    @Override
    public String visualizzaDettaglioAbbonato(int id) {
	// TODO Auto-generated method stub
	return "dettaglioAbbonato";
    }

    @Override
    public String modificaAbbonato(int id, Model model) {
	Abbonato trovato = adminController.ricercaAbbonato(id);
	model.addAttribute("abbonatoTrovato", trovato);
	return "modificaAbbonato";
    }

    @Override
    public String creaAccountPerAbbonato(Abbonato abbonato) {
	// TODO Auto-generated method stub
	return "";
    }

    @Override
    public String mostraFormNuovoAbbonato() {
	// TODO Auto-generated method stub
	return "nuovoAbbonato";
    }

}
