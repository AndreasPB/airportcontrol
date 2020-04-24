package gruppe3.airportcontrol.repositories;

import gruppe3.airportcontrol.models.Event_log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLogRepository extends JpaRepository<Event_log, Long>
{
}
