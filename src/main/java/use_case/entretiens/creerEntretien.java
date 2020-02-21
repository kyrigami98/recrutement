package use_case.entretiens;
import model.Entretien;
import model.entretiens;

import java.util.List;

public class creerEntretien {

    public creerEntretien(Entretien entretien, entretiens entretiens) {

    }

    public boolean creer(Entretien entretien, entretiens entretiens) {
        if(!verifierExistanceEntretien.exist((List<Entretien>) entretiens,entretien) &&
           !chevaucher.Cheuvauche((List<Entretien>) entretiens,entretien)
        ) {
            ((List<Entretien>) entretiens).add(entretien);
            return true;
        }else{
            return false;
        }
    }

}
