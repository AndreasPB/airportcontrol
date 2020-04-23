package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Fly_stoerrelse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoerrelseRepository extends JpaRepository<Fly_stoerrelse, Long> {
}
