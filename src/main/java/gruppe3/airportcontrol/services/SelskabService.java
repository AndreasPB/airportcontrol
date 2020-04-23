package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Selskab;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelskabService implements IService<Selskab> {
    @Override
    public List<Selskab> findAll() {
        return null;
    }

    @Override
    public void save(Selskab element) {

    }

    @Override
    public Optional<Selskab> findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
