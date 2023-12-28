package steppp1518.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    private String email;
    private String password;

    @Transient
    private Collection<Role> roles;

    public Client() {
        roles = new ArrayList<>();
        roles.add(Role.USER);
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

    public Collection<Role> getRoles() {
        return roles;
    }
}
