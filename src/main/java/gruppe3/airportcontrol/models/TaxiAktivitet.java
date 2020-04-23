package gruppe3.airportcontrol.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxiAktivitet extends BaseEntity {

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date planlagtTaxiLandingInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date forventetTaxiLandingInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date forventetTaxiVentepladsInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date planlagtTaxiVentepladsUd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date forventetTaxiVentepladsUd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date forventetTaxiLufthavnUd;

    @OneToOne
    private TaxiAktivitetTidsforbrug taxiAktivitetTidsforbrug;

    public TaxiAktivitet() {
    }
}
