package gruppe3.airportcontrol.services;

import gruppe3.airportcontrol.models.Event_log;
import gruppe3.airportcontrol.repositories.EventLogRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventLogService implements IService<Event_log>
{
    private EventLogRepository eventLogRepository;

    public EventLogService(EventLogRepository eventLogRepository)
    {
        this.eventLogRepository = eventLogRepository;
    }

    @Override
    public List<Event_log> findAll()
    {
        return eventLogRepository.findAll();
    }

    @Override
    public void save(Event_log element)
    {
        eventLogRepository.save(element);
    }

    @Override
    public Optional<Event_log> findById(long id) throws NotFoundException
    {
        try{
            return eventLogRepository.findById(id);
        }catch (IllegalArgumentException ia){
            throw new NotFoundException("Not found");
        }
    }

    @Override
    public void deleteById(long id) throws NotFoundException
    {
        eventLogRepository.deleteById(id);
    }
}
