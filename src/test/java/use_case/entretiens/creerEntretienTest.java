package use_case.entretiens;

import common.dto.creneauDto;
import model.Entretien;
import model.Profil;
import model.Salle;
import model.entretiens;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class creerEntretienTest {

    @Test
    void creer() {
        LocalTime localTime = LocalTime.now();
        creneauDto creneau3 = new creneauDto(new Date(), localTime, localTime.plusHours(2));

        Profil candidat1 = new Profil(2,"DOSSOU" ,"Kyriel", "candidat",creneau3);
        Profil candidat2 = new Profil(3,"BOURDON" ,"Brian", "recruteur",creneau3);
        Salle salle1 =  new Salle("A1", 20, "disponible");

        List<Entretien> listEntretiens = new ArrayList<>();
        entretiens entretiens = new entretiens(listEntretiens);
        Entretien entretien = new Entretien( creneau3, "confirmer", candidat2, candidat1,salle1);

        creerEntretien aj = new creerEntretien(entretien,entretiens);
        //assertTrue(aj.creer(entretien ,entretiens));
    }
}