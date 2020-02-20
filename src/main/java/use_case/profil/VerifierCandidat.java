package use_case.profil;

public class VerifierCandidat {
    public boolean isCandidat() {
        if(this.poste.equals("candidat")){
            return true;
        }else{
            return false;
        }
    }
}
