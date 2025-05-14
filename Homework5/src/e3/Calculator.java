package e3;

public class Calculator {

	public static void main(String[] args) {
		try {
		System.out.println(Calculator.divide(3, 0));
		} catch (ArithmeticException e) {
			System.err.println(e);
		}
	}
	
	public static double divide(double a, double b) {
		if(b==0) {
			throw new ArithmeticException("You are not allowed to divide by 0!");
		}
		return a/b;
	}
}
