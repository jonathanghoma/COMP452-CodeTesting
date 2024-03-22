import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class GameResultTest {

    @Test
    void humanWasPlaying() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        GameResult result = new GameResult(true, 1000, guessGame.getNumGuesses());
        assertEquals(true, result.humanWasPlaying);
    }
    @Test
    void humanNotPlaying() {
        ComputerGuessesGame toTest = new ComputerGuessesGame();
        GameResult result = new GameResult(false, 501, toTest.getNumGuesses());
        assertEquals(false, result.humanWasPlaying);
    }
    @Test
    void guessNumber() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        GameResult result = new GameResult(true, 1000, guessGame.getNumGuesses());
        assertEquals(1000, result.correctValue);
    }
    @Test
    void numGuess() {
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(1000);
        GameResult result = new GameResult(true, 1000, guessGame.getNumGuesses());
        assertEquals(1, result.numGuesses);
    }
}