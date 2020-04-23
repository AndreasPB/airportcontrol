package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Fly_stoerrelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Fly_model fly_model;
    @OneToOne
    private Bagage_aktivitet_tidsforbrug bagage_aktivitet_tidsforbrug;

    public Fly_stoerrelse(){}

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
}
