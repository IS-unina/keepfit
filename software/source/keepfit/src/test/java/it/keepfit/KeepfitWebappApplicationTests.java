package it.keepfit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;

@SpringBootTest
class KeepfitWebappApplicationTests {

    @Autowired
    private AbbonatoDAO abbonatoDAO;

    @Test
    void contextLoads() {
    }

    @Test
    void testLeggiAbbonatiEmptyStatoAbbonamento() {

	List<Abbonato> list = abbonatoDAO.leggiAbbonati("MARIO", "ROSSI", "");
	assertTrue(list.size() == 1);
	assertTrue("MARIO".equals(list.get(0).getNome()));
    }

    @Test
    void testLeggiAbbonatiStatoAbbonamentoAttivo() {
	List<Abbonato> list = abbonatoDAO.leggiAbbonati("", "", "ATTIVO");
	assertTrue(list.size() == 2);
    }

    @Test
    void testLeggiAbbonatiStatoAbbonamentoScaduto() {
	List<Abbonato> list = abbonatoDAO.leggiAbbonati("", "", "SCADUTO");
	assertTrue(list.size() == 1);
    }

}
