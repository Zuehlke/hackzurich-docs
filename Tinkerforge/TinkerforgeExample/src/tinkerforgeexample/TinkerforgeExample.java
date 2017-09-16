/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tinkerforgeexample;

import com.tinkerforge.IPConnection;
import com.tinkerforge.BrickletDualButton;
import com.tinkerforge.BrickletRGBLED;

/**
 * A simple example showing how to create a simple Tinkerforge application
 * using a master brick and the following bricklets:
 * 
 * - Dual button bricklet
 * - RGB LED bricklet
 * 
 * Note: Change the bricklet UID's to the actual UID's of your bricklet hardware
 *       (see the "TODO's" below).
 *       Use Tinkerforge's Brick Daemon and Brick Viewer to obtain the UID's.
 * 
 */
public class TinkerforgeExample {

    private static final String HOST = "localhost";
    private static final int PORT = 4223;

    private static final String DUAL_BUTTON_UID = "vEp";  // TODO: Use the UID of your dual button bricklet here!
    private static final String RGB_LED_UID = "AQG";  // TODO: Use the UID of your RGB LED bricklet here!
    
    private static int colorNumber = 0;
    private static BrickletRGBLED rgbLedBricklet;
    private static BrickletDualButton dualButtonBricklet;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {
        
        try {
            IPConnection ipcon = new IPConnection(); // Create IP connection
            dualButtonBricklet = new BrickletDualButton(DUAL_BUTTON_UID, ipcon); // Create device object
            rgbLedBricklet = new BrickletRGBLED(RGB_LED_UID, ipcon); // Create device object

            ipcon.connect(HOST, PORT); // Connect to brickd
        
            // Add state changed listener
            dualButtonBricklet.addStateChangedListener(new BrickletDualButton.StateChangedListener() {
                public void stateChanged(short buttonL, short buttonR, short ledL,
                                         short ledR) {
                    // This function is called when a button on the dual button bricklet is pressed.
                    if(buttonL == BrickletDualButton.BUTTON_STATE_PRESSED) {
                        try {
                            toggleRgbLedColor();
                        }
                        catch(Exception e){
                        }
                    }
                    if(buttonR == BrickletDualButton.BUTTON_STATE_PRESSED) {
                        try {
                            toggleRightDualButtonLed();
                        }
                        catch(Exception e) {
                        }
                    }
                }
            });

            System.out.println("Press key to exit"); System.in.read();
            ipcon.disconnect();

        }
        catch(Exception e) {
            throw e;
        }
    }
    
    /**
     * Toggle the color of the RGB LED bricklet.
     */
    private static void toggleRgbLedColor() throws Exception {
        if (colorNumber == 0) {
            rgbLedBricklet.setRGBValue((short)255, (short)255, (short)255);  // White
            colorNumber++;
        }
        else if (colorNumber == 1) {
            rgbLedBricklet.setRGBValue((short)255, (short)0, (short)0);  // Red
            colorNumber++;          
        }
        else if (colorNumber == 2) {
            rgbLedBricklet.setRGBValue((short)0, (short)255, (short)0);  // Green
            colorNumber++;          
        }
        else if (colorNumber == 3) {
            rgbLedBricklet.setRGBValue((short)0, (short)0, (short)255);  // Blue
            colorNumber++;          
        }
        else {
            rgbLedBricklet.setRGBValue((short)0, (short)0, (short)0);  // Black (Off)
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
        }
        else {
            dualButtonBricklet.setLEDState(BrickletDualButton.LED_STATE_OFF, BrickletDualButton.LED_STATE_ON);
        }
    }
}
