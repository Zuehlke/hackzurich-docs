/* ***********************************************************
 * This file was automatically generated on 2017-07-27.      *
 *                                                           *
 * Java Bindings Version 2.1.14                              *
 *                                                           *
 * If you have a bugfix for this file and want to commit it, *
 * please fix the bug in the generator. You can find a link  *
 * to the generators git repository on tinkerforge.com       *
 *************************************************************/

package com.tinkerforge;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Silently drives one bipolar stepper motor with up to 46V and 1.6A per phase
 */
public class BrickSilentStepper extends Device {
	public final static int DEVICE_IDENTIFIER = 19;
	public final static String DEVICE_DISPLAY_NAME = "Silent Stepper Brick";

	public final static byte FUNCTION_SET_MAX_VELOCITY = (byte)1;
	public final static byte FUNCTION_GET_MAX_VELOCITY = (byte)2;
	public final static byte FUNCTION_GET_CURRENT_VELOCITY = (byte)3;
	public final static byte FUNCTION_SET_SPEED_RAMPING = (byte)4;
	public final static byte FUNCTION_GET_SPEED_RAMPING = (byte)5;
	public final static byte FUNCTION_FULL_BRAKE = (byte)6;
	public final static byte FUNCTION_SET_CURRENT_POSITION = (byte)7;
	public final static byte FUNCTION_GET_CURRENT_POSITION = (byte)8;
	public final static byte FUNCTION_SET_TARGET_POSITION = (byte)9;
	public final static byte FUNCTION_GET_TARGET_POSITION = (byte)10;
	public final static byte FUNCTION_SET_STEPS = (byte)11;
	public final static byte FUNCTION_GET_STEPS = (byte)12;
	public final static byte FUNCTION_GET_REMAINING_STEPS = (byte)13;
	public final static byte FUNCTION_SET_STEP_CONFIGURATION = (byte)14;
	public final static byte FUNCTION_GET_STEP_CONFIGURATION = (byte)15;
	public final static byte FUNCTION_DRIVE_FORWARD = (byte)16;
	public final static byte FUNCTION_DRIVE_BACKWARD = (byte)17;
	public final static byte FUNCTION_STOP = (byte)18;
	public final static byte FUNCTION_GET_STACK_INPUT_VOLTAGE = (byte)19;
	public final static byte FUNCTION_GET_EXTERNAL_INPUT_VOLTAGE = (byte)20;
	public final static byte FUNCTION_SET_MOTOR_CURRENT = (byte)22;
	public final static byte FUNCTION_GET_MOTOR_CURRENT = (byte)23;
	public final static byte FUNCTION_ENABLE = (byte)24;
	public final static byte FUNCTION_DISABLE = (byte)25;
	public final static byte FUNCTION_IS_ENABLED = (byte)26;
	public final static byte FUNCTION_SET_BASIC_CONFIGURATION = (byte)27;
	public final static byte FUNCTION_GET_BASIC_CONFIGURATION = (byte)28;
	public final static byte FUNCTION_SET_SPREADCYCLE_CONFIGURATION = (byte)29;
	public final static byte FUNCTION_GET_SPREADCYCLE_CONFIGURATION = (byte)30;
	public final static byte FUNCTION_SET_STEALTH_CONFIGURATION = (byte)31;
	public final static byte FUNCTION_GET_STEALTH_CONFIGURATION = (byte)32;
	public final static byte FUNCTION_SET_COOLSTEP_CONFIGURATION = (byte)33;
	public final static byte FUNCTION_GET_COOLSTEP_CONFIGURATION = (byte)34;
	public final static byte FUNCTION_SET_MISC_CONFIGURATION = (byte)35;
	public final static byte FUNCTION_GET_MISC_CONFIGURATION = (byte)36;
	public final static byte FUNCTION_GET_DRIVER_STATUS = (byte)37;
	public final static byte FUNCTION_SET_MINIMUM_VOLTAGE = (byte)38;
	public final static byte FUNCTION_GET_MINIMUM_VOLTAGE = (byte)39;
	public final static byte FUNCTION_SET_TIME_BASE = (byte)42;
	public final static byte FUNCTION_GET_TIME_BASE = (byte)43;
	public final static byte FUNCTION_GET_ALL_DATA = (byte)44;
	public final static byte FUNCTION_SET_ALL_DATA_PERIOD = (byte)45;
	public final static byte FUNCTION_GET_ALL_DATA_PERIOD = (byte)46;
	public final static byte FUNCTION_SET_SPITFP_BAUDRATE_CONFIG = (byte)231;
	public final static byte FUNCTION_GET_SPITFP_BAUDRATE_CONFIG = (byte)232;
	public final static byte FUNCTION_GET_SEND_TIMEOUT_COUNT = (byte)233;
	public final static byte FUNCTION_SET_SPITFP_BAUDRATE = (byte)234;
	public final static byte FUNCTION_GET_SPITFP_BAUDRATE = (byte)235;
	public final static byte FUNCTION_GET_SPITFP_ERROR_COUNT = (byte)237;
	public final static byte FUNCTION_ENABLE_STATUS_LED = (byte)238;
	public final static byte FUNCTION_DISABLE_STATUS_LED = (byte)239;
	public final static byte FUNCTION_IS_STATUS_LED_ENABLED = (byte)240;
	public final static byte FUNCTION_GET_PROTOCOL1_BRICKLET_NAME = (byte)241;
	public final static byte FUNCTION_GET_CHIP_TEMPERATURE = (byte)242;
	public final static byte FUNCTION_RESET = (byte)243;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;
	private final static int CALLBACK_UNDER_VOLTAGE = 40;
	private final static int CALLBACK_POSITION_REACHED = 41;
	private final static int CALLBACK_ALL_DATA = 47;
	private final static int CALLBACK_NEW_STATE = 48;

