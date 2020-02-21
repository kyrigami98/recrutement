package use_case.entretien;

import model.Entretien;

import java.util.Date;

public class Confirmer {
    public boolean confirmer(Entretien entretien) {
        if(entretien.getStatut() !=  "annuler" && entretien.getStatut().equals("planifier") &&
                entretien.getCreneau().getDate().compareTo(new Date()) >=0) {
            entretien.setStatut("confirmer");
            return true;
        }
        else
        {
            return false;
        }
    }
}
