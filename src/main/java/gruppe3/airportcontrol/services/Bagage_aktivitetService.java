package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Bagage_aktivitet;
import gruppe3.airportcontrol.repositories.Bagage_aktivitetRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bagage_aktivitetService implements IService<Bagage_aktivitet> {

    private Bagage_aktivitetRepository bagage_aktivitetRepository;

    public Bagage_aktivitetService(Bagage_aktivitetRepository bagage_aktivitetRepository) {
        this.bagage_aktivitetRepository = bagage_aktivitetRepository;
    }

    @Override
    public List<Bagage_aktivitet> findAll() {
        return bagage_aktivitetRepository.findAll();
    }

    @Override
    public void save(Bagage_aktivitet element) {
        bagage_aktivitetRepository.save(element);
    }

    @Override
    public Optional<Bagage_aktivitet> findById(long id) throws NotFoundException {
        try{
            return bagage_aktivitetRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        bagage_aktivitetRepository.deleteById(id);
    }
}
