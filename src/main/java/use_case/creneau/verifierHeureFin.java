package use_case.creneau;

import model.creneau.creneau;

import java.time.LocalTime;

public class verifierHeureFin {
    boolean verifHeureFin(creneau creneau) {
        if(creneau.getHeureFin().compareTo(LocalTime.now()) > 0 ){
            return true;
        }else{
            return false;
        }
    }
}
