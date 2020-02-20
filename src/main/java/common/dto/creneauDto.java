package common.dto;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class creneauDto{
    private Date date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public creneauDto(Date date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        creneauDto creneauDto = (creneauDto) o;
        return Objects.equals(date, creneauDto.date) &&
                Objects.equals(heureDebut, creneauDto.heureDebut) &&
                Objects.equals(heureFin, creneauDto.heureFin);
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





}
