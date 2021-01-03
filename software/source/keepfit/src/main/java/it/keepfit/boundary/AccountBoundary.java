/*
 * 
 */
package it.keepfit.boundary;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// TODO: Auto-generated Javadoc
/**
 * The Interface AccountBoundary.
 */
@Controller
public interface AccountBoundary {

    /**
     * Visualizza elenco protocolli.
     *
     * @return the string
     */
    @GetMapping("/protocolli")
    public String visualizzaElencoProtocolli();

    /**
     * Visualizza protocollo.
     *
     * @param id the id
     * @return the string
     */
    @GetMapping("/protocolli/{id}")
    public String visualizzaProtocollo(@PathParam("id") int id);
}
