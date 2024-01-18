package steppp1518.database;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.UUID;

public interface BankAccountRepository extends CrudRepository<BankAccount, UUID> {
    Collection<BankAccount> findByEmail(String email);
}
