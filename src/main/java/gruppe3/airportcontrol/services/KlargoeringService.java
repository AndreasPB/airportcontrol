package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import gruppe3.airportcontrol.repositories.KlargoeringRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KlargoeringService implements IService<Klargoering> {
    private KlargoeringRepository klargoeringRepository;

    public KlargoeringService(KlargoeringRepository klargoeringRepository) {
        this.klargoeringRepository = klargoeringRepository;
    }

    @Override
    public List<Klargoering> findAll() {
        return klargoeringRepository.findAll();
    }

    @Override
    public void save(Klargoering element) {
        klargoeringRepository.save(element);
    }

    @Override
    public Optional<Klargoering> findById(long id) throws NotFoundException {
        try{
            return klargoeringRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) {
        klargoeringRepository.deleteById(id);
    }
}
