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
 * Determine position, velocity and altitude using GPS
 */
public class BrickletGPSV2 extends Device {
	public final static int DEVICE_IDENTIFIER = 276;
	public final static String DEVICE_DISPLAY_NAME = "GPS Bricklet 2.0";

	public final static byte FUNCTION_GET_COORDINATES = (byte)1;
	public final static byte FUNCTION_GET_STATUS = (byte)2;
	public final static byte FUNCTION_GET_ALTITUDE = (byte)3;
	public final static byte FUNCTION_GET_MOTION = (byte)4;
	public final static byte FUNCTION_GET_DATE_TIME = (byte)5;
	public final static byte FUNCTION_RESTART = (byte)6;
	public final static byte FUNCTION_GET_SATELLITE_SYSTEM_STATUS_LOW_LEVEL = (byte)7;
	public final static byte FUNCTION_GET_SATELLITE_STATUS = (byte)8;
	public final static byte FUNCTION_SET_FIX_LED_CONFIG = (byte)9;
	public final static byte FUNCTION_GET_FIX_LED_CONFIG = (byte)10;
	public final static byte FUNCTION_SET_COORDINATES_CALLBACK_PERIOD = (byte)11;
	public final static byte FUNCTION_GET_COORDINATES_CALLBACK_PERIOD = (byte)12;
	public final static byte FUNCTION_SET_STATUS_CALLBACK_PERIOD = (byte)13;
	public final static byte FUNCTION_GET_STATUS_CALLBACK_PERIOD = (byte)14;
	public final static byte FUNCTION_SET_ALTITUDE_CALLBACK_PERIOD = (byte)15;
	public final static byte FUNCTION_GET_ALTITUDE_CALLBACK_PERIOD = (byte)16;
	public final static byte FUNCTION_SET_MOTION_CALLBACK_PERIOD = (byte)17;
	public final static byte FUNCTION_GET_MOTION_CALLBACK_PERIOD = (byte)18;
	public final static byte FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD = (byte)19;
	public final static byte FUNCTION_GET_DATE_TIME_CALLBACK_PERIOD = (byte)20;
	public final static byte FUNCTION_GET_SPITFP_ERROR_COUNT = (byte)234;
	public final static byte FUNCTION_SET_BOOTLOADER_MODE = (byte)235;
	public final static byte FUNCTION_GET_BOOTLOADER_MODE = (byte)236;
	public final static byte FUNCTION_SET_WRITE_FIRMWARE_POINTER = (byte)237;
	public final static byte FUNCTION_WRITE_FIRMWARE = (byte)238;
	public final static byte FUNCTION_SET_STATUS_LED_CONFIG = (byte)239;
	public final static byte FUNCTION_GET_STATUS_LED_CONFIG = (byte)240;
	public final static byte FUNCTION_GET_CHIP_TEMPERATURE = (byte)242;
	public final static byte FUNCTION_RESET = (byte)243;
	public final static byte FUNCTION_WRITE_UID = (byte)248;
	public final static byte FUNCTION_READ_UID = (byte)249;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;
	private final static int CALLBACK_PULSE_PER_SECOND = 21;
	private final static int CALLBACK_COORDINATES = 22;
	private final static int CALLBACK_STATUS = 23;
	private final static int CALLBACK_ALTITUDE = 24;
	private final static int CALLBACK_MOTION = 25;
	private final static int CALLBACK_DATE_TIME = 26;

