package com.gozde.dockercomposedemo.service;

import com.gozde.dockercomposedemo.model.Customer;
import com.gozde.dockercomposedemo.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private final CustomerRepository customerRepository;


    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostConstruct
    public void init() {
        Customer customer1 = new Customer();
        customer1.setFirstName("Gozde");
        customer1.setLastName("Yalcin");
        customerRepository.save(customer1);
        
        Customer customer2 = new Customer();
        customer2.setFirstName("Boncuk");
        customer2.setLastName("Yalcin");
        customerRepository.save(customer2);
    }
}
