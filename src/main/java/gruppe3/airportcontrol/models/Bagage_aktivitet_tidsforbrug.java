package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Bagage_aktivitet_tidsforbrug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int bagage_tidsforbrug;
    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Bagage_aktivitet_tidsforbrug(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBagage_tidsforbrug() {
        return bagage_tidsforbrug;
    }

    public void setBagage_tidsforbrug(int bagage_tidsforbrug) {
        this.bagage_tidsforbrug = bagage_tidsforbrug;
    }

    public Fly_stoerrelse getFly_stoerrelse() {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse) {
        this.fly_stoerrelse = fly_stoerrelse;
    }
}
