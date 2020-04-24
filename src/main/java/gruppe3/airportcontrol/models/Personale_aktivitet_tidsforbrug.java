package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Personale_aktivitet_tidsforbrug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int personale_tidsforbrug;

    @OneToOne
    private Personale_aktivitet personale_aktivitet;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Personale_aktivitet_tidsforbrug()
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

    public int getPersonale_tidsforbrug()
    {
        return personale_tidsforbrug;
    }

    public void setPersonale_tidsforbrug(int personale_tidsforbrug)
    {
        this.personale_tidsforbrug = personale_tidsforbrug;
    }

    public Personale_aktivitet getPersonale_aktivitet()
    {
        return personale_aktivitet;
    }

    public void setPersonale_aktivitet(Personale_aktivitet personale_aktivitet)
    {
        this.personale_aktivitet = personale_aktivitet;
    }

    public Fly_stoerrelse getFly_stoerrelse()
    {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse)
    {
        this.fly_stoerrelse = fly_stoerrelse;
    }
}
