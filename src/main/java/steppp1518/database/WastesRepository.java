package steppp1518.database;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.UUID;

public interface WastesRepository extends CrudRepository<Waste, UUID> {
    Collection<Waste> findByEmail(String email);
}
