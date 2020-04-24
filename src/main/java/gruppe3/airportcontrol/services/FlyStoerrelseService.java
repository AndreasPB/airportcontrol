package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Fly_stoerrelse;
import gruppe3.airportcontrol.repositories.FlyStoerrelseRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlyStoerrelseService implements IService<Fly_stoerrelse>
{
    private final FlyStoerrelseRepository flyStoerrelseRepository;

    public FlyStoerrelseService(FlyStoerrelseRepository flyStoerrelseRepository)
    {
        this.flyStoerrelseRepository = flyStoerrelseRepository;
    }

    @Override
    public List<Fly_stoerrelse> findAll()
    {
        return flyStoerrelseRepository.findAll();
    }

    @Override
    public void save(Fly_stoerrelse element)
    {
        flyStoerrelseRepository.save(element);
    }

    @Override
    public Optional<Fly_stoerrelse> findById(long id) throws NotFoundException
    {
        try{
            return flyStoerrelseRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        flyStoerrelseRepository.deleteById(id);
    }
}
