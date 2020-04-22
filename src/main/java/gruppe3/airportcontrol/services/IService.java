package gruppe3.airportcontrol.services;

import java.util.List;
import java.util.Optional;

public interface IService<E> {

    List<E> findAll();
    void save(E element);
    E findById(long id);
    void deleteById(long id);
}
