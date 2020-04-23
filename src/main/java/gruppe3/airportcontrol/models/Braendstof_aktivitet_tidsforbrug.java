package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Braendstof_aktivitet_tidsforbrug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int braendstof_tidsforbrug;

    public Braendstof_aktivitet_tidsforbrug() {
    }

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Braendstof_aktivitet_tidsforbrug()
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

    public int getBraendstof_tidsforbrug()
    {
        return braendstof_tidsforbrug;
    }

    public void setBraendstof_tidsforbrug(int braendstof_tidsforbrug)
    {
        this.braendstof_tidsforbrug = braendstof_tidsforbrug;
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
