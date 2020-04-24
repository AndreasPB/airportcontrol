package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Passagere_aktivitet;
import gruppe3.airportcontrol.models.Personale_aktivitet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passagere_aktivitetRepository extends JpaRepository<Passagere_aktivitet, Long> {
}
