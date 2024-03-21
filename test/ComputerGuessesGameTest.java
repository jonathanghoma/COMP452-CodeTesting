import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ComputerGuessesGameTest {
    @Test
    void computerGameInit(){
        ComputerGuessesGame toTest = new ComputerGuessesGame();
        assertEquals(501, toTest.getLastGuess());
    }
    @Test
    void computerGameFirstGuess(){
        ComputerGuessesGame toTest = new ComputerGuessesGame();
        assertEquals(1, toTest.getNumGuesses());
    }

    @Test
    void computerMaxGuess(){
        ComputerGuessesGame toTest = new ComputerGuessesGame();
        for(int i = 0; i < 10; i++){
            toTest.setLowerBound();
        }
        assertEquals(1000, toTest.getLastGuess());
    }
    @Test
    void computerMinGuess(){
        ComputerGuessesGame toTest = new ComputerGuessesGame();
        for(int i = 0; i < 10; i++){
            toTest.setLowerBound();
        }
        assertEquals(1, toTest.getLastGuess());
    }
}
