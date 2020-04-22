package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Flymodel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlymodelService implements IService<Flymodel> {
    @Override
    public List<Flymodel> findAll() {
        return null;
    }

    @Override
    public void save(Flymodel element) {

    }

    @Override
    public Flymodel findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
