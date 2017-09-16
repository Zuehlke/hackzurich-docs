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
	private static final String SERVO_UID = "6Rrbr9";
	private static final short SERVO_NUMBER = 6;

	private static BrickletDualButton dualButtonBricklet;
	private MotionDetector motionDetector;
	private Light light;
	private static BrickServo servoBricklet;
	private static NFCRFIDBricklet nfcrfidBricklet;
	
	public TinkerforgeDemo() throws Exception{
		IPConnection ipcon = new IPConnection();
		motionDetector = new MotionDetector(this, ipcon);
		light = new Light(this, ipcon);
		dualButtonBricklet = new BrickletDualButton(DUAL_BUTTON_UID, ipcon);
		servoBricklet = new BrickServo(SERVO_UID, ipcon);
		nfcrfidBricklet = new NFCRFIDBricklet(this, ipcon);

		ipcon.connect(HOST, PORT); // Connect to brickd
		
		motionDetector.startMotionDetection();

		nfcrfidBricklet.registerLogic();

		nfcrfidBricklet.registerLogic();

		// Add state changed listener
		dualButtonBricklet.addStateChangedListener(new BrickletDualButton.StateChangedListener() {
			public void stateChanged(short buttonL, short buttonR, short ledL, short ledR) {
				// This function is called when a button on the dual button
				// bricklet is pressed.
				System.out.println("dual button clicked.");
				if (buttonL > 0) {
					motionDetector.motionDetected();
				}
				if (buttonR > 0) {
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

	public static void main(String[] args) throws Exception {
		new TinkerforgeDemo();
	}

	protected void onMotionDetected() throws TimeoutException, NotConnectedException, InterruptedException {
		moveServo();
		getLight().flash();
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

	public Light getLight() {
		return light;
	}

}
