package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Passagere_aktivitet_tidsforbrug;
import gruppe3.airportcontrol.repositories.PassagereAktivitetTidsforbrugRepository;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public class PassagereAktivitetTidsforbrugService implements IService<Passagere_aktivitet_tidsforbrug>
{
    private PassagereAktivitetTidsforbrugRepository passagereAktivitetTidsforbrugRepository;

    public PassagereAktivitetTidsforbrugService(PassagereAktivitetTidsforbrugRepository passagereAktivitetTidsforbrugRepository)
    {
        this.passagereAktivitetTidsforbrugRepository = passagereAktivitetTidsforbrugRepository;
    }

    @Override
    public List<Passagere_aktivitet_tidsforbrug> findAll()
    {
        return passagereAktivitetTidsforbrugRepository.findAll();
    }

    @Override
    public void save(Passagere_aktivitet_tidsforbrug element)
    {
        passagereAktivitetTidsforbrugRepository.save(element);
    }

    @Override
    public Optional<Passagere_aktivitet_tidsforbrug> findById(long id) throws NotFoundException
    {
        try{
            return passagereAktivitetTidsforbrugRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        passagereAktivitetTidsforbrugRepository.deleteById(id);
    }
}
