package tinkerforgeexample;

import com.tinkerforge.BrickletRGBLED;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;
import com.tinkerforge.BrickletRGBLED.RGBValue;

public class Light {

	private static final String RGB_LED_UID = "AQG";
	private int colorNumber = 0;
	private BrickletRGBLED rgbLedBricklet;
	private TinkerforgeDemo tinkerforgeDemo;
	

	public Light(TinkerforgeDemo tinkerforgeDemo, IPConnection ipcon) {
		this.tinkerforgeDemo = tinkerforgeDemo;
		rgbLedBricklet = new BrickletRGBLED(RGB_LED_UID, ipcon);
	}
	
	public void setColor(java.awt.Color color) {
		try {
//			if (color == Color.YELLOW) {
				rgbLedBricklet.setRGBValue((short) 255, (short) 255, (short)0);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void flash() throws TimeoutException, NotConnectedException, InterruptedException {
		short off = 0;
		for (int i = 0; i <= 5; i++) {
			RGBValue rgbValue = rgbLedBricklet.getRGBValue();
			rgbLedBricklet.setRGBValue(off, off, off);
			Thread.sleep(500);
			rgbLedBricklet.setRGBValue(rgbValue.r, rgbValue.g, rgbValue.b);
		}
	}
	
	public void toggleRgbLedColor() throws Exception {
		if (colorNumber == 0) {
			rgbLedBricklet.setRGBValue((short) 255, (short) 255, (short) 255); // White
			colorNumber++;
		} else if (colorNumber == 1) {
			rgbLedBricklet.setRGBValue((short) 255, (short) 0, (short) 0); // Red
			colorNumber++;
		} else if (colorNumber == 2) {
			rgbLedBricklet.setRGBValue((short) 0, (short) 255, (short) 0); // Green
			colorNumber++;
		} else if (colorNumber == 3) {
			rgbLedBricklet.setRGBValue((short) 0, (short) 0, (short) 255); // Blue
			colorNumber++;
		} else {
			rgbLedBricklet.setRGBValue((short) 0, (short) 0, (short) 0); // Black
			colorNumber = 0;
		}
	}

	public RGBValue getRGBValue() throws TimeoutException, NotConnectedException {
		return rgbLedBricklet.getRGBValue();
	}

	public void setRGBValue(int r, int g, int b) throws TimeoutException, NotConnectedException {
		rgbLedBricklet.setRGBValue((short)r, (short)g, (short)b);
	}
}
