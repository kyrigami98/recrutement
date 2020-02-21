package model.entretien;

import model.profil.Profil;
import model.salle.Salle;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Entretien implements {
    private creneau creneau;
    private Salle salle;
    private String statut;
    private Profil recruteur;
    private Profil candidat;
    private UUID entretienID = UUID.randomUUID();

    public Entretien(creneau creneau, String statut, Profil recruteur, Profil candidat, Salle salle) {
        this.creneau = creneau;
        this.statut = statut;
        this.recruteur = recruteur;
        this.candidat = candidat;
        this.entretienID = entretienID;
        this.salle = salle;
    }

    public creneau getCreneau() {
        return creneau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entretien entretien = (Entretien) o;
        return entretienID.equals(entretien.entretienID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entretienID);
    }
}
