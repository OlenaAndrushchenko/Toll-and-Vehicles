package dev.olena.tollvehicles.models;

public class Car implements Vehicle {
    private String registrationPlate;

    public Car(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    @Override
    public double calculateToll() {
        return 100.0;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    
}
