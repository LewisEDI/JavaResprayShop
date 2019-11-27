import org.junit.Before;
import org.junit.Test;
import people.LawAbidingCitizen;

import static org.junit.Assert.assertEquals;

public class LawAbidingCitizenTest {

    LawAbidingCitizen lawAbidingCitizen;

    @Before
    public void before(){
        lawAbidingCitizen = new LawAbidingCitizen("Joe", 300, "accountant", "Credit card");
    }

    @Test
    public void hasName(){
        assertEquals("Joe", lawAbidingCitizen.getName());
    }

    @Test
    public void hasCash(){
        assertEquals(300, lawAbidingCitizen.getAvailableCash());
    }

    @Test
    public void hasJob(){
        assertEquals("accountant", lawAbidingCitizen.getJob());
    }


}
