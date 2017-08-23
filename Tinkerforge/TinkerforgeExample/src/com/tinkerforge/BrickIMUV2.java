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
 * Full fledged AHRS with 9 degrees of freedom
 */
public class BrickIMUV2 extends Device {
	public final static int DEVICE_IDENTIFIER = 18;
	public final static String DEVICE_DISPLAY_NAME = "IMU Brick 2.0";

	public final static byte FUNCTION_GET_ACCELERATION = (byte)1;
	public final static byte FUNCTION_GET_MAGNETIC_FIELD = (byte)2;
	public final static byte FUNCTION_GET_ANGULAR_VELOCITY = (byte)3;
	public final static byte FUNCTION_GET_TEMPERATURE = (byte)4;
	public final static byte FUNCTION_GET_ORIENTATION = (byte)5;
	public final static byte FUNCTION_GET_LINEAR_ACCELERATION = (byte)6;
	public final static byte FUNCTION_GET_GRAVITY_VECTOR = (byte)7;
	public final static byte FUNCTION_GET_QUATERNION = (byte)8;
	public final static byte FUNCTION_GET_ALL_DATA = (byte)9;
	public final static byte FUNCTION_LEDS_ON = (byte)10;
	public final static byte FUNCTION_LEDS_OFF = (byte)11;
	public final static byte FUNCTION_ARE_LEDS_ON = (byte)12;
	public final static byte FUNCTION_SAVE_CALIBRATION = (byte)13;
	public final static byte FUNCTION_SET_ACCELERATION_PERIOD = (byte)14;
	public final static byte FUNCTION_GET_ACCELERATION_PERIOD = (byte)15;
	public final static byte FUNCTION_SET_MAGNETIC_FIELD_PERIOD = (byte)16;
	public final static byte FUNCTION_GET_MAGNETIC_FIELD_PERIOD = (byte)17;
	public final static byte FUNCTION_SET_ANGULAR_VELOCITY_PERIOD = (byte)18;
	public final static byte FUNCTION_GET_ANGULAR_VELOCITY_PERIOD = (byte)19;
	public final static byte FUNCTION_SET_TEMPERATURE_PERIOD = (byte)20;
	public final static byte FUNCTION_GET_TEMPERATURE_PERIOD = (byte)21;
	public final static byte FUNCTION_SET_ORIENTATION_PERIOD = (byte)22;
	public final static byte FUNCTION_GET_ORIENTATION_PERIOD = (byte)23;
	public final static byte FUNCTION_SET_LINEAR_ACCELERATION_PERIOD = (byte)24;
	public final static byte FUNCTION_GET_LINEAR_ACCELERATION_PERIOD = (byte)25;
	public final static byte FUNCTION_SET_GRAVITY_VECTOR_PERIOD = (byte)26;
	public final static byte FUNCTION_GET_GRAVITY_VECTOR_PERIOD = (byte)27;
	public final static byte FUNCTION_SET_QUATERNION_PERIOD = (byte)28;
	public final static byte FUNCTION_GET_QUATERNION_PERIOD = (byte)29;
	public final static byte FUNCTION_SET_ALL_DATA_PERIOD = (byte)30;
	public final static byte FUNCTION_GET_ALL_DATA_PERIOD = (byte)31;
	public final static byte FUNCTION_SET_SENSOR_CONFIGURATION = (byte)41;
	public final static byte FUNCTION_GET_SENSOR_CONFIGURATION = (byte)42;
	public final static byte FUNCTION_SET_SENSOR_FUSION_MODE = (byte)43;
	public final static byte FUNCTION_GET_SENSOR_FUSION_MODE = (byte)44;
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
	private final static int CALLBACK_ACCELERATION = 32;
	private final static int CALLBACK_MAGNETIC_FIELD = 33;
	private final static int CALLBACK_ANGULAR_VELOCITY = 34;
	private final static int CALLBACK_TEMPERATURE = 35;
	private final static int CALLBACK_LINEAR_ACCELERATION = 36;
	private final static int CALLBACK_GRAVITY_VECTOR = 37;
	private final static int CALLBACK_ORIENTATION = 38;
	private final static int CALLBACK_QUATERNION = 39;
	private final static int CALLBACK_ALL_DATA = 40;

