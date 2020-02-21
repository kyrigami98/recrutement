package use_case.salle;

import model.salle.Salle;

public class PeutEtreUtiliser {
    public boolean isDisponible(Salle salle) {
        if (salle.getEtat().equals("disponible")){
            return true;
        }else{
            return false;
        }
    }
}
