package e3;

public interface GameLogic {
	void handleGuess(char guess);
	boolean hasWon(); 					//task says void
	void endGame(boolean won);
}