	public final static short STEP_RESOLUTION_1 = (short)8;
	public final static short STEP_RESOLUTION_2 = (short)7;
	public final static short STEP_RESOLUTION_4 = (short)6;
	public final static short STEP_RESOLUTION_8 = (short)5;
	public final static short STEP_RESOLUTION_16 = (short)4;
	public final static short STEP_RESOLUTION_32 = (short)3;
	public final static short STEP_RESOLUTION_64 = (short)2;
	public final static short STEP_RESOLUTION_128 = (short)1;
	public final static short STEP_RESOLUTION_256 = (short)0;
	public final static short CHOPPER_MODE_SPREAD_CYCLE = (short)0;
	public final static short CHOPPER_MODE_FAST_DECAY = (short)1;
	public final static short FREEWHEEL_MODE_NORMAL = (short)0;
	public final static short FREEWHEEL_MODE_FREEWHEELING = (short)1;
	public final static short FREEWHEEL_MODE_COIL_SHORT_LS = (short)2;
	public final static short FREEWHEEL_MODE_COIL_SHORT_HS = (short)3;
	public final static short CURRENT_UP_STEP_INCREMENT_1 = (short)0;
	public final static short CURRENT_UP_STEP_INCREMENT_2 = (short)1;
	public final static short CURRENT_UP_STEP_INCREMENT_4 = (short)2;
	public final static short CURRENT_UP_STEP_INCREMENT_8 = (short)3;
	public final static short CURRENT_DOWN_STEP_DECREMENT_1 = (short)0;
	public final static short CURRENT_DOWN_STEP_DECREMENT_2 = (short)1;
	public final static short CURRENT_DOWN_STEP_DECREMENT_8 = (short)2;
	public final static short CURRENT_DOWN_STEP_DECREMENT_32 = (short)3;
	public final static short MINIMUM_CURRENT_HALF = (short)0;
	public final static short MINIMUM_CURRENT_QUARTER = (short)1;
	public final static short STALLGUARD_MODE_STANDARD = (short)0;
	public final static short STALLGUARD_MODE_FILTERED = (short)1;
	public final static short OPEN_LOAD_NONE = (short)0;
	public final static short OPEN_LOAD_PHASE_A = (short)1;
	public final static short OPEN_LOAD_PHASE_B = (short)2;
	public final static short OPEN_LOAD_PHASE_AB = (short)3;
	public final static short SHORT_TO_GROUND_NONE = (short)0;
	public final static short SHORT_TO_GROUND_PHASE_A = (short)1;
	public final static short SHORT_TO_GROUND_PHASE_B = (short)2;
	public final static short SHORT_TO_GROUND_PHASE_AB = (short)3;
	public final static short OVER_TEMPERATURE_NONE = (short)0;
	public final static short OVER_TEMPERATURE_WARNING = (short)1;
	public final static short OVER_TEMPERATURE_LIMIT = (short)2;
	public final static short STATE_STOP = (short)1;
	public final static short STATE_ACCELERATION = (short)2;
	public final static short STATE_RUN = (short)3;
	public final static short STATE_DEACCELERATION = (short)4;
	public final static short STATE_DIRECTION_CHANGE_TO_FORWARD = (short)5;
	public final static short STATE_DIRECTION_CHANGE_TO_BACKWARD = (short)6;
	public final static short COMMUNICATION_METHOD_NONE = (short)0;
	public final static short COMMUNICATION_METHOD_USB = (short)1;
	public final static short COMMUNICATION_METHOD_SPI_STACK = (short)2;
	public final static short COMMUNICATION_METHOD_CHIBI = (short)3;
	public final static short COMMUNICATION_METHOD_RS485 = (short)4;
	public final static short COMMUNICATION_METHOD_WIFI = (short)5;
	public final static short COMMUNICATION_METHOD_ETHERNET = (short)6;
	public final static short COMMUNICATION_METHOD_WIFI_V2 = (short)7;

	private List<UnderVoltageListener> listenerUnderVoltage = new CopyOnWriteArrayList<UnderVoltageListener>();
	private List<PositionReachedListener> listenerPositionReached = new CopyOnWriteArrayList<PositionReachedListener>();
	private List<AllDataListener> listenerAllData = new CopyOnWriteArrayList<AllDataListener>();
	private List<NewStateListener> listenerNewState = new CopyOnWriteArrayList<NewStateListener>();

	public class SpeedRamping {
		public int acceleration;
		public int deacceleration;

		public String toString() {
			return "[" + "acceleration = " + acceleration + ", " + "deacceleration = " + deacceleration + "]";
		}
	}

	public class StepConfiguration {
		public short stepResolution;
		public boolean interpolation;

		public String toString() {
			return "[" + "stepResolution = " + stepResolution + ", " + "interpolation = " + interpolation + "]";
		}
	}

	public class BasicConfiguration {
		public int standstillCurrent;
		public int motorRunCurrent;
		public int standstillDelayTime;
		public int powerDownTime;
		public int stealthThreshold;
		public int coolstepThreshold;
		public int classicThreshold;
		public boolean highVelocityChopperMode;

		public String toString() {
			return "[" + "standstillCurrent = " + standstillCurrent + ", " + "motorRunCurrent = " + motorRunCurrent + ", " + "standstillDelayTime = " + standstillDelayTime + ", " + "powerDownTime = " + powerDownTime + ", " + "stealthThreshold = " + stealthThreshold + ", " + "coolstepThreshold = " + coolstepThreshold + ", " + "classicThreshold = " + classicThreshold + ", " + "highVelocityChopperMode = " + highVelocityChopperMode + "]";
		}
	}

	public class SpreadcycleConfiguration {
		public short slowDecayDuration;
		public boolean enableRandomSlowDecay;
		public short fastDecayDuration;
		public short hysteresisStartValue;
		public byte hysteresisEndValue;
		public byte sineWaveOffset;
		public short chopperMode;
		public short comparatorBlankTime;
		public boolean fastDecayWithoutComparator;

		public String toString() {
			return "[" + "slowDecayDuration = " + slowDecayDuration + ", " + "enableRandomSlowDecay = " + enableRandomSlowDecay + ", " + "fastDecayDuration = " + fastDecayDuration + ", " + "hysteresisStartValue = " + hysteresisStartValue + ", " + "hysteresisEndValue = " + hysteresisEndValue + ", " + "sineWaveOffset = " + sineWaveOffset + ", " + "chopperMode = " + chopperMode + ", " + "comparatorBlankTime = " + comparatorBlankTime + ", " + "fastDecayWithoutComparator = " + fastDecayWithoutComparator + "]";
		}
	}

	public class StealthConfiguration {
		public boolean enableStealth;
		public short amplitude;
		public short gradient;
		public boolean enableAutoscale;
		public boolean forceSymmetric;
		public short freewheelMode;

		public String toString() {
			return "[" + "enableStealth = " + enableStealth + ", " + "amplitude = " + amplitude + ", " + "gradient = " + gradient + ", " + "enableAutoscale = " + enableAutoscale + ", " + "forceSymmetric = " + forceSymmetric + ", " + "freewheelMode = " + freewheelMode + "]";
		}
	}

	public class CoolstepConfiguration {
		public short minimumStallguardValue;
		public short maximumStallguardValue;
		public short currentUpStepWidth;
		public short currentDownStepWidth;
		public short minimumCurrent;
		public byte stallguardThresholdValue;
		public short stallguardMode;

		public String toString() {
			return "[" + "minimumStallguardValue = " + minimumStallguardValue + ", " + "maximumStallguardValue = " + maximumStallguardValue + ", " + "currentUpStepWidth = " + currentUpStepWidth + ", " + "currentDownStepWidth = " + currentDownStepWidth + ", " + "minimumCurrent = " + minimumCurrent + ", " + "stallguardThresholdValue = " + stallguardThresholdValue + ", " + "stallguardMode = " + stallguardMode + "]";
		}
	}

	public class MiscConfiguration {
		public boolean disableShortToGroundProtection;
		public short synchronizePhaseFrequency;

		public String toString() {
			return "[" + "disableShortToGroundProtection = " + disableShortToGroundProtection + ", " + "synchronizePhaseFrequency = " + synchronizePhaseFrequency + "]";
		}
	}

	public class DriverStatus {
		public short openLoad;
		public short shortToGround;
		public short overTemperature;
		public boolean motorStalled;
		public short actualMotorCurrent;
		public boolean fullStepActive;
		public short stallguardResult;
		public short stealthVoltageAmplitude;

		public String toString() {
			return "[" + "openLoad = " + openLoad + ", " + "shortToGround = " + shortToGround + ", " + "overTemperature = " + overTemperature + ", " + "motorStalled = " + motorStalled + ", " + "actualMotorCurrent = " + actualMotorCurrent + ", " + "fullStepActive = " + fullStepActive + ", " + "stallguardResult = " + stallguardResult + ", " + "stealthVoltageAmplitude = " + stealthVoltageAmplitude + "]";
		}
	}

	public class AllData {
		public int currentVelocity;
		public int currentPosition;
		public int remainingSteps;
		public int stackVoltage;
		public int externalVoltage;
		public int currentConsumption;

		public String toString() {
			return "[" + "currentVelocity = " + currentVelocity + ", " + "currentPosition = " + currentPosition + ", " + "remainingSteps = " + remainingSteps + ", " + "stackVoltage = " + stackVoltage + ", " + "externalVoltage = " + externalVoltage + ", " + "currentConsumption = " + currentConsumption + "]";
		}
	}

	public class SPITFPBaudrateConfig {
		public boolean enableDynamicBaudrate;
		public long minimumDynamicBaudrate;

