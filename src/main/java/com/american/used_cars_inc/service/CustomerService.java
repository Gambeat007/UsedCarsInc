package com.american.used_cars_inc.service;


import com.american.used_cars_inc.model.Customer;
import com.american.used_cars_inc.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() {
        return customerRepository.findAllCustomers();
    }

    public List<Customer> findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }
}
