package com.codeclan.Course_Customer_bookings.repositories;

import com.codeclan.Course_Customer_bookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
