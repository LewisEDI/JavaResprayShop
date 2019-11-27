import cars.LegalCar;
import cars.StolenCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GarageTest {

    Garage garage;
    StolenCar stolenCar;
    LegalCar legalCar;

    @Before
    public void before() {
        garage = new Garage("Java Respray Shop");
        stolenCar = new StolenCar("red", "Ferrari", 1994, true);
        legalCar = new LegalCar("blue", "Ford", 2002, false);

    }

    @Test

    public void canAddStolenVehicle(){
        garage.addVehicles(stolenCar);
        assertEquals(1, garage.vehicleCount());
    }

    @Test

    public void canAddLegalVehicle(){
        garage.addVehicles(legalCar);
        assertEquals(1, garage.vehicleCount());
    }

    @Test

    public void canAddBothVehicles(){
        garage.addVehicles(legalCar);
        garage.addVehicles(stolenCar);
        assertEquals(2, garage.vehicleCount());
    }

}


