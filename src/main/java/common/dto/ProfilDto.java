package common.dto;

import java.util.UUID;

public class ProfilDto {

    private UUID profilID = UUID.randomUUID();
    private double experience;
    private String nom;
    private String prenom;
    private String poste;
    private creneauDto disponibilite;

    public ProfilDto(double experience, String nom, String prenom, String poste, creneauDto disponibilite) {
        this.experience = experience;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.disponibilite = disponibilite;
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

    public String getDisponibilite() {
        return poste;
    }

}
