package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Fly_stoerrelse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoerrelseService implements IService<Fly_stoerrelse> {
    @Override
    public List<Fly_stoerrelse> findAll() {
        return null;
    }

    @Override
    public void save(Fly_stoerrelse element) {

    }

    @Override
    public Optional<Fly_stoerrelse> findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
