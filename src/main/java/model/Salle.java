package model;

public class Salle {
    private String nom;
    private int capacite;
    private String etat;

    public Salle(String nom, int capacite, String etat) {
        this.nom = nom;
        this.capacite = capacite;
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

}
