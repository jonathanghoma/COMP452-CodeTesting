import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class HumanGuessesGameTest {

    @Test
    void testMaxGuess() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        assertEquals(3, guessGame.getNumGuesses());

    }
    @Test
    void testMinGuess() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1);
        guessGame.makeGuess(500);
        guessGame.makeGuess(250);
        guessGame.makeGuess(100);
        guessGame.makeGuess(1);
        assertEquals(4, guessGame.getNumGuesses());
    }
    @Test
    void testIsDoneTrue() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        assertEquals(true, guessGame.isDone());
    }
    @Test
    void testIsDoneFalse() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        assertEquals(false, guessGame.isDone());
    }
}
