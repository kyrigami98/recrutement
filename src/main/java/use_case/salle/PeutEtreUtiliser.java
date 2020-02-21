package use_case.salle;

import model.Salle;

public class PeutEtreUtiliser {
    private Salle salle;

    public PeutEtreUtiliser(Salle salle) {
        this.salle = salle;
    }

    public boolean isDisponible(Salle salle) {
        if (salle.getEtat().equals("disponible")){
            return true;
        }else{
            return false;
        }
    }
}
