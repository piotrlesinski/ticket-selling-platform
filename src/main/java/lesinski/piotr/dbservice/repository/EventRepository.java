package lesinski.piotr.dbservice.repository;

import lesinski.piotr.dbservice.model.Event;
import lesinski.piotr.dbservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Integer> {

    Event findByName(String name);

    Event findById(int id);

    List<Event> findAllByUser(User user);

    List<Event> findAll();
}
