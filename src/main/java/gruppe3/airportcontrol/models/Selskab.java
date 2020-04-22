package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Selskab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String selskab_navn;
    private String selskab_kode;
    @OneToMany
    private List<Fly> mangeFly;

    public Selskab(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSelskab_navn() {
        return selskab_navn;
    }

    public void setSelskab_navn(String selskab_navn) {
        this.selskab_navn = selskab_navn;
    }

    public String getSelskab_kode() {
        return selskab_kode;
    }

    public void setSelskab_kode(String selskab_kode) {
        this.selskab_kode = selskab_kode;
    }

    public List<Fly> getMangeFly() {
        return mangeFly;
    }

    public void setMangeFly(List<Fly> mangeFly) {
        this.mangeFly = mangeFly;
    }
}
