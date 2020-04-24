package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.TaxiAktivitetTidsforbrug;
import gruppe3.airportcontrol.repositories.TaxiAktivitetTidsforbrugRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiAktivitetTidsforbrugService implements IService<TaxiAktivitetTidsforbrug> {
    private TaxiAktivitetTidsforbrugRepository taxiAktivitetTidsforbrugRepository;

    public TaxiAktivitetTidsforbrugService(TaxiAktivitetTidsforbrugRepository taxiAktivitetTidsforbrugRepository) {
        this.taxiAktivitetTidsforbrugRepository = taxiAktivitetTidsforbrugRepository;
    }

    @Override
    public List<TaxiAktivitetTidsforbrug> findAll() {
       return taxiAktivitetTidsforbrugRepository.findAll();
}

    @Override
    public void save(TaxiAktivitetTidsforbrug element) {
        taxiAktivitetTidsforbrugRepository.save(element);

    }

    @Override
    public Optional<TaxiAktivitetTidsforbrug> findById(long id) throws NotFoundException {
        try{
            return taxiAktivitetTidsforbrugRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        taxiAktivitetTidsforbrugRepository.deleteById(id);

    }
}
