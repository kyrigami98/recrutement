package use_case.creneau;


import common.dto.creneauDto;

import java.time.LocalTime;

public class verifierHeureFin {
    private creneauDto creneau;

    public verifierHeureFin(creneauDto creneau) {
        this.creneau = creneau;
    }

    boolean verifHeureFin(creneauDto creneau) {
        if(creneau.getHeureFin().compareTo(LocalTime.now()) > 0 ){
            return true;
        }else{
            return false;
        }
    }
}
