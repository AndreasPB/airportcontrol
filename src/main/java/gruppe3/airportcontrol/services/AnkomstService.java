package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Ankomst;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnkomstService implements IService<Ankomst> {
    @Override
    public List<Ankomst> findAll() {
        return null;
    }

    @Override
    public void save(Ankomst element) {

    }

    @Override
    public Optional<Ankomst> findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
