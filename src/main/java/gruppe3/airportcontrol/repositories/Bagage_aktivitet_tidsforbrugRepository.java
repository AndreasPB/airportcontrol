package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Bagage_aktivitet_tidsforbrug;
import gruppe3.airportcontrol.models.Fly_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bagage_aktivitet_tidsforbrugRepository extends JpaRepository<Bagage_aktivitet_tidsforbrug, Long> {
}
