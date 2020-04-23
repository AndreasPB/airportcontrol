package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity
public class Personale_aktivitet
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
    private Personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug;

    @OneToOne
    private Ankomst_afgang ankomst_afgang;

    public Personale_aktivitet()
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

    public LocalTime getPlanlagt_personale_naboplads()
    {
        return planlagt_personale_naboplads;
    }

    public void setPlanlagt_personale_naboplads(LocalTime planlagt_personale_naboplads)
    {
        this.planlagt_personale_naboplads = planlagt_personale_naboplads;
    }

    public LocalTime getPlanlagt_personale_egen_terminal()
    {
        return planlagt_personale_egen_terminal;
    }

    public void setPlanlagt_personale_egen_terminal(LocalTime planlagt_personale_egen_terminal)
    {
        this.planlagt_personale_egen_terminal = planlagt_personale_egen_terminal;
    }

    public LocalTime getPlanlagt_personale_anden_terminal()
    {
        return planlagt_personale_anden_terminal;
    }

    public void setPlanlagt_personale_anden_terminal(LocalTime planlagt_personale_anden_terminal)
    {
        this.planlagt_personale_anden_terminal = planlagt_personale_anden_terminal;
    }

    public LocalTime getForventet_personale_naboplads()
    {
        return forventet_personale_naboplads;
    }

    public void setForventet_personale_naboplads(LocalTime forventet_personale_naboplads)
    {
        this.forventet_personale_naboplads = forventet_personale_naboplads;
    }

    public LocalTime getForventet_personale_egen_terminal()
    {
        return forventet_personale_egen_terminal;
    }

    public void setForventet_personale_egen_terminal(LocalTime forventet_personale_egen_terminal)
    {
        this.forventet_personale_egen_terminal = forventet_personale_egen_terminal;
    }

    public LocalTime getForventet_personale_anden_terminal()
    {
        return forventet_personale_anden_terminal;
    }

    public void setForventet_personale_anden_terminal(LocalTime forventet_personale_anden_terminal)
    {
        this.forventet_personale_anden_terminal = forventet_personale_anden_terminal;
    }

    public Personale_aktivitet_tidsforbrug getPersonale_aktivitet_tidsforbrug()
    {
        return personale_aktivitet_tidsforbrug;
    }

    public void setPersonale_aktivitet_tidsforbrug(Personale_aktivitet_tidsforbrug personale_aktivitet_tidsforbrug)
    {
        this.personale_aktivitet_tidsforbrug = personale_aktivitet_tidsforbrug;
    }

    public Ankomst_afgang getAnkomst_afgang()
    {
        return ankomst_afgang;
    }

    public void setAnkomst_afgang(Ankomst_afgang ankomst_afgang)
    {
        this.ankomst_afgang = ankomst_afgang;
    }
}
