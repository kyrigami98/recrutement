package use_case.entretiens;

import model.Entretien;

import java.util.List;

public class ajouterEntretien {

    public ajouterEntretien( List<Entretien> listEntretiens,Entretien entretien) {
        listEntretiens.add(entretien);
    }


}
