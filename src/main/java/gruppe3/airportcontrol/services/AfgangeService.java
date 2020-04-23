package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Afgange;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfgangeService implements IService<Afgange> {
    @Override
    public List<Afgange> findAll() {
        return null;
    }

    @Override
    public void save(Afgange element) {

    }

    @Override
    public Afgange findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
