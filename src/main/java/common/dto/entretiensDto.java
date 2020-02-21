package common.dto;

import model.Entretien;

import java.util.ArrayList;
import java.util.List;

public class entretiensDto {

    List<Entretien> listEntretiens = new ArrayList<>();

    public entretiensDto(List<Entretien> listEntretien) {
        this.listEntretiens = listEntretien;
    }

    public List<Entretien> getList() {
        return listEntretiens;
    }


}
