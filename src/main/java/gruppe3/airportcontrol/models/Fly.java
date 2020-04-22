package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Fly {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Selskab selskab;

    public Fly(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
