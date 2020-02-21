package use_case.entretiens;

import model.entretien.Entretien;

import java.util.List;

public class verifierExistanceEntretien {

    public static boolean exist(List<Entretien> listEntretiens, Entretien entretien) {
        if(listEntretiens.contains(entretien)){
            return true;
        }else{
            return false;
        }
    }

}
