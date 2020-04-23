package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Fly;
import gruppe3.airportcontrol.repositories.FlyRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlyService implements IService<Fly> {

    private final FlyRepository flyRepository;

    public FlyService(FlyRepository flyRepository) {
        this.flyRepository = flyRepository;
    }

    @Override
    public List<Fly> findAll() {
        return flyRepository.findAll();
    }

    @Override
    public void save(Fly element) {
        flyRepository.save(element);
    }

    @Override
    public Optional<Fly> findById(long id) throws NotFoundException {
        try{
            return flyRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) {
        flyRepository.deleteById(id);
    }
}
