/*
 * 
 */
package it.keepfit.boundary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// TODO: Auto-generated Javadoc
/**
 * The Interface AbbonatoBoundary.
 */
@Controller
public interface AbbonatoBoundary {

    /**
     * Visualizza elenco esercizi.
     *
     * @return the string
     */
    @GetMapping("/esercizi")
    public String visualizzaElencoEsercizi();

    /**
     * Visualizza dettaglio esercizio.
     *
     * @param id the id
     * @return the string
     */
    @GetMapping("esercizi/{id}")
    public String visualizzaDettaglioEsercizio(@PathVariable("id") int id);
}
