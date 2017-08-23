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
 * Battery-backed real-time clock
 */
public class BrickletRealTimeClock extends Device {
	public final static int DEVICE_IDENTIFIER = 268;
	public final static String DEVICE_DISPLAY_NAME = "Real-Time Clock Bricklet";

	public final static byte FUNCTION_SET_DATE_TIME = (byte)1;
	public final static byte FUNCTION_GET_DATE_TIME = (byte)2;
	public final static byte FUNCTION_GET_TIMESTAMP = (byte)3;
	public final static byte FUNCTION_SET_OFFSET = (byte)4;
	public final static byte FUNCTION_GET_OFFSET = (byte)5;
	public final static byte FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD = (byte)6;
	public final static byte FUNCTION_GET_DATE_TIME_CALLBACK_PERIOD = (byte)7;
	public final static byte FUNCTION_SET_ALARM = (byte)8;
	public final static byte FUNCTION_GET_ALARM = (byte)9;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;
	private final static int CALLBACK_DATE_TIME = 10;
	private final static int CALLBACK_ALARM = 11;

	public final static short WEEKDAY_MONDAY = (short)1;
	public final static short WEEKDAY_TUESDAY = (short)2;
	public final static short WEEKDAY_WEDNESDAY = (short)3;
	public final static short WEEKDAY_THURSDAY = (short)4;
	public final static short WEEKDAY_FRIDAY = (short)5;
	public final static short WEEKDAY_SATURDAY = (short)6;
	public final static short WEEKDAY_SUNDAY = (short)7;
	public final static byte ALARM_MATCH_DISABLED = (byte)-1;
	public final static int ALARM_INTERVAL_DISABLED = -1;

	private List<DateTimeListener> listenerDateTime = new CopyOnWriteArrayList<DateTimeListener>();
	private List<AlarmListener> listenerAlarm = new CopyOnWriteArrayList<AlarmListener>();

	public class DateTime {
		public int year;
		public short month;
		public short day;
		public short hour;
		public short minute;
		public short second;
		public short centisecond;
		public short weekday;

		public String toString() {
			return "[" + "year = " + year + ", " + "month = " + month + ", " + "day = " + day + ", " + "hour = " + hour + ", " + "minute = " + minute + ", " + "second = " + second + ", " + "centisecond = " + centisecond + ", " + "weekday = " + weekday + "]";
		}
	}

	public class Alarm {
		public byte month;
		public byte day;
		public byte hour;
		public byte minute;
		public byte second;
		public byte weekday;
		public int interval;

