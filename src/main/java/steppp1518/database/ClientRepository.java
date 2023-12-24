package steppp1518.database;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
    Client findByEmail(String email);
}
