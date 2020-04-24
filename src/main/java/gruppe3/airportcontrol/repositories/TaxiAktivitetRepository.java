package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.TaxiAktivitet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiAktivitetRepository extends JpaRepository<TaxiAktivitet, Long> {
}
