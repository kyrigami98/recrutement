package model.profil;

import java.util.UUID;

public class Profil {

    private UUID profilID = UUID.randomUUID();
    private double experience;
    private String nom;
    private String prenom;
    private String poste;

    public Profil(double experience, String nom, String prenom, String poste) {
        this.experience = experience;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
    }

    public UUID getProfilID() {
        return profilID;
    }
    public double getExperience() {
        return experience;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPoste() {
        return poste;
    }

}
