package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stoerrelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Stoerrelse(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
