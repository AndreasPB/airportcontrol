package gruppe3.airportcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiAktivitetTidsforbrugRepository extends JpaRepository<TaxiAktivitetTidsforbrugRepository, Long> {
}
