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
}
