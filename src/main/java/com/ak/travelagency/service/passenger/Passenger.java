package com.ak.travelagency.service.passenger;

import com.ak.travelagency.service.Activity;
import com.ak.travelagency.service.constants.PassengerType;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger {

    private String name;

    private int passengerNumber;

    private PassengerType type;

    private double balance;

    public double getBalance() {
        return balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = (type == PassengerType.STANDARD || type == PassengerType.GOLD) ? 1000.0 : 0.0;
    }

    public void signUpForActivity(Activity activity) {
        if (!activity.hasSpace()) {
            System.out.println("Activity " + activity.getActivityName() + " has reached its capacity. Cannot sign up.");
            return;
        }

        if (canSignUp(activity)) {
            if (activities == null) {
                activities = new ArrayList<>();
            }
            activities.add(activity);
            activity.decrementCapacity();
        } else {
            System.out.println("Cannot sign up for activity: " + activity.getActivityName());
        }
    }

    protected abstract boolean canSignUp(Activity activity);

    @Override
    public String toString() {
        return "Passenger: " + name + ", Passenger Number: " + passengerNumber + ", Activities: " + (activities == null ? 0 : activities.size());
    }
}

