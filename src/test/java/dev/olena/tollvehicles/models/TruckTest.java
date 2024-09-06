package dev.olena.tollvehicles.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TruckTest {
    @Test
    void testCalculateToll() {
        Truck truck = new Truck("KA8465PE", 4);
        double expectedToll = 50.0 * 4;
        assertEquals(expectedToll, truck.calculateToll());
    }

    @Test
    void testGetNumberOfAxles() {
        Truck truck = new Truck("KA8465PE", 4);
        assertEquals("KA8465PE", truck.getRegistrationPlate());
    }

    @Test
    void testGetRegistrationPlate() {
        Truck truck = new Truck("KA8465PE", 4);
        truck.setRegistrationPlate("NEW1234");
        assertEquals("NEW1234", truck.getRegistrationPlate());
    }
    @Test
    public void testSetNumberOfAxles() {
        Truck truck = new Truck("KA8465PE", 4);
        truck.setNumberOfAxles(6);
        assertEquals(6, truck.getNumberOfAxles());
    }
}
