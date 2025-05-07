package e3;

public class e3_Main {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		lamp.turnOn();
		lamp.setBrightness(80);
		lamp.dimToHalf();
		System.out.println("Brightness: " + lamp.getBrightness());
			
	}

}
