package gruppe3.airportcontrol.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class TaxiAktivitetTidsforbrug extends BaseEntity {

    @OneToOne
    private TaxiAktivitet taxiAktivitet;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    public TaxiAktivitetTidsforbrug() {
    }

    public TaxiAktivitet getTaxiAktivitet() {
        return taxiAktivitet;
    }

    public void setTaxiAktivitet(TaxiAktivitet taxiAktivitet) {
        this.taxiAktivitet = taxiAktivitet;
    }

    public Fly_stoerrelse getFly_stoerrelse() {
        return fly_stoerrelse;
    }

    public void setFly_stoerrelse(Fly_stoerrelse fly_stoerrelse) {
        this.fly_stoerrelse = fly_stoerrelse;
    }
}
