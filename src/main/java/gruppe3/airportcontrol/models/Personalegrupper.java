package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class personalegrupper
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_personalegrupper;

    private String personalegruppe;
    @OneToMany
    private List<personale> personaleList;

    public personalegrupper()
    {
    }

    public long getId_personalegrupper()
    {
        return id_personalegrupper;
    }

    public void setId_personalegrupper(long id_personalegrupper)
    {
        this.id_personalegrupper = id_personalegrupper;
    }

    public String getPersonalegruppe()
    {
        return personalegruppe;
    }

    public void setPersonalegruppe(String personalegruppe)
    {
        this.personalegruppe = personalegruppe;
    }

    public List<personale> getPersonaleList()
    {
        return personaleList;
    }

    public void setPersonaleList(List<personale> personaleList)
    {
        this.personaleList = personaleList;
    }
}
