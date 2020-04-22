package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Standplads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private List<Afgange> afgange;

    public Standplads(){}

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public List<Afgange> getAfgange() {
        return afgange;
    }

    public void setAfgange(List<Afgange> afgange) {
        this.afgange = afgange;
    }
}
