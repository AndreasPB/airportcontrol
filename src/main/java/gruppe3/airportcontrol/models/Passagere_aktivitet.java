package gruppe3.airportcontrol.models;

import javax.persistence.*;

@Entity
public class Passagere_aktivitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int passagere_tidsforbrug;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public Passagere_aktivitet(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPassagere_tidsforbrug() {
        return passagere_tidsforbrug;
    }

    public void setPassagere_tidsforbrug(int passagere_tidsforbrug) {
        this.passagere_tidsforbrug = passagere_tidsforbrug;
    }

    public Fly_stoerrelse getFly_stoerrelse() {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse) {
        this.fly_stoerrelse = fly_stoerrelse;
    }
}
