package steppp1518.service;

import steppp1518.database.BankAccount;

import java.util.Collection;

public interface BankAccountService {
    void add(final BankAccount account);
    Collection<BankAccount> get_accounts(final String email);
}
