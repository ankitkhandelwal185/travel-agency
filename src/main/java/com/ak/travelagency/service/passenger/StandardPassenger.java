package com.ak.travelagency.service.passenger;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.constants.PassengerType;

public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, PassengerType.STANDARD);
    }

    @Override
    protected boolean canSignUp(Activity activity) {
        return getBalance() >= activity.getCost();
    }
}
