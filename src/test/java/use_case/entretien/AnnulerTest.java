package use_case.entretien;

import common.dto.creneauDto;
import model.Entretien;
import model.Profil;
import model.Salle;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AnnulerTest {

    @Test
    void annuler() {
        LocalTime localTime = LocalTime.now();
        String raison = "trop compétent";
        creneauDto creneau3 = new creneauDto(new Date(), localTime, localTime.plusHours(2));

        Profil candidat1 = new Profil(2,"DOSSOU" ,"Kyriel", "candidat", creneau3);
        Profil candidat2 = new Profil(3,"BOURDON" ,"Brian", "recruteur", creneau3);
        Salle salle1 =  new Salle("A1", 10, "disponible");

        Entretien entretien = new Entretien( creneau3, "confirmer", candidat2, candidat1,salle1);
        assertTrue(Annuler.annuler(entretien, "absent"));
    }
}