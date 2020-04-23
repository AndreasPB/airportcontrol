package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.services.IService;
import gruppe3.airportcontrol.services.KlargoeringService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements IService<Klargoering> {

    @Override
    public List<Klargoering> findAll() {
        return null;
    }

    @Override
    public void save(Klargoering element) {

    }

    @Override
    public Klargoering findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
