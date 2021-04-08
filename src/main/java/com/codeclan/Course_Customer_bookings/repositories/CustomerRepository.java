package com.codeclan.Course_Customer_bookings.repositories;

import com.codeclan.Course_Customer_bookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
