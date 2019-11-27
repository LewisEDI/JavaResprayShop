import cars.LegalCar;
import cars.StolenCar;
import org.junit.Before;
import org.junit.Test;
import people.Sprayer;

import static org.junit.Assert.assertEquals;

public class SprayerTest {

    Sprayer sprayer;
    LegalCar legalCar;
    StolenCar stolenCar;

    @Before
    public void before(){
        legalCar = new LegalCar("blue", "Ford", 2002, false);
        sprayer = new Sprayer("Simon", 5);
        stolenCar = new StolenCar("red", "Fiat", 2016, true);
    }

    @Test

    public void paintReduces(){
        sprayer.reducePaint();
        assertEquals(4, sprayer.getPaint());
    }

    @Test

    public void sprayChangesColourAndReducesPaint(){
        sprayer.sprays(legalCar, "Royal Blue");
        assertEquals(4, sprayer.getPaint());
        assertEquals("Royal Blue", legalCar.getColour());
    }



}
