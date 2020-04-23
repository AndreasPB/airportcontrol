package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Fly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<Fly, Long> {
}
