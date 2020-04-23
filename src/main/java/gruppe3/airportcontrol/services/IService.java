package gruppe3.airportcontrol.services;

import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface IService<E> {

    List<E> findAll();
    void save(E element);
    Optional<E> findById(long id) throws NotFoundException;
    void deleteById(long id) throws NotFoundException;
}
