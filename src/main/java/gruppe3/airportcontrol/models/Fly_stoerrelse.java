package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Fly_stoerrelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String stoerrelse;

    @OneToOne
    private Fly_model fly_model;
    @OneToOne
    private Bagage_aktivitet_tidsforbrug bagage_aktivitet_tidsforbrug;
    @OneToOne
    private Personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug;

    @OneToOne
    private TaxiAktivitetTidsforbrug taxiAktivitetTidsforbrug;

    @OneToOne
    private Braendstof_aktivitet_tidsforbrug braendstof_aktivitet_tidsforbrug;

    @OneToOne
    private Passagere_aktivitet_tidsforbrug passagere_aktivitet_tidsforbrug;

    public Fly_stoerrelse(){}

    public String getStoerrelse()
    {
        return stoerrelse;
    }

    public void setStoerrelse(String stoerrelse)
    {
        this.stoerrelse = stoerrelse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Fly_model getFly_model() {
        return fly_model;
    }

    public void setFly_model(Fly_model fly_model) {
        this.fly_model = fly_model;
    }

    public Bagage_aktivitet_tidsforbrug getBagage_aktivitet_tidsforbrug() {
        return bagage_aktivitet_tidsforbrug;
    }

    public void setBagage_aktivitet_tidsforbrug(Bagage_aktivitet_tidsforbrug bagage_aktivitet_tidsforbrug) {
        this.bagage_aktivitet_tidsforbrug = bagage_aktivitet_tidsforbrug;
    }

    public Personale_aktivitet_tidsforbrug getPersonale_aktivitet_tidsforbrug() {
        return personale_aktivitet_tidsforbrug;
    }

    public void setPersonale_aktivitet_tidsforbrug(Personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug) {
        this.personale_aktivitet_tidsforbrug = personale_aktivitet_tidsforbrug;
    }

    public TaxiAktivitetTidsforbrug getTaxiAktivitetTidsforbrug() {
        return taxiAktivitetTidsforbrug;
    }

    public void setTaxiAktivitetTidsforbrug(TaxiAktivitetTidsforbrug taxiAktivitetTidsforbrug) {
        this.taxiAktivitetTidsforbrug = taxiAktivitetTidsforbrug;
    }

    public Braendstof_aktivitet_tidsforbrug getBraendstof_aktivitet_tidsforbrug() {
        return braendstof_aktivitet_tidsforbrug;
    }

    public void setBraendstof_aktivitet_tidsforbrug(Braendstof_aktivitet_tidsforbrug braendstof_aktivitet_tidsforbrug) {
        this.braendstof_aktivitet_tidsforbrug = braendstof_aktivitet_tidsforbrug;
    }

    public Passagere_aktivitet_tidsforbrug getPassagere_aktivitet_tidsforbrug() {
        return passagere_aktivitet_tidsforbrug;
    }

    public void setPassagere_aktivitet_tidsforbrug(Passagere_aktivitet_tidsforbrug passagere_aktivitet_tidsforbrug) {
        this.passagere_aktivitet_tidsforbrug = passagere_aktivitet_tidsforbrug;
    }
}
