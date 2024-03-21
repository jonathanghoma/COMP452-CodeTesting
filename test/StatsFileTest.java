import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsFileTest {
    @Test
    void testNumGuesses(){
        StatsFile toTest = new StatsFile();
        assertEquals(10, toTest.numGames(10));
    }
}
