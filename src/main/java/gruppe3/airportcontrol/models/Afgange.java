package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Afgange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int standplads;
    @OneToOne
    private Afgange afgang;
    @OneToOne
    private Ankomst ankomst;
    private LocalDate dato;
    private LocalDate tid;
    private String destination;


    public Afgange(){}

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

    public Afgange getAfgang() {
        return afgang;
    }

    public void setAfgang(Afgange afgang) {
        this.afgang = afgang;
    }

    public Ankomst getAnkomst() {
        return ankomst;
    }

    public void setAnkomst(Ankomst ankomst) {
        this.ankomst = ankomst;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
