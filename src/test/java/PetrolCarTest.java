import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Engine engine;
    Tyres tyres;
    Gearbox gearbox;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Fiesta", 7000, "White", engine, tyres, gearbox);
        engine = new Engine(1.8, "Petrol");
        tyres = new Tyres("Slick", 16);
        gearbox = new Gearbox("Manual", 5);
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
