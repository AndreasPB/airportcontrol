package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Personale_aktivitet_tidsforbrug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_personale_aktivitet_tidsforbrug;

    private int personale_tidsforbrug;

    @OneToOne
    private Personale_aktivitet personale_aktivitet;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Personale_aktivitet_tidsforbrug()
    {
    }

    public Personale_aktivitet_tidsforbrug(int personale_tidsforbrug)
    {
        this.personale_tidsforbrug = personale_tidsforbrug;
    }

    public long getId_personale_aktivitet_tidsforbrug()
    {
        return id_personale_aktivitet_tidsforbrug;
    }

    public void setId_personale_aktivitet_tidsforbrug(long id_personale_aktivitet_tidsforbrug)
    {
        this.id_personale_aktivitet_tidsforbrug = id_personale_aktivitet_tidsforbrug;
    }

    public int getPersonale_tidsforbrug()
    {
        return personale_tidsforbrug;
    }

    public void setPersonale_tidsforbrug(int tidsforbrug)
    {
        this.personale_tidsforbrug = tidsforbrug;
    }
}
