package use_case.creneau;

import java.time.LocalTime;

public class verifierHeureFin {
    boolean verifHeureFin() {
        if(this.heureFin.compareTo(LocalTime.now()) > 0 ){
            return true;
        }else{
            return false;
        }
    }
}
