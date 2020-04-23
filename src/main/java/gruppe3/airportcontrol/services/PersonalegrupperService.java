package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Personalegrupper;
import gruppe3.airportcontrol.repositories.PersonalegrupperRepository;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public class PersonalegrupperService implements IService<Personalegrupper>
{
    private PersonalegrupperRepository personalegrupperRepository;

    public PersonalegrupperService(PersonalegrupperRepository personalegrupperRepository)
    {
        this.personalegrupperRepository = personalegrupperRepository;
    }

    @Override
    public List<Personalegrupper> findAll()
    {
        return personalegrupperRepository.findAll();
    }

    @Override
    public void save(Personalegrupper element)
    {
        personalegrupperRepository.save(element);
    }

    @Override
    public Optional<Personalegrupper> findById(long id) throws NotFoundException
    {
        try{
            return personalegrupperRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        personalegrupperRepository.deleteById(id);
    }
}
