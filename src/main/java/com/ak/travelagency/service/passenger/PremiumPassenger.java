package com.ak.travelagency.service.passenger;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.constants.PassengerType;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, PassengerType.PREMIUM);
    }

    @Override
    protected boolean canSignUp(Activity activity) {
        return true; // Premium passenger can sign up for any activity
    }
}
