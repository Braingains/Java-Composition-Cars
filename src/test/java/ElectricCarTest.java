import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    Motor motor;
    Tyres tyres;

    @Before
    public void before() {
        electricCar = new ElectricCar("Leaf", 15000, "Silver", motor, tyres);
    }

    @Test
    public void hasModel() {
        assertEquals ("Leaf", electricCar.getModel());
    }
    @Test
    public void hasPrice() {
        assertEquals(15000, electricCar.getPrice(), 0.01);
    }
    @Test
    public void hasColour() {
        assertEquals("Silver", electricCar.getColour());
    }
    @Test
    public void hasMotor() {
        assertEquals(1.0, electricCar.getMotorSize(), 0.1);
    }
    @Test
    public void hasTyres() {

        assertEquals(tyres, electricCar.getTyres());
    }

}