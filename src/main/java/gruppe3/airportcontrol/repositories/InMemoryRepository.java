package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.services.IService;
import gruppe3.airportcontrol.services.KlargoeringService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepository {
    private ArrayList<Klargoering> klargoering = new ArrayList();

    @PostConstruct
    public void initData() {
        Klargoering klargoering1 = new Klargoering();
        Klargoering klargoering2 = new Klargoering();
        Klargoering klargoering3 = new Klargoering();
        klargoering.add(klargoering1);
        klargoering.add(klargoering2);
        klargoering.add(klargoering3);
    }

    public List<Klargoering> findAll() {
        return klargoering;
    }

    public void save(Klargoering element) {
        klargoering.add(element);

    }

    public Klargoering findById(long id) throws NotFoundException {
        for (Klargoering klargoering1 : klargoering) {
            if (klargoering1.getId() == id) {
                return klargoering1;
            }
        }
        throw new NotFoundException("The klargoring with id=" + id + " could not be found.");
    }

    public void deleteById(long id) throws NotFoundException {
        klargoering.remove(findById(id));
    }
}
