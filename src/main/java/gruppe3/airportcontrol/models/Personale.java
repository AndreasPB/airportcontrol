package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class personale
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_personale;

    private String personale_navn;
    private String personale_username;
    private String personale_password;

    @ManyToOne
    private personalegrupper personalegrupper;
    @ManyToOne
    private event_log event_log;

    public personale()
    {
    }

    public long getId_personale()
    {
        return id_personale;
    }

    public void setId_personale(long id_personale)
    {
        this.id_personale = id_personale;
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

    public gruppe3.airportcontrol.models.personalegrupper getPersonalegrupper()
    {
        return personalegrupper;
    }

    public void setPersonalegrupper(gruppe3.airportcontrol.models.personalegrupper personalegrupper)
    {
        this.personalegrupper = personalegrupper;
    }

    public gruppe3.airportcontrol.models.event_log getEvent_log()
    {
        return event_log;
    }

    public void setEvent_log(gruppe3.airportcontrol.models.event_log event_log)
    {
        this.event_log = event_log;
    }
}

