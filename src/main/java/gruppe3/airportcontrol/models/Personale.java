package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Personale
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String personale_navn;
    private String personale_username;
    private String personale_password;

    @ManyToOne
    private Personalegrupper personalegrupper;
    @ManyToOne
    private Event_log event_log;

    public Personale()
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

    public String getPersonale_navn()
    {
        return personale_navn;
    }

    public void setPersonale_navn(String personale_navn)
    {
        this.personale_navn = personale_navn;
    }

    public String getPersonale_username()
    {
        return personale_username;
    }

    public void setPersonale_username(String personale_username)
    {
        this.personale_username = personale_username;
    }

    public String getPersonale_password()
    {
        return personale_password;
    }

    public void setPersonale_password(String personale_password)
    {
        this.personale_password = personale_password;
    }

    public Personalegrupper getPersonalegrupper()
    {
        return personalegrupper;
    }

    public void setPersonalegrupper(Personalegrupper personalegrupper)
    {
        this.personalegrupper = personalegrupper;
    }

    public Event_log getEvent_log()
    {
        return event_log;
    }

    public void setEvent_log(Event_log event_log)
    {
        this.event_log = event_log;
    }
}

