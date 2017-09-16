package tinkerforgeexample;

import java.awt.Color;

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
	
	public void setColor(java.awt.Color color, int ms) {
		try {
			RGBValue rgbValue = rgbLedBricklet.getRGBValue();
			setColor(color);
			new Thread(new LightRunnable(ms, rgbValue)).start();
		} catch (TimeoutException | NotConnectedException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void setColor(java.awt.Color color) {
		try {
			if (color == Color.BLACK) {
				setRGBValue(0,  0,  0);
			}
			if (color == Color.YELLOW) {
				setRGBValue( 255,  255, 0);
			}
			if (color == Color.WHITE) {
				setRGBValue( 255,  255,  255); // White
			}
			if (color == Color.RED) {
				setRGBValue( 255,  0,  0); // Red
			}
			if (color == Color.GREEN) {
				setRGBValue( 0,  255,  0); // Green
			}
			if (color == Color.BLUE) {
				setRGBValue( 0,  0,  255); // Blue
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void flash(int times) throws TimeoutException, NotConnectedException, InterruptedException {
		RGBValue rgbValue = rgbLedBricklet.getRGBValue();
		for (int i = 1; i <= times; i++) {
			setColor(Color.BLACK);
			Thread.sleep(500);
			rgbLedBricklet.setRGBValue(rgbValue.r, rgbValue.g, rgbValue.b);
		}
	}
	
	public void toggleRgbLedColor() throws Exception {
		if (colorNumber == 0) {
			setColor(Color.WHITE);
			colorNumber++;
		} else if (colorNumber == 1) {
			setColor(Color.RED);
			colorNumber++;
		} else if (colorNumber == 2) {
			setColor(Color.GREEN);
			colorNumber++;
		} else if (colorNumber == 3) {
			setColor(Color.BLUE);
			colorNumber++;
		} else {
			setColor(Color.BLACK);
			colorNumber = 0;
		}
	}

	public RGBValue getRGBValue() throws TimeoutException, NotConnectedException {
		return rgbLedBricklet.getRGBValue();
	}

	public void setRGBValue(int r, int g, int b) throws TimeoutException, NotConnectedException {
		rgbLedBricklet.setRGBValue((short)r, (short)g, (short)b);
	}
	
	private  class LightRunnable implements Runnable {
		
		private int ms;
		private RGBValue rgbValue;

		public LightRunnable(int ms, RGBValue rgbValue) {
			this.ms = ms;
			this.rgbValue = rgbValue;
		}

	    public void run() {
	        try {
				Thread.sleep(ms);
				setRGBValue(rgbValue.r, rgbValue.g, rgbValue.b);
			} catch (Exception  e) {
				Thread.interrupted();
			}
	    }
		}
}