	public final static int RESTART_TYPE_HOT_START = 0;
	public final static int RESTART_TYPE_WARM_START = 1;
	public final static int RESTART_TYPE_COLD_START = 2;
	public final static int RESTART_TYPE_FACTORY_RESET = 3;
	public final static int SATELLITE_SYSTEM_GPS = 0;
	public final static int SATELLITE_SYSTEM_GLONASS = 1;
	public final static int SATELLITE_SYSTEM_GALILEO = 2;
	public final static int FIX_NO_FIX = 1;
	public final static int FIX_2D_FIX = 2;
	public final static int FIX_3D_FIX = 3;
	public final static int FIX_LED_CONFIG_OFF = 0;
	public final static int FIX_LED_CONFIG_ON = 1;
	public final static int FIX_LED_CONFIG_SHOW_HEARTBEAT = 2;
	public final static int FIX_LED_CONFIG_SHOW_FIX = 3;
	public final static int FIX_LED_CONFIG_SHOW_PPS = 4;
	public final static int BOOTLOADER_MODE_BOOTLOADER = 0;
	public final static int BOOTLOADER_MODE_FIRMWARE = 1;
	public final static int BOOTLOADER_MODE_BOOTLOADER_WAIT_FOR_REBOOT = 2;
	public final static int BOOTLOADER_MODE_FIRMWARE_WAIT_FOR_REBOOT = 3;
	public final static int BOOTLOADER_MODE_FIRMWARE_WAIT_FOR_ERASE_AND_REBOOT = 4;
	public final static int BOOTLOADER_STATUS_OK = 0;
	public final static int BOOTLOADER_STATUS_INVALID_MODE = 1;
	public final static int BOOTLOADER_STATUS_NO_CHANGE = 2;
	public final static int BOOTLOADER_STATUS_ENTRY_FUNCTION_NOT_PRESENT = 3;
	public final static int BOOTLOADER_STATUS_DEVICE_IDENTIFIER_INCORRECT = 4;
	public final static int BOOTLOADER_STATUS_CRC_MISMATCH = 5;
	public final static int STATUS_LED_CONFIG_OFF = 0;
	public final static int STATUS_LED_CONFIG_ON = 1;
	public final static int STATUS_LED_CONFIG_SHOW_HEARTBEAT = 2;
	public final static int STATUS_LED_CONFIG_SHOW_STATUS = 3;

	private List<PulsePerSecondListener> listenerPulsePerSecond = new CopyOnWriteArrayList<PulsePerSecondListener>();
	private List<CoordinatesListener> listenerCoordinates = new CopyOnWriteArrayList<CoordinatesListener>();
	private List<StatusListener> listenerStatus = new CopyOnWriteArrayList<StatusListener>();
	private List<AltitudeListener> listenerAltitude = new CopyOnWriteArrayList<AltitudeListener>();
	private List<MotionListener> listenerMotion = new CopyOnWriteArrayList<MotionListener>();
	private List<DateTimeListener> listenerDateTime = new CopyOnWriteArrayList<DateTimeListener>();

	public class Coordinates {
		public long latitude;
		public char ns;
		public long longitude;
		public char ew;

		public String toString() {
			return "[" + "latitude = " + latitude + ", " + "ns = " + ns + ", " + "longitude = " + longitude + ", " + "ew = " + ew + "]";
		}
	}

	public class Status {
		public boolean hasFix;
		public int satellitesView;

		public String toString() {
			return "[" + "hasFix = " + hasFix + ", " + "satellitesView = " + satellitesView + "]";
		}
	}

	public class Altitude {
		public int altitude;
		public int geoidalSeparation;

		public String toString() {
			return "[" + "altitude = " + altitude + ", " + "geoidalSeparation = " + geoidalSeparation + "]";
		}
	}

	public class Motion {
		public long course;
		public long speed;

		public String toString() {
			return "[" + "course = " + course + ", " + "speed = " + speed + "]";
		}
	}

	public class DateTime {
		public long date;
		public long time;

		public String toString() {
			return "[" + "date = " + date + ", " + "time = " + time + "]";
		}
	}

	public class SatelliteSystemStatusLowLevel {
		public int satelliteNumbersLength;
		public int[] satelliteNumbersData = new int[12];
		public int fix;
		public int pdop;
		public int hdop;
		public int vdop;

		public String toString() {
			return "[" + "satelliteNumbersLength = " + satelliteNumbersLength + ", " + "satelliteNumbersData = " + Arrays.toString(satelliteNumbersData) + ", " + "fix = " + fix + ", " + "pdop = " + pdop + ", " + "hdop = " + hdop + ", " + "vdop = " + vdop + "]";
		}
	}

	public class SatelliteStatus {
		public int elevation;
		public int azimuth;
		public int snr;

		public String toString() {
			return "[" + "elevation = " + elevation + ", " + "azimuth = " + azimuth + ", " + "snr = " + snr + "]";
		}
	}

	public class SPITFPErrorCount {
		public long errorCountAckChecksum;
		public long errorCountMessageChecksum;
		public long errorCountFrame;
		public long errorCountOverflow;

