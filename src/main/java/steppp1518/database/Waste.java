package steppp1518.database;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "wastes")
public class Waste implements Cloneable {
    @Id
    private UUID id;
    private Date date;
    private Category category;
    private String email;
    private BigDecimal amount;
    @Version
    private Long version;

    @PrePersist
    public void prePersist() {
        date = new Date();
        id = UUID.randomUUID();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Waste clone() throws CloneNotSupportedException {
        return (Waste)super.clone();
    }
}
