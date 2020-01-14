package lesinski.piotr.dbservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "datetime_of_event")
    @NotNull
    private String dateTimeOfEvent;

    @Column(name = "created_at")
    private String createdAt;

    public Event() {
    }

    public Event(int id, @NotNull String name, @NotNull String description, @NotNull String dateTimeOfEvent, String createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateTimeOfEvent = dateTimeOfEvent;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTimeOfEvent() {
        return dateTimeOfEvent;
    }

    public void setDateTimeOfEvent(String dateTimeOfEvent) {
        this.dateTimeOfEvent = dateTimeOfEvent;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateTimeOfEvent='" + dateTimeOfEvent + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
