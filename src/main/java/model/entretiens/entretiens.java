package model.entretiens;

import model.entretien.Entretien;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class entretiens {

    List<Entretien> listEntretiens = new ArrayList<>();

    public entretiens(List<Entretien> listEntretien) {
        this.listEntretiens = listEntretien;
    }

    public List<Entretien> getList() {
        return listEntretiens;
    }


}
