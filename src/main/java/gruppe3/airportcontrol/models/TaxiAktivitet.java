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

    public Date getPlanlagtTaxiLandingInd() {
        return planlagtTaxiLandingInd;
    }

    public void setPlanlagtTaxiLandingInd(Date planlagtTaxiLandingInd) {
        this.planlagtTaxiLandingInd = planlagtTaxiLandingInd;
    }

    public Date getForventetTaxiLandingInd() {
        return forventetTaxiLandingInd;
    }

    public void setForventetTaxiLandingInd(Date forventetTaxiLandingInd) {
        this.forventetTaxiLandingInd = forventetTaxiLandingInd;
    }

    public Date getForventetTaxiVentepladsInd() {
        return forventetTaxiVentepladsInd;
    }

    public void setForventetTaxiVentepladsInd(Date forventetTaxiVentepladsInd) {
        this.forventetTaxiVentepladsInd = forventetTaxiVentepladsInd;
    }

    public Date getPlanlagtTaxiVentepladsUd() {
        return planlagtTaxiVentepladsUd;
    }

    public void setPlanlagtTaxiVentepladsUd(Date planlagtTaxiVentepladsUd) {
        this.planlagtTaxiVentepladsUd = planlagtTaxiVentepladsUd;
    }

    public Date getForventetTaxiVentepladsUd() {
        return forventetTaxiVentepladsUd;
    }

    public void setForventetTaxiVentepladsUd(Date forventetTaxiVentepladsUd) {
        this.forventetTaxiVentepladsUd = forventetTaxiVentepladsUd;
    }

    public Date getForventetTaxiLufthavnUd() {
        return forventetTaxiLufthavnUd;
    }

    public void setForventetTaxiLufthavnUd(Date forventetTaxiLufthavnUd) {
        this.forventetTaxiLufthavnUd = forventetTaxiLufthavnUd;
    }

    public TaxiAktivitetTidsforbrug getTaxiAktivitetTidsforbrug() {
        return taxiAktivitetTidsforbrug;
    }

    public void setTaxiAktivitetTidsforbrug(TaxiAktivitetTidsforbrug taxiAktivitetTidsforbrug) {
        this.taxiAktivitetTidsforbrug = taxiAktivitetTidsforbrug;
    }
}
