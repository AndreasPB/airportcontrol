package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Braendstof_aktivitet_tidsforbrug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_braendstof_aktivitet_tidsforbrug;

    private int braendstof_tidsforbrug;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public long getId_braendstof_aktivitet_tidsforbrug()
    {
        return id_braendstof_aktivitet_tidsforbrug;
    }

    public void setId_braendstof_aktivitet_tidsforbrug(long id_braendstof_aktivitet_tidsforbrug)
    {
        this.id_braendstof_aktivitet_tidsforbrug = id_braendstof_aktivitet_tidsforbrug;
    }

    public int getBraendstof_tidsforbrug()
    {
        return braendstof_tidsforbrug;
    }

    public void setBraendstof_tidsforbrug(int braendstof_tidsforbrug)
    {
        this.braendstof_tidsforbrug = braendstof_tidsforbrug;
    }
}
