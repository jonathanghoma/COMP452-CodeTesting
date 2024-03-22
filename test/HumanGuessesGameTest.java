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
    void testManyGuesses() {
        HumanGuessesGame guessGame = new HumanGuessesGame(101);
        guessGame.makeGuess(700);
        guessGame.makeGuess(350);
        guessGame.makeGuess(50);
        guessGame.makeGuess(300);
        guessGame.makeGuess(200);
        guessGame.makeGuess(150);
        guessGame.makeGuess(60);
        guessGame.makeGuess(68);
        guessGame.makeGuess(76);
        guessGame.makeGuess(999);
        guessGame.makeGuess(88);
        guessGame.makeGuess(91);
        guessGame.makeGuess(95);
        guessGame.makeGuess(98);
        guessGame.makeGuess(100);
        guessGame.makeGuess(101);
        assertEquals(16, guessGame.getNumGuesses());
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
