package com.ak.travelagency.service.passenger;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.constants.PassengerType;

public class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, PassengerType.GOLD);
    }

    @Override
    protected boolean canSignUp(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        return getBalance() >= discountedCost;
    }
}
