package gruppe3.airportcontrol.models;

import javax.persistence.*;


@Entity
public class Fly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Selskab selskab;

    @OneToOne
    private Flymodel flymodel;

    @OneToOne
    private Ankomst ankomst;
    @OneToOne
    private Afgange afgange;

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

    public Flymodel getFlymodel() {
        return flymodel;
    }

    public void setFlymodel(Flymodel flymodel) {
        this.flymodel = flymodel;
    }

    public Ankomst getAnkomst() {
        return ankomst;
    }

    public void setAnkomst(Ankomst ankomst) {
        this.ankomst = ankomst;
    }

    public Afgange getAfgang() {
        return afgange;
    }

    public void setAfgang(Afgange afgange) {
        this.afgange = afgange;
    }
}
