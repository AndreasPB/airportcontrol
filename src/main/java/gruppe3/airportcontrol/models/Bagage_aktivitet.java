package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Bagage_aktivitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime planlagt_bagage_ud;
    private LocalTime planlagt_bagage_ind;
    @OneToOne
    private Bagage_aktivitet_tidsforbrug bagage_aktivitet_tidsforbrug;
    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Bagage_aktivitet(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getPlanlagt_bagage_ud() {
        return planlagt_bagage_ud;
    }

    public void setPlanlagt_bagage_ud(LocalTime planlagt_bagage_ud) {
        this.planlagt_bagage_ud = planlagt_bagage_ud;
    }

    public LocalTime getPlanlagt_bagage_ind() {
        return planlagt_bagage_ind;
    }

    public void setPlanlagt_bagage_ind(LocalTime planlagt_bagage_ind) {
        this.planlagt_bagage_ind = planlagt_bagage_ind;
    }

    public Bagage_aktivitet_tidsforbrug getBagage_aktivitet_tidsforbrug() {
        return bagage_aktivitet_tidsforbrug;
    }

    public void setBagage_aktivitet_tidsforbrug(Bagage_aktivitet_tidsforbrug bagage_aktivitet_tidsforbrug) {
        this.bagage_aktivitet_tidsforbrug = bagage_aktivitet_tidsforbrug;
    }

    public Fly_stoerrelse getFly_stoerrelse() {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse) {
        this.fly_stoerrelse = fly_stoerrelse;
    }
}
