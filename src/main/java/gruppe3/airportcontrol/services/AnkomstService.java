package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Ankomst_afgang;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnkomstService implements IService<Ankomst_afgang> {
    @Override
    public List<Ankomst_afgang> findAll() {
        return null;
    }

    @Override
    public void save(Ankomst_afgang element) {

    }

    @Override
    public Optional<Ankomst_afgang> findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
