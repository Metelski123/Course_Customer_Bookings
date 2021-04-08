package com.codeclan.Course_Customer_bookings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Column(name = "name")
    private String name;

    @Column(name = "town")
    private String town;

    @Column(name = "star_rating")
    private int starRating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "course")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonIgnoreProperties({"course"})
    private List<Booking> bookings;



    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
    }

    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
