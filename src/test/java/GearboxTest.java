import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox("Manual", 5);
    }

    @Test
    public void hasType() {
        assertEquals ("Manual", gearbox.getGearboxType());
    }

    @Test
    public void hasNumberOfGears() {
        assertEquals(5, gearbox.getNumberOfGears());
    }
}
