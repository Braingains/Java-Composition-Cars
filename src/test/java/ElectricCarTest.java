import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar("Leaf", 15000, "Silver");
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
}