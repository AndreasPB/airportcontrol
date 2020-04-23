package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Selskab;
import gruppe3.airportcontrol.repositories.SelskabRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelskabService implements IService<Selskab> {

    private SelskabRepository selskabRepository;

    public SelskabService(SelskabRepository selskabRepository) {
        this.selskabRepository = selskabRepository;
    }

    @Override
    public List<Selskab> findAll() {
        return selskabRepository.findAll();
    }

    @Override
    public void save(Selskab element) {
        selskabRepository.save(element);
    }

    @Override
    public Optional<Selskab> findById(long id) throws NotFoundException {
        try{
            return selskabRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) {
        selskabRepository.deleteById(id);
    }
}
