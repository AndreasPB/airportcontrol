package gruppe3.airportcontrol.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxiAktivitetTidsforbrug extends BaseEntity {

    @OneToOne
    private TaxiAktivitet taxiAktivitet;

    @OneToOne
    private Fly_stoerrelse fly_stoerrelse;

    @Column(name = "taxi_tidsforbrug")
    private int taxiTidsforbrug;

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
