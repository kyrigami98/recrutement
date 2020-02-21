package use_case.entretien;

import model.Salle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class verifierSalleTest {

    @Test
    void verifSalle() {
        Salle salle =  new Salle("A1", 10, "disponible");
        assertTrue(verifierSalle.verifSalle(salle));
    }
}