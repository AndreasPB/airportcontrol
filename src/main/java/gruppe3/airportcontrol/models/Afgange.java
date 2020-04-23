package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Afgange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Fly fly;

    private int standplads;

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

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
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
