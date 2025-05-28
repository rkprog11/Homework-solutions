package e3;

public class HangmanGame extends GameGUI implements TimerLogic, GameLogic {

	@Override
	public void handleGuess(char guess) {
		// TODO Auto-generated method stub
		if(guessedLetters.contains(guess)) {
			System.out.println("You already guessed this letter.");
			return;
		}
		guessedLetters.add(guess);
		if(currentWord.indexOf(guess) == -1) {
			attemptsLeft--;
		}
		updateDisplay();
		if(hasWon()) {
			endGame(true);
		} else {
			if(attemptsLeft == 0) {
				endGame(false);
			}
		}
	}
	
	
	
	@Override
	protected void startGame() {
		// TODO Auto-generated method stub
		super.startGame();
		startTimer();
	}



	@Override
	public void endGame(boolean won) {
		// TODO Auto-generated method stub
		if(won) {
			System.out.println("You have Won!!! You guessed the word " + currentWord + " correctly.");
		} else {
			System.out.println("You have lost. The word was: " + currentWord);
		}
		inputField.setEnabled(false);
		System.exit(0);
	}

	@Override
	public void startTimer() {
		// TODO Auto-generated method stub
		TimerRunnable TR = new TimerRunnable(this);
		Thread thread = new Thread(TR);
		thread.start();
	}

	@Override
	public boolean hasWon() {
		// TODO Auto-generated method stub
		for(char letter: currentWord.toCharArray()) {
			if(!guessedLetters.contains(letter)) {
				return false;
			}
		}
		return true;
	}

}
