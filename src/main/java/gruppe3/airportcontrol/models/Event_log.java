package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event_log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Lob
    private String event;
    private LocalDate tidsstempel;

    @OneToMany
    private List<Brugere> brugereList;

    public Event_log() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getTidsstempel() {
        return tidsstempel;
    }

    public void setTidsstempel(LocalDate tidsstempel) {
        this.tidsstempel = tidsstempel;
    }

    public List<Brugere> getBrugereList() {
        return brugereList;
    }

    public void setBrugereList(List<Brugere> brugereList) {
        this.brugereList = brugereList;
    }
}
