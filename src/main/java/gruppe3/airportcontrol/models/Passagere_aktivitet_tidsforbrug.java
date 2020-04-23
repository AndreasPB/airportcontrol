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
}
