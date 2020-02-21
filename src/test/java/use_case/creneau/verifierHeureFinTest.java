package use_case.creneau;

import common.dto.creneauDto;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class verifierHeureFinTest {

    @Test
    void verifHeureFin() {
        LocalTime localTime = LocalTime.now();
        creneauDto creneau = new creneauDto(new Date(), localTime, localTime.plusHours(2));
        verifierHeureFin heureFin= new verifierHeureFin(creneau);
        assertTrue(heureFin.verifHeureFin(creneau));
    }
}