		public String toString() {
			return "[" + "errorCountAckChecksum = " + errorCountAckChecksum + ", " + "errorCountMessageChecksum = " + errorCountMessageChecksum + ", " + "errorCountFrame = " + errorCountFrame + ", " + "errorCountOverflow = " + errorCountOverflow + "]";
		}
	}

	public class SatelliteSystemStatus {
		public int[] satelliteNumbers = new int[-1];
		public int fix;
		public int pdop;
		public int hdop;
		public int vdop;

		public SatelliteSystemStatus(int[] satelliteNumbers, int fix, int pdop, int hdop, int vdop) {
			this.satelliteNumbers = satelliteNumbers;
			this.fix = fix;
			this.pdop = pdop;
			this.hdop = hdop;
			this.vdop = vdop;
		}

		public String toString() {
			return "[" + "satelliteNumbers = " + Arrays.toString(satelliteNumbers) + ", " + "fix = " + fix + ", " + "pdop = " + pdop + ", " + "hdop = " + hdop + ", " + "vdop = " + vdop + "]";
		}
	}

	/**
	 * This listener is triggered precisely once per second,
	 * see `PPS &lt;https://en.wikipedia.org/wiki/Pulse-per-second_signal&gt;`__.
	 * 
	 * The precision of two subsequent pulses will be skewed because
	 * of the latency in the USB/RS485/Ethernet connection. But in the
	 * long run this will be very precise. For example a count of
	 * 3600 pulses will take exactly 1 hour.
	 */
	public interface PulsePerSecondListener extends DeviceListener {
		public void pulsePerSecond();
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletGPSV2#setCoordinatesCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletGPSV2#getCoordinates()}.
	 * 
	 * The {@link BrickletGPSV2.CoordinatesListener} listener is only triggered if the coordinates changed
	 * since the last triggering and if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public interface CoordinatesListener extends DeviceListener {
		public void coordinates(long latitude, char ns, long longitude, char ew);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletGPSV2#setStatusCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletGPSV2#getStatus()}.
	 * 
	 * The {@link BrickletGPSV2.StatusListener} listener is only triggered if the status changed since the
	 * last triggering.
	 */
	public interface StatusListener extends DeviceListener {
		public void status(boolean hasFix, int satellitesView);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletGPSV2#setAltitudeCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletGPSV2#getAltitude()}.
	 * 
	 * The {@link BrickletGPSV2.AltitudeListener} listener is only triggered if the altitude changed since the
	 * last triggering and if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public interface AltitudeListener extends DeviceListener {
		public void altitude(int altitude, int geoidalSeparation);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletGPSV2#setMotionCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletGPSV2#getMotion()}.
	 * 
	 * The {@link BrickletGPSV2.MotionListener} listener is only triggered if the motion changed since the
	 * last triggering and if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public interface MotionListener extends DeviceListener {
		public void motion(long course, long speed);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletGPSV2#setDateTimeCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletGPSV2#getDateTime()}.
	 * 
	 * The {@link BrickletGPSV2.DateTimeListener} listener is only triggered if the date or time changed
	 * since the last triggering.
	 */
	public interface DateTimeListener extends DeviceListener {
		public void dateTime(long date, long time);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickletGPSV2(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 0;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_COORDINATES)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALTITUDE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MOTION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DATE_TIME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_RESTART)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SATELLITE_SYSTEM_STATUS_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SATELLITE_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_FIX_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_FIX_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_COORDINATES_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_COORDINATES_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STATUS_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STATUS_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ALTITUDE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALTITUDE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MOTION_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MOTION_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DATE_TIME_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SPITFP_ERROR_COUNT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_BOOTLOADER_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_BOOTLOADER_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WRITE_FIRMWARE_POINTER)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_WRITE_FIRMWARE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STATUS_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STATUS_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIP_TEMPERATURE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_RESET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_WRITE_UID)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_READ_UID)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;

		callbacks[CALLBACK_PULSE_PER_SECOND] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				for (PulsePerSecondListener listener: listenerPulsePerSecond) {
					listener.pulsePerSecond();
				}
			}
		};

