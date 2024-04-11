package com.ak.travelagency;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.Destination;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 10, destination);
        destination.addActivity(activity);
        assertEquals(1, destination.getActivities().size());
    }
}