		public String toString() {
			return "[" + "enableDynamicBaudrate = " + enableDynamicBaudrate + ", " + "minimumDynamicBaudrate = " + minimumDynamicBaudrate + "]";
		}
	}

	public class SPITFPErrorCount {
		public long errorCountACKChecksum;
		public long errorCountMessageChecksum;
		public long errorCountFrame;
		public long errorCountOverflow;

		public String toString() {
			return "[" + "errorCountACKChecksum = " + errorCountACKChecksum + ", " + "errorCountMessageChecksum = " + errorCountMessageChecksum + ", " + "errorCountFrame = " + errorCountFrame + ", " + "errorCountOverflow = " + errorCountOverflow + "]";
		}
	}

	public class Protocol1BrickletName {
		public short protocolVersion;
		public short[] firmwareVersion = new short[3];
		public String name;

		public String toString() {
			return "[" + "protocolVersion = " + protocolVersion + ", " + "firmwareVersion = " + Arrays.toString(firmwareVersion) + ", " + "name = " + name + "]";
		}
	}

	/**
	 * This listener is triggered when the input voltage drops below the value set by
	 * {@link BrickSilentStepper#setMinimumVoltage(int)}. The parameter is the current voltage given
	 * in mV.
	 */
	public interface UnderVoltageListener extends DeviceListener {
		public void underVoltage(int voltage);
	}

	/**
	 * This listener is triggered when a position set by {@link BrickSilentStepper#setSteps(int)} or
	 * {@link BrickSilentStepper#setTargetPosition(int)} is reached.
	 * 
	 * \note
	 *  Since we can't get any feedback from the stepper motor, this only works if the
	 *  acceleration (see {@link BrickSilentStepper#setSpeedRamping(int, int)}) is set smaller or equal to the
	 *  maximum acceleration of the motor. Otherwise the motor will lag behind the
	 *  control value and the listener will be triggered too early.
	 */
	public interface PositionReachedListener extends DeviceListener {
		public void positionReached(int position);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickSilentStepper#setAllDataPeriod(long)}. The parameters are: the current velocity,
	 * the current position, the remaining steps, the stack voltage, the external
	 * voltage and the current consumption of the stepper motor.
	 */
	public interface AllDataListener extends DeviceListener {
		public void allData(int currentVelocity, int currentPosition, int remainingSteps, int stackVoltage, int externalVoltage, int currentConsumption);
	}

