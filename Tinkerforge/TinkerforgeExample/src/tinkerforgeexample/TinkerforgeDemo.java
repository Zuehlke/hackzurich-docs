/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tinkerforgeexample;

import com.tinkerforge.*;

import java.awt.*;

/**
 * A simple example showing how to create a simple Tinkerforge application using
 * a master brick and the following bricklets:
 * <p>
 * - Dual button bricklet - RGB LED bricklet
 * <p>
 * Note: Change the bricklet UID's to the actual UID's of your bricklet hardware
 * (see the "TODO's" below). Use Tinkerforge's Brick Daemon and Brick Viewer to
 * obtain the UID's.
 */
public class TinkerforgeDemo {

    private static final String HOST = "172.31.0.225";
    private static final int PORT = 4223;

    private static final String DUAL_BUTTON_UID = "vTZ";
    private static final String SERVO_UID = "6Rqvth";
    private static final short SERVO_NUMBER = 0;

    private static BrickletDualButton dualButtonBricklet;
    private MotionDetector motionDetector;
    private Light light;
    private BrickServo servoBricklet;
    private static NFCRFIDBricklet nfcrfidBricklet;

    public TinkerforgeDemo() throws Exception {
        IPConnection ipcon = new IPConnection();
        motionDetector = new MotionDetector(this, ipcon);
        light = new Light(this, ipcon);
        dualButtonBricklet = new BrickletDualButton(DUAL_BUTTON_UID, ipcon);
        servoBricklet = new BrickServo(SERVO_UID, ipcon);
        nfcrfidBricklet = new NFCRFIDBricklet(this, ipcon);

        ipcon.connect(HOST, PORT); // Connect to brickd

        moveServo(false);

        motionDetector.startMotionDetection();

        nfcrfidBricklet.registerLogic();

        light.setColor(Color.BLACK);
        // Add state changed listener
        dualButtonBricklet.addStateChangedListener(new BrickletDualButton.StateChangedListener() {
            public void stateChanged(short buttonL, short buttonR, short ledL, short ledR) {
                // This function is called when a button on the dual button
                // bricklet is pressed.

                if (buttonL == 1 && buttonR == 1) {
                    try {
                        toggleServo();
                    } catch (TimeoutException | NotConnectedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("dual button clicked." + buttonL + buttonR + ledL + ledR);
                /*try {
                    moveServo(buttonL > 0);
                } catch (TimeoutException | NotConnectedException e) {
                    e.printStackTrace();
                }

                if (buttonR > 0) {
                    try {
                        toggleRightDualButtonLed();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }*/
            }
        });

        System.out.println("Press key to exit");
        System.in.read();
        ipcon.disconnect();
    }

    private void toggleServo() throws TimeoutException, NotConnectedException {
        short position = servoBricklet.getPosition(SERVO_NUMBER);
        moveServo(position < 0);
    }

    public static void main(String[] args) throws Exception {
        new TinkerforgeDemo();
    }

    protected void onMotionDetected() throws TimeoutException, NotConnectedException, InterruptedException {
        getLight().flash(5);
    }

    protected void moveServo(boolean open) throws TimeoutException, NotConnectedException {
        if (open) {
            servoBricklet.setPosition(SERVO_NUMBER, (short) 9000);
        } else {
            servoBricklet.setPosition(SERVO_NUMBER, (short) -700);
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

    public void blackOutLight() {
        this.light.setColor(Color.BLACK);
    }

    public void moveServo(boolean open, int timeToClose) throws TimeoutException, NotConnectedException {
        moveServo(open);
        new Thread(() -> {
            try {
                Thread.sleep(timeToClose);
                moveServo(!open);
            } catch (InterruptedException | NotConnectedException | TimeoutException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
