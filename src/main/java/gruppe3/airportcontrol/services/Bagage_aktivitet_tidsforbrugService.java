package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Bagage_aktivitet_tidsforbrug;
import gruppe3.airportcontrol.repositories.Bagage_aktivitet_tidsforbrugRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bagage_aktivitet_tidsforbrugService implements IService<Bagage_aktivitet_tidsforbrug> {

    private Bagage_aktivitet_tidsforbrugRepository bagage_aktivitet_tidsforbrugRepository;

    public Bagage_aktivitet_tidsforbrugService(Bagage_aktivitet_tidsforbrugRepository bagage_aktivitet_tidsforbrugRepository) {
        this.bagage_aktivitet_tidsforbrugRepository = bagage_aktivitet_tidsforbrugRepository;
    }

    @Override
    public List<Bagage_aktivitet_tidsforbrug> findAll() {
        return bagage_aktivitet_tidsforbrugRepository.findAll();
    }

    @Override
    public void save(Bagage_aktivitet_tidsforbrug element) {
        bagage_aktivitet_tidsforbrugRepository.save(element);
    }

    @Override
    public Optional<Bagage_aktivitet_tidsforbrug> findById(long id) throws NotFoundException {
        try{
            return bagage_aktivitet_tidsforbrugRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        bagage_aktivitet_tidsforbrugRepository.deleteById(id);
    }
}
