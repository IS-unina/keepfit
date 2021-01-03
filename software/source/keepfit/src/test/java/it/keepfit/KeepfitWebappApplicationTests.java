package it.keepfit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.keepfit.dao.AbbonatoDAO;
import it.keepfit.entity.Abbonato;

// TODO: Auto-generated Javadoc
/**
 * The Class KeepfitWebappApplicationTests.
 */
@SpringBootTest
class KeepfitWebappApplicationTests {

    /** The abbonato DAO. */
    @Autowired
    private AbbonatoDAO abbonatoDAO;

    /**
     * Context loads.
     */
    @Test
    void contextLoads() {
    }

    /**
     * Test leggi abbonati empty stato abbonamento.
     */
    @Test
    void testLeggiAbbonatiEmptyStatoAbbonamento() {

	List<Abbonato> list = abbonatoDAO.leggiAbbonati("MARIO", "ROSSI", "");
	assertTrue(list.size() == 1);
	assertTrue("MARIO".equals(list.get(0).getNome()));
    }

    /**
     * Test leggi abbonati stato abbonamento attivo.
     */
    @Test
    void testLeggiAbbonatiStatoAbbonamentoAttivo() {
	List<Abbonato> list = abbonatoDAO.leggiAbbonati("", "", "ATTIVO");
	assertTrue(list.size() == 2);
    }

    /**
     * Test leggi abbonati stato abbonamento scaduto.
     */
    @Test
    void testLeggiAbbonatiStatoAbbonamentoScaduto() {
	List<Abbonato> list = abbonatoDAO.leggiAbbonati("", "", "SCADUTO");
	assertTrue(list.size() == 1);
    }

}
