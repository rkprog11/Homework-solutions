package e3;

import javax.swing.SwingUtilities;

public class TimerRunnable implements Runnable {
	private final HangmanGame game;

	public TimerRunnable(HangmanGame game) {
		this.game = game;

	}

	@Override
	public void run() {
		// TODO: Implement the countdown loop
		// - Decrease timeLeft every second
		// - Update the time label using SwingUtilities.invokeLater()
		// - End the game if time runs out
		for(;game.timeLeft > 0; game.timeLeft--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SwingUtilities.invokeLater(new Runnable()
	        {
	            public void run()
	            {
	                 game.updateDisplay();
	            }
	        });
			//System.out.println(game.timeLeft);
		}
		SwingUtilities.invokeLater(()-> {
			 game.endGame(false);
		 });
		return;
	}
}
