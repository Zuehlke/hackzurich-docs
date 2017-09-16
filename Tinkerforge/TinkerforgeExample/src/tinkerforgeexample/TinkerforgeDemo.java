/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tinkerforgeexample;

import com.tinkerforge.*;
import com.tinkerforge.BrickletRGBLED.RGBValue;

/**
 * A simple example showing how to create a simple Tinkerforge application using
 * a master brick and the following bricklets:
 * 
 * - Dual button bricklet - RGB LED bricklet
 * 
 * Note: Change the bricklet UID's to the actual UID's of your bricklet hardware
 * (see the "TODO's" below). Use Tinkerforge's Brick Daemon and Brick Viewer to
 * obtain the UID's.
 * 
 */
public class TinkerforgeDemo {

	private static final String HOST = "172.31.0.225";
	private static final int PORT = 4223;

	private static final String DUAL_BUTTON_UID = "vTZ";
	private static final String RGB_LED_UID = "AQG";
	
	private static final String SERVO_UID = "6Rrbr9";
	private static final short SERVO_NUMBER = 6;

	private static int colorNumber = 0;
	private static BrickletRGBLED rgbLedBricklet;
	private static BrickletDualButton dualButtonBricklet;
	private static MotionDetector motionDetector;
	private static BrickServo servoBricklet;
	private static NFCRFIDBricklet nfcrfidBricklet;

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws Exception {
		TinkerforgeDemo tinkerforgeDemo = new TinkerforgeDemo();
		IPConnection ipcon = new IPConnection(); // Create IP connection
		dualButtonBricklet = new BrickletDualButton(DUAL_BUTTON_UID, ipcon);
		rgbLedBricklet = new BrickletRGBLED(RGB_LED_UID, ipcon);
		motionDetector = new MotionDetector(tinkerforgeDemo, ipcon);
		servoBricklet = new BrickServo(SERVO_UID, ipcon);
		nfcrfidBricklet = new NFCRFIDBricklet(ipcon, rgbLedBricklet);

		ipcon.connect(HOST, PORT); // Connect to brickd

		nfcrfidBricklet.registerLogic();

		nfcrfidBricklet.registerLogic();

		// Add state changed listener
		dualButtonBricklet.addStateChangedListener(new BrickletDualButton.StateChangedListener() {
			public void stateChanged(short buttonL, short buttonR, short ledL, short ledR) {
				// This function is called when a button on the dual button
				// bricklet is pressed.
				System.out.println("dual button clicked.");
				if (buttonL == BrickletDualButton.BUTTON_STATE_PRESSED) {
					try {
						toggleRgbLedColor();
					} catch (Exception e) {
					}
				}
				if (buttonR == BrickletDualButton.BUTTON_STATE_PRESSED) {
					try {
						toggleRightDualButtonLed();
					} catch (Exception e) {
					}
				}
			}
		});

		System.out.println("Press key to exit");
		System.in.read();
		ipcon.disconnect();
	}

	protected static void onMotionDetected() throws TimeoutException, NotConnectedException, InterruptedException {
		moveServo();
		flashLight();
	}

	private static void flashLight() throws TimeoutException, NotConnectedException, InterruptedException {
		short off = (short) 0;
		for (int i = 0; i <= 5; i++) {
			RGBValue rgbValue = rgbLedBricklet.getRGBValue();
			rgbLedBricklet.setRGBValue(off, off, off);
			Thread.sleep(500);
			rgbLedBricklet.setRGBValue(rgbValue.r, rgbValue.g, rgbValue.b);
		}
	}

	private static void moveServo() throws TimeoutException, NotConnectedException {
		short position = servoBricklet.getPosition(SERVO_NUMBER);
		System.out.println("servo was " + position);
		if (position < 0) {
			servoBricklet.setPosition(SERVO_NUMBER, (short) 8000);
		} else {
			servoBricklet.setPosition(SERVO_NUMBER, (short) -8000);
		}
	}

	/**
	 * Toggle the color of the RGB LED bricklet.
	 */
	private static void toggleRgbLedColor() throws Exception {
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
																			// (Off)
			colorNumber = 0;
		}
	}

	/**
	 * Toggle the LED in the right button of the dual button bricklet.
	 */
	private static void toggleRightDualButtonLed() throws Exception {
		BrickletDualButton.LEDState ledState = dualButtonBricklet.getLEDState();

		if (ledState.ledR == BrickletDualButton.LED_STATE_ON) {
			dualButtonBricklet.setLEDState(BrickletDualButton.LED_STATE_OFF, BrickletDualButton.LED_STATE_OFF);
		} else {
			dualButtonBricklet.setLEDState(BrickletDualButton.LED_STATE_OFF, BrickletDualButton.LED_STATE_ON);
		}
	}

	public void setLightColor(java.awt.Color color) {
		try {
//			if (color == Color.YELLOW) {
				rgbLedBricklet.setRGBValue((short) 255, (short) 255, (short)0);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
