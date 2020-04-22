package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlargoeringService implements IService<Klargoering> {
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
