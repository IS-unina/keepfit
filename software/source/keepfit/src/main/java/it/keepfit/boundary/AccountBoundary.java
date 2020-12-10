package it.keepfit.boundary;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface AccountBoundary {

    @GetMapping("/protocolli")
    public String visualizzaElencoProtocolli();

    @GetMapping("/protocolli/{id}")
    public String visualizzaProtocollo(@PathParam("id") int id);
}