	public final static short MAGNETOMETER_RATE_2HZ = (short)0;
	public final static short MAGNETOMETER_RATE_6HZ = (short)1;
	public final static short MAGNETOMETER_RATE_8HZ = (short)2;
	public final static short MAGNETOMETER_RATE_10HZ = (short)3;
	public final static short MAGNETOMETER_RATE_15HZ = (short)4;
	public final static short MAGNETOMETER_RATE_20HZ = (short)5;
	public final static short MAGNETOMETER_RATE_25HZ = (short)6;
	public final static short MAGNETOMETER_RATE_30HZ = (short)7;
	public final static short GYROSCOPE_RANGE_2000DPS = (short)0;
	public final static short GYROSCOPE_RANGE_1000DPS = (short)1;
	public final static short GYROSCOPE_RANGE_500DPS = (short)2;
	public final static short GYROSCOPE_RANGE_250DPS = (short)3;
	public final static short GYROSCOPE_RANGE_125DPS = (short)4;
	public final static short GYROSCOPE_BANDWIDTH_523HZ = (short)0;
	public final static short GYROSCOPE_BANDWIDTH_230HZ = (short)1;
	public final static short GYROSCOPE_BANDWIDTH_116HZ = (short)2;
	public final static short GYROSCOPE_BANDWIDTH_47HZ = (short)3;
	public final static short GYROSCOPE_BANDWIDTH_23HZ = (short)4;
	public final static short GYROSCOPE_BANDWIDTH_12HZ = (short)5;
	public final static short GYROSCOPE_BANDWIDTH_64HZ = (short)6;
	public final static short GYROSCOPE_BANDWIDTH_32HZ = (short)7;
	public final static short ACCELEROMETER_RANGE_2G = (short)0;
	public final static short ACCELEROMETER_RANGE_4G = (short)1;
	public final static short ACCELEROMETER_RANGE_8G = (short)2;
	public final static short ACCELEROMETER_RANGE_16G = (short)3;
	public final static short ACCELEROMETER_BANDWIDTH_7_81HZ = (short)0;
	public final static short ACCELEROMETER_BANDWIDTH_15_63HZ = (short)1;
	public final static short ACCELEROMETER_BANDWIDTH_31_25HZ = (short)2;
	public final static short ACCELEROMETER_BANDWIDTH_62_5HZ = (short)3;
	public final static short ACCELEROMETER_BANDWIDTH_125HZ = (short)4;
	public final static short ACCELEROMETER_BANDWIDTH_250HZ = (short)5;
	public final static short ACCELEROMETER_BANDWIDTH_500HZ = (short)6;
	public final static short ACCELEROMETER_BANDWIDTH_1000HZ = (short)7;
	public final static short SENSOR_FUSION_OFF = (short)0;
	public final static short SENSOR_FUSION_ON = (short)1;
	public final static short SENSOR_FUSION_ON_WITHOUT_MAGNETOMETER = (short)2;
	public final static short COMMUNICATION_METHOD_NONE = (short)0;
	public final static short COMMUNICATION_METHOD_USB = (short)1;
	public final static short COMMUNICATION_METHOD_SPI_STACK = (short)2;
	public final static short COMMUNICATION_METHOD_CHIBI = (short)3;
	public final static short COMMUNICATION_METHOD_RS485 = (short)4;
	public final static short COMMUNICATION_METHOD_WIFI = (short)5;
	public final static short COMMUNICATION_METHOD_ETHERNET = (short)6;
	public final static short COMMUNICATION_METHOD_WIFI_V2 = (short)7;

	private List<AccelerationListener> listenerAcceleration = new CopyOnWriteArrayList<AccelerationListener>();
	private List<MagneticFieldListener> listenerMagneticField = new CopyOnWriteArrayList<MagneticFieldListener>();
	private List<AngularVelocityListener> listenerAngularVelocity = new CopyOnWriteArrayList<AngularVelocityListener>();
	private List<TemperatureListener> listenerTemperature = new CopyOnWriteArrayList<TemperatureListener>();
	private List<LinearAccelerationListener> listenerLinearAcceleration = new CopyOnWriteArrayList<LinearAccelerationListener>();
	private List<GravityVectorListener> listenerGravityVector = new CopyOnWriteArrayList<GravityVectorListener>();
	private List<OrientationListener> listenerOrientation = new CopyOnWriteArrayList<OrientationListener>();
	private List<QuaternionListener> listenerQuaternion = new CopyOnWriteArrayList<QuaternionListener>();
	private List<AllDataListener> listenerAllData = new CopyOnWriteArrayList<AllDataListener>();

