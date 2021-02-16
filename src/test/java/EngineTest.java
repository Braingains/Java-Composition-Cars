import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.8, "Petrol");
    }

    @Test
    public void hasSize() {
        assertEquals (1.8, engine.getSize(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals("Petrol", engine.getEngineType());
    }
}
