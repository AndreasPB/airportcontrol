package gruppe3.airportcontrol.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Personalegrupper
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String personalegruppe;
    @OneToMany
    private List<Personale> personaleList;

    public Personalegrupper()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getPersonalegruppe()
    {
        return personalegruppe;
    }

    public void setPersonalegruppe(String personalegruppe)
    {
        this.personalegruppe = personalegruppe;
    }

    public List<Personale> getPersonaleList()
    {
        return personaleList;
    }

    public void setPersonaleList(List<Personale> personaleList)
    {
        this.personaleList = personaleList;
    }
}
