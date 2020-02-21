package use_case.entretiens;

import model.entretien.Entretien;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class chevaucher {

    public static boolean Cheuvauche(List<Entretien> listEntretiens, Entretien entretien) {
        final boolean[] bool = {true};
        listEntretiens.forEach((Entretien item) ->{
            if(item.getCreneau().equals(entretien.getCreneau())){
                bool[0] = true;
            }else{
                bool[0] = false;
            }
        });
        return bool[0];
    }
}
