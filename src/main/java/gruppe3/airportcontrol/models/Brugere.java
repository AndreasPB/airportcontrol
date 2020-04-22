package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Brugere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String bruger_navn;
    private String bruger_kode;
    @ManyToOne
    private Personalegrupper personalegrupper;
    @ManyToOne
    private Event_log event_log;

    public Brugere(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBruger_navn() {
        return bruger_navn;
    }

    public void setBruger_navn(String bruger_navn) {
        this.bruger_navn = bruger_navn;
    }

    public String getBruger_kode() {
        return bruger_kode;
    }

    public void setBruger_kode(String bruger_kode) {
        this.bruger_kode = bruger_kode;
    }

    public Personalegrupper getPersonalegrupper() {
        return personalegrupper;
    }

    public void setPersonalegrupper(Personalegrupper personalegrupper) {
        this.personalegrupper = personalegrupper;
    }

    public Event_log getEvent_log() {
        return event_log;
    }

    public void setEvent_log(Event_log event_log) {
        this.event_log = event_log;
    }
}
