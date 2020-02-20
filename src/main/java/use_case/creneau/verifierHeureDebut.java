package use_case.creneau;

public class verifierHeureDebut {
    boolean verifHeureDebut() {
        if(this.heureDebut.compareTo(this.heureFin) < 0 ){
            return true;
        }else{
            return false;
        }
    }
}