	public class Acceleration {
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class MagneticField {
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class AngularVelocity {
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class Orientation {
		public short heading;
		public short roll;
		public short pitch;

		public String toString() {
			return "[" + "heading = " + heading + ", " + "roll = " + roll + ", " + "pitch = " + pitch + "]";
		}
	}

	public class LinearAcceleration {
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class GravityVector {
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class Quaternion {
		public short w;
		public short x;
		public short y;
		public short z;

		public String toString() {
			return "[" + "w = " + w + ", " + "x = " + x + ", " + "y = " + y + ", " + "z = " + z + "]";
		}
	}

	public class AllData {
		public short[] acceleration = new short[3];
		public short[] magneticField = new short[3];
		public short[] angularVelocity = new short[3];
		public short[] eulerAngle = new short[3];
		public short[] quaternion = new short[4];
		public short[] linearAcceleration = new short[3];
		public short[] gravityVector = new short[3];
		public byte temperature;
		public short calibrationStatus;

		public String toString() {
			return "[" + "acceleration = " + Arrays.toString(acceleration) + ", " + "magneticField = " + Arrays.toString(magneticField) + ", " + "angularVelocity = " + Arrays.toString(angularVelocity) + ", " + "eulerAngle = " + Arrays.toString(eulerAngle) + ", " + "quaternion = " + Arrays.toString(quaternion) + ", " + "linearAcceleration = " + Arrays.toString(linearAcceleration) + ", " + "gravityVector = " + Arrays.toString(gravityVector) + ", " + "temperature = " + temperature + ", " + "calibrationStatus = " + calibrationStatus + "]";
		}
	}

	public class SensorConfiguration {
		public short magnetometerRate;
		public short gyroscopeRange;
		public short gyroscopeBandwidth;
		public short accelerometerRange;
		public short accelerometerBandwidth;

		public String toString() {
			return "[" + "magnetometerRate = " + magnetometerRate + ", " + "gyroscopeRange = " + gyroscopeRange + ", " + "gyroscopeBandwidth = " + gyroscopeBandwidth + ", " + "accelerometerRange = " + accelerometerRange + ", " + "accelerometerBandwidth = " + accelerometerBandwidth + "]";
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
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setAccelerationPeriod(long)}. The parameters are the acceleration
	 * for the x, y and z axis.
	 */
	public interface AccelerationListener extends DeviceListener {
		public void acceleration(short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setMagneticFieldPeriod(long)}. The parameters are the magnetic
	 * field for the x, y and z axis.
	 */
	public interface MagneticFieldListener extends DeviceListener {
		public void magneticField(short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setAngularVelocityPeriod(long)}. The parameters are the angular
	 * velocity for the x, y and z axis.
	 */
	public interface AngularVelocityListener extends DeviceListener {
		public void angularVelocity(short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setTemperaturePeriod(long)}. The parameter is the temperature.
	 */
	public interface TemperatureListener extends DeviceListener {
		public void temperature(byte temperature);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setLinearAccelerationPeriod(long)}. The parameters are the
	 * linear acceleration for the x, y and z axis.
	 */
	public interface LinearAccelerationListener extends DeviceListener {
		public void linearAcceleration(short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setGravityVectorPeriod(long)}. The parameters gravity vector
	 * for the x, y and z axis.
	 */
	public interface GravityVectorListener extends DeviceListener {
		public void gravityVector(short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setOrientationPeriod(long)}. The parameters are the orientation
	 * (heading (yaw), roll, pitch) of the IMU Brick in Euler angles. See
	 * {@link BrickIMUV2#getOrientation()} for details.
	 */
	public interface OrientationListener extends DeviceListener {
		public void orientation(short heading, short roll, short pitch);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setQuaternionPeriod(long)}. The parameters are the orientation
	 * (x, y, z, w) of the IMU Brick in quaternions. See {@link BrickIMUV2#getQuaternion()}
	 * for details.
	 */
	public interface QuaternionListener extends DeviceListener {
		public void quaternion(short w, short x, short y, short z);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickIMUV2#setAllDataPeriod(long)}. The parameters are as for
	 * {@link BrickIMUV2#getAllData()}.
	 */
	public interface AllDataListener extends DeviceListener {
		public void allData(short[] acceleration, short[] magneticField, short[] angularVelocity, short[] eulerAngle, short[] quaternion, short[] linearAcceleration, short[] gravityVector, byte temperature, short calibrationStatus);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickIMUV2(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 1;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ACCELERATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MAGNETIC_FIELD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ANGULAR_VELOCITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_TEMPERATURE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ORIENTATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_LINEAR_ACCELERATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_GRAVITY_VECTOR)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_QUATERNION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALL_DATA)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_LEDS_ON)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_LEDS_OFF)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ARE_LEDS_ON)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SAVE_CALIBRATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ACCELERATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ACCELERATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MAGNETIC_FIELD_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MAGNETIC_FIELD_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ANGULAR_VELOCITY_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ANGULAR_VELOCITY_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_TEMPERATURE_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_TEMPERATURE_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ORIENTATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ORIENTATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_LINEAR_ACCELERATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_LINEAR_ACCELERATION_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_GRAVITY_VECTOR_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_GRAVITY_VECTOR_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_QUATERNION_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_QUATERNION_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ALL_DATA_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALL_DATA_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SENSOR_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SENSOR_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_SENSOR_FUSION_MODE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SENSOR_FUSION_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
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

		callbacks[CALLBACK_ACCELERATION] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (AccelerationListener listener: listenerAcceleration) {
					listener.acceleration(x, y, z);
				}
			}
		};

		callbacks[CALLBACK_MAGNETIC_FIELD] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (MagneticFieldListener listener: listenerMagneticField) {
					listener.magneticField(x, y, z);
				}
			}
		};

		callbacks[CALLBACK_ANGULAR_VELOCITY] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (AngularVelocityListener listener: listenerAngularVelocity) {
					listener.angularVelocity(x, y, z);
				}
			}
		};

		callbacks[CALLBACK_TEMPERATURE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				byte temperature = (bb.get());

				for (TemperatureListener listener: listenerTemperature) {
					listener.temperature(temperature);
				}
			}
		};

		callbacks[CALLBACK_LINEAR_ACCELERATION] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (LinearAccelerationListener listener: listenerLinearAcceleration) {
					listener.linearAcceleration(x, y, z);
				}
			}
		};

		callbacks[CALLBACK_GRAVITY_VECTOR] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (GravityVectorListener listener: listenerGravityVector) {
					listener.gravityVector(x, y, z);
				}
			}
		};

