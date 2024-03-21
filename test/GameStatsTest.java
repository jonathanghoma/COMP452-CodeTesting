import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class GameStatsTest {

    @Test
    void NoGame() {
        GameStats stats1 = new StatsFile();
        assertEquals(0, stats1.numGames(4));
    }
    @Test
    void OneGame() {
        GameStats stats2 = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        assertEquals(1, stats2.numGames(3));
    }
    @Test
    void TwoDifferentGames() {
        GameStats stats3 = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        HumanGuessesGame guessGame2 = new HumanGuessesGame(900);
        guessGame2.makeGuess(400);
        guessGame2.makeGuess(650);
        guessGame2.makeGuess(800);
        guessGame2.makeGuess(900);
        assertEquals(1, stats3.numGames(3));
    }
    @Test
    void TwoSameGames() {
        GameStats stats4 = new StatsFile();
        HumanGuessesGame guessGame = new HumanGuessesGame(1000);
        guessGame.makeGuess(500);
        guessGame.makeGuess(750);
        guessGame.makeGuess(1000);
        HumanGuessesGame guessGame2 = new HumanGuessesGame(800);
        guessGame2.makeGuess(400);
        guessGame2.makeGuess(650);
        guessGame2.makeGuess(800);
        assertEquals(2, stats4.numGames(3));
    }
}
