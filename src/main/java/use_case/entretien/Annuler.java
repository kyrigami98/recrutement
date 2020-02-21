package use_case.entretien;

import common.dto.EntretienDto;
import model.Entretien;

import java.util.Date;

public class Annuler{
    static boolean annuler(Entretien entretien, String raison) {
        if (!raison.isEmpty()) {
            if ((entretien.getStatut() == "confirmer") && (entretien.getCreneau().getDate().compareTo(new Date()) <= 0)) {
                entretien.setStatut("annuler");
                return true;
            }
            return false;
        }else {
            return false;
        }
    }
}
