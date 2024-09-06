package dev.olena.tollvehicles.models;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    
    private String name;
    private String city;
    private double totalTollCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalTollCollected = 0.0;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        double toll = vehicle.calculateToll();
        this.totalTollCollected += toll;
        this.vehicles.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTotalTollCollected() {
        return totalTollCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void printVehicleList() {
        System.out.println("Vehicles at " + name + " in " + city + ":");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " with registration plate " + vehicle.getRegistrationPlate() + " and toll " + vehicle.calculateToll());
        }
    }
}
