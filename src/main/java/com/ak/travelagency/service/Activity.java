package com.ak.travelagency.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Activity {
    private String name;
    private String description;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    private double cost;
    private int capacity;
    private Destination destination;

    public String getActivityName() {
        return name;
    }

    public boolean hasSpace() {
        return capacity > 0;
    }

    public void decrementCapacity() {
        capacity--;
    }

    @Override
    public String toString() {
        return "Activity: " + name + ", Description: " + description + ", Cost: " + cost + ", Capacity: " + capacity;
    }
}

