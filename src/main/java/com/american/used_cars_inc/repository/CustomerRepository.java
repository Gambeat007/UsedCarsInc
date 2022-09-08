package com.american.used_cars_inc.repository;

import com.american.used_cars_inc.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT customer FROM Customer customer")
    List<Customer> findAllCustomers();

    @Query("SELECT customer FROM Customer customer WHERE customer.name = :name")
    List<Customer> findCustomerByName(@Param("name") String name);
}
