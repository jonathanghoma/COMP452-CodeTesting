import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class HumanGuessesGameTest {

    @Test
    void testMaxGuess() {
        HumanGuessesGame guessGame = new HumanGuessesGame(501);
        guessGame.makeGuess(500);
        guessGame.makeGuess(501);
        assertEquals(2, guessGame.getNumGuesses());

    }

    @Test
    void testMinGuess() {

    }
}
