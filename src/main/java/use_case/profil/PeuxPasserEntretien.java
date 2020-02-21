package use_case.profil;

import model.Profil;

public class PeuxPasserEntretien {
    public boolean canTest(Profil user) {
        if(user.isCandidat() && this.isRecruteur() && this.experience > user.experience){
            return true;
        }else{
            return false;
        }
    }
}
