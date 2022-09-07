package com.american.used_cars_inc.repository;

import com.american.used_cars_inc.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT customer FROM Customer customer")
    List<Customer> findAllCustomers();
}
