package com.ak.travelagency.service;

import com.ak.travelagency.service.passenger.Passenger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public List<Destination> getDestinations(){
        return  this.destinations;
    }

    public List<Passenger> getPassengers(){
        return this.passengers;
    }

    public void addDestination(Destination destination) {
        if (destinations == null) {
            destinations = new ArrayList<>();
        }
        destinations.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers == null) {
            passengers = new ArrayList<>();
        }
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Travel package is full. Cannot add more passengers.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + (passengers == null ? 0 : passengers.size()));
        if (passengers != null) {
            for (Passenger passenger : passengers) {
                System.out.println(passenger);
            }
        }
    }
}