		callbacks[CALLBACK_COORDINATES] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				long latitude = IPConnection.unsignedInt(bb.getInt());
				char ns = (char)(bb.get());
				long longitude = IPConnection.unsignedInt(bb.getInt());
				char ew = (char)(bb.get());

				for (CoordinatesListener listener: listenerCoordinates) {
					listener.coordinates(latitude, ns, longitude, ew);
				}
			}
		};

		callbacks[CALLBACK_STATUS] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				boolean hasFix = (bb.get()) != 0;
				int satellitesView = IPConnection.unsignedByte(bb.get());

				for (StatusListener listener: listenerStatus) {
					listener.status(hasFix, satellitesView);
				}
			}
		};

		callbacks[CALLBACK_ALTITUDE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int altitude = (bb.getInt());
				int geoidalSeparation = (bb.getInt());

				for (AltitudeListener listener: listenerAltitude) {
					listener.altitude(altitude, geoidalSeparation);
				}
			}
		};

		callbacks[CALLBACK_MOTION] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				long course = IPConnection.unsignedInt(bb.getInt());
				long speed = IPConnection.unsignedInt(bb.getInt());

				for (MotionListener listener: listenerMotion) {
					listener.motion(course, speed);
				}
			}
		};

		callbacks[CALLBACK_DATE_TIME] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				long date = IPConnection.unsignedInt(bb.getInt());
				long time = IPConnection.unsignedInt(bb.getInt());

				for (DateTimeListener listener: listenerDateTime) {
					listener.dateTime(date, time);
				}
			}
		};
	}

	/**
	 * Returns the GPS coordinates. Latitude and longitude are given in the
	 * ``DD.dddddd°`` format, the value 57123468 means 57.123468°.
	 * The parameter ``ns`` and ``ew`` are the cardinal directions for
	 * latitude and longitude. Possible values for ``ns`` and ``ew`` are 'N', 'S', 'E'
	 * and 'W' (north, south, east and west).
	 * 
	 * This data is only valid if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public Coordinates getCoordinates() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_COORDINATES, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Coordinates obj = new Coordinates();
		obj.latitude = IPConnection.unsignedInt(bb.getInt());
		obj.ns = (char)(bb.get());
		obj.longitude = IPConnection.unsignedInt(bb.getInt());
		obj.ew = (char)(bb.get());

		return obj;
	}

	/**
	 * Returns if a fix is currently available as well as the, the number of
	 * satellites that are in view.
	 * 
	 * There is also a :ref:`green LED &lt;gps_v2_bricklet_fix_led&gt;` on the Bricklet that
	 * indicates the fix status.
	 */
	public Status getStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Status obj = new Status();
		obj.hasFix = (bb.get()) != 0;
		obj.satellitesView = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns the current altitude and corresponding geoidal separation.
	 * 
	 * Both values are given in cm.
	 * 
	 * This data is only valid if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public Altitude getAltitude() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALTITUDE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Altitude obj = new Altitude();
		obj.altitude = (bb.getInt());
		obj.geoidalSeparation = (bb.getInt());

		return obj;
	}

	/**
	 * Returns the current course and speed. Course is given in hundredths degree
	 * and speed is given in hundredths km/h. A course of 0° means the Bricklet is
	 * traveling north bound and 90° means it is traveling east bound.
	 * 
	 * Please note that this only returns useful values if an actual movement
	 * is present.
	 * 
	 * This data is only valid if there is currently a fix as indicated by
	 * {@link BrickletGPSV2#getStatus()}.
	 */
	public Motion getMotion() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MOTION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Motion obj = new Motion();
		obj.course = IPConnection.unsignedInt(bb.getInt());
		obj.speed = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Returns the current date and time. The date is
	 * given in the format ``ddmmyy`` and the time is given
	 * in the format ``hhmmss.sss``. For example, 140713 means
	 * 14.05.13 as date and 195923568 means 19:59:23.568 as time.
	 */
	public DateTime getDateTime() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_DATE_TIME, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		DateTime obj = new DateTime();
		obj.date = IPConnection.unsignedInt(bb.getInt());
		obj.time = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Restarts the GPS Bricklet, the following restart types are available:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "Hot start (use all available data in the NV store)"
	 *  "1", "Warm start (don't use ephemeris at restart)"
	 *  "2", "Cold start (don't use time, position, almanacs and ephemeris at restart)"
	 *  "3", "Factory reset (clear all system/user configurations at restart)"
	 * \endverbatim
	 */
	public void restart(int restartType) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_RESTART, this);

		bb.put((byte)restartType);

		sendRequest(bb.array());
	}

	/**
	 * Returns the
	 * 
	 * * satellite numbers list (up to 12 items)
	 * * fix value,
	 * * PDOP value,
	 * * HDOP value and
	 * * VDOP value
	 * 
	 * for a given satellite system. Currently GPS and GLONASS are supported, Galileo
	 * is not yet supported.
	 * 
	 * The GPS and GLONASS satellites have unique numbers and the satellite list gives
	 * the numbers of the satellites that are currently utilized. The number 0 is not
	 * a valid satellite number and can be ignored in the list.
	 */
	public SatelliteSystemStatusLowLevel getSatelliteSystemStatusLowLevel(int satelliteSystem) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_SATELLITE_SYSTEM_STATUS_LOW_LEVEL, this);

		bb.put((byte)satelliteSystem);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SatelliteSystemStatusLowLevel obj = new SatelliteSystemStatusLowLevel();
		obj.satelliteNumbersLength = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 12; i++) {
			obj.satelliteNumbersData[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.fix = IPConnection.unsignedByte(bb.get());
		obj.pdop = IPConnection.unsignedShort(bb.getShort());
		obj.hdop = IPConnection.unsignedShort(bb.getShort());
		obj.vdop = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Returns the current
	 * 
	 * * elevation (0° - 90°),
	 * * azimuth (0° - 359°) and
	 * * SNR (0dB - 99dB)
	 * 
	 * for a given satellite and satellite system.
	 * 
	 * The satellite number here always goes from 1 to 32. For GLONASS it corresponds to
	 * the satellites 65-96.
	 * 
	 * Galileo is not yet supported.
	 */
	public SatelliteStatus getSatelliteStatus(int satelliteSystem, int satelliteNumber) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_GET_SATELLITE_STATUS, this);

		bb.put((byte)satelliteSystem);
		bb.put((byte)satelliteNumber);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SatelliteStatus obj = new SatelliteStatus();
		obj.elevation = (bb.getShort());
		obj.azimuth = (bb.getShort());
		obj.snr = (bb.getShort());

		return obj;
	}

	/**
	 * Sets the fix LED configuration. By default the LED shows if
	 * the Bricklet got a GPS fix yet. If a fix is established the LED turns on.
	 * If there is no fix then the LED is turned off.
	 * 
	 * You can also turn the LED permanently on/off, show a heartbeat or let it blink
	 * in sync with the PPS (pulse per second) output of the GPS module.
	 * 
	 * If the Bricklet is in bootloader mode, the LED is off.
	 */
	public void setFixLEDConfig(int config) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_FIX_LED_CONFIG, this);

		bb.put((byte)config);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletGPSV2#setFixLEDConfig(int)}
	 */
	public int getFixLEDConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_FIX_LED_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int config = IPConnection.unsignedByte(bb.get());

		return config;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletGPSV2.CoordinatesListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletGPSV2.CoordinatesListener} listener is only triggered if the coordinates changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 */
	public void setCoordinatesCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_COORDINATES_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletGPSV2#setCoordinatesCallbackPeriod(long)}.
	 */
	public long getCoordinatesCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_COORDINATES_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletGPSV2.StatusListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletGPSV2.StatusListener} listener is only triggered if the status changed since the
	 * last triggering.
	 * 
	 * The default value is 0.
	 */
	public void setStatusCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_STATUS_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletGPSV2#setStatusCallbackPeriod(long)}.
	 */
	public long getStatusCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STATUS_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletGPSV2.AltitudeListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletGPSV2.AltitudeListener} listener is only triggered if the altitude changed since the
	 * last triggering.
	 * 
	 * The default value is 0.
	 */
	public void setAltitudeCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_ALTITUDE_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletGPSV2#setAltitudeCallbackPeriod(long)}.
	 */
	public long getAltitudeCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALTITUDE_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletGPSV2.MotionListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletGPSV2.MotionListener} listener is only triggered if the motion changed since the
	 * last triggering.
	 * 
	 * The default value is 0.
	 */
	public void setMotionCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_MOTION_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletGPSV2#setMotionCallbackPeriod(long)}.
	 */
	public long getMotionCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MOTION_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletGPSV2.DateTimeListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletGPSV2.DateTimeListener} listener is only triggered if the date or time changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 */
	public void setDateTimeCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletGPSV2#setDateTimeCallbackPeriod(long)}.
	 */
	public long getDateTimeCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_DATE_TIME_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Returns the error count for the communication between Brick and Bricklet.
	 * 
	 * The errors are divided into
	 * 
	 * * ack checksum errors,
	 * * message checksum errors,
	 * * frameing errors and
	 * * overflow errors.
	 * 
	 * The errors counts are for errors that occur on the Bricklet side. All
	 * Bricks have a similar function that returns the errors on the Brick side.
	 */
	public SPITFPErrorCount getSPITFPErrorCount() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SPITFP_ERROR_COUNT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		SPITFPErrorCount obj = new SPITFPErrorCount();
		obj.errorCountAckChecksum = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountMessageChecksum = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountFrame = IPConnection.unsignedInt(bb.getInt());
		obj.errorCountOverflow = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Sets the bootloader mode and returns the status after the requested
	 * mode change was instigated.
	 * 
	 * You can change from bootloader mode to firmware mode and vice versa. A change
	 * from bootloader mode to firmware mode will only take place if the entry function,
	 * device identifier und crc are present and correct.
	 * 
	 * This function is used by Brick Viewer during flashing. It should not be
	 * necessary to call it in a normal user program.
	 */
	public int setBootloaderMode(int mode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_BOOTLOADER_MODE, this);

		bb.put((byte)mode);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int status = IPConnection.unsignedByte(bb.get());

		return status;
	}

	/**
	 * Returns the current bootloader mode, see {@link BrickletGPSV2#setBootloaderMode(int)}.
	 */
	public int getBootloaderMode() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_BOOTLOADER_MODE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int mode = IPConnection.unsignedByte(bb.get());

		return mode;
	}

	/**
	 * Sets the firmware pointer for func:`WriteFirmware`. The pointer has
	 * to be increased by chunks of size 64. The data is written to flash
	 * every 4 chunks (which equals to one page of size 256).
	 * 
	 * This function is used by Brick Viewer during flashing. It should not be
	 * necessary to call it in a normal user program.
	 */
	public void setWriteFirmwarePointer(long pointer) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_WRITE_FIRMWARE_POINTER, this);

		bb.putInt((int)pointer);

		sendRequest(bb.array());
	}

	/**
	 * Writes 64 Bytes of firmware at the position as written by
	 * {@link BrickletGPSV2#setWriteFirmwarePointer(long)} before. The firmware is written
	 * to flash every 4 chunks.
	 * 
	 * You can only write firmware in bootloader mode.
	 * 
	 * This function is used by Brick Viewer during flashing. It should not be
	 * necessary to call it in a normal user program.
	 */
	public int writeFirmware(int[] data) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_WRITE_FIRMWARE, this);

		for (int i = 0; i < 64; i++) {
			bb.put((byte)data[i]);
		}

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int status = IPConnection.unsignedByte(bb.get());

		return status;
	}

	/**
	 * Sets the status LED configuration. By default the LED shows
	 * communication traffic between Brick and Bricklet, it flickers once
	 * for every 10 received data packets.
	 * 
	 * You can also turn the LED permanently on/off or show a heartbeat.
	 * 
	 * If the Bricklet is in bootloader mode, the LED is will show heartbeat by default.
	 */
	public void setStatusLEDConfig(int config) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_STATUS_LED_CONFIG, this);

		bb.put((byte)config);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletGPSV2#setStatusLEDConfig(int)}
	 */
	public int getStatusLEDConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STATUS_LED_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int config = IPConnection.unsignedByte(bb.get());

		return config;
	}

	/**
	 * Returns the temperature in °C as measured inside the microcontroller. The
	 * value returned is not the ambient temperature!
	 * 
	 * The temperature is only proportional to the real temperature and it has bad
	 * accuracy. Practically it is only useful as an indicator for
	 * temperature changes.
	 */
	public int getChipTemperature() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIP_TEMPERATURE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int temperature = (bb.getShort());

		return temperature;
	}

	/**
	 * Calling this function will reset the Bricklet. All configurations
	 * will be lost.
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
	 * Writes a new UID into flash. If you want to set a new UID
	 * you have to decode the Base58 encoded UID string into an
	 * integer first.
	 * 
	 * We recommend that you use Brick Viewer to change the UID.
	 */
	public void writeUID(long uid) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_WRITE_UID, this);

		bb.putInt((int)uid);

		sendRequest(bb.array());
	}

	/**
	 * Returns the current UID as an integer. Encode as
	 * Base58 to get the usual string version.
	 */
	public long readUID() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_READ_UID, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long uid = IPConnection.unsignedInt(bb.getInt());

		return uid;
	}

	/**
	 * Returns the UID, the UID where the Bricklet is connected to,
	 * the position, the hardware and firmware version as well as the
	 * device identifier.
	 * 
	 * The position can be 'a', 'b', 'c' or 'd'.
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
	 * Returns the
	 * 
	 * * satellite numbers list (up to 12 items)
	 * * fix value,
	 * * PDOP value,
	 * * HDOP value and
	 * * VDOP value
	 * 
	 * for a given satellite system. Currently GPS and GLONASS are supported, Galileo
	 * is not yet supported.
	 * 
	 * The GPS and GLONASS satellites have unique numbers and the satellite list gives
	 * the numbers of the satellites that are currently utilized. The number 0 is not
	 * a valid satellite number and can be ignored in the list.
	 */
	public SatelliteSystemStatus getSatelliteSystemStatus(int satelliteSystem) throws TimeoutException, NotConnectedException {
		SatelliteSystemStatusLowLevel ret = getSatelliteSystemStatusLowLevel(satelliteSystem);
		int[] satelliteNumbers = new int[ret.satelliteNumbersLength];

		System.arraycopy(ret.satelliteNumbersData, 0, satelliteNumbers, 0, ret.satelliteNumbersLength);

		return new SatelliteSystemStatus(satelliteNumbers, ret.fix, ret.pdop, ret.hdop, ret.vdop);
	}

	/**
	 * Adds a PulsePerSecond listener.
	 */
	public void addPulsePerSecondListener(PulsePerSecondListener listener) {
		listenerPulsePerSecond.add(listener);
	}

	/**
	 * Removes a PulsePerSecond listener.
	 */
	public void removePulsePerSecondListener(PulsePerSecondListener listener) {
		listenerPulsePerSecond.remove(listener);
	}

	/**
	 * Adds a Coordinates listener.
	 */
	public void addCoordinatesListener(CoordinatesListener listener) {
		listenerCoordinates.add(listener);
	}

	/**
	 * Removes a Coordinates listener.
	 */
	public void removeCoordinatesListener(CoordinatesListener listener) {
		listenerCoordinates.remove(listener);
	}

	/**
	 * Adds a Status listener.
	 */
	public void addStatusListener(StatusListener listener) {
		listenerStatus.add(listener);
	}

	/**
	 * Removes a Status listener.
	 */
	public void removeStatusListener(StatusListener listener) {
		listenerStatus.remove(listener);
	}

	/**
	 * Adds a Altitude listener.
	 */
	public void addAltitudeListener(AltitudeListener listener) {
		listenerAltitude.add(listener);
	}

	/**
	 * Removes a Altitude listener.
	 */
	public void removeAltitudeListener(AltitudeListener listener) {
		listenerAltitude.remove(listener);
	}

	/**
	 * Adds a Motion listener.
	 */
	public void addMotionListener(MotionListener listener) {
		listenerMotion.add(listener);
	}

	/**
	 * Removes a Motion listener.
	 */
	public void removeMotionListener(MotionListener listener) {
		listenerMotion.remove(listener);
	}

	/**
	 * Adds a DateTime listener.
	 */
	public void addDateTimeListener(DateTimeListener listener) {
		listenerDateTime.add(listener);
	}

	/**
	 * Removes a DateTime listener.
	 */
	public void removeDateTimeListener(DateTimeListener listener) {
		listenerDateTime.remove(listener);
	}
}
