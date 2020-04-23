package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fly_stoerrelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Fly_model fly_model;
    //mangler taxi-aktivitets-tidsforbrug + andre aktiviteter

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
}
