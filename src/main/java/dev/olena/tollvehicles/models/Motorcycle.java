package dev.olena.tollvehicles.models;

public class Motorcycle implements Vehicle {
    private String registrationPlate;

    public Motorcycle(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }   

    @Override
    public double calculateToll() {
        return 50.0;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    
}
