package use_case.entretien;

public class verifierSalle {
    private boolean verifSalle()
    {
        if(salle.getEtat() != "pleine") return true;
        else return false;

    }
}
