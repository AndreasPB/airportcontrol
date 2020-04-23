package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Ankomst;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Ankomst findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
