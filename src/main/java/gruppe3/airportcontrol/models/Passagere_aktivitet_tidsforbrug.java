package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Passagere_aktivitet_tidsforbrug
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_passagere_aktivitet_tidsforbrug;

    private int passagere_tidsforbrug;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    @OneToOne
    private Passagere_aktivitet passagere_aktivitet;

    public Passagere_aktivitet_tidsforbrug()
    {
    }

    public long getId_passagere_aktivitet_tidsforbrug()
    {
        return id_passagere_aktivitet_tidsforbrug;
    }

    public void setId_passagere_aktivitet_tidsforbrug(long id_passagere_aktivitet_tidsforbrug)
    {
        this.id_passagere_aktivitet_tidsforbrug = id_passagere_aktivitet_tidsforbrug;
    }

    public int getPassagere_tidsforbrug()
    {
        return passagere_tidsforbrug;
    }

    public void setPassagere_tidsforbrug(int passagere_tidsforbrug)
    {
        this.passagere_tidsforbrug = passagere_tidsforbrug;
    }

    public Fly_stoerrelse getFly_stoerrelse()
    {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse)
    {
        this.fly_stoerrelse = fly_stoerrelse;
    }

    public Passagere_aktivitet getPassagere_aktivitet()
    {
        return passagere_aktivitet;
    }

    public void setPassagere_aktivitet(Passagere_aktivitet passagere_aktivitet)
    {
        this.passagere_aktivitet = passagere_aktivitet;
    }
}
