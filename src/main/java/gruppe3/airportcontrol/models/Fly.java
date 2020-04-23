package gruppe3.airportcontrol.models;

import org.springframework.ui.Model;

import javax.persistence.*;
import java.util.List;

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
    private Afgange afgang;

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
        return afgang;
    }

    public void setAfgang(Afgange afgang) {
        this.afgang = afgang;
    }
}
