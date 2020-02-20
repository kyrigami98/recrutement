import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

class creneau {
    private Date date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public creneau(Date date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        creneau creneau = (creneau) o;
        return Objects.equals(date, creneau.date) &&
                Objects.equals(heureDebut, creneau.heureDebut) &&
                Objects.equals(heureFin, creneau.heureFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, heureDebut, heureFin);
    }

    public Date getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    boolean verifHeureDebut() {
        if(this.heureDebut.compareTo(this.heureFin) < 0 ){
            return true;
        }else{
            return false;
        }
    }

    boolean verifHeureFin() {
        if(this.heureFin.compareTo(LocalTime.now()) > 0 ){
            return true;
        }else{
            return false;
        }
    }

}
