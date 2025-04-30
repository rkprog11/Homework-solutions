package exercise1;

public class Account {
	public String owner;
	private double balance;
	protected int pin;
	String internalNote;
	
	public void changePin(int currentPin, int newPin) {
		if(currentPin == this.pin) {
			this.pin = newPin;
		}
	}
	public double getBalance() {
		return balance;
	}
	
}
