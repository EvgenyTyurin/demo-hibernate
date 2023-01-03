package com.example.demohibernate;

import com.example.demohibernate.jpa.Account;
import com.example.demohibernate.jpa.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Демо-приложение
 */
@SpringBootApplication
public class DemoHibernateApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoHibernateApplication.class);

    // Старт приложения
    public static void main(String[] args) {
        SpringApplication.run(DemoHibernateApplication.class, args);
    }

    // Тест
    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository, AccountRepository accountRepository) {
        return (args) -> {

            Customer customer = new Customer("Jack", "Bauer");
            customerRepository.save(customer);

            accountRepository.save(new Account("12345", customer));
            accountRepository.save(new Account("67890", customer));

            log.info("-- Счета Джека Бауэра");
            for (Account account : accountRepository.findByCustomer(customer)) {
                log.info(account.getNumber());
            }

        };
    }
}
