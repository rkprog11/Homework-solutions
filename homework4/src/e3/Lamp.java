package e3;

public class Lamp implements Switchable, Dimmable {
	boolean on;
	int brightness;

	@Override
	public void setBrightness(int level) {
		if(on && (0<=level) && (level <= MAX_BRIGHTNESS)){
			this.brightness = level;
		}

	}

	@Override
	public int getBrightness() {
		return this.brightness;
	}

	@Override
	public void turnOn() {
		this.on = true;
	}

	@Override
	public void turnOff() {
		this.on = false;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}

}
