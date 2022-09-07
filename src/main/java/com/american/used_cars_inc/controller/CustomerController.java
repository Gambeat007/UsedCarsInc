package com.american.used_cars_inc.controller;

import com.american.used_cars_inc.model.Customer;
import com.american.used_cars_inc.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/cutomers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
