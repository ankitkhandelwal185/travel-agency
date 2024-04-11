package com.ak.travelagency;

import com.ak.travelagency.service.Destination;
import com.ak.travelagency.service.passenger.GoldPassenger;
import com.ak.travelagency.service.passenger.Passenger;
import com.ak.travelagency.service.TravelPackage;
import com.ak.travelagency.service.passenger.PremiumPassenger;
import com.ak.travelagency.service.passenger.StandardPassenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 10);
        Destination destination = new Destination("Test Destination");
        travelPackage.addDestination(destination);
        assertEquals(1, travelPackage.getDestinations().size());
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 2);
        Passenger passenger1 = new StandardPassenger("John", 1);
        Passenger passenger2 = new GoldPassenger("Alice", 2);
        Passenger passenger3 = new PremiumPassenger("Bob", 3);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);
        assertEquals(2, travelPackage.getPassengers().size());
    }
}

// Similarly, you can write test cases for other classes (Destination, Activity, Passenger)

