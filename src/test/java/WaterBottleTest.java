import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void vol_starts_at_100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drink_reduces_volume_by_10(){
        waterbottle.takeDrink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void can_empty_bottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void can_fill_bottle(){
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}
