package gruppe3.airportcontrol.services;

import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiAktivitetService implements IService<TaxiAktivitetService> {
    @Override
    public List<TaxiAktivitetService> findAll() {
        return null;
    }

    @Override
    public void save(TaxiAktivitetService element) {

    }

    @Override
    public Optional<TaxiAktivitetService> findById(long id) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public void deleteById(long id) throws NotFoundException {

    }
}
