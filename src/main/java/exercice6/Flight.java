package exercice6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Flight {
    private String flightID;
    private int capacity;
    private int nbreReservation;
    Set<Customer> reservations;

    public Flight(String flightID, int capacity) {
        this.flightID = flightID;
        this.capacity = capacity;
        this.reservations = new HashSet<>();
    }

    public void setNbreReservation(int nbreReservation) {
        this.nbreReservation = nbreReservation;
    }
    public boolean possibleToBook() {
        return capacity > nbreReservation;
    }

    public void makeReservation(Customer customer) {
        reservations.add(customer);
        nbreReservation += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightID, flight.flightID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(flightID);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", capacity=" + capacity +
                ", Saturé=" + (capacity <= nbreReservation) +
                ", reservations=" + reservations +
                '}';
    }
}
