package lesinski.piotr.dbservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "event_id")
    @NotNull
    private int eventId;

    @Column(name = "price")
    @NotNull
    private int price;

    @Column(name = "max_available_qty")
    @NotNull
    private int maxAvailableQty;

    @Column(name = "created_at")
    private String createdAt;

    public Ticket() {
    }

    public Ticket(int id, @NotNull int eventId, @NotNull int price, @NotNull int maxAvailableQty, String createdAt) {
        this.id = id;
        this.eventId = eventId;
        this.price = price;
        this.maxAvailableQty = maxAvailableQty;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxAvailableQty() {
        return maxAvailableQty;
    }

    public void setMaxAvailableQtyQty(int maxAvailableQty) {
        this.maxAvailableQty = maxAvailableQty;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", price=" + price +
                ", maxTicketQty=" + maxAvailableQty +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
