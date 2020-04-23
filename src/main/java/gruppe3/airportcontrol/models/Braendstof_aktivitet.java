package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Braendstof_aktivitet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_braendstof_aktivitet;

    private LocalTime planlagt_paafyld;

    private LocalTime forventet_paafyld;

    @OneToOne
    private Ankomst_afgang ankomst_afgang;

    @OneToOne
    private Braendstof_aktivitet_tidsforbrug braendstof_aktivitet_tidsforbrug;

    public Braendstof_aktivitet() {
    }

    public long getId_braendstof_aktivitet() {
        return id_braendstof_aktivitet;
    }

    public void setId_braendstof_aktivitet(long id_braendstof_aktivitet) {
        this.id_braendstof_aktivitet = id_braendstof_aktivitet;
    }

    public LocalTime getPlanlagt_paafyld() {
        return planlagt_paafyld;
    }

    public void setPlanlagt_paafyld(LocalTime planlagt_paafyld) {
        this.planlagt_paafyld = planlagt_paafyld;
    }

    public LocalTime getForventet_paafyld() {
        return forventet_paafyld;
    }

    public void setForventet_paafyld(LocalTime forventet_paafyld) {
        this.forventet_paafyld = forventet_paafyld;
    }

    public Ankomst_afgang getAnkomst_afgang() {
        return ankomst_afgang;
    }

    public void setAnkomst_afgang(Ankomst_afgang ankomst_afgang) {
        this.ankomst_afgang = ankomst_afgang;
    }

    public Braendstof_aktivitet_tidsforbrug getBraendstof_aktivitet_tidsforbrug() {
        return braendstof_aktivitet_tidsforbrug;
    }

    public void setBraendstof_aktivitet_tidsforbrug(Braendstof_aktivitet_tidsforbrug braendstof_aktivitet_tidsforbrug) {
        this.braendstof_aktivitet_tidsforbrug = braendstof_aktivitet_tidsforbrug;
    }
}