	/**
	 * This listener is triggered whenever the Slient Stepper Brick enters a new state.
	 * It returns the new state as well as the previous state.
	 */
	public interface NewStateListener extends DeviceListener {
		public void newState(short stateNew, short statePrevious);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickSilentStepper(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 0;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MAX_VELOCITY)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MAX_VELOCITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CURRENT_VELOCITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SPEED_RAMPING)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPEED_RAMPING)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_FULL_BRAKE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CURRENT_POSITION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CURRENT_POSITION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_TARGET_POSITION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_TARGET_POSITION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STEPS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STEPS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_REMAINING_STEPS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STEP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STEP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DRIVE_FORWARD)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DRIVE_BACKWARD)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_STOP)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_INPUT_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_EXTERNAL_INPUT_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MOTOR_CURRENT)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MOTOR_CURRENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_BASIC_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_BASIC_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SPREADCYCLE_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPREADCYCLE_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STEALTH_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STEALTH_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_COOLSTEP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_COOLSTEP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MISC_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MISC_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DRIVER_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MINIMUM_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MINIMUM_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_TIME_BASE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_TIME_BASE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALL_DATA)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ALL_DATA_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALL_DATA_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SPITFP_BAUDRATE_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPITFP_BAUDRATE_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SEND_TIMEOUT_COUNT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SPITFP_BAUDRATE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPITFP_BAUDRATE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPITFP_ERROR_COUNT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_STATUS_LED)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_STATUS_LED)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_STATUS_LED_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_PROTOCOL1_BRICKLET_NAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIP_TEMPERATURE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_RESET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;

		callbacks[CALLBACK_UNDER_VOLTAGE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int voltage = IPConnection.unsignedShort(bb.getShort());

				for (UnderVoltageListener listener: listenerUnderVoltage) {
					listener.underVoltage(voltage);
				}
			}
		};

		callbacks[CALLBACK_POSITION_REACHED] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int position = (bb.getInt());

				for (PositionReachedListener listener: listenerPositionReached) {
					listener.positionReached(position);
				}
			}
		};

		callbacks[CALLBACK_ALL_DATA] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int currentVelocity = IPConnection.unsignedShort(bb.getShort());
				int currentPosition = (bb.getInt());
				int remainingSteps = (bb.getInt());
				int stackVoltage = IPConnection.unsignedShort(bb.getShort());
				int externalVoltage = IPConnection.unsignedShort(bb.getShort());
				int currentConsumption = IPConnection.unsignedShort(bb.getShort());

				for (AllDataListener listener: listenerAllData) {
					listener.allData(currentVelocity, currentPosition, remainingSteps, stackVoltage, externalVoltage, currentConsumption);
				}
			}
		};

		callbacks[CALLBACK_NEW_STATE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short stateNew = IPConnection.unsignedByte(bb.get());
				short statePrevious = IPConnection.unsignedByte(bb.get());

				for (NewStateListener listener: listenerNewState) {
					listener.newState(stateNew, statePrevious);
				}
			}
		};
	}

	/**
	 * Sets the maximum velocity of the stepper motor in steps per second.
	 * This function does *not* start the motor, it merely sets the maximum
	 * velocity the stepper motor is accelerated to. To get the motor running use
	 * either {@link BrickSilentStepper#setTargetPosition(int)}, {@link BrickSilentStepper#setSteps(int)}, {@link BrickSilentStepper#driveForward()} or
	 * {@link BrickSilentStepper#driveBackward()}.
	 */
	public void setMaxVelocity(int velocity) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_MAX_VELOCITY, this);

		bb.putShort((short)velocity);

		sendRequest(bb.array());
	}

	/**
	 * Returns the velocity as set by {@link BrickSilentStepper#setMaxVelocity(int)}.
	 */
	public int getMaxVelocity() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MAX_VELOCITY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int velocity = IPConnection.unsignedShort(bb.getShort());

		return velocity;
	}

	/**
	 * Returns the *current* velocity of the stepper motor in steps per second.
	 */
	public int getCurrentVelocity() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CURRENT_VELOCITY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int velocity = IPConnection.unsignedShort(bb.getShort());

		return velocity;
	}

	/**
	 * Sets the acceleration and deacceleration of the stepper motor. The values
	 * are given in *steps/s²*. An acceleration of 1000 means, that
	 * every second the velocity is increased by 1000 *steps/s*.
	 * 
	 * For example: If the current velocity is 0 and you want to accelerate to a
	 * velocity of 8000 *steps/s* in 10 seconds, you should set an acceleration
	 * of 800 *steps/s²*.
	 * 
	 * An acceleration/deacceleration of 0 means instantaneous
	 * acceleration/deacceleration (not recommended)
	 * 
	 * The default value is 1000 for both
	 */
	public void setSpeedRamping(int acceleration, int deacceleration) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_SPEED_RAMPING, this);

		bb.putShort((short)acceleration);
		bb.putShort((short)deacceleration);

		sendRequest(bb.array());
	}

	/**
	 * Returns the acceleration and deacceleration as set by
	 * {@link BrickSilentStepper#setSpeedRamping(int, int)}.
	 */
	public SpeedRamping getSpeedRamping() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SPEED_RAMPING, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SpeedRamping obj = new SpeedRamping();
		obj.acceleration = IPConnection.unsignedShort(bb.getShort());
		obj.deacceleration = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Executes an active full brake.
	 * 
	 * \warning
	 *  This function is for emergency purposes,
	 *  where an immediate brake is necessary. Depending on the current velocity and
	 *  the strength of the motor, a full brake can be quite violent.
	 * 
	 * Call {@link BrickSilentStepper#stop()} if you just want to stop the motor.
	 */
	public void fullBrake() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_FULL_BRAKE, this);


		sendRequest(bb.array());
	}

	/**
	 * Sets the current steps of the internal step counter. This can be used to
	 * set the current position to 0 when some kind of starting position
	 * is reached (e.g. when a CNC machine reaches a corner).
	 */
	public void setCurrentPosition(int position) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_CURRENT_POSITION, this);

		bb.putInt(position);

		sendRequest(bb.array());
	}

	/**
	 * Returns the current position of the stepper motor in steps. On startup
	 * the position is 0. The steps are counted with all possible driving
	 * functions ({@link BrickSilentStepper#setTargetPosition(int)}, {@link BrickSilentStepper#setSteps(int)}, {@link BrickSilentStepper#driveForward()} or
	 * {@link BrickSilentStepper#driveBackward()}). It also is possible to reset the steps to 0 or
	 * set them to any other desired value with {@link BrickSilentStepper#setCurrentPosition(int)}.
	 */
	public int getCurrentPosition() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CURRENT_POSITION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int position = (bb.getInt());

		return position;
	}

	/**
	 * Sets the target position of the stepper motor in steps. For example,
	 * if the current position of the motor is 500 and {@link BrickSilentStepper#setTargetPosition(int)} is
	 * called with 1000, the stepper motor will drive 500 steps forward. It will
	 * use the velocity, acceleration and deacceleration as set by
	 * {@link BrickSilentStepper#setMaxVelocity(int)} and {@link BrickSilentStepper#setSpeedRamping(int, int)}.
	 * 
	 * A call of {@link BrickSilentStepper#setTargetPosition(int)} with the parameter *x* is equivalent to
	 * a call of {@link BrickSilentStepper#setSteps(int)} with the parameter
	 * (*x* - {@link BrickSilentStepper#getCurrentPosition()}).
	 */
	public void setTargetPosition(int position) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_TARGET_POSITION, this);

		bb.putInt(position);

		sendRequest(bb.array());
	}

	/**
	 * Returns the last target position as set by {@link BrickSilentStepper#setTargetPosition(int)}.
	 */
	public int getTargetPosition() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_TARGET_POSITION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int position = (bb.getInt());

		return position;
	}

	/**
	 * Sets the number of steps the stepper motor should run. Positive values
	 * will drive the motor forward and negative values backward.
	 * The velocity, acceleration and deacceleration as set by
	 * {@link BrickSilentStepper#setMaxVelocity(int)} and {@link BrickSilentStepper#setSpeedRamping(int, int)} will be used.
	 */
	public void setSteps(int steps) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_STEPS, this);

		bb.putInt(steps);

		sendRequest(bb.array());
	}

	/**
	 * Returns the last steps as set by {@link BrickSilentStepper#setSteps(int)}.
	 */
	public int getSteps() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STEPS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int steps = (bb.getInt());

		return steps;
	}

	/**
	 * Returns the remaining steps of the last call of {@link BrickSilentStepper#setSteps(int)}.
	 * For example, if {@link BrickSilentStepper#setSteps(int)} is called with 2000 and
	 * {@link BrickSilentStepper#getRemainingSteps()} is called after the motor has run for 500 steps,
	 * it will return 1500.
	 */
	public int getRemainingSteps() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_REMAINING_STEPS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int steps = (bb.getInt());

		return steps;
	}

	/**
	 * Sets the step resolution from full-step up to 1/256-step.
	 * 
	 * If interpolation is turned on, the Silent Stepper Brick will always interpolate
	 * your step inputs as 1/256-step. If you use full-step mode with interpolation, each
	 * step will generate 256 1/256 steps.
	 * 
	 * For maximum torque use full-step without interpolation. For maximum resolution use
	 * 1/256-step. Turn interpolation on to make the Stepper driving less noisy.
	 * 
	 * If you often change the speed with high acceleration you should turn the
	 * interpolation off.
	 * 
	 * The default is 1/256-step with interpolation on.
	 */
	public void setStepConfiguration(short stepResolution, boolean interpolation) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_STEP_CONFIGURATION, this);

		bb.put((byte)stepResolution);
		bb.put((byte)(interpolation ? 1 : 0));

		sendRequest(bb.array());
	}

	/**
	 * Returns the step mode as set by {@link BrickSilentStepper#setStepConfiguration(short, boolean)}.
	 */
	public StepConfiguration getStepConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STEP_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		StepConfiguration obj = new StepConfiguration();
		obj.stepResolution = IPConnection.unsignedByte(bb.get());
		obj.interpolation = (bb.get()) != 0;

		return obj;
	}

	/**
	 * Drives the stepper motor forward until {@link BrickSilentStepper#driveBackward()} or
	 * {@link BrickSilentStepper#stop()} is called. The velocity, acceleration and deacceleration as
	 * set by {@link BrickSilentStepper#setMaxVelocity(int)} and {@link BrickSilentStepper#setSpeedRamping(int, int)} will be used.
	 */
	public void driveForward() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DRIVE_FORWARD, this);


		sendRequest(bb.array());
	}

	/**
	 * Drives the stepper motor backward until {@link BrickSilentStepper#driveForward()} or
	 * {@link BrickSilentStepper#stop()} is triggered. The velocity, acceleration and deacceleration as
	 * set by {@link BrickSilentStepper#setMaxVelocity(int)} and {@link BrickSilentStepper#setSpeedRamping(int, int)} will be used.
	 */
	public void driveBackward() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DRIVE_BACKWARD, this);


		sendRequest(bb.array());
	}

	/**
	 * Stops the stepper motor with the deacceleration as set by
	 * {@link BrickSilentStepper#setSpeedRamping(int, int)}.
	 */
	public void stop() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_STOP, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns the stack input voltage in mV. The stack input voltage is the
	 * voltage that is supplied via the stack, i.e. it is given by a
	 * Step-Down or Step-Up Power Supply.
	 */
	public int getStackInputVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_INPUT_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Returns the external input voltage in mV. The external input voltage is
	 * given via the black power input connector on the Slient Stepper Brick.
	 * 
	 * If there is an external input voltage and a stack input voltage, the motor
	 * will be driven by the external input voltage. If there is only a stack
	 * voltage present, the motor will be driven by this voltage.
	 * 
	 * \warning
	 *  This means, if you have a high stack voltage and a low external voltage,
	 *  the motor will be driven with the low external voltage. If you then remove
	 *  the external connection, it will immediately be driven by the high
	 *  stack voltage
	 */
	public int getExternalInputVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_EXTERNAL_INPUT_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Sets the current in mA with which the motor will be driven.
	 * The minimum value is 360mA, the maximum value 1640mA and the
	 * default value is 800mA.
	 * 
	 * \warning
	 *  Do not set this value above the specifications of your stepper motor.
	 *  Otherwise it may damage your motor.
	 */
	public void setMotorCurrent(int current) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_MOTOR_CURRENT, this);

		bb.putShort((short)current);

		sendRequest(bb.array());
	}

	/**
	 * Returns the current as set by {@link BrickSilentStepper#setMotorCurrent(int)}.
	 */
	public int getMotorCurrent() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MOTOR_CURRENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int current = IPConnection.unsignedShort(bb.getShort());

		return current;
	}

	/**
	 * Enables the driver chip. The driver parameters can be configured (maximum velocity,
	 * acceleration, etc) before it is enabled.
	 */
	public void enable() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the driver chip. The configurations are kept (maximum velocity,
	 * acceleration, etc) but the motor is not driven until it is enabled again.
	 */
	public void disable() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the driver chip is enabled, *false* otherwise.
	 */
	public boolean isEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Sets the basic configuration parameters for the different modes (Stealth, Coolstep, Classic).
	 * 
	 * * Standstill Current: This value can be used to lower the current during stand still. This might
	 *   be reasonable to reduce the heating of the motor and the Brick. When the motor is in standstill 
	 *   the configured motor phase current will be driven until the configured 
	 *   Power Down Time is elapsed. After that the phase current will be reduced to the standstill 
	 *   current. The elapsed time for this reduction can be configured with the Standstill Delay Time.
	 *   The unit is in mA and the maximum allowed value is the configured maximum motor current
	 *   (see {@link BrickSilentStepper#setMotorCurrent(int)}).
	 * 
	 * * Motor Run Current: The value sets the motor current when the motor is running. 
	 *   Use a value of at least one half of the global maximum motor current for a good 
	 *   microstep performance. The unit is in mA and the maximum allowed value is the current 
	 *   motor current. The API maps the entered value to 1/32 ... 32/32 of the maximum
	 *   motor current. This value should be used to change the motor current during motor movement,
	 *   whereas the global maximum motor current should not be changed while the motor is moving
	 *   (see {@link BrickSilentStepper#setMotorCurrent(int)}).
	 * 
	 * * Standstill Delay Time: Controls the duration for motor power down after a motion
	 *   as soon as standstill is detected and the Power Down Time is expired. A high Standstill Delay
	 *   Time results in a smooth transition that avoids motor jerk during power down.
	 *   The value range is 0 to 307ms
	 * 
	 * * Power Down Time: Sets the delay time after a stand still.
	 *   The value range is 0 to 5222ms.
	 * 
	 * * Stealth Threshold: Sets the upper threshold for Stealth mode in steps/s. The value range is
	 *   0-65536 steps/s. If the velocity of the motor goes above this value, Stealth mode is turned
	 *   off. Otherwise it is turned on. In Stealth mode the torque declines with high speed.
	 * 
	 * * Coolstep Threshold: Sets the lower threshold for Coolstep mode in steps/s. The value range is
	 *   0-65536 steps/s. The Coolstep Threshold needs to be above the Stealth Threshold.
	 * 
	 * * Classic Threshold: Sets the lower threshold for classic mode. The value range is
	 *   0-65536 steps/s. In classic mode the stepper becomes more noisy, but the torque is maximized.
	 * 
	 * * High Velocity Shopper Mode: If High Velocity Shopper Mode is enabled, the stepper control
	 *   is optimized to run the stepper motors at high velocities.
	 * 
	 * If you want to use all three thresholds make sure that
	 * Stealth Threshold &lt; Coolstep Threshold &lt; Classic Threshold.
	 * 
	 * The default values are:
	 * 
	 * * Standstill Current: 200
	 * * Motor Run Current: 800
	 * * Standstill Delay Time: 0
	 * * Power Down Time: 1000
	 * * Stealth Threshold: 500
	 * * Coolstep Threshold: 500
	 * * Classic Threshold: 1000
	 * * High Velocity Shopper Mode: false
	 */
	public void setBasicConfiguration(int standstillCurrent, int motorRunCurrent, int standstillDelayTime, int powerDownTime, int stealthThreshold, int coolstepThreshold, int classicThreshold, boolean highVelocityChopperMode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)23, FUNCTION_SET_BASIC_CONFIGURATION, this);

		bb.putShort((short)standstillCurrent);
		bb.putShort((short)motorRunCurrent);
		bb.putShort((short)standstillDelayTime);
		bb.putShort((short)powerDownTime);
		bb.putShort((short)stealthThreshold);
		bb.putShort((short)coolstepThreshold);
		bb.putShort((short)classicThreshold);
		bb.put((byte)(highVelocityChopperMode ? 1 : 0));

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}.
	 */
	public BasicConfiguration getBasicConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_BASIC_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		BasicConfiguration obj = new BasicConfiguration();
		obj.standstillCurrent = IPConnection.unsignedShort(bb.getShort());
		obj.motorRunCurrent = IPConnection.unsignedShort(bb.getShort());
		obj.standstillDelayTime = IPConnection.unsignedShort(bb.getShort());
		obj.powerDownTime = IPConnection.unsignedShort(bb.getShort());
		obj.stealthThreshold = IPConnection.unsignedShort(bb.getShort());
		obj.coolstepThreshold = IPConnection.unsignedShort(bb.getShort());
		obj.classicThreshold = IPConnection.unsignedShort(bb.getShort());
		obj.highVelocityChopperMode = (bb.get()) != 0;

		return obj;
	}

	/**
	 * Note: If you don't know what any of this means you can very likely keep all of
	 * the values as default!
	 * 
	 * Sets the Spreadcycle configuration parameters. Spreadcycle is a chopper algorithm which actively
	 * controls the motor current flow. More information can be found in the TMC2130 datasheet on page
	 * 47 (7 spreadCycle and Classic Chopper).
	 * 
	 * * Slow Decay Duration: Controls duration of off time setting of slow decay phase. The value
	 *   range is 0-15. 0 = driver disabled, all bridges off. Use 1 only with Comparator Blank time &gt;= 2.
	 * 
	 * * Enable Random Slow Decay: Set to false to fix chopper off time as set by Slow Decay Duration.
	 *   If you set it to true, Decay Duration is randomly modulated.
	 * 
	 * * Fast Decay Duration: Sets the fast decay duration. The value range is 0-15. This parameters is
	 *   only used if the Chopper Mode is set to Fast Decay.
	 * 
	 * * Hysteresis Start Value: Sets the hysteresis start value. The value range is 0-7. This parameter is
	 *   only used if the Chopper Mode is set to Spread Cycle.
	 * 
	 * * Hysteresis End Value: Sets the hysteresis end value. The value range is -3 to 12. This parameter is
	 *   only used if the Chopper Mode is set to Spread Cycle.
	 * 
	 * * Sine Wave Offset: Sets the sine wave offset. The value range is -3 to 12. This parameters is
	 *   only used if the Chopper Mode is set to Fast Decay. 1/512 of the value becomes added to the absolute
	 *   value of the sine wave.
	 * 
	 * * Chopper Mode: 0 = Spread Cycle, 1 = Fast Decay.
	 * 
	 * * Comparator Blank Time: Sets the blank time of the comparator. Available values are
	 * 
	 *   * 0 = 16 clocks,
	 *   * 1 = 24 clocks,
	 *   * 2 = 36 clocks and
	 *   * 3 = 54 clocks.
	 * 
	 *   A value of 1 or 2 is recommended for most applications.
	 * 
	 * * Fast Decay Without Comparator: If set to true the current comparator usage for termination of the
	 *   fast decay cycle is disabled.
	 * 
	 * The default values are:
	 * 
	 * * Slow Decay Duration: 4
	 * * Enable Random Slow Decay: 0
	 * * Fast Decay Duration: 0
	 * * Hysteresis Start Value: 0
	 * * Hysteresis End Value: 0
	 * * Sine Wave Offset: 0
	 * * Chopper Mode: 0
	 * * Comparator Blank Time: 1
	 * * Fast Decay Without Comparator: false
	 */
	public void setSpreadcycleConfiguration(short slowDecayDuration, boolean enableRandomSlowDecay, short fastDecayDuration, short hysteresisStartValue, byte hysteresisEndValue, byte sineWaveOffset, short chopperMode, short comparatorBlankTime, boolean fastDecayWithoutComparator) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)17, FUNCTION_SET_SPREADCYCLE_CONFIGURATION, this);

		bb.put((byte)slowDecayDuration);
		bb.put((byte)(enableRandomSlowDecay ? 1 : 0));
		bb.put((byte)fastDecayDuration);
		bb.put((byte)hysteresisStartValue);
		bb.put(hysteresisEndValue);
		bb.put(sineWaveOffset);
		bb.put((byte)chopperMode);
		bb.put((byte)comparatorBlankTime);
		bb.put((byte)(fastDecayWithoutComparator ? 1 : 0));

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}.
	 */
	public SpreadcycleConfiguration getSpreadcycleConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SPREADCYCLE_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SpreadcycleConfiguration obj = new SpreadcycleConfiguration();
		obj.slowDecayDuration = IPConnection.unsignedByte(bb.get());
		obj.enableRandomSlowDecay = (bb.get()) != 0;
		obj.fastDecayDuration = IPConnection.unsignedByte(bb.get());
		obj.hysteresisStartValue = IPConnection.unsignedByte(bb.get());
		obj.hysteresisEndValue = (bb.get());
		obj.sineWaveOffset = (bb.get());
		obj.chopperMode = IPConnection.unsignedByte(bb.get());
		obj.comparatorBlankTime = IPConnection.unsignedByte(bb.get());
		obj.fastDecayWithoutComparator = (bb.get()) != 0;

		return obj;
	}

	/**
	 * Note: If you don't know what any of this means you can very likely keep all of
	 * the values as default!
	 * 
	 * Sets the configuration relevant for Stealth mode.
	 * 
	 * * Enable Stealth: If set to true the stealth mode is enabled, if set to false the
	 *   stealth mode is disabled, even if the speed is below the threshold set in {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}.
	 * 
	 * * Amplitude: If autoscale is disabled, the PWM amplitude is scaled by this value. If autoscale is enabled,
	 *   this value defines the maximum PWM amplitude change per half wave. The value range is 0-255.
	 * 
	 * * Gradient: If autoscale is disabled, the PWM gradient is scaled by this value. If autoscale is enabled,
	 *   this value defines the maximum PWM gradient. With autoscale a value above 64 is recommended,
	 *   otherwise the regulation might not be able to measure the current. The value range is 0-255.
	 * 
	 * * Enable Autoscale: If set to true, automatic current control is used. Otherwise the user defined
	 *   amplitude and gradient are used.
	 * 
	 * * Force Symmetric: If true, A symmetric PWM cycle is enforced. Otherwise the PWM value may change within each
	 *   PWM cycle.
	 * 
	 * * Freewheel Mode: The freewheel mode defines the behavior in stand still if the Standstill Current
	 *   (see {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}) is set to 0.
	 * 
	 * The default values are:
	 * 
	 * * Enable Stealth: true
	 * * Amplitude: 128
	 * * Gradient: 4
	 * * Enable Autoscale: true
	 * * Force Symmetric: false
	 * * Freewheel Mode: 0 (Normal)
	 */
	public void setStealthConfiguration(boolean enableStealth, short amplitude, short gradient, boolean enableAutoscale, boolean forceSymmetric, short freewheelMode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)14, FUNCTION_SET_STEALTH_CONFIGURATION, this);

		bb.put((byte)(enableStealth ? 1 : 0));
		bb.put((byte)amplitude);
		bb.put((byte)gradient);
		bb.put((byte)(enableAutoscale ? 1 : 0));
		bb.put((byte)(forceSymmetric ? 1 : 0));
		bb.put((byte)freewheelMode);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickSilentStepper#setStealthConfiguration(boolean, short, short, boolean, boolean, short)}.
	 */
	public StealthConfiguration getStealthConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STEALTH_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		StealthConfiguration obj = new StealthConfiguration();
		obj.enableStealth = (bb.get()) != 0;
		obj.amplitude = IPConnection.unsignedByte(bb.get());
		obj.gradient = IPConnection.unsignedByte(bb.get());
		obj.enableAutoscale = (bb.get()) != 0;
		obj.forceSymmetric = (bb.get()) != 0;
		obj.freewheelMode = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Note: If you don't know what any of this means you can very likely keep all of
	 * the values as default!
	 * 
	 * Sets the configuration relevant for Coolstep.
	 * 
	 * * Minimum Stallguard Value: If the Stallguard result falls below this value*32, the motor current
	 *   is increased to reduce motor load angle. The value range is 0-15. A value of 0 turns Coolstep off.
	 * 
	 * * Maximum Stallguard Value: If the Stallguard result goes above
	 *   (Min Stallguard Value + Max Stallguard Value + 1) * 32, the motor current is decreased to save
	 *   energy.
	 * 
	 * * Current Up Step Width: Sets the up step increment per Stallguard value. The value range is 0-3,
	 *   corresponding to the increments 1, 2, 4 and 8.
	 * 
	 * * Current Down Step Width: Sets the down step decrement per Stallguard value. The value range is 0-3,
	 *   corresponding to the decrements 1, 2, 8 and 16.
	 * 
	 * * Minimum Current: Sets the minimum current for Coolstep current control. You can choose between
	 *   half and quarter of the run current.
	 * 
	 * * Stallguard Threshold Value: Sets the level for stall output (see {@link BrickSilentStepper#getDriverStatus()}). The value
	 *   range is -64 to +63. A lower value gives a higher sensitivity. You have to find a suitable value for your
	 *   motor by trial and error, 0 works for most motors.
	 * 
	 * * Stallguard Mode: Set to 0 for standard resolution or 1 for filtered mode. In filtered mode the Stallguard
	 *   signal will be updated every four full-steps.
	 * 
	 * The default values are:
	 * 
	 * * Minimum Stallguard Value: 2
	 * * Maximum Stallguard Value: 10
	 * * Current Up Step Width: 0
	 * * Current Down Step Width: 0
	 * * Minimum Current: 0
	 * * Stallguard Threshold Value: 0
	 * * Stallguard Mode: 0
	 */
	public void setCoolstepConfiguration(short minimumStallguardValue, short maximumStallguardValue, short currentUpStepWidth, short currentDownStepWidth, short minimumCurrent, byte stallguardThresholdValue, short stallguardMode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_SET_COOLSTEP_CONFIGURATION, this);

		bb.put((byte)minimumStallguardValue);
		bb.put((byte)maximumStallguardValue);
		bb.put((byte)currentUpStepWidth);
		bb.put((byte)currentDownStepWidth);
		bb.put((byte)minimumCurrent);
		bb.put(stallguardThresholdValue);
		bb.put((byte)stallguardMode);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickSilentStepper#setCoolstepConfiguration(short, short, short, short, short, byte, short)}.
	 */
	public CoolstepConfiguration getCoolstepConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_COOLSTEP_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		CoolstepConfiguration obj = new CoolstepConfiguration();
		obj.minimumStallguardValue = IPConnection.unsignedByte(bb.get());
		obj.maximumStallguardValue = IPConnection.unsignedByte(bb.get());
		obj.currentUpStepWidth = IPConnection.unsignedByte(bb.get());
		obj.currentDownStepWidth = IPConnection.unsignedByte(bb.get());
		obj.minimumCurrent = IPConnection.unsignedByte(bb.get());
		obj.stallguardThresholdValue = (bb.get());
		obj.stallguardMode = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Note: If you don't know what any of this means you can very likely keep all of
	 * the values as default!
	 * 
	 * Sets miscellaneous configuration parameters.
	 * 
	 * * Disable Short To Ground Protection: Set to false to enable short to ground protection, otherwise
	 *   it is disabled.
	 * 
	 * * Synchronize Phase Frequency: With this parameter you can synchronize the chopper for both phases
	 *   of a two phase motor to avoid the occurrence of a beat. The value range is 0-15. If set to 0,
	 *   the synchronization is turned off. Otherwise the synchronization is done through the formula
	 *   f_sync = f_clk/(value*64). In Classic Mode the synchronization is automatically switched off.
	 *   f_clk is 12.8MHz.
	 * 
	 * The default values are:
	 * 
	 * * Disable Short To Ground Protection: 0
	 * * Synchronize Phase Frequency: 0
	 */
	public void setMiscConfiguration(boolean disableShortToGroundProtection, short synchronizePhaseFrequency) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_MISC_CONFIGURATION, this);

		bb.put((byte)(disableShortToGroundProtection ? 1 : 0));
		bb.put((byte)synchronizePhaseFrequency);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickSilentStepper#setMiscConfiguration(boolean, short)}.
	 */
	public MiscConfiguration getMiscConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MISC_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		MiscConfiguration obj = new MiscConfiguration();
		obj.disableShortToGroundProtection = (bb.get()) != 0;
		obj.synchronizePhaseFrequency = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns the current driver status.
	 * 
	 * * Open Load: Indicates if an open load is present on phase A, B or both. This could mean that there is a problem
	 *   with the wiring of the motor. False detection can occur in fast motion as well as during stand still.
	 * 
	 * * Short To Ground: Indicates if a short to ground is present on phase A, B or both. If this is detected the driver
	 *   automatically becomes disabled and stays disabled until it is enabled again manually.
	 * 
	 * * Over Temperature: The over temperature indicator switches to "Warning" if the driver IC warms up. The warning flag
	 *   is expected during long duration stepper uses. If the temperature limit is reached the indicator switches
	 *   to "Limit". In this case the driver becomes disabled until it cools down again.
	 * 
	 * * Motor Stalled: Is true if a motor stall was detected.
	 * 
	 * * Actual Motor Current: Indicates the actual current control scaling as used in Coolstep mode. 
	 *   The returned value is between 0 and 31. It represents a multiplier of 1/32 to 32/32 of the
	 *   ``Motor Run Current`` as set by {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}. Example: If a ``Motor Run Current``
	 *   of 1000mA was set and the returned value is 15, the ``Actual Motor Current`` is 16/32*1000mA = 500mA.
	 * 
	 * * Stallguard Result: Indicates the load of the motor. A lower value signals a higher load. Per trial and error
	 *   you can find out which value corresponds to a suitable torque for the velocity used in your application.
	 *   After that you can use this threshold value to find out if a motor stall becomes probable and react on it (e.g.
	 *   decrease velocity).
	 *   During stand still this value can not be used for stall detection, it shows the chopper on-time for motor coil A.
	 * 
	 * * Stealth Voltage Amplitude: Shows the actual PWM scaling. In Stealth mode it can be used to detect motor load and
	 *   stall if autoscale is enabled (see {@link BrickSilentStepper#setStealthConfiguration(boolean, short, short, boolean, boolean, short)}).
	 */
	public DriverStatus getDriverStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_DRIVER_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		DriverStatus obj = new DriverStatus();
		obj.openLoad = IPConnection.unsignedByte(bb.get());
		obj.shortToGround = IPConnection.unsignedByte(bb.get());
		obj.overTemperature = IPConnection.unsignedByte(bb.get());
		obj.motorStalled = (bb.get()) != 0;
		obj.actualMotorCurrent = IPConnection.unsignedByte(bb.get());
		obj.fullStepActive = (bb.get()) != 0;
		obj.stallguardResult = IPConnection.unsignedByte(bb.get());
		obj.stealthVoltageAmplitude = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the minimum voltage in mV, below which the {@link BrickSilentStepper.UnderVoltageListener} listener
	 * is triggered. The minimum possible value that works with the Slient Stepper
	 * Brick is 8V.
	 * You can use this function to detect the discharge of a battery that is used
	 * to drive the stepper motor. If you have a fixed power supply, you likely do
	 * not need this functionality.
	 * 
	 * The default value is 8V.
	 */
	public void setMinimumVoltage(int voltage) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_MINIMUM_VOLTAGE, this);

		bb.putShort((short)voltage);

		sendRequest(bb.array());
	}

	/**
	 * Returns the minimum voltage as set by {@link BrickSilentStepper#setMinimumVoltage(int)}.
	 */
	public int getMinimumVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MINIMUM_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Sets the time base of the velocity and the acceleration of the Silent Stepper
	 * Brick (in seconds).
	 * 
	 * For example, if you want to make one step every 1.5 seconds, you can set
	 * the time base to 15 and the velocity to 10. Now the velocity is
	 * 10steps/15s = 1steps/1.5s.
	 * 
	 * The default value is 1.
	 */
	public void setTimeBase(long timeBase) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_TIME_BASE, this);

		bb.putInt((int)timeBase);

		sendRequest(bb.array());
	}

	/**
	 * Returns the time base as set by {@link BrickSilentStepper#setTimeBase(long)}.
	 */
	public long getTimeBase() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_TIME_BASE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long timeBase = IPConnection.unsignedInt(bb.getInt());

		return timeBase;
	}

	/**
	 * Returns the following parameters: The current velocity,
	 * the current position, the remaining steps, the stack voltage, the external
	 * voltage and the current consumption of the stepper motor.
	 * 
	 * The current consumption is calculated by multiplying the ``Actual Motor Current``
	 * value (see {@link BrickSilentStepper#setBasicConfiguration(int, int, int, int, int, int, int, boolean)}) with the ``Motor Run Current``
	 * (see {@link BrickSilentStepper#getDriverStatus()}). This is an internal calculation of the
	 * driver, not an independent external measurement.
	 * 
	 * The current consumption calculation was broken up to firmware 2.0.1, it is fixed
	 * since firmware 2.0.2.
	 * 
	 * There is also a listener for this function, see {@link BrickSilentStepper.AllDataListener} listener.
	 */
	public AllData getAllData() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALL_DATA, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		AllData obj = new AllData();
		obj.currentVelocity = IPConnection.unsignedShort(bb.getShort());
		obj.currentPosition = (bb.getInt());
		obj.remainingSteps = (bb.getInt());
		obj.stackVoltage = IPConnection.unsignedShort(bb.getShort());
		obj.externalVoltage = IPConnection.unsignedShort(bb.getShort());
		obj.currentConsumption = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the period in ms with which the {@link BrickSilentStepper.AllDataListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setAllDataPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ALL_DATA_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickSilentStepper#setAllDataPeriod(long)}.
	 */
	public long getAllDataPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALL_DATA_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * The SPITF protocol can be used with a dynamic baudrate. If the dynamic baudrate is
	 * enabled, the Brick will try to adapt the baudrate for the communication
	 * between Bricks and Bricklets according to the amount of data that is transferred.
	 * 
	 * The baudrate will be increased exponetially if lots of data is send/receieved and
	 * decreased linearly if little data is send/received.
	 * 
	 * This lowers the baudrate in applications where little data is transferred (e.g.
	 * a weather station) and increases the robustness. If there is lots of data to transfer
	 * (e.g. Thermal Imaging Bricklet) it automatically increases the baudrate as needed.
	 * 
	 * In cases where some data has to transferred as fast as possible every few seconds
	 * (e.g. RS485 Bricklet with a high baudrate but small payload) you may want to turn
	 * the dynamic baudrate off to get the highest possible performance.
	 * 
	 * The maximum value of the baudrate can be set per port with the function 
	 * {@link BrickSilentStepper#setSPITFPBaudrate(char, long)}. If the dynamic baudrate is disabled, the baudrate
	 * as set by {@link BrickSilentStepper#setSPITFPBaudrate(char, long)} will be used statically.
	 * 
	 * The minimum dynamic baudrate has a value range of 400000 to 2000000 baud.
	 * 
	 * By default dynamic baudrate is enabled and the minimum dynamic baudrate is 400000.
	 * 
	 * .. versionadded:: 2.0.4$nbsp;(Firmware)
	 */
	public void setSPITFPBaudrateConfig(boolean enableDynamicBaudrate, long minimumDynamicBaudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE_CONFIG, this);

		bb.put((byte)(enableDynamicBaudrate ? 1 : 0));
		bb.putInt((int)minimumDynamicBaudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate config, see {@link BrickSilentStepper#setSPITFPBaudrateConfig(boolean, long)}.
	 * 
	 * .. versionadded:: 2.0.4$nbsp;(Firmware)
	 */
	public SPITFPBaudrateConfig getSPITFPBaudrateConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SPITFP_BAUDRATE_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SPITFPBaudrateConfig obj = new SPITFPBaudrateConfig();
		obj.enableDynamicBaudrate = (bb.get()) != 0;
		obj.minimumDynamicBaudrate = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Returns the timeout count for the different communication methods.
	 * 
	 * The methods 0-2 are available for all Bricks, 3-7 only for Master Bricks.
	 * 
	 * This function is mostly used for debugging during development, in normal operation
	 * the counters should nearly always stay at 0.
	 */
	public long getSendTimeoutCount(short communicationMethod) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_SEND_TIMEOUT_COUNT, this);

		bb.put((byte)communicationMethod);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long timeoutCount = IPConnection.unsignedInt(bb.getInt());

		return timeoutCount;
	}

	/**
	 * Sets the baudrate for a specific Bricklet port ('a' - 'd'). The
	 * baudrate can be in the range 400000 to 2000000.
	 * 
	 * If you want to increase the throughput of Bricklets you can increase
	 * the baudrate. If you get a high error count because of high
	 * interference (see {@link BrickSilentStepper#getSPITFPErrorCount(char)}) you can decrease the
	 * baudrate.
	 * 
	 * If the dynamic baudrate feature is enabled, the baudrate set by this
	 * function corresponds to the maximum baudrate (see {@link BrickSilentStepper#setSPITFPBaudrateConfig(boolean, long)}).
	 * 
	 * Regulatory testing is done with the default baudrate. If CE compatability
	 * or similar is necessary in you applications we recommend to not change
	 * the baudrate.
	 * 
	 * The default baudrate for all ports is 1400000.
	 */
	public void setSPITFPBaudrate(char brickletPort, long baudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE, this);

		bb.put((byte)brickletPort);
		bb.putInt((int)baudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate for a given Bricklet port, see {@link BrickSilentStepper#setSPITFPBaudrate(char, long)}.
	 */
	public long getSPITFPBaudrate(char brickletPort) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_SPITFP_BAUDRATE, this);

		bb.put((byte)brickletPort);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long baudrate = IPConnection.unsignedInt(bb.getInt());

		return baudrate;
	}

	/**
	 * Returns the error count for the communication between Brick and Bricklet.
	 * 
	 * The errors are divided into
	 * 
	 * * ACK checksum errors,
	 * * message checksum errors,
	 * * frameing errors and
	 * * overflow errors.
	 * 
	 * The errors counts are for errors that occur on the Brick side. All
	 * Bricklets have a similar function that returns the errors on the Bricklet side.
	 */
	public SPITFPErrorCount getSPITFPErrorCount(char brickletPort) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_SPITFP_ERROR_COUNT, this);

		bb.put((byte)brickletPort);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SPITFPErrorCount obj = new SPITFPErrorCount();
		obj.errorCountACKChecksum = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountMessageChecksum = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountFrame = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountOverflow = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Enables the status LED.
	 * 
	 * The status LED is the blue LED next to the USB connector. If enabled is is
	 * on and it flickers if data is transfered. If disabled it is always off.
	 * 
	 * The default state is enabled.
	 */
	public void enableStatusLED() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_STATUS_LED, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the status LED.
	 * 
	 * The status LED is the blue LED next to the USB connector. If enabled is is
	 * on and it flickers if data is transfered. If disabled it is always off.
	 * 
	 * The default state is enabled.
	 */
	public void disableStatusLED() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_STATUS_LED, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the status LED is enabled, *false* otherwise.
	 */
	public boolean isStatusLEDEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_STATUS_LED_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Returns the firmware and protocol version and the name of the Bricklet for a
	 * given port.
	 * 
	 * This functions sole purpose is to allow automatic flashing of v1.x.y Bricklet
	 * plugins.
	 */
	public Protocol1BrickletName getProtocol1BrickletName(char port) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_PROTOCOL1_BRICKLET_NAME, this);

		bb.put((byte)port);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Protocol1BrickletName obj = new Protocol1BrickletName();
		obj.protocolVersion = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 3; i++) {
			obj.firmwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.name = IPConnection.string(bb, 40);

		return obj;
	}

	/**
	 * Returns the temperature in °C/10 as measured inside the microcontroller. The
	 * value returned is not the ambient temperature!
	 * 
	 * The temperature is only proportional to the real temperature and it has an
	 * accuracy of +-15%. Practically it is only useful as an indicator for
	 * temperature changes.
	 */
	public short getChipTemperature() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIP_TEMPERATURE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short temperature = (bb.getShort());

		return temperature;
	}

	/**
	 * Calling this function will reset the Brick. Calling this function
	 * on a Brick inside of a stack will reset the whole stack.
	 * 
	 * After a reset you have to create new device objects,
	 * calling functions on the existing ones will result in
	 * undefined behavior!
	 */
	public void reset() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_RESET, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns the UID, the UID where the Brick is connected to,
	 * the position, the hardware and firmware version as well as the
	 * device identifier.
	 * 
	 * The position can be '0'-'8' (stack position).
	 * 
	 * The device identifier numbers can be found :ref:`here &lt;device_identifier&gt;`.
	 * |device_identifier_constant|
	 */
	public Identity getIdentity() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_IDENTITY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Identity obj = new Identity();
		obj.uid = IPConnection.string(bb, 8);
		obj.connectedUid = IPConnection.string(bb, 8);
		obj.position = (char)(bb.get());
		for (int i = 0; i < 3; i++) {
			obj.hardwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 3; i++) {
			obj.firmwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.deviceIdentifier = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Adds a UnderVoltage listener.
	 */
	public void addUnderVoltageListener(UnderVoltageListener listener) {
		listenerUnderVoltage.add(listener);
	}

	/**
	 * Removes a UnderVoltage listener.
	 */
	public void removeUnderVoltageListener(UnderVoltageListener listener) {
		listenerUnderVoltage.remove(listener);
	}

	/**
	 * Adds a PositionReached listener.
	 */
	public void addPositionReachedListener(PositionReachedListener listener) {
		listenerPositionReached.add(listener);
	}

	/**
	 * Removes a PositionReached listener.
	 */
	public void removePositionReachedListener(PositionReachedListener listener) {
		listenerPositionReached.remove(listener);
	}

	/**
	 * Adds a AllData listener.
	 */
	public void addAllDataListener(AllDataListener listener) {
		listenerAllData.add(listener);
	}

	/**
	 * Removes a AllData listener.
	 */
	public void removeAllDataListener(AllDataListener listener) {
		listenerAllData.remove(listener);
	}

	/**
	 * Adds a NewState listener.
	 */
	public void addNewStateListener(NewStateListener listener) {
		listenerNewState.add(listener);
	}

	/**
	 * Removes a NewState listener.
	 */
	public void removeNewStateListener(NewStateListener listener) {
		listenerNewState.remove(listener);
	}
}
