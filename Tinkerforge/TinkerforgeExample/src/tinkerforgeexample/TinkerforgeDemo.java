/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tinkerforgeexample;

import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;
import com.tinkerforge.BrickServo;
import com.tinkerforge.BrickletDualButton;
import com.tinkerforge.BrickletMotionDetector;
import com.tinkerforge.BrickletRGBLED;
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

	private static final String HOST = "localhost";
	private static final int PORT = 4223;

	private static final String DUAL_BUTTON_UID = "vTZ";
	private static final String RGB_LED_UID = "AQG";
	private static final String MOTION_DETECTOR_UID = "BYr";
	private static final String SERVO_UID = "BYr";
	private static final short SERVO_NUMBER = 6;
	

	private static int colorNumber = 0;
	private static BrickletRGBLED rgbLedBricklet;
	private static BrickletDualButton dualButtonBricklet;
	private static BrickletMotionDetector motionDetectorBricklet;
	private static BrickServo servoBricklet;

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws Exception {

		IPConnection ipcon = new IPConnection(); // Create IP connection
		dualButtonBricklet = new BrickletDualButton(DUAL_BUTTON_UID, ipcon);
		rgbLedBricklet = new BrickletRGBLED(RGB_LED_UID, ipcon);
		motionDetectorBricklet = new BrickletMotionDetector(MOTION_DETECTOR_UID, ipcon);
		servoBricklet = new BrickServo(SERVO_UID, ipcon);

		ipcon.connect(HOST, PORT); // Connect to brickd

		// Add state changed listener
		dualButtonBricklet.addStateChangedListener(new BrickletDualButton.StateChangedListener() {
			public void stateChanged(short buttonL, short buttonR, short ledL, short ledR) {
				// This function is called when a button on the dual button
				// bricklet is pressed.
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

		motionDetectorBricklet.addMotionDetectedListener(new BrickletMotionDetector.MotionDetectedListener() {
			public void motionDetected() {
				try {
					System.out.println("motion detected ...");
					flash();
					System.out.println("motion detected ... done.");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		motionDetectorBricklet.addDetectionCycleEndedListener(new BrickletMotionDetector.DetectionCycleEndedListener() {
			public void detectionCycleEnded() {
				System.out.println("Detection Cycle Ended (next detection possible in ~3 seconds)");
			}
		});

		System.out.println("Press key to exit");
		System.in.read();
		ipcon.disconnect();
	}

	protected static void flash() throws TimeoutException, NotConnectedException, InterruptedException {
		short position = servoBricklet.getPosition(SERVO_NUMBER);
		System.out.println("servo was " + position);
		if (position < 0) {
			servoBricklet.setPosition(SERVO_NUMBER, (short)8000);
		} else {
			servoBricklet.setPosition(SERVO_NUMBER, (short)-8000);
		}
		for (int i = 0 ; i <= 10; i++) {
			RGBValue rgbValue = rgbLedBricklet.getRGBValue();
			rgbLedBricklet.setRGBValue((short)0, (short)0, (short)0);
			Thread.sleep(100);
			rgbLedBricklet.setRGBValue(rgbValue.r, rgbValue.g, rgbValue.b);
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
}
