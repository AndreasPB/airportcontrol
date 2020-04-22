package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Selskab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String selskab_navn;
    private String selskab_kode;
    @OneToMany
    private List<Fly> alleFly;

    public Selskab(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
