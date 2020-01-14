package lesinski.piotr.dbservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "event_id")
    @NotNull
    private int eventId;

    @Column(name = "user_id")
    @NotNull
    private int userId;

    @Column(name = "quantity")
    @NotNull
    private int quantity;

    @Column(name = "created_at")
    private String createdAt;

    public Reservation() {
    }

    public Reservation(int id, @NotNull int eventId, @NotNull int userId, @NotNull int quantity, String createdAt) {
        this.id = id;
        this.eventId = eventId;
        this.userId = userId;
        this.quantity = quantity;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
