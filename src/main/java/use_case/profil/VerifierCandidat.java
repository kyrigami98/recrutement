package use_case.profil;

import model.Entretien;
import model.Profil;

public class VerifierCandidat {
    public boolean isCandidat(Profil profil) {
        if(profil.getPoste().equals("candidat")){
            return true;
        }else{
            return false;
        }
    }
}
