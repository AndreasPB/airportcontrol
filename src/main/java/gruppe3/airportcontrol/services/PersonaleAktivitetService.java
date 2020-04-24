package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Personale;
import gruppe3.airportcontrol.models.Personale_aktivitet;
import gruppe3.airportcontrol.repositories.PersonaleAktivitetRepository;
import gruppe3.airportcontrol.repositories.PersonaleRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaleAktivitetService implements IService<Personale_aktivitet>
{
    private PersonaleAktivitetRepository personaleAktivitetRepository;

    public PersonaleAktivitetService(PersonaleAktivitetRepository personaleAktivitetRepository)
    {
        this.personaleAktivitetRepository = personaleAktivitetRepository;
    }

    @Override
    public List<Personale_aktivitet> findAll()
    {
        return personaleAktivitetRepository.findAll();
    }

    @Override
    public void save(Personale_aktivitet element)
    {
        personaleAktivitetRepository.save(element);
    }

    @Override
    public Optional<Personale_aktivitet> findById(long id) throws NotFoundException
    {
        try{
            return personaleAktivitetRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        personaleAktivitetRepository.deleteById(id);
    }
}