		public String toString() {
			return "[" + "month = " + month + ", " + "day = " + day + ", " + "hour = " + hour + ", " + "minute = " + minute + ", " + "second = " + second + ", " + "weekday = " + weekday + ", " + "interval = " + interval + "]";
		}
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickletRealTimeClock#setDateTimeCallbackPeriod(long)}. The parameters are the same
	 * as for {@link BrickletRealTimeClock#getDateTime()} and {@link BrickletRealTimeClock#getTimestamp()} combined.
	 * 
	 * The {@link BrickletRealTimeClock.DateTimeListener} listener is only triggered if the date or time changed
	 * since the last triggering.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public interface DateTimeListener extends DeviceListener {
		public void dateTime(int year, short month, short day, short hour, short minute, short second, short centisecond, short weekday, long timestamp);
	}

	/**
	 * This listener is triggered every time the current date and time matches the
	 * configured alarm (see {@link BrickletRealTimeClock#setAlarm(byte, byte, byte, byte, byte, byte, int)}). The parameters are the same
	 * as for {@link BrickletRealTimeClock#getDateTime()} and {@link BrickletRealTimeClock#getTimestamp()} combined.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public interface AlarmListener extends DeviceListener {
		public void alarm(int year, short month, short day, short hour, short minute, short second, short centisecond, short weekday, long timestamp);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickletRealTimeClock(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 1;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_DATE_TIME)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DATE_TIME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_TIMESTAMP)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_OFFSET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_OFFSET)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DATE_TIME_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ALARM)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ALARM)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;

		callbacks[CALLBACK_DATE_TIME] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int year = IPConnection.unsignedShort(bb.getShort());
				short month = IPConnection.unsignedByte(bb.get());
				short day = IPConnection.unsignedByte(bb.get());
				short hour = IPConnection.unsignedByte(bb.get());
				short minute = IPConnection.unsignedByte(bb.get());
				short second = IPConnection.unsignedByte(bb.get());
				short centisecond = IPConnection.unsignedByte(bb.get());
				short weekday = IPConnection.unsignedByte(bb.get());
				long timestamp = (bb.getLong());

				for (DateTimeListener listener: listenerDateTime) {
					listener.dateTime(year, month, day, hour, minute, second, centisecond, weekday, timestamp);
				}
			}
		};

		callbacks[CALLBACK_ALARM] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int year = IPConnection.unsignedShort(bb.getShort());
				short month = IPConnection.unsignedByte(bb.get());
				short day = IPConnection.unsignedByte(bb.get());
				short hour = IPConnection.unsignedByte(bb.get());
				short minute = IPConnection.unsignedByte(bb.get());
				short second = IPConnection.unsignedByte(bb.get());
				short centisecond = IPConnection.unsignedByte(bb.get());
				short weekday = IPConnection.unsignedByte(bb.get());
				long timestamp = (bb.getLong());

				for (AlarmListener listener: listenerAlarm) {
					listener.alarm(year, month, day, hour, minute, second, centisecond, weekday, timestamp);
				}
			}
		};
	}

	/**
	 * Sets the current date (including weekday) and the current time with hundredths
	 * of a second resolution.
	 * 
	 * Possible value ranges:
	 * 
	 * * Year: 2000 to 2099
	 * * Month: 1 to 12 (January to December)
	 * * Day: 1 to 31
	 * * Hour: 0 to 23
	 * * Minute: 0 to 59
	 * * Second: 0 to 59
	 * * Centisecond: 0 to 99
	 * * Weekday: 1 to 7 (Monday to Sunday)
	 * 
	 * If the backup battery is installed then the real-time clock keeps date and
	 * time even if the Bricklet is not powered by a Brick.
	 * 
	 * The real-time clock handles leap year and inserts the 29th of February
	 * accordingly. But leap seconds, time zones and daylight saving time are not
	 * handled.
	 */
	public void setDateTime(int year, short month, short day, short hour, short minute, short second, short centisecond, short weekday) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)17, FUNCTION_SET_DATE_TIME, this);

		bb.putShort((short)year);
		bb.put((byte)month);
		bb.put((byte)day);
		bb.put((byte)hour);
		bb.put((byte)minute);
		bb.put((byte)second);
		bb.put((byte)centisecond);
		bb.put((byte)weekday);

