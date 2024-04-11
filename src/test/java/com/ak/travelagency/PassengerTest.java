package com.ak.travelagency;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.Destination;
import com.ak.travelagency.service.passenger.Passenger;
import com.ak.travelagency.service.passenger.StandardPassenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 1, destination);
        Passenger passenger = new StandardPassenger("John", 1);
        passenger.signUpForActivity(activity);
        assertEquals(1, passenger.getActivities().size());
    }

    @Test
    public void testSignUpForFullActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 0, destination);
        Passenger passenger = new StandardPassenger("John", 1);
        passenger.signUpForActivity(activity);
        assertTrue(passenger.getActivities().isEmpty());
    }

    @Test
    public void testSignUpWithInsufficientBalance() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 1, destination);
        Passenger passenger = new StandardPassenger("John", 1);
        passenger.signUpForActivity(activity);
        assertEquals(0, passenger.getActivities().size());
    }
}

