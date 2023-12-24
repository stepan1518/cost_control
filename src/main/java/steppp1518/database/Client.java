package steppp1518.database;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    private String email;
    private String password;

    public Client() {

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
