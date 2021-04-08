package com.codeclan.Course_Customer_bookings.repositories;

import com.codeclan.Course_Customer_bookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
