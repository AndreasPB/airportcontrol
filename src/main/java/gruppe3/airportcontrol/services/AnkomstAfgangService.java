package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Ankomst_afgang;
import gruppe3.airportcontrol.repositories.AnkomstAfgangRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnkomstAfgangService implements IService<Ankomst_afgang>{

    @Autowired
    private AnkomstAfgangRepository ankomstAfgangRepository;

    public AnkomstAfgangService(AnkomstAfgangRepository ankomstAfgangRepository)
    {
        this.ankomstAfgangRepository = ankomstAfgangRepository;
    }


    public List<Ankomst_afgang> findAll() {
        return ankomstAfgangRepository.findAll();
    }


    public void save(Ankomst_afgang element)
    {
        ankomstAfgangRepository.save(element);
    }


    public Optional<Ankomst_afgang> findById(long id) throws NotFoundException
    {
        try{
            return ankomstAfgangRepository.findById(id);
        }catch (IllegalArgumentException ia)
        {
            throw new NotFoundException("Not found");
        }
    }


    public void deleteById(long id) {
        ankomstAfgangRepository.deleteById(id);
    }
}
