import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class GameStatsTest {

    @Test
    void NoGame() {
        GameStats stats = new StatsFile();
        assertEquals(0, stats.numGames(4));
    }
    @Test
    void OneGame() {
        GameStats stats = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        assertEquals(1, stats.numGames(3));
    }
    @Test
    void TwoDifferentGames() {
        GameStats stats = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        HumanGuessesGame guessGame2 = new HumanGuessesGame(900);
        guessGame2.makeGuess(400);
        guessGame2.makeGuess(650);
        guessGame2.makeGuess(800);
        guessGame2.makeGuess(900);
        assertEquals(1, stats.numGames(3));
    }
    @Test
    void TwoSameGames() {
        GameStats stats = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        HumanGuessesGame guessGame2 = new HumanGuessesGame(800);
        guessGame2.makeGuess(400);
        guessGame2.makeGuess(650);
        guessGame2.makeGuess(800);
        assertEquals(2, stats.numGames(3));
    }

    @Test
    void MaxGames() {
        GameStats stats = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(600);
        guessGame.makeGuess(700);
        guessGame.makeGuess(800);
        guessGame.makeGuess(900);
        guessGame.makeGuess(1000);
        assertEquals(37, stats.maxNumGuesses());
    }
}
