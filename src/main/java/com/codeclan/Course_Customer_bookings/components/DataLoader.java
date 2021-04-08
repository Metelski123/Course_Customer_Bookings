package com.codeclan.Course_Customer_bookings.components;


import com.codeclan.Course_Customer_bookings.models.Booking;
import com.codeclan.Course_Customer_bookings.models.Course;
import com.codeclan.Course_Customer_bookings.models.Customer;
import com.codeclan.Course_Customer_bookings.repositories.BookingRepository;
import com.codeclan.Course_Customer_bookings.repositories.CourseRepository;
import com.codeclan.Course_Customer_bookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {


        Course course1 = new Course("BodyBuilding", "Linlithgow", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Dungeons and Dragons", "Keighley", 2);
        courseRepository.save(course2);

        Customer James = new Customer("James", "Keighley", 38);
        customerRepository.save(James);

        Customer Jan = new Customer("Jan", "Linlithgow", 35);
        customerRepository.save(Jan);

        Booking fitness = new Booking("12-03-21", James, course1);
        bookingRepository.save(fitness);

        Booking roleplay = new Booking("23-12-21", Jan, course2);
        bookingRepository.save(roleplay);
    }
}
