package use_case.salle;

import model.Salle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeutEtreUtiliserTest {
    Salle salle = new Salle("A1", 12, "disponible");
    PeutEtreUtiliser test = new PeutEtreUtiliser(salle);

    @Test
    void isDisponible() {
        assertTrue(test.isDisponible(salle));
    }
}