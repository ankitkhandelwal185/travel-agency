package com.ak.travelagency;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.Destination;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void testHasSpace() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 1, destination);
        assertTrue(activity.hasSpace());
    }

    @Test
    public void testDecrementCapacity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 50.0, 1, destination);
        activity.decrementCapacity();
        assertFalse(activity.hasSpace());
    }
}

