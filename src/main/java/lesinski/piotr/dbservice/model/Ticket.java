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

    @Column(name = "max_tickets_qty")
    @NotNull
    private int maxTicketQty;

    @Column(name = "created_at")
    private String createdAt;

    public Ticket() {
    }

    public Ticket(int id, @NotNull int eventId, @NotNull int price, @NotNull int maxTicketQty, String createdAt) {
        this.id = id;
        this.eventId = eventId;
        this.price = price;
        this.maxTicketQty = maxTicketQty;
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

    public int getMaxTicketQty() {
        return maxTicketQty;
    }

    public void setMaxTicketQty(int maxTicketQty) {
        this.maxTicketQty = maxTicketQty;
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
                ", maxTicketQty=" + maxTicketQty +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
