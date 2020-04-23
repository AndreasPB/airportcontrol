package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class event_log
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_event_log;
    @Lob
    private String event;
    private LocalDate date_and_time;

    @OneToMany
    private List<personale> personaleList;

    public long getId_event_log()
    {
        return id_event_log;
    }

    public void setId_event_log(long id_event_log)
    {
        this.id_event_log = id_event_log;
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
}
