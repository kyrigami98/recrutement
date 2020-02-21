package use_case.creneau;

import model.creneau.creneau;

public class verifierHeureDebut {
    boolean verifHeureDebut(creneau creneau) {
        if(creneau.getHeureDebut().compareTo(creneau.getHeureFin()) < 0 ){
            return true;
        }else{
            return false;
        }
    }
}
