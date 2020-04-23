package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Fly_model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String model_navn;
    @OneToOne
    private Fly_stoerrelse flystoerrelse;
    @OneToOne
    private Fly fly;

    public Fly_model(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel_navn() {
        return model_navn;
    }

    public void setModel_navn(String model_navn) {
        this.model_navn = model_navn;
    }

    public Fly_stoerrelse getFlystoerrelse() {
        return flystoerrelse;
    }

    public void setFlystoerrelse(Fly_stoerrelse flystoerrelse) {
        this.flystoerrelse = flystoerrelse;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
