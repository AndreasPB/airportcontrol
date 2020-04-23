package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Passagere_aktivitet;
import gruppe3.airportcontrol.repositories.Passagere_aktivitetRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Passagere_aktivitetService implements IService<Passagere_aktivitet> {

    private Passagere_aktivitetRepository passagere_aktivitetRepository;

    public Passagere_aktivitetService(Passagere_aktivitetRepository passagere_aktivitetRepository) {
        this.passagere_aktivitetRepository = passagere_aktivitetRepository;
    }

    @Override
    public List<Passagere_aktivitet> findAll() {
        return passagere_aktivitetRepository.findAll();
    }

    @Override
    public void save(Passagere_aktivitet element) {
        passagere_aktivitetRepository.save(element);
    }

    @Override
    public Optional<Passagere_aktivitet> findById(long id) throws NotFoundException {
        try{
            return passagere_aktivitetRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        passagere_aktivitetRepository.deleteById(id);
    }
}
