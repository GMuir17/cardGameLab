import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void Before() {
        player = new Player("Magda");
    }

    @Test
    public void canGetName() {
        assertEquals("Magda", player.getName());
    }
}
