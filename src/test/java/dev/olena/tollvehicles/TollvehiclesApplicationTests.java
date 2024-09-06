package dev.olena.tollvehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import dev.olena.tollvehicles.models.Car;
import dev.olena.tollvehicles.models.Motorcycle;
import dev.olena.tollvehicles.models.TollStation;
import dev.olena.tollvehicles.models.Truck;
import dev.olena.tollvehicles.models.Vehicle;

@SpringBootTest
class TollvehiclesApplicationTests {

	@Test
    public void testTollCalculation() {
        TollStation tollStation = new TollStation("Main Station", "Metropolis");

        Vehicle car = new Car("AB3194BD");
        Vehicle motorcycle = new Motorcycle("AA7777HH");
        Vehicle truck = new Truck("KA8465PE", 4);

        tollStation.addVehicle(car);
        tollStation.addVehicle(motorcycle);
        tollStation.addVehicle(truck);

        assertEquals(100.0, car.calculateToll());
        assertEquals(50.0, motorcycle.calculateToll());
        assertEquals(200.0, truck.calculateToll());

        assertEquals(350.0, tollStation.getTotalTollCollected());
        assertEquals(3, tollStation.getVehicles().size());
    }

}
