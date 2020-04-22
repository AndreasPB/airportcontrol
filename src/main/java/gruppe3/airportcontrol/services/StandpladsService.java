package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Standplads;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandpladsService implements IService<Standplads> {
    @Override
    public List<Standplads> findAll() {
        return null;
    }

    @Override
    public void save(Standplads element) {

    }

    @Override
    public Standplads findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
