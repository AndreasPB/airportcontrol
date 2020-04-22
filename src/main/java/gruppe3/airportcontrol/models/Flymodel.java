package gruppe3.airportcontrol.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flymodel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Flymodel(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
