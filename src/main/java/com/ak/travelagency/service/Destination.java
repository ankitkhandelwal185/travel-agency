package com.ak.travelagency.service;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;

    private List<Activity> activities;

    public Destination(String name){
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        if (activities == null) {
            activities = new ArrayList<>();
        }
        activities.add(activity);
    }

    public void printActivities() {
        System.out.println("Destination: " + name);
        if (activities != null) {
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }
}

