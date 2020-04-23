package gruppe3.airportcontrol.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TaxiAktivitet extends BaseEntity {

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "planlagt_taxi_landing_ind")
    private Date planlagtTaxiLandingInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "forventet_taxi_landing_ind")
    private Date forventetTaxiLandingInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "forventet_taxi_venteplads_ind")
    private Date forventetTaxiVentepladsInd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "planlagt_taxi_venteplads_ud")
    private Date planlagtTaxiVentepladsUd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "forventet_taxi_venteplads_ud")
    private Date forventetTaxiVentepladsUd;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "forventet_taxi_lufthavn_ud")
    private Date forventetTaxiLufthavnUd;

    @OneToOne
    private TaxiAktivitetTidsforbrug taxiAktivitetTidsforbrug;

    public TaxiAktivitet() {
    }
}
