package common.dto;

import model.Profil;
import model.Salle;

import java.util.Objects;
import java.util.UUID;

public class EntretienDto {
    private creneauDto creneau;
    private Salle salle;
    private String statut;
    private Profil recruteur;
    private Profil candidat;
    private UUID entretienID = UUID.randomUUID();

    public EntretienDto(creneauDto creneau, String statut, Profil recruteur, Profil candidat, Salle salle) {
        this.creneau = creneau;
        this.statut = statut;
        this.recruteur = recruteur;
        this.candidat = candidat;
        this.entretienID = entretienID;
        this.salle = salle;
    }

    public creneauDto getCreneau() {
        return creneau;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public Profil getRecruteur() {
        return recruteur;
    }

    public Profil getCandidat() {
        return candidat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntretienDto entretien = (EntretienDto) o;
        return entretienID.equals(entretien.entretienID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entretienID);
    }
}
