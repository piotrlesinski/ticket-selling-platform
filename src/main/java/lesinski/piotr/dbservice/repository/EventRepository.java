package lesinski.piotr.dbservice.repository;

import lesinski.piotr.dbservice.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("eventRepository")
public interface EventRepository extends JpaRepository<Event, Integer> {

    public Event findByEvent(String event);
}
