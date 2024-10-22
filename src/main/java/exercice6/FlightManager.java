package exercice6;

import exercice6.exceptions.FlightNotFoundException;
import exercice6.exceptions.InsufficientSeatsException;

import java.util.HashSet;
import java.util.Set;

public class FlightManager {

    Set<Flight> flights;
    Set<Customer> customers;

    public FlightManager() {
        flights = new HashSet<>();
        customers = new HashSet<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void bookFlight(Flight flight, Customer customer) throws FlightNotFoundException, InsufficientSeatsException {

        if (!flights.contains(flight)) {
            throw new FlightNotFoundException("Ce vol n'existe pas");
        }

        if (!flight.possibleToBook()) {
            throw new InsufficientSeatsException("Ce vol est saturé");
        }

        flight.makeReservation(customer);
    }


}
