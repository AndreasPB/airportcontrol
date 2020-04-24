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
    private String ank_afg;
    private String lufthavn_fra_eller_til;

    @OneToOne
    private Fly fly;

    @OneToOne
    private TaxiAktivitet taxiAktivitet;

    @OneToOne
    private Bagage_aktivitet bagage_aktivitet;

    @OneToOne
    private Braendstof_aktivitet braendstof_aktivitet;

    @OneToOne
    private Personale_aktivitet personale_aktivitet;

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

    public String getLufthavn_fra_eller_til() {
        return lufthavn_fra_eller_til;
    }

    public void setLufthavn_fra_eller_til(String indkommende_fra) {
        this.lufthavn_fra_eller_til = indkommende_fra;
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

    public String getAnk_afg() {
        return ank_afg;
    }

    public void setAnk_afg(String ank_afg) {
        this.ank_afg = ank_afg;
    }

    public TaxiAktivitet getTaxiAktivitet() {
        return taxiAktivitet;
    }

    public void setTaxiAktivitet(TaxiAktivitet taxiAktivitet) {
        this.taxiAktivitet = taxiAktivitet;
    }

    public Bagage_aktivitet getBagage_aktivitet() {
        return bagage_aktivitet;
    }

    public void setBagage_aktivitet(Bagage_aktivitet bagage_aktivitet) {
        this.bagage_aktivitet = bagage_aktivitet;
    }

    public Braendstof_aktivitet getBraendstof_aktivitet() {
        return braendstof_aktivitet;
    }

    public void setBraendstof_aktivitet(Braendstof_aktivitet braendstof_aktivitet) {
        this.braendstof_aktivitet = braendstof_aktivitet;
    }

    public Personale_aktivitet getPersonale_aktivitet() {
        return personale_aktivitet;
    }

    public void setPersonale_aktivitet(Personale_aktivitet personale_aktivitet) {
        this.personale_aktivitet = personale_aktivitet;
    }
}
