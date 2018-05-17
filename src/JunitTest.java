import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class JunitTest {

    @Test
    public void test(){
        //fail("Not yet implemented");

        Game game = new Game();

        assertEquals(10, game.resolve(10, 22));
        assertEquals(9, game.resolve(22, 9));
        assertEquals(0, game.resolve(22, 22));
        assertEquals(10, game.resolve(10, 7));
        assertEquals(19, game.resolve(1, 19));
        assertEquals(19, game.resolve(19, 19));
        assertEquals(19, game.resolve(22, 19));


    }



}