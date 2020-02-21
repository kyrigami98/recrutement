package use_case.entretien;

import model.Salle;

public class verifierSalle {
    static boolean verifSalle(Salle salle)
    {
        if(salle.getEtat() != "pleine") return true;
        else return false;

    }
}