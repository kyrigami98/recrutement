package use_case.creneau;

import model.entretien.Entretiens;

public class verifierHeureDebut implements Entretiens {
    boolean verifHeureDebut() {
        if(this.heureDebut.compareTo(this.heureFin) < 0 ){
            return true;
        }else{
            return false;
        }
    }
}
