package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Ankomst_afgang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int standplads;
    private int venteplads;
    private LocalDate dato;
    private LocalTime tid;
    private String lufthavn_fra;

    @OneToOne
    private Fly fly;

    public Ankomst_afgang(){}

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

    public LocalTime getTid() {
        return tid;
    }

    public void setTid(LocalTime tid) {
        this.tid = tid;
    }

    public String getLufthavn_fra() {
        return lufthavn_fra;
    }

    public void setLufthavn_fra(String indkommende_fra) {
        this.lufthavn_fra = indkommende_fra;
    }

    public int getVenteplads() {
        return venteplads;
    }

    public void setVenteplads(int venteplads) {
        this.venteplads = venteplads;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
