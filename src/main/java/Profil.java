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

    public boolean isCandidat() {
        if(this.poste.equals("candidat")){
            return true;
        }else{
            return false;
        }
    }
    public boolean isRecruteur() {
        if(this.poste.equals("recruteur")){
            return true;
        }else{
            return false;
        }
    }

    public boolean canTest(Profil user) {
        if(user.isCandidat() && this.isRecruteur() && this.experience > user.experience){
            return true;
        }else{
            return false;
        }
    }

}
