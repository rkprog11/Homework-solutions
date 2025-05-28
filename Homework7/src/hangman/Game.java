package hangman;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends JFrame {
// GUI components
	protected JLabel wordLabel, attemptsLabel, timeLabel;
	protected JTextField inputField;
// The word the player has to guess (fixed for now)
	protected String currentWord = "example";
// Stores the letters guessed by the player
	protected ArrayList<Character> guessedLetters = new ArrayList<>();
// Number of tries left
	protected int attemptsLeft = 6;
// Time left (not yet functional– stays at 60)
	protected int timeLeft = 60;	

// Sets up the window and its components
	public Game() {
		setTitle("Hangman Game");

		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 1));
// Button to start a new game
		JButton startButton = new JButton("Start Game");
		add(startButton);
// Label showing the guessed word with _ for unknown letters
		wordLabel = new JLabel("Word: ", SwingConstants.CENTER);
		add(wordLabel);
// Label showing how many tries are left
		attemptsLabel = new JLabel("Attempts left: " + attemptsLeft, SwingConstants.CENTER);
		add(attemptsLabel);
// Label showing the time left (not yet changing)
		timeLabel = new JLabel("Time left: " + timeLeft, SwingConstants.CENTER);
		add(timeLabel);
// Input field where the player types their guess
		inputField = new JTextField();
		inputField.setHorizontalAlignment(JTextField.CENTER);
		inputField.setEnabled(false); // initially inactive
		add(inputField);
// Starts the game when button is clicked and disables restart
		startButton.addActionListener(e -> {
			startGame();
			startButton.setEnabled(false);
		});
// You will implement this method
		inputField.addActionListener(e -> {
			processInput();
		});
		
		setVisible(true);
	}

// Resets game state when starting a new game
	protected void startGame() {
		guessedLetters.clear();
		attemptsLeft = 6;
		timeLeft = 60;
		updateDisplay();
		inputField.setEnabled(true);
		inputField.requestFocus();
	}

//Updates the word, attempts, and time on the screen
	protected void updateDisplay() {
		StringBuilder display = new StringBuilder();
		for (char c : currentWord.toCharArray()) {
			if (guessedLetters.contains(c)) {
				display.append(c).append(" ");
			} else {
				display.append("_ ");
			}
		}
		wordLabel.setText("Word: " + display.toString());
		attemptsLabel.setText("Attempts left: " + attemptsLeft);
		timeLabel.setText("Time left: " + timeLeft);
	}

	/*
	 * TODO Task 1: Add ActionListener for keyboard input on inputField and process
	 * the input
	 */
	public void processInput() {
// You will implement this
		String input = inputField.getText().toLowerCase();
		inputField.setText(null);
		if(!(input.length() == 1) || 97 > input.toCharArray()[0] || input.toCharArray()[0] > 122) {
			System.out.println("Please enter exactly one letter.");
		} else {
			handleGuess(input.toCharArray()[0]);
		}
	}

	/*
	 * TODO Task 1: Check if the guessed letter is in the word and handle result
	 */
	protected void handleGuess(char guess) {
// You will implement this
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

	/*
	 * TODO Task 1: Check if the player has guessed all letters correctly
	 */
	private boolean hasWon() {
// You will implement this
		for(char letter: currentWord.toCharArray()) {
			if(!guessedLetters.contains(letter)) {
				return false;
			}
		}
		return true;
	}

// TODO Task 1: End the game and show a message
	protected void endGame(boolean won) {
// You will implement this
		if(won) {
			System.out.println("You have Won!!! You guessed the word " + currentWord + " correctly.");
		} else {
			System.out.println("You have lost. The word was: " + currentWord);
		}
		inputField.setEnabled(false);
		System.exit(0);
	}
}
