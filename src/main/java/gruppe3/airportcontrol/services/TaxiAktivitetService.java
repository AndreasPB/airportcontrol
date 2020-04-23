package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.TaxiAktivitet;
import gruppe3.airportcontrol.repositories.TaxiAktivitetRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiAktivitetService implements IService<TaxiAktivitet> {
    private TaxiAktivitetRepository taxiAktivitetRepository;

    public TaxiAktivitetService(TaxiAktivitetRepository taxiAktivitetRepository) {
        this.taxiAktivitetRepository = taxiAktivitetRepository;
    }

    @Override
    public List<TaxiAktivitet> findAll() {
       return taxiAktivitetRepository.findAll();
    }

    @Override
    public void save(TaxiAktivitet element) {
        taxiAktivitetRepository.save(element);
    }

    @Override
    public Optional<TaxiAktivitet> findById(long id) throws NotFoundException {
        try{
            return taxiAktivitetRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        taxiAktivitetRepository.deleteById(id);
    }
}
