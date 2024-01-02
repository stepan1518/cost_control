package steppp1518.database;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface WastesRepository extends CrudRepository<Waste, Date> {
}
