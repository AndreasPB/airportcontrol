package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stoerrelse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private List<Stoerrelse> stoerrelse;

    public Stoerrelse(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Stoerrelse> getStoerrelse() {
        return stoerrelse;
    }

    public void setStoerrelse(List<Stoerrelse> stoerrelse) {
        this.stoerrelse = stoerrelse;
    }
}
