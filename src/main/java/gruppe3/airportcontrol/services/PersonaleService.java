package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Personale;
import gruppe3.airportcontrol.repositories.PersonaleRepository;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public class PersonaleService implements IService<Personale>
{
    private PersonaleRepository personaleRepository;

    public PersonaleService(PersonaleRepository personaleRepository)
    {
        this.personaleRepository = personaleRepository;
    }

    @Override
    public List<Personale> findAll()
    {
        return personaleRepository.findAll();
    }

    @Override
    public void save(Personale element)
    {
        personaleRepository.save(element);
    }

    @Override
    public Optional<Personale> findById(long id) throws NotFoundException
    {
        try{
            return personaleRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        personaleRepository.deleteById(id);
    }
}
