package use_case.entretien;

import model.entretien.Entretien;

import java.util.Date;

public class Annuler{
    public boolean annuler(String raison) {
        if (!raison.isEmpty()) {
            if ((this.statut == "confirmer") && (this.creneau.getDate().compareTo(new Date()) <= 0)) {
                this.statut = "annuler";
                return true;
            }
            return false;
        }else {
            return false;
        }
    }
}
