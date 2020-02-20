import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProfilTest {

    Profil candidat1 = new Profil(2,"DOSSOU" ,"Kyriel", "candidat");
    Profil candidat2 = new Profil(3,"BOURDON" ,"Brian", "recruteur");

    @Test
    void getExperience() {
    }

    @Test
    void getNom() {
    }

    @Test
    void getPrenom() {
    }

    @Test
    void getPoste() {
    }

    @Test
    void getProfilID() {
    }

    @Test
    void getExperience1() {
    }

    @Test
    void getNom1() {
    }

    @Test
    void getPoste1() {
    }

    @Test
    void isCandidat() {
        assertTrue(candidat1.isCandidat());
    }

    @Test
    void isRecruteur() {
        assertTrue(candidat2.isRecruteur());
    }

    @Test
    void canTest() {
        assertTrue(candidat2.canTest(candidat1));
    }

}
