package gruppe3.airportcontrol.models;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
public class Klargoering {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int taxiInt;
    private int pass_ud;
    private int bag_ud;
    private int braendstof;
    private int bag_ind;
    private int pass_ind;
    private int taxi_ud;
    @OneToOne
    private Afgange afgang;
    @OneToOne
    private Ankomst ankomst;


    public Klargoering(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTaxiInt() {
        return taxiInt;
    }

    public void setTaxiInt(int taxiInt) {
        this.taxiInt = taxiInt;
    }

    public int getPass_ud() {
        return pass_ud;
    }

    public void setPass_ud(int pass_ud) {
        this.pass_ud = pass_ud;
    }

    public int getBag_ud() {
        return bag_ud;
    }

    public void setBag_ud(int bag_ud) {
        this.bag_ud = bag_ud;
    }

    public int getBraendstof() {
        return braendstof;
    }

    public void setBraendstof(int braendstof) {
        this.braendstof = braendstof;
    }

    public int getBag_ind() {
        return bag_ind;
    }

    public void setBag_ind(int bag_ind) {
        this.bag_ind = bag_ind;
    }

    public int getPass_ind() {
        return pass_ind;
    }

    public void setPass_ind(int pass_ind) {
        this.pass_ind = pass_ind;
    }

    public int getTaxi_ud() {
        return taxi_ud;
    }

    public void setTaxi_ud(int taxi_ud) {
        this.taxi_ud = taxi_ud;
    }

    public Afgange getAfgang() {
        return afgang;
    }

    public void setAfgang(Afgange afgang) {
        this.afgang = afgang;
    }

    public Ankomst getAnkomst() {
        return ankomst;
    }

    public void setAnkomst(Ankomst ankomst) {
        this.ankomst = ankomst;
    }
}
