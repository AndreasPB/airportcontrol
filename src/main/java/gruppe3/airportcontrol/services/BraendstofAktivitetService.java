package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Braendstof_aktivitet;
import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.repositories.BraendstofAktivitetRepository;
import gruppe3.airportcontrol.repositories.KlargoeringRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BraendstofAktivitetService implements IService<Braendstof_aktivitet>
{
    private BraendstofAktivitetRepository braendstofAktivitetRepository;

    public BraendstofAktivitetService(BraendstofAktivitetRepository braendstofAktivitetRepository)
    {
        this.braendstofAktivitetRepository = braendstofAktivitetRepository;
    }

    @Override
    public List<Braendstof_aktivitet> findAll()
    {
        return braendstofAktivitetRepository.findAll();
    }

    @Override
    public void save(Braendstof_aktivitet element)
    {
        braendstofAktivitetRepository.save(element);
    }

    @Override
    public Optional<Braendstof_aktivitet> findById(long id) throws NotFoundException
    {
        try{
            return braendstofAktivitetRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        braendstofAktivitetRepository.deleteById(id);
    }
}
