import model.entretien.Entretien;
import model.entretien.creneau;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import java.util.Date;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CreneauTest {

    LocalTime localTime = LocalTime.now();
    creneau creneau1 = new creneau(new Date(), localTime, localTime.plusHours(2));
    creneau creneau2 = new creneau(new Date(), localTime, localTime.plusHours(2));

    @org.junit.jupiter.api.Test
    void getDate() {
    }

    @org.junit.jupiter.api.Test
    void verifHeureDebut() {
        assertTrue(creneau1.verifHeureDebut());
    }

    @org.junit.jupiter.api.Test
    void verifHeureFin() {
        assertTrue(creneau1.verifHeureFin());
    }

    @org.junit.jupiter.api.Test
    void equals() {
        assertTrue(creneau1.equals(creneau2));

    }

}
