package use_case.entretien;

import java.util.Date;

public class Confirmer {
    public boolean confirmer() {
        if(this.statut !=  "annuler" && this.statut.equals("planifier") && this.creneau.getDate().compareTo(new Date()) >=0) {
            this.statut = "confirmer";
            return true;
        }
        else
        {
            return false;
        }
    }
}
