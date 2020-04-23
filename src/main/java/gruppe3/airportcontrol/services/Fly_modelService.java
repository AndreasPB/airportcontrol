package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Fly_model;
import gruppe3.airportcontrol.repositories.Fly_modelRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Fly_modelService implements IService<Fly_model> {

    private final Fly_modelRepository fly_modelRepository;

    public Fly_modelService(Fly_modelRepository fly_modelRepository) {
        this.fly_modelRepository = fly_modelRepository;
    }


    @Override
    public List<Fly_model> findAll() {
        return fly_modelRepository.findAll();
    }

    @Override
    public void save(Fly_model element) { fly_modelRepository.save(element);}

    @Override
    public Optional<Fly_model> findById(long id) throws NotFoundException{
        try{
            return fly_modelRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) {
        fly_modelRepository.deleteById(id);
    }
}
