import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Fiesta", 7000, "White");
    }

    @Test
    public void hasModel() {
        assertEquals ("Fiesta", petrolCar.getModel());
    }
    @Test
    public void hasPrice() {
        assertEquals(7000, petrolCar.getPrice(), 0.01);
    }
    @Test
    public void hasColour() {
        assertEquals("White", petrolCar.getColour());
    }
}
