package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Flymodel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String model_navn;
    @ManyToOne
    private Stoerrelse stoerrelse;

    public Flymodel(){}

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

    public Stoerrelse getStoerrelse() {
        return stoerrelse;
    }

    public void setStoerrelse(Stoerrelse stoerrelse) {
        this.stoerrelse = stoerrelse;
    }
}
