package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Braendstof_aktivitet_tidsforbrug;
import gruppe3.airportcontrol.repositories.BraendstofAktivitetTidsforbrugRepository;
import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public class BraendstofAktivitetTidsforbrugService implements IService<Braendstof_aktivitet_tidsforbrug>
{
    private BraendstofAktivitetTidsforbrugRepository braendstofAktivitetTidsforbrugRepository;

    public BraendstofAktivitetTidsforbrugService(BraendstofAktivitetTidsforbrugRepository braendstofAktivitetTidsforbrugRepository)
    {
        this.braendstofAktivitetTidsforbrugRepository = braendstofAktivitetTidsforbrugRepository;
    }

    @Override
    public List<Braendstof_aktivitet_tidsforbrug> findAll()
    {
        return braendstofAktivitetTidsforbrugRepository.findAll();
    }

    @Override
    public void save(Braendstof_aktivitet_tidsforbrug element)
    {
        braendstofAktivitetTidsforbrugRepository.save(element);
    }

    @Override
    public Optional<Braendstof_aktivitet_tidsforbrug> findById(long id) throws NotFoundException
    {
        try{
            return braendstofAktivitetTidsforbrugRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        braendstofAktivitetTidsforbrugRepository.deleteById(id);
    }
}
