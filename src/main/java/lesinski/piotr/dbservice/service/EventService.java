package lesinski.piotr.dbservice.service;

import lesinski.piotr.dbservice.model.Event;
import lesinski.piotr.dbservice.model.User;

import java.util.List;

public interface EventService {

    Event findByEventName(String name);

    Event findById(int id);

    List<Event> findEventByUser(User user);

    List<Event> findAll();
}
