package dev.olena.tollvehicles.models;

public class Truck implements Vehicle {
    private String registrationPlate;
    private int numberOfAxles;

    public Truck(String registrationPlate, int numberOfAxles) {
        this.registrationPlate = registrationPlate;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double calculateToll() {
        return 50.0 * numberOfAxles;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    
}
