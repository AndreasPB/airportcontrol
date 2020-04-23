package gruppe3.airportcontrol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ankomst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int standplads;
    private LocalDate dato;
    private LocalDate tid;
    private String indkommende_fra;

    public Ankomst(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStandplads() {
        return standplads;
    }

    public void setStandplads(int standplads) {
        this.standplads = standplads;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getTid() {
        return tid;
    }

    public void setTid(LocalDate tid) {
        this.tid = tid;
    }

    public String getIndkommende_fra() {
        return indkommende_fra;
    }

    public void setIndkommende_fra(String indkommende_fra) {
        this.indkommende_fra = indkommende_fra;
    }
}
