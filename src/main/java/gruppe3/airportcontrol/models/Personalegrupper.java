package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Personalegrupper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String personalegruppe;
    @OneToMany
    private List<Brugere> brugerlist;

    public Personalegrupper() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonalegruppe() {
        return personalegruppe;
    }

    public void setPersonalegruppe(String personalegruppe) {
        this.personalegruppe = personalegruppe;
    }

    public List<Brugere> getBrugerlist() {
        return brugerlist;
    }

    public void setBrugerlist(List<Brugere> brugerlist) {
        this.brugerlist = brugerlist;
    }
}
