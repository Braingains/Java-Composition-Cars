import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorTest {

    Motor motor;

    @Before
    public void before() {
        motor = new Motor(1.0);
    }

    @Test
    public void hasSize() {
        assertEquals(1.0, this.motor.getSize(), 0.01);
    }
}
