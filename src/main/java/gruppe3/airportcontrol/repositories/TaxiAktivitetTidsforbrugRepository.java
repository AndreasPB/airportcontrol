package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.TaxiAktivitetTidsforbrug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiAktivitetTidsforbrugRepository extends JpaRepository<TaxiAktivitetTidsforbrug, Long> {
}
