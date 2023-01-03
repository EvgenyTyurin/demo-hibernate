package com.example.demohibernate;

import java.util.List;

import com.example.demohibernate.jpa.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Репо клиентов
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
