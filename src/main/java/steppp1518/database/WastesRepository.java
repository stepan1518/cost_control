package steppp1518.database;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Date;

public interface WastesRepository extends CrudRepository<Waste, Date> {
    Collection<Waste> findByEmail(String email);
}
