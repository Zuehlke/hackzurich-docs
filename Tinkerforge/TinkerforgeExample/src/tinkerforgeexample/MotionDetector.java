package tinkerforgeexample;

import java.awt.Color;

import com.tinkerforge.BrickletMotionDetector;
import com.tinkerforge.IPConnection;

public class MotionDetector implements BrickletMotionDetector.MotionDetectedListener, BrickletMotionDetector.DetectionCycleEndedListener {
	
	private static final String MOTION_DETECTOR_UID = "BYr";
	
	private final BrickletMotionDetector brickletMotionDetector;

	private TinkerforgeDemo tinkerforgeDemo;
	
	private void onMotionDetected() {
		tinkerforgeDemo.getLight().setColor(Color.YELLOW, 2000);
	}

	public MotionDetector(TinkerforgeDemo tinkerforgeDemo, IPConnection ipcon) {
		this.tinkerforgeDemo = tinkerforgeDemo;
		brickletMotionDetector = new BrickletMotionDetector(MOTION_DETECTOR_UID, ipcon);
	}
	
	public void startMotionDetection() {
		brickletMotionDetector.addMotionDetectedListener(this);
		brickletMotionDetector.addDetectionCycleEndedListener(this);
	}
	
	@Override
	public void motionDetected() {
		System.out.println("motion detected ...");
		try {
			onMotionDetected();
		} catch (Exception e) {
			throw new RuntimeException("oops", e);
		}
		System.out.println("motion detected ... done.");
	}

	@Override
	public void detectionCycleEnded() {
		System.out.println("Detection Cycle Ended (next detection possible in ~3 seconds)");
	}

}


