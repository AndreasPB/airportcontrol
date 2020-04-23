package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Ankomst_afgang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnkomstRepository extends JpaRepository<Ankomst_afgang, Long> {
}
