package steppp1518.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steppp1518.database.BankAccount;
import steppp1518.database.BankAccountRepository;

import java.util.Collection;

@Service
public class BankAccountDBService implements BankAccountService {
    @Autowired
    BankAccountRepository bankAccountRepository;

    @Transactional
    @Override
    public void add(final BankAccount account) {
        bankAccountRepository.save(account);
    }

    @Transactional
    @Override
    public Collection<BankAccount> get_accounts(final String email) {
        return bankAccountRepository.findByEmail(email);
    }
}
