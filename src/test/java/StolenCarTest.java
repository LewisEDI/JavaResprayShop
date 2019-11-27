import cars.StolenCar;
import org.junit.Before;
import org.junit.Test;
import people.Criminal;

import static org.junit.Assert.assertEquals;

public class StolenCarTest {

    StolenCar stolenCar;
    Criminal criminal;

    @Before
    public void before(){
        stolenCar = new StolenCar("blue", "Cyber Truck", 2019, true);
        criminal = new Criminal("Raf", "Cat swinging", "cash", 10000);
    }

    @Test
    public void getPrice(){
        assertEquals(200, stolenCar.price(), 0.01);
    }

    @Test
    public void getDoublePrice(){
        assertEquals(400, stolenCar.priceFor(criminal), 0.01);
    }
}
