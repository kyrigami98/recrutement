package model;

import model.Entretien;

import java.util.ArrayList;
import java.util.List;

public class entretiens {

    List<Entretien> listEntretiens = new ArrayList<>();

    public entretiens(List<Entretien> listEntretien) {
        this.listEntretiens = listEntretien;
    }

    public List<Entretien> getList() {
        return listEntretiens;
    }


}
