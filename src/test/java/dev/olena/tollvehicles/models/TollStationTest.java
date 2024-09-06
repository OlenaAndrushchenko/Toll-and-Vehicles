package dev.olena.tollvehicles.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class TollStationTest {
    @Test
    void testAddVehicleAndTotalToll() {
        TollStation tollStation = new TollStation("FactoriaF5", "Langreo");

        Vehicle car = new Car("AB3194BD");
        Vehicle motorcycle = new Motorcycle("AA7777HH");
        Vehicle truck = new Truck("KA8465PE", 4);

        tollStation.addVehicle(car);
        tollStation.addVehicle(motorcycle);
        tollStation.addVehicle(truck);

        double expectedTotalTollCollected = 100.0 + 50.0 + (50.0 * 4);
        assertEquals(expectedTotalTollCollected, tollStation.getTotalTollCollected());

        assertEquals(3, tollStation.getVehicles().size());
    }

    @Test
    void testPrintVehicleList() {
        TollStation tollStation = new TollStation("FactoriaF5", "Langreo");

        Vehicle car = new Car("AB3194BD");
        Vehicle motorcycle = new Motorcycle("AA7777HH");
        Vehicle truck = new Truck("KA8465PE", 4);

        tollStation.addVehicle(car);
        tollStation.addVehicle(motorcycle);
        tollStation.addVehicle(truck);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        tollStation.printVehicleList();
        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("Vehicles at FactoriaF5 in Langreo:"));
        assertTrue(output.contains("Car with registration plate AB3194BD and toll 100.0"));
        assertTrue(output.contains("Motorcycle with registration plate AA7777HH and toll 50.0"));
        assertTrue(output.contains("Truck with registration plate KA8465PE and toll 200.0")); 
    }

    @Test
    public void testGettersAndSetters() {
        TollStation tollStation = new TollStation("FactoriaF5", "Langreo");

        assertEquals("FactoriaF5", tollStation.getName(), "Initial name should be FactoriaF5.");
        assertEquals("Langreo", tollStation.getCity(), "Initial city should be Langreo.");

        tollStation.setName("NewName");
        tollStation.setCity("NewCity");

        assertEquals("NewName", tollStation.getName(), "Name should be updated to NewName.");
        assertEquals("NewCity", tollStation.getCity(), "City should be updated to NewCity.");
    }
}
