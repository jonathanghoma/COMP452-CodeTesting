public class ComputerGuessesGame {
    private int upperBound;
    private int lowerBound;
    private int numGuesses;
    private boolean NumberGuessed;
    private int lastGuess;

    ComputerGuessesGame(){
        upperBound = 1000;
        lowerBound = 1;
        numGuesses = 0;
        NumberGuessed = false;
        lastGuess = (lowerBound + upperBound + 1) / 2;
    }


    int getUpperBound(){return upperBound;}
    int getLowerBound(){return lowerBound;}
    int getNumGuesses(){return numGuesses;}
    int getLastGuess(){return lastGuess;}
    boolean isGuessed(){return NumberGuessed;}

    void setUpperBound(){
        upperBound = Math.min(upperBound, lastGuess);
        lastGuess = (lowerBound + upperBound + 1) / 2;
        numGuesses += 1;
    }
    void setLowerBound(){
        lowerBound = Math.max(lowerBound, lastGuess + 1);
        lastGuess = (lowerBound + upperBound + 1) / 2;
        numGuesses += 1;
    }

}
