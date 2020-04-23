package gruppe3.airportcontrol.models;

import javax.persistence.*;


@Entity
public class Fly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Selskab selskab;

    @OneToOne
    private Fly_model flymodel;

    @OneToOne(mappedBy = "fly")
    private Ankomst_afgang ankomstAfgang;

    public Fly(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Selskab getSelskab() {
        return selskab;
    }

    public void setSelskab(Selskab selskab) {
        this.selskab = selskab;
    }

    public Fly_model getFlymodel() {
        return flymodel;
    }

    public void setFlymodel(Fly_model flymodel) {
        this.flymodel = flymodel;
    }

    public Ankomst_afgang getAnkomstAfgang() {
        return ankomstAfgang;
    }

    public void setAnkomstAfgang(Ankomst_afgang ankomstAfgang) {
        this.ankomstAfgang = ankomstAfgang;
    }


}
