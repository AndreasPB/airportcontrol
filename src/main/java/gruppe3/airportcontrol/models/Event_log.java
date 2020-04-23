package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Event_log
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    private String event;
    private LocalDate date_and_time;

    public Event_log() {
    }

    @OneToMany
    private List<Personale> personaleList;

    public Event_log()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }

    public LocalDate getDate_and_time()
    {
        return date_and_time;
    }

    public void setDate_and_time(LocalDate date_and_time)
    {
        this.date_and_time = date_and_time;
    }

    public List<Personale> getPersonaleList()
    {
        return personaleList;
    }

    public void setPersonaleList(List<Personale> personaleList)
    {
        this.personaleList = personaleList;
    }
}