		sendRequest(bb.array());
	}

	/**
	 * Returns the current date (including weekday) and the current time of the
	 * real-time clock with hundredths of a second resolution.
	 */
	public DateTime getDateTime() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_DATE_TIME, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		DateTime obj = new DateTime();
		obj.year = IPConnection.unsignedShort(bb.getShort());
		obj.month = IPConnection.unsignedByte(bb.get());
		obj.day = IPConnection.unsignedByte(bb.get());
		obj.hour = IPConnection.unsignedByte(bb.get());
		obj.minute = IPConnection.unsignedByte(bb.get());
		obj.second = IPConnection.unsignedByte(bb.get());
		obj.centisecond = IPConnection.unsignedByte(bb.get());
		obj.weekday = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns the current date and the time of the real-time clock converted to
	 * milliseconds. The timestamp has an effective resolution of hundredths of a
	 * second.
	 */
	public long getTimestamp() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_TIMESTAMP, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long timestamp = (bb.getLong());

		return timestamp;
	}

	/**
	 * Sets the offset the real-time clock should compensate for in 2.17 ppm steps
	 * between -277.76 ppm (-128) and +275.59 ppm (127).
	 * 
	 * The real-time clock time can deviate from the actual time due to the frequency
	 * deviation of its 32.768 kHz crystal. Even without compensation (factory
	 * default) the resulting time deviation should be at most ±20 ppm (±52.6
	 * seconds per month).
	 * 
	 * This deviation can be calculated by comparing the same duration measured by the
	 * real-time clock (``rtc_duration``) an accurate reference clock
	 * (``ref_duration``).
	 * 
	 * For best results the configured offset should be set to 0 ppm first and then a
	 * duration of at least 6 hours should be measured.
	 * 
	 * The new offset (``new_offset``) can be calculated from the currently configured
	 * offset (``current_offset``) and the measured durations as follow::
	 * 
	 *   new_offset = current_offset - round(1000000 * (rtc_duration - ref_duration) / rtc_duration / 2.17)
	 * 
	 * If you want to calculate the offset, then we recommend using the calibration
	 * dialog in Brick Viewer, instead of doing it manually.
	 * 
	 * The offset is saved in the EEPROM of the Bricklet and only needs to be
	 * configured once.
	 */
	public void setOffset(byte offset) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_OFFSET, this);

		bb.put(offset);

		sendRequest(bb.array());
	}

	/**
	 * Returns the offset as set by {@link BrickletRealTimeClock#setOffset(byte)}.
	 */
	public byte getOffset() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_OFFSET, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		byte offset = (bb.get());

		return offset;
	}

	/**
	 * Sets the period in ms with which the {@link BrickletRealTimeClock.DateTimeListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickletRealTimeClock.DateTimeListener} Listener is only triggered if the date or time changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public void setDateTimeCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_DATE_TIME_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickletRealTimeClock#setDateTimeCallbackPeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
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
	 * Configures a repeatable alarm. The {@link BrickletRealTimeClock.AlarmListener} listener is triggered if the
	 * current date and time matches the configured alarm.
	 * 
	 * Setting a parameter to -1 means that it should be disabled and doesn't take part
	 * in the match. Setting all parameters to -1 disables the alarm completely.
	 * 
	 * For example, to make the alarm trigger every day at 7:30 AM it can be
	 * configured as (-1, -1, 7, 30, -1, -1, -1). The hour is set to match 7 and the
	 * minute is set to match 30. The alarm is triggered if all enabled parameters
	 * match.
	 * 
	 * The interval has a special role. It allows to make the alarm reconfigure itself.
	 * This is useful if you need a repeated alarm that cannot be expressed by matching
	 * the current date and time. For example, to make the alarm trigger every 23
	 * seconds it can be configured as (-1, -1, -1, -1, -1, -1, 23). Internally the
	 * Bricklet will take the current date and time, add 23 seconds to it and set the
	 * result as its alarm. The first alarm will be triggered 23 seconds after the
	 * call. Because the interval is not -1, the Bricklet will do the same again
	 * internally, take the current date and time, add 23 seconds to it and set that
	 * as its alarm. This results in a repeated alarm that triggers every 23 seconds.
	 * 
	 * The interval can also be used in combination with the other parameters. For
	 * example, configuring the alarm as (-1, -1, 7, 30, -1, -1, 300) results in an
	 * alarm that triggers every day at 7:30 AM and is then repeated every 5 minutes.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public void setAlarm(byte month, byte day, byte hour, byte minute, byte second, byte weekday, int interval) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)18, FUNCTION_SET_ALARM, this);

		bb.put(month);
		bb.put(day);
		bb.put(hour);
		bb.put(minute);
		bb.put(second);
		bb.put(weekday);
		bb.putInt(interval);

		sendRequest(bb.array());
	}

	/**
	 * Returns the alarm configuration as set by {@link BrickletRealTimeClock#setAlarm(byte, byte, byte, byte, byte, byte, int)}.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public Alarm getAlarm() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ALARM, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Alarm obj = new Alarm();
		obj.month = (bb.get());
		obj.day = (bb.get());
		obj.hour = (bb.get());
		obj.minute = (bb.get());
		obj.second = (bb.get());
		obj.weekday = (bb.get());
		obj.interval = (bb.getInt());

		return obj;
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

	/**
	 * Adds a Alarm listener.
	 */
	public void addAlarmListener(AlarmListener listener) {
		listenerAlarm.add(listener);
	}

	/**
	 * Removes a Alarm listener.
	 */
	public void removeAlarmListener(AlarmListener listener) {
		listenerAlarm.remove(listener);
	}
}
