package hangman;

public class Timer extends Game {
	protected Thread timerThread;
	protected boolean timerRunning;
	// TODO: Override startGame() to also start the timer
	// TODO: Implement startTimer() to create and start the timer thread
	public Timer () {
		super();
	}
	
	@Override
	protected void startGame() {
		// TODO Auto-generated method stub
		super.startGame();
		startTimer();
	}

	public void startTimer() {
		TimerRunnable TR = new TimerRunnable(this);
		Thread thread = new Thread(TR);
		thread.start();
	}
}
