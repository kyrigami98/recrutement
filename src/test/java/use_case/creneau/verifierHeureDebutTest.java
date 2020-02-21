package use_case.creneau;

import common.dto.creneauDto;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class verifierHeureDebutTest {

    @Test
    void verifHeureDebut() {
        LocalTime localTime = LocalTime.now();
        creneauDto creneau = new creneauDto(new Date(), localTime, localTime.plusHours(2));
        verifierHeureDebut heureDebut= new verifierHeureDebut(creneau);
        assertTrue(heureDebut.verifHeureDebut(creneau));
    }
}