		callbacks[CALLBACK_ORIENTATION] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short heading = (bb.getShort());
				short roll = (bb.getShort());
				short pitch = (bb.getShort());

				for (OrientationListener listener: listenerOrientation) {
					listener.orientation(heading, roll, pitch);
				}
			}
		};

		callbacks[CALLBACK_QUATERNION] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short w = (bb.getShort());
				short x = (bb.getShort());
				short y = (bb.getShort());
				short z = (bb.getShort());

				for (QuaternionListener listener: listenerQuaternion) {
					listener.quaternion(w, x, y, z);
				}
			}
		};

		callbacks[CALLBACK_ALL_DATA] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short[] acceleration = new short[3];
				for (int i = 0; i < 3; i++) {
					acceleration[i] = (bb.getShort());
				}
				short[] magneticField = new short[3];
				for (int i = 0; i < 3; i++) {
					magneticField[i] = (bb.getShort());
				}
				short[] angularVelocity = new short[3];
				for (int i = 0; i < 3; i++) {
					angularVelocity[i] = (bb.getShort());
				}
				short[] eulerAngle = new short[3];
				for (int i = 0; i < 3; i++) {
					eulerAngle[i] = (bb.getShort());
				}
				short[] quaternion = new short[4];
				for (int i = 0; i < 4; i++) {
					quaternion[i] = (bb.getShort());
				}
				short[] linearAcceleration = new short[3];
				for (int i = 0; i < 3; i++) {
					linearAcceleration[i] = (bb.getShort());
				}
				short[] gravityVector = new short[3];
				for (int i = 0; i < 3; i++) {
					gravityVector[i] = (bb.getShort());
				}
				byte temperature = (bb.get());
				short calibrationStatus = IPConnection.unsignedByte(bb.get());

				for (AllDataListener listener: listenerAllData) {
					listener.allData(acceleration, magneticField, angularVelocity, eulerAngle, quaternion, linearAcceleration, gravityVector, temperature, calibrationStatus);
				}
			}
		};
	}

	/**
	 * Returns the calibrated acceleration from the accelerometer for the
	 * x, y and z axis in 1/100 m/s².
	 * 
	 * If you want to get the acceleration periodically, it is recommended
	 * to use the {@link BrickIMUV2.AccelerationListener} listener and set the period with
	 * {@link BrickIMUV2#setAccelerationPeriod(long)}.
	 */
	public Acceleration getAcceleration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ACCELERATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Acceleration obj = new Acceleration();
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the calibrated magnetic field from the magnetometer for the
	 * x, y and z axis in 1/16 µT (Microtesla).
	 * 
	 * If you want to get the magnetic field periodically, it is recommended
	 * to use the {@link BrickIMUV2.MagneticFieldListener} listener and set the period with
	 * {@link BrickIMUV2#setMagneticFieldPeriod(long)}.
	 */
	public MagneticField getMagneticField() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MAGNETIC_FIELD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		MagneticField obj = new MagneticField();
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the calibrated angular velocity from the gyroscope for the
	 * x, y and z axis in 1/16 °/s.
	 * 
	 * If you want to get the angular velocity periodically, it is recommended
	 * to use the {@link BrickIMUV2.AngularVelocityListener} alistener nd set the period with
	 * {@link BrickIMUV2#setAngularVelocityPeriod(long)}.
	 */
	public AngularVelocity getAngularVelocity() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ANGULAR_VELOCITY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		AngularVelocity obj = new AngularVelocity();
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the temperature of the IMU Brick. The temperature is given in
	 * °C. The temperature is measured in the core of the BNO055 IC, it is not the
	 * ambient temperature
	 */
	public byte getTemperature() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_TEMPERATURE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		byte temperature = (bb.get());

		return temperature;
	}

	/**
	 * Returns the current orientation (heading, roll, pitch) of the IMU Brick as
	 * independent Euler angles in 1/16 degree. Note that Euler angles always
	 * experience a `gimbal lock &lt;https://en.wikipedia.org/wiki/Gimbal_lock&gt;`__.
	 * We recommend that you use quaternions instead, if you need the absolute
	 * orientation.
	 * 
	 * The rotation angle has the following ranges:
	 * 
	 * * heading: 0° to 360°
	 * * roll: -90° to +90°
	 * * pitch: -180° to +180°
	 * 
	 * If you want to get the orientation periodically, it is recommended
	 * to use the {@link BrickIMUV2.OrientationListener} listener and set the period with
	 * {@link BrickIMUV2#setOrientationPeriod(long)}.
	 */
	public Orientation getOrientation() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ORIENTATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Orientation obj = new Orientation();
		obj.heading = (bb.getShort());
		obj.roll = (bb.getShort());
		obj.pitch = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the linear acceleration of the IMU Brick for the
	 * x, y and z axis in 1/100 m/s².
	 * 
	 * The linear acceleration is the acceleration in each of the three
	 * axis of the IMU Brick with the influences of gravity removed.
	 * 
	 * It is also possible to get the gravity vector with the influence of linear
	 * acceleration removed, see {@link BrickIMUV2#getGravityVector()}.
	 * 
	 * If you want to get the linear acceleration periodically, it is recommended
	 * to use the {@link BrickIMUV2.LinearAccelerationListener} listener and set the period with
	 * {@link BrickIMUV2#setLinearAccelerationPeriod(long)}.
	 */
	public LinearAcceleration getLinearAcceleration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_LINEAR_ACCELERATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		LinearAcceleration obj = new LinearAcceleration();
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the current gravity vector of the IMU Brick for the
	 * x, y and z axis in 1/100 m/s².
	 * 
	 * The gravity vector is the acceleration that occurs due to gravity.
	 * Influences of additional linear acceleration are removed.
	 * 
	 * It is also possible to get the linear acceleration with the influence
	 * of gravity removed, see {@link BrickIMUV2#getLinearAcceleration()}.
	 * 
	 * If you want to get the gravity vector periodically, it is recommended
	 * to use the {@link BrickIMUV2.GravityVectorListener} listener and set the period with
	 * {@link BrickIMUV2#setGravityVectorPeriod(long)}.
	 */
	public GravityVector getGravityVector() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_GRAVITY_VECTOR, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		GravityVector obj = new GravityVector();
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Returns the current orientation (w, x, y, z) of the IMU Brick as
	 * `quaternions &lt;https://en.wikipedia.org/wiki/Quaternions_and_spatial_rotation&gt;`__.
	 * 
	 * You have to divide the returns values by 16383 (14 bit) to get
	 * the usual range of -1.0 to +1.0 for quaternions.
	 * 
	 * If you want to get the quaternions periodically, it is recommended
	 * to use the {@link BrickIMUV2.QuaternionListener} listener and set the period with
	 * {@link BrickIMUV2#setQuaternionPeriod(long)}.
	 */
	public Quaternion getQuaternion() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_QUATERNION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Quaternion obj = new Quaternion();
		obj.w = (bb.getShort());
		obj.x = (bb.getShort());
		obj.y = (bb.getShort());
		obj.z = (bb.getShort());

		return obj;
	}

	/**
	 * Return all of the available data of the IMU Brick.
	 * 
	 * * acceleration in 1/100 m/s² (see {@link BrickIMUV2#getAcceleration()})
	 * * magnetic field in 1/16 µT (see {@link BrickIMUV2#getMagneticField()})
	 * * angular velocity in 1/16 °/s (see {@link BrickIMUV2#getAngularVelocity()})
	 * * Euler angles in 1/16 ° (see {@link BrickIMUV2#getOrientation()})
	 * * quaternion 1/16383 (see {@link BrickIMUV2#getQuaternion()})
	 * * linear acceleration 1/100 m/s² (see {@link BrickIMUV2#getLinearAcceleration()})
	 * * gravity vector 1/100 m/s² (see {@link BrickIMUV2#getGravityVector()})
	 * * temperature in 1 °C (see {@link BrickIMUV2#getTemperature()})
	 * * calibration status (see below)
	 * 
	 * The calibration status consists of four pairs of two bits. Each pair
	 * of bits represents the status of the current calibration.
	 * 
	 * * bit 0-1: Magnetometer
	 * * bit 2-3: Accelerometer
	 * * bit 4-5: Gyroscope
	 * * bit 6-7: System
	 * 
	 * A value of 0 means for "not calibrated" and a value of 3 means
	 * "fully calibrated". In your program you should always be able to
	 * ignore the calibration status, it is used by the calibration
	 * window of the Brick Viewer and it can be ignored after the first
	 * calibration. See the documentation in the calibration window for
	 * more information regarding the calibration of the IMU Brick.
	 * 
	 * If you want to get the data periodically, it is recommended
	 * to use the {@link BrickIMUV2.AllDataListener} listener and set the period with
	 * {@link BrickIMUV2#setAllDataPeriod(long)}.
	 */
	public AllData getAllData() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALL_DATA, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		AllData obj = new AllData();
		for (int i = 0; i < 3; i++) {
			obj.acceleration[i] = (bb.getShort());
		}
		for (int i = 0; i < 3; i++) {
			obj.magneticField[i] = (bb.getShort());
		}
		for (int i = 0; i < 3; i++) {
			obj.angularVelocity[i] = (bb.getShort());
		}
		for (int i = 0; i < 3; i++) {
			obj.eulerAngle[i] = (bb.getShort());
		}
		for (int i = 0; i < 4; i++) {
			obj.quaternion[i] = (bb.getShort());
		}
		for (int i = 0; i < 3; i++) {
			obj.linearAcceleration[i] = (bb.getShort());
		}
		for (int i = 0; i < 3; i++) {
			obj.gravityVector[i] = (bb.getShort());
		}
		obj.temperature = (bb.get());
		obj.calibrationStatus = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Turns the orientation and direction LEDs of the IMU Brick on.
	 */
	public void ledsOn() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_LEDS_ON, this);


		sendRequest(bb.array());
	}

	/**
	 * Turns the orientation and direction LEDs of the IMU Brick off.
	 */
	public void ledsOff() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_LEDS_OFF, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the orientation and direction LEDs of the IMU Brick
	 * are on, *false* otherwise.
	 */
	public boolean areLedsOn() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ARE_LEDS_ON, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean leds = (bb.get()) != 0;

		return leds;
	}

	/**
	 * A call of this function saves the current calibration to be used
	 * as a starting point for the next restart of continuous calibration
	 * of the IMU Brick.
	 * 
	 * A return value of *true* means that the calibration could be used and
	 * *false* means that it could not be used (this happens if the calibration
	 * status is not "fully calibrated").
	 * 
	 * This function is used by the calibration window of the Brick Viewer, you
	 * should not need to call it in your program.
	 */
	public boolean saveCalibration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_SAVE_CALIBRATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean calibrationDone = (bb.get()) != 0;

		return calibrationDone;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.AccelerationListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The default value is 0.
	 */
	public void setAccelerationPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ACCELERATION_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setAccelerationPeriod(long)}.
	 */
	public long getAccelerationPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ACCELERATION_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.MagneticFieldListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setMagneticFieldPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_MAGNETIC_FIELD_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setMagneticFieldPeriod(long)}.
	 */
	public long getMagneticFieldPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MAGNETIC_FIELD_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.AngularVelocityListener} listener is
	 * triggered periodically. A value of 0 turns the listener off.
	 */
	public void setAngularVelocityPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ANGULAR_VELOCITY_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setAngularVelocityPeriod(long)}.
	 */
	public long getAngularVelocityPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ANGULAR_VELOCITY_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.TemperatureListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setTemperaturePeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_TEMPERATURE_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setTemperaturePeriod(long)}.
	 */
	public long getTemperaturePeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_TEMPERATURE_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.OrientationListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setOrientationPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ORIENTATION_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setOrientationPeriod(long)}.
	 */
	public long getOrientationPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ORIENTATION_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.LinearAccelerationListener} listener is
	 * triggered periodically. A value of 0 turns the listener off.
	 */
	public void setLinearAccelerationPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_LINEAR_ACCELERATION_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setLinearAccelerationPeriod(long)}.
	 */
	public long getLinearAccelerationPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_LINEAR_ACCELERATION_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.GravityVectorListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setGravityVectorPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_GRAVITY_VECTOR_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setGravityVectorPeriod(long)}.
	 */
	public long getGravityVectorPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_GRAVITY_VECTOR_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.QuaternionListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setQuaternionPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_QUATERNION_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setQuaternionPeriod(long)}.
	 */
	public long getQuaternionPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_QUATERNION_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickIMUV2.AllDataListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 */
	public void setAllDataPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ALL_DATA_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickIMUV2#setAllDataPeriod(long)}.
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
	 * Sets the available sensor configuration for the Magnetometer, Gyroscope and
	 * Accelerometer. The Accelerometer Range is user selectable in all fusion modes,
	 * all other configurations are auto-controlled in fusion mode.
	 * 
	 * The default values are:
	 * 
	 * * Magnetometer Rate 20Hz
	 * * Gyroscope Range 2000°/s
	 * * Gyroscope Bandwidth 32Hz
	 * * Accelerometer Range +/-4G
	 * * Accelerometer Bandwidth 62.5Hz
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setSensorConfiguration(short magnetometerRate, short gyroscopeRange, short gyroscopeBandwidth, short accelerometerRange, short accelerometerBandwidth) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SENSOR_CONFIGURATION, this);

		bb.put((byte)magnetometerRate);
		bb.put((byte)gyroscopeRange);
		bb.put((byte)gyroscopeBandwidth);
		bb.put((byte)accelerometerRange);
		bb.put((byte)accelerometerBandwidth);

		sendRequest(bb.array());
	}

	/**
	 * Returns the sensor configuration as set by {@link BrickIMUV2#setSensorConfiguration(short, short, short, short, short)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public SensorConfiguration getSensorConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SENSOR_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SensorConfiguration obj = new SensorConfiguration();
		obj.magnetometerRate = IPConnection.unsignedByte(bb.get());
		obj.gyroscopeRange = IPConnection.unsignedByte(bb.get());
		obj.gyroscopeBandwidth = IPConnection.unsignedByte(bb.get());
		obj.accelerometerRange = IPConnection.unsignedByte(bb.get());
		obj.accelerometerBandwidth = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * If the fusion mode is turned off, the functions {@link BrickIMUV2#getAcceleration()},
	 * {@link BrickIMUV2#getMagneticField()} and {@link BrickIMUV2#getAngularVelocity()} return uncalibrated
	 * and uncompensated sensor data. All other sensor data getters return no data.
	 * 
	 * Since firmware version 2.0.6 you can also use a fusion mode without magnetometer.
	 * In this mode the calculated orientation is relative (with magnetometer it is
	 * absolute with respect to the earth). However, the calculation can't be influenced
	 * by spurious magnetic fields.
	 * 
	 * By default sensor fusion is on.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setSensorFusionMode(short mode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_SENSOR_FUSION_MODE, this);

		bb.put((byte)mode);

		sendRequest(bb.array());
	}

	/**
	 * Returns the sensor fusion mode as set by {@link BrickIMUV2#setSensorFusionMode(short)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public short getSensorFusionMode() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SENSOR_FUSION_MODE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short mode = IPConnection.unsignedByte(bb.get());

		return mode;
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
	 * {@link BrickIMUV2#setSPITFPBaudrate(char, long)}. If the dynamic baudrate is disabled, the baudrate
	 * as set by {@link BrickIMUV2#setSPITFPBaudrate(char, long)} will be used statically.
	 * 
	 * The minimum dynamic baudrate has a value range of 400000 to 2000000 baud.
	 * 
	 * By default dynamic baudrate is enabled and the minimum dynamic baudrate is 400000.
	 * 
	 * .. versionadded:: 2.0.10$nbsp;(Firmware)
	 */
	public void setSPITFPBaudrateConfig(boolean enableDynamicBaudrate, long minimumDynamicBaudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE_CONFIG, this);

		bb.put((byte)(enableDynamicBaudrate ? 1 : 0));
		bb.putInt((int)minimumDynamicBaudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate config, see {@link BrickIMUV2#setSPITFPBaudrateConfig(boolean, long)}.
	 * 
	 * .. versionadded:: 2.0.10$nbsp;(Firmware)
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
	 * 
	 * .. versionadded:: 2.0.7$nbsp;(Firmware)
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
	 * interference (see {@link BrickIMUV2#getSPITFPErrorCount(char)}) you can decrease the
	 * baudrate.
	 * 
	 * If the dynamic baudrate feature is enabled, the baudrate set by this
	 * function corresponds to the maximum baudrate (see {@link BrickIMUV2#setSPITFPBaudrateConfig(boolean, long)}).
	 * 
	 * Regulatory testing is done with the default baudrate. If CE compatability
	 * or similar is necessary in you applications we recommend to not change
	 * the baudrate.
	 * 
	 * The default baudrate for all ports is 1400000.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setSPITFPBaudrate(char brickletPort, long baudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE, this);

		bb.put((byte)brickletPort);
		bb.putInt((int)baudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate for a given Bricklet port, see {@link BrickIMUV2#setSPITFPBaudrate(char, long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
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
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
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
	 * Adds a Acceleration listener.
	 */
	public void addAccelerationListener(AccelerationListener listener) {
		listenerAcceleration.add(listener);
	}

	/**
	 * Removes a Acceleration listener.
	 */
	public void removeAccelerationListener(AccelerationListener listener) {
		listenerAcceleration.remove(listener);
	}

	/**
	 * Adds a MagneticField listener.
	 */
	public void addMagneticFieldListener(MagneticFieldListener listener) {
		listenerMagneticField.add(listener);
	}

	/**
	 * Removes a MagneticField listener.
	 */
	public void removeMagneticFieldListener(MagneticFieldListener listener) {
		listenerMagneticField.remove(listener);
	}

	/**
	 * Adds a AngularVelocity listener.
	 */
	public void addAngularVelocityListener(AngularVelocityListener listener) {
		listenerAngularVelocity.add(listener);
	}

	/**
	 * Removes a AngularVelocity listener.
	 */
	public void removeAngularVelocityListener(AngularVelocityListener listener) {
		listenerAngularVelocity.remove(listener);
	}

	/**
	 * Adds a Temperature listener.
	 */
	public void addTemperatureListener(TemperatureListener listener) {
		listenerTemperature.add(listener);
	}

	/**
	 * Removes a Temperature listener.
	 */
	public void removeTemperatureListener(TemperatureListener listener) {
		listenerTemperature.remove(listener);
	}

	/**
	 * Adds a LinearAcceleration listener.
	 */
	public void addLinearAccelerationListener(LinearAccelerationListener listener) {
		listenerLinearAcceleration.add(listener);
	}

	/**
	 * Removes a LinearAcceleration listener.
	 */
	public void removeLinearAccelerationListener(LinearAccelerationListener listener) {
		listenerLinearAcceleration.remove(listener);
	}

	/**
	 * Adds a GravityVector listener.
	 */
	public void addGravityVectorListener(GravityVectorListener listener) {
		listenerGravityVector.add(listener);
	}

	/**
	 * Removes a GravityVector listener.
	 */
	public void removeGravityVectorListener(GravityVectorListener listener) {
		listenerGravityVector.remove(listener);
	}

	/**
	 * Adds a Orientation listener.
	 */
	public void addOrientationListener(OrientationListener listener) {
		listenerOrientation.add(listener);
	}

	/**
	 * Removes a Orientation listener.
	 */
	public void removeOrientationListener(OrientationListener listener) {
		listenerOrientation.remove(listener);
	}

	/**
	 * Adds a Quaternion listener.
	 */
	public void addQuaternionListener(QuaternionListener listener) {
		listenerQuaternion.add(listener);
	}

	/**
	 * Removes a Quaternion listener.
	 */
	public void removeQuaternionListener(QuaternionListener listener) {
		listenerQuaternion.remove(listener);
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
}
