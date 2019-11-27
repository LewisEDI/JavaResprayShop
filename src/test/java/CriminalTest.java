import org.junit.Before;
import org.junit.Test;
import people.Criminal;

import static org.junit.Assert.assertEquals;

public class CriminalTest {

    Criminal criminal;

    @Before
    public void before(){
        criminal = new Criminal("Raf", "Cat Spinning", "cash", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Raf", criminal.getName());
    }

    @Test
    public void hasPaymentMethod(){
        assertEquals("cash", criminal.getPaymentMethod());
    }

    @Test
    public void hasCash(){
        assertEquals(100000, criminal.getAvailableCash());
    }

    @Test
    public void hasAreaOfCriminalExpertise(){
        assertEquals("Cat Spinning", criminal.getAreaOfCriminalExpertise());
    }

}
