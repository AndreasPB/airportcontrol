package gruppe3.airportcontrol.services;

import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiAktivitetTidsforbrugService implements IService<TaxiAktivitetTidsforbrugService> {
    @Override
    public List<TaxiAktivitetTidsforbrugService> findAll() {
        return null;
    }

    @Override
    public void save(TaxiAktivitetTidsforbrugService element) {

    }

    @Override
    public Optional<TaxiAktivitetTidsforbrugService> findById(long id) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public void deleteById(long id) throws NotFoundException {

    }
}
