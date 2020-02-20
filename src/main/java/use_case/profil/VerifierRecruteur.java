package use_case.profil;

import model.profil.Profil;

public class VerifierRecruteur {
    public boolean isRecruteur(Profil profil) {
        if(profil.getPoste().equals("recruteur")){
            return true;
        }else{
            return false;
        }
    }
}
