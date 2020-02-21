package use_case.entretiens;
import model.entretien.Entretien;
import model.entretiens.entretiens;

import java.util.List;

public class creerEntretien {

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
