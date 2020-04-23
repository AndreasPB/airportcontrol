package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Stoerrelse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoerrelseService implements IService<Stoerrelse> {
    @Override
    public List<Stoerrelse> findAll() {
        return null;
    }

    @Override
    public void save(Stoerrelse element) {

    }

    @Override
    public Stoerrelse findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
