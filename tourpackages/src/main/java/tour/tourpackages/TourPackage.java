package tour.tourpackages;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.*;





@Entity
@Table(name = "tour_packages")
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@NotBlank(message = "Destination cannot be empty")
    private String destination;
@Positive(message = "Duration must be greater than zero")
    private int duration; // in days
@Positive(message = "Price must be greater than zero")
    private double price;
    
    @Column(length = 1000)
    private String description;
    
    @Column(length = 2000)
    private String itinerary;

    // Constructors
    public TourPackage() {
    }

    public TourPackage(String destination, int duration, double price, String description, String itinerary) {
        this.destination = destination;
        this.duration = duration;
        this.price = price;
        this.description = description;
        this.itinerary = itinerary;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", itinerary='" + itinerary + '\'' +
                '}';
    }
}
