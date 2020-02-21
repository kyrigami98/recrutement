package common.dto;

public class SalleDto {
    private String nom;
    private int capacite;
    private int id;
    private String etat;

    public SalleDto(String nom, int capacite, int id, String etat) {
        this.nom = nom;
        this.capacite = capacite;
        this.id = id;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public String getEtat() {
        return etat;
    }

    public int getCapacite() {
        return capacite;
    }
    public int getId() {
        return id;
    }

}
