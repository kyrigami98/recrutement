import model.entretien.Entretien;
import model.entretien.creneau;
import model.profil.Profil;
import model.salle.Salle;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class EntretienTest {

    LocalTime localTime = LocalTime.now();
    String raison = "trop compétent";
    creneau creneau3 = new creneau(new Date(), localTime, localTime.plusHours(2));

    Profil candidat1 = new Profil(2,"DOSSOU" ,"Kyriel", "candidat");
    Profil candidat2 = new Profil(3,"BOURDON" ,"Brian", "recruteur");
    Salle salle1 =  new Salle("A1", 20, 1, "ok");

    Entretien entretien = new Entretien( creneau3, "confirmer", candidat2, candidat1,salle1);

    @Test
    void getCreneau() {
    }

    @Test
    void equals1() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntretienTest that = (EntretienTest) o;
        return Objects.equals(localTime, that.localTime) &&
                Objects.equals(raison, that.raison) &&
                Objects.equals(creneau3, that.creneau3) &&
                Objects.equals(candidat1, that.candidat1) &&
                Objects.equals(candidat2, that.candidat2) &&
                Objects.equals(entretien, that.entretien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localTime, raison, creneau3, candidat1, candidat2, entretien);
    }

    @Test
    void hashCode1() {
    }

    @Test
    void confirmer() {
        assertTrue(entretien.confirmer());
    }

    @Test
    void annuler() {
        assertTrue(entretien.annuler(raison));
    }
    void verifierSalle() {assertTrue(entretien.verifierSalle());}
}
