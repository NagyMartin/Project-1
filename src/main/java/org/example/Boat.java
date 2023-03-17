package org.example;

public class Boat implements Vehicle {

    public void drive(double x) {
        System.out.println("The boat drove for: " + x + " kilometers.");
    }


    public void start() {
        System.out.println("Boat engine started.");
    }


    public void stop() {
        System.out.println("Boat engine stopped.");
    }
}
