package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Personale_aktivitet_tidsforbrug;
import gruppe3.airportcontrol.repositories.PersonaleAktivitetTidsforbrugRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaleAktivitetTidsforbrugService implements IService<Personale_aktivitet_tidsforbrug>
{
    private PersonaleAktivitetTidsforbrugRepository personaleAktivitetTidsforbrugRepository;

    public PersonaleAktivitetTidsforbrugService(PersonaleAktivitetTidsforbrugRepository personaleAktivitetTidsforbrugRepository)
    {
        this.personaleAktivitetTidsforbrugRepository = personaleAktivitetTidsforbrugRepository;
    }

    @Override
    public List<Personale_aktivitet_tidsforbrug> findAll()
    {
        return personaleAktivitetTidsforbrugRepository.findAll();
    }

    @Override
    public void save(Personale_aktivitet_tidsforbrug element)
    {
        personaleAktivitetTidsforbrugRepository.save(element);
    }

    @Override
    public Optional<Personale_aktivitet_tidsforbrug> findById(long id) throws NotFoundException
    {
        try{
            return personaleAktivitetTidsforbrugRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        personaleAktivitetTidsforbrugRepository.deleteById(id);
    }
}
