package dev.olena.tollvehicles.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void testSetRegistrationPlateForCar() {
        Car car = new Car("AB3194BD");

        car.setRegistrationPlate("XYZ1234");

        assertEquals("XYZ1234", car.getRegistrationPlate());
    }

    @Test
    public void testSetRegistrationPlateForMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("AA7777HH");

        motorcycle.setRegistrationPlate("LMN5678");

        assertEquals("LMN5678", motorcycle.getRegistrationPlate());
    }
}
