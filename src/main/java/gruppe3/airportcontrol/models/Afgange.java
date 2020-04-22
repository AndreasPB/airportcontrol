package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Afgange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Standplads standplads;
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

    public Standplads getStandplads() {
        return standplads;
    }

    public void setStandplads(Standplads standplads) {
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
