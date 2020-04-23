package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Klargoering;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KlargoeringService implements IService<Klargoering> {
    private JpaRepository jpaRepo;

    public KlargoeringService(@Qualifier("klargoeringRepository") JpaRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    @Override
    public List<Klargoering> findAll() {
        return jpaRepo.findAll();
    }

    @Override
    public void save(Klargoering element) {

    }

    @Override
    public Klargoering findById(long id) throws NotFoundException {
        return null;
    }

    @Override
    public void deleteById(long id) throws NotFoundException {
        jpaRepo.deleteById(id);

    }
}
