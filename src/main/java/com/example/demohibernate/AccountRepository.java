package com.example.demohibernate;

import com.example.demohibernate.jpa.Account;
import com.example.demohibernate.jpa.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Репо счетов
 */

public interface AccountRepository extends CrudRepository<Account, String> {

    Account findByNumber(String number);

    List<Account> findByCustomer(Customer customer);
}
