package e3;

public interface Dimmable {
	final int MAX_BRIGHTNESS = 100;
	void setBrightness(int level);
	int getBrightness();
	default void dimToHalf() {
		setBrightness(MAX_BRIGHTNESS/2);
	};
}
