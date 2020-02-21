package use_case.creneau;

import common.dto.creneauDto;

public class verifierHeureDebut {
    boolean verifHeureDebut(creneauDto creneau) {
        if(creneau.getHeureDebut().compareTo(creneau.getHeureFin()) < 0 ){
            return true;
        }else{
            return false;
        }
    }
}
