package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity
public class personale_aktivitet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_personale_aktivitet;

    private LocalTime planlagt_personale_naboplads;
    private LocalTime planlagt_personale_egen_terminal;
    private LocalTime planlagt_personale_anden_terminal;
    private LocalTime forventet_personale_naboplads;
    private LocalTime forventet_personale_egen_terminal;
    private LocalTime forventet_personale_anden_terminal;

    @OneToOne
    private personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug;

    @OneToOne
    private ankomst_afgang ankomst_afgang;

    public personale_aktivitet()
    {
    }

    public long getId_personale_aktivitet()
    {
        return id_personale_aktivitet;
    }

    public void setId_personale_aktivitet(long id_personale_aktivitet)
    {
        this.id_personale_aktivitet = id_personale_aktivitet;
    }

    public Time getPlanlagt_personale_naboplads()
    {
        return planlagt_personale_naboplads;
    }

    public void setPlanlagt_personale_naboplads(Time planlagt_personale_naboplads)
    {
        this.planlagt_personale_naboplads = planlagt_personale_naboplads;
    }

    public Time getPlanlagt_personale_egen_terminal()
    {
        return planlagt_personale_egen_terminal;
    }

    public void setPlanlagt_personale_egen_terminal(Time planlagt_personale_egen_terminal)
    {
        this.planlagt_personale_egen_terminal = planlagt_personale_egen_terminal;
    }

    public Time getPlanlagt_personale_anden_terminal()
    {
        return planlagt_personale_anden_terminal;
    }

    public void setPlanlagt_personale_anden_terminal(Time planlagt_personale_anden_terminal)
    {
        this.planlagt_personale_anden_terminal = planlagt_personale_anden_terminal;
    }

    public Time getForventet_personale_naboplads()
    {
        return forventet_personale_naboplads;
    }

    public void setForventet_personale_naboplads(Time forventet_personale_naboplads)
    {
        this.forventet_personale_naboplads = forventet_personale_naboplads;
    }

    public Time getForventet_personale_egen_terminal()
    {
        return forventet_personale_egen_terminal;
    }

    public void setForventet_personale_egen_terminal(Time forventet_personale_egen_terminal)
    {
        this.forventet_personale_egen_terminal = forventet_personale_egen_terminal;
    }

    public Time getForventet_personale_anden_terminal()
    {
        return forventet_personale_anden_terminal;
    }

    public void setForventet_personale_anden_terminal(Time forventet_personale_anden_terminal)
    {
        this.forventet_personale_anden_terminal = forventet_personale_anden_terminal;
    }

    public gruppe3.airportcontrol.models.personale_aktivitet_tidsforbrug getPersonale_aktivitet_tidsforbrug()
    {
        return personale_aktivitet_tidsforbrug;
    }

    public void setPersonale_aktivitet_tidsforbrug(gruppe3.airportcontrol.models.personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug)
    {
        this.personale_aktivitet_tidsforbrug = personale_aktivitet_tidsforbrug;
    }
}
