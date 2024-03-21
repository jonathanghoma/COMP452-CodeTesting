import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComputerGuessesPanelTest {
    @Test
    void testMaxGuess(){
        ComputerGuessesPanel toTest = new ComputerGuessesPanel();
        toTest.setInitial();
        //assertEquals(1, toTest.setLowerBound());

    }
    @Test
    void testMinGuess(){
        ComputerGuessesPanel toTest = new ComputerGuessesPanel();
        toTest.setLowerBound();
        toTest.setLowerBound();
    }
}
