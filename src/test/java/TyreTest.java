import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Slick", 16 );
    }

    @Test
    public void hasType() {
        assertEquals ("Slick", tyres.getTyreType());
    }

    @Test
    public void hasTyreSize() {
        assertEquals(16, tyres.getTyreSize());
    }
}
