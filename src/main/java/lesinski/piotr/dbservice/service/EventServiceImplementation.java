package lesinski.piotr.dbservice.service;

import lesinski.piotr.dbservice.model.Event;
import lesinski.piotr.dbservice.model.User;
import lesinski.piotr.dbservice.repository.EventRepository;

import java.util.List;

public class EventServiceImplementation implements EventService {

    private EventRepository eventRepository;

    @Override
    public Event findByEventName(String name) {
        return eventRepository.findByName(name);
    }

    @Override
    public Event findById(int id) {
        return eventRepository.findById(id);
    }

    @Override
    public List<Event> findEventByUser(User user) {
        return eventRepository.findAllByUser(user);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
