package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Fly;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlyService implements IService<Fly> {

    @Override
    public List<Fly> findAll() {
        return null;
    }

    @Override
    public void save(Fly element) {

    }

    @Override
    public Optional<Fly> findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
