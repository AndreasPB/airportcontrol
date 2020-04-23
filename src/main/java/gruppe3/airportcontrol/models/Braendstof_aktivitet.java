package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity
public class braendstof_aktivitet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_braendstof_aktivitet;

    private LocalTime planlagt_paafyld;

    private LocalTime forventet_paafyld;

    @OneToOne
    private ankomst_afgang ankomst_afgang;

    @OneToOne
    private braendstof_aktivitet_tidsforbrug braendstof_aktivitet_tidsforbrug;

}
