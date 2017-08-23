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
 * Communicates with CAN bus devices
 */
public class BrickletCAN extends Device {
	public final static int DEVICE_IDENTIFIER = 270;
	public final static String DEVICE_DISPLAY_NAME = "CAN Bricklet";

	public final static byte FUNCTION_WRITE_FRAME = (byte)1;
	public final static byte FUNCTION_READ_FRAME = (byte)2;
	public final static byte FUNCTION_ENABLE_FRAME_READ_CALLBACK = (byte)3;
	public final static byte FUNCTION_DISABLE_FRAME_READ_CALLBACK = (byte)4;
	public final static byte FUNCTION_IS_FRAME_READ_CALLBACK_ENABLED = (byte)5;
	public final static byte FUNCTION_SET_CONFIGURATION = (byte)6;
	public final static byte FUNCTION_GET_CONFIGURATION = (byte)7;
	public final static byte FUNCTION_SET_READ_FILTER = (byte)8;
	public final static byte FUNCTION_GET_READ_FILTER = (byte)9;
	public final static byte FUNCTION_GET_ERROR_LOG = (byte)10;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;
	private final static int CALLBACK_FRAME_READ = 11;

	public final static short FRAME_TYPE_STANDARD_DATA = (short)0;
	public final static short FRAME_TYPE_STANDARD_REMOTE = (short)1;
	public final static short FRAME_TYPE_EXTENDED_DATA = (short)2;
	public final static short FRAME_TYPE_EXTENDED_REMOTE = (short)3;
	public final static short BAUD_RATE_10KBPS = (short)0;
	public final static short BAUD_RATE_20KBPS = (short)1;
	public final static short BAUD_RATE_50KBPS = (short)2;
	public final static short BAUD_RATE_125KBPS = (short)3;
	public final static short BAUD_RATE_250KBPS = (short)4;
	public final static short BAUD_RATE_500KBPS = (short)5;
	public final static short BAUD_RATE_800KBPS = (short)6;
	public final static short BAUD_RATE_1000KBPS = (short)7;
	public final static short TRANSCEIVER_MODE_NORMAL = (short)0;
	public final static short TRANSCEIVER_MODE_LOOPBACK = (short)1;
	public final static short TRANSCEIVER_MODE_READ_ONLY = (short)2;
	public final static short FILTER_MODE_DISABLED = (short)0;
	public final static short FILTER_MODE_ACCEPT_ALL = (short)1;
	public final static short FILTER_MODE_MATCH_STANDARD = (short)2;
	public final static short FILTER_MODE_MATCH_STANDARD_AND_DATA = (short)3;
	public final static short FILTER_MODE_MATCH_EXTENDED = (short)4;

	private List<FrameReadListener> listenerFrameRead = new CopyOnWriteArrayList<FrameReadListener>();

	public class ReadFrame {
		public boolean success;
		public short frameType;
		public long identifier;
		public short[] data = new short[8];
		public short length;

		public String toString() {
			return "[" + "success = " + success + ", " + "frameType = " + frameType + ", " + "identifier = " + identifier + ", " + "data = " + Arrays.toString(data) + ", " + "length = " + length + "]";
		}
	}

	public class Configuration {
		public short baudRate;
		public short transceiverMode;
		public int writeTimeout;

		public String toString() {
			return "[" + "baudRate = " + baudRate + ", " + "transceiverMode = " + transceiverMode + ", " + "writeTimeout = " + writeTimeout + "]";
		}
	}

	public class ReadFilter {
		public short mode;
		public long mask;
		public long filter1;
		public long filter2;

		public String toString() {
			return "[" + "mode = " + mode + ", " + "mask = " + mask + ", " + "filter1 = " + filter1 + ", " + "filter2 = " + filter2 + "]";
		}
	}

	public class ErrorLog {
		public short writeErrorLevel;
		public short readErrorLevel;
		public boolean transceiverDisabled;
		public long writeTimeoutCount;
		public long readRegisterOverflowCount;
		public long readBufferOverflowCount;

		public String toString() {
			return "[" + "writeErrorLevel = " + writeErrorLevel + ", " + "readErrorLevel = " + readErrorLevel + ", " + "transceiverDisabled = " + transceiverDisabled + ", " + "writeTimeoutCount = " + writeTimeoutCount + ", " + "readRegisterOverflowCount = " + readRegisterOverflowCount + ", " + "readBufferOverflowCount = " + readBufferOverflowCount + "]";
		}
	}

	/**
	 * This listener is triggered if a data or remote frame was received by the CAN
	 * transceiver.
	 * 
	 * The ``identifier`` return value follows the identifier format described for
	 * {@link BrickletCAN#writeFrame(short, long, short[], short)}.
	 * 
	 * For remote frames the ``data`` return value always contains invalid values.
	 * 
	 * A configurable read filter can be used to define which frames should be
	 * received by the CAN transceiver at all (see {@link BrickletCAN#setReadFilter(short, long, long, long)}).
	 * 
	 * To enable this listener, use {@link BrickletCAN#enableFrameReadCallback()}.
	 */
	public interface FrameReadListener extends DeviceListener {
		public void frameRead(short frameType, long identifier, short[] data, short length);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickletCAN(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 0;
		responseExpected[IPConnection.unsignedByte(FUNCTION_WRITE_FRAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_READ_FRAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_FRAME_READ_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_FRAME_READ_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_FRAME_READ_CALLBACK_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_READ_FILTER)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_READ_FILTER)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ERROR_LOG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;

		callbacks[CALLBACK_FRAME_READ] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				short frameType = IPConnection.unsignedByte(bb.get());
				long identifier = IPConnection.unsignedInt(bb.getInt());
				short[] data = new short[8];
				for (int i = 0; i < 8; i++) {
					data[i] = IPConnection.unsignedByte(bb.get());
				}
				short length = IPConnection.unsignedByte(bb.get());

				for (FrameReadListener listener: listenerFrameRead) {
					listener.frameRead(frameType, identifier, data, length);
				}
			}
		};
	}

	/**
	 * Writes a data or remote frame to the write buffer to be transmitted over the
	 * CAN transceiver.
	 * 
	 * The Bricklet supports the standard 11-bit (CAN 2.0A) and the additional extended
	 * 18-bit (CAN 2.0B) identifiers. For standard frames the Bricklet uses bit 0 to 10
	 * from the ``identifier`` parameter as standard 11-bit identifier. For extended
	 * frames the Bricklet additionally uses bit 11 to 28 from the ``identifier``
	 * parameter as extended 18-bit identifier.
	 * 
	 * For remote frames the ``data`` parameter is ignored.
	 * 
	 * Returns *true* if the frame was successfully added to the write buffer. Returns
	 * *false* if the frame could not be added because write buffer is already full.
	 * 
	 * The write buffer can overflow if frames are written to it at a higher rate
	 * than the Bricklet can transmitted them over the CAN transceiver. This may
	 * happen if the CAN transceiver is configured as read-only or is using a low baud
	 * rate (see {@link BrickletCAN#setConfiguration(short, short, int)}). It can also happen if the CAN bus is
	 * congested and the frame cannot be transmitted because it constantly loses
	 * arbitration or because the CAN transceiver is currently disabled due to a high
	 * write error level (see {@link BrickletCAN#getErrorLog()}).
	 */
	public boolean writeFrame(short frameType, long identifier, short[] data, short length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)22, FUNCTION_WRITE_FRAME, this);

		bb.put((byte)frameType);
		bb.putInt((int)identifier);
		for (int i = 0; i < 8; i++) {
			bb.put((byte)data[i]);
		}
		bb.put((byte)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean success = (bb.get()) != 0;

		return success;
	}

	/**
	 * Tries to read the next data or remote frame from the read buffer and return it.
	 * If a frame was successfully read, then the ``success`` return value is set to
	 * *true* and the other return values contain the frame. If the read buffer is
	 * empty and no frame could be read, then the ``success`` return value is set to
	 * *false* and the other return values contain invalid data.
	 * 
	 * The ``identifier`` return value follows the identifier format described for
	 * {@link BrickletCAN#writeFrame(short, long, short[], short)}.
	 * 
	 * For remote frames the ``data`` return value always contains invalid data.
	 * 
	 * A configurable read filter can be used to define which frames should be
	 * received by the CAN transceiver and put into the read buffer (see
	 * {@link BrickletCAN#setReadFilter(short, long, long, long)}).
	 * 
	 * Instead of polling with this function, you can also use listeners. See the
	 * {@link BrickletCAN#enableFrameReadCallback()} function and the {@link BrickletCAN.FrameReadListener} listener.
	 */
	public ReadFrame readFrame() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_READ_FRAME, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ReadFrame obj = new ReadFrame();
		obj.success = (bb.get()) != 0;
		obj.frameType = IPConnection.unsignedByte(bb.get());
		obj.identifier = IPConnection.unsignedInt(bb.getInt());
		for (int i = 0; i < 8; i++) {
			obj.data[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.length = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Enables the {@link BrickletCAN.FrameReadListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void enableFrameReadCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_FRAME_READ_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the {@link BrickletCAN.FrameReadListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void disableFrameReadCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_FRAME_READ_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the {@link BrickletCAN.FrameReadListener} listener is enabled, *false* otherwise.
	 */
	public boolean isFrameReadCallbackEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_FRAME_READ_CALLBACK_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Sets the configuration for the CAN bus communication.
	 * 
	 * The baud rate can be configured in steps between 10 and 1000 kbit/s.
	 * 
	 * The CAN transceiver has three different modes:
	 * 
	 * * Normal: Reads from and writes and to the CAN bus and performs active bus
	 *   error detection and acknowledgement.
	 * * Loopback: All reads and writes are performed internally. The transceiver
	 *   is disconnected from the actual CAN bus.
	 * * Read-Only: Only reads from the CAN bus, but does neither active bus error
	 *   detection nor acknowledgement. Only the receiving part of the transceiver
	 *   is connected to the CAN bus.
	 * 
	 * The write timeout has three different modes that define how a failed frame
	 * transmission should be handled:
	 * 
	 * * One-Shot (&lt; 0): Only one transmission attempt will be made. If the
	 *   transmission fails then the frame is discarded.
	 * * Infinite (= 0): Infinite transmission attempts will be made. The frame will
	 *   never be discarded.
	 * * Milliseconds (&gt; 0): A limited number of transmission attempts will be made.
	 *   If the frame could not be transmitted successfully after the configured
	 *   number of milliseconds then the frame is discarded.
	 * 
	 * The default is: 125 kbit/s, normal transceiver mode and infinite write timeout.
	 */
	public void setConfiguration(short baudRate, short transceiverMode, int writeTimeout) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)14, FUNCTION_SET_CONFIGURATION, this);

		bb.put((byte)baudRate);
		bb.put((byte)transceiverMode);
		bb.putInt(writeTimeout);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletCAN#setConfiguration(short, short, int)}.
	 */
	public Configuration getConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Configuration obj = new Configuration();
		obj.baudRate = IPConnection.unsignedByte(bb.get());
		obj.transceiverMode = IPConnection.unsignedByte(bb.get());
		obj.writeTimeout = (bb.getInt());

		return obj;
	}

	/**
	 * Set the read filter configuration. This can be used to define which frames
	 * should be received by the CAN transceiver and put into the read buffer.
	 * 
	 * The read filter has five different modes that define if and how the mask and
	 * the two filters are applied:
	 * 
	 * * Disabled: No filtering is applied at all. All frames are received even
	 *   incomplete and defective frames. This mode should be used for debugging only.
	 * * Accept-All: All complete and error-free frames are received.
	 * * Match-Standard: Only standard frames with a matching identifier are received.
	 * * Match-Standard-and-Data: Only standard frames with matching identifier and
	 *   data bytes are received.
	 * * Match-Extended: Only extended frames with a matching identifier are received.
	 * 
	 * The mask and filters are used as bit masks. Their usage depends on the mode:
	 * 
	 * * Disabled: Mask and filters are ignored.
	 * * Accept-All: Mask and filters are ignored.
	 * * Match-Standard: Bit 0 to 10 (11 bits) of mask and filters are used to match
	 *   the 11-bit identifier of standard frames.
	 * * Match-Standard-and-Data: Bit 0 to 10 (11 bits) of mask and filters are used
	 *   to match the 11-bit identifier of standard frames. Bit 11 to 18 (8 bits) and
	 *   bit 19 to 26 (8 bits) of mask and filters are used to match the first and
	 *   second data byte (if present) of standard frames.
	 * * Match-Extended: Bit 0 to 10 (11 bits) of mask and filters are used
	 *   to match the standard 11-bit identifier part of extended frames. Bit 11 to 28
	 *   (18 bits) of mask and filters are used to match the extended 18-bit identifier
	 *   part of extended frames.
	 * 
	 * The mask and filters are applied in this way: The mask is used to select the
	 * identifier and data bits that should be compared to the corresponding filter
	 * bits. All unselected bits are automatically accepted. All selected bits have
	 * to match one of the filters to be accepted. If all bits for the selected mode
	 * are accepted then the frame is accepted and is added to the read buffer.
	 * 
	 * \verbatim
	 *  "Mask Bit", "Filter Bit", "Identifier/Data Bit", "Result"
	 * 
	 *  0, X, X, Accept
	 *  1, 0, 0, Accept
	 *  1, 0, 1, Reject
	 *  1, 1, 0, Reject
	 *  1, 1, 1, Accept
	 * \endverbatim
	 * 
	 * For example, to receive standard frames with identifier 0x123 only the mode can
	 * be set to Match-Standard with 0x7FF as mask and 0x123 as filter 1 and filter 2.
	 * The mask of 0x7FF selects all 11 identifier bits for matching so that the
	 * identifier has to be exactly 0x123 to be accepted.
	 * 
	 * To accept identifier 0x123 and identifier 0x456 at the same time, just set
	 * filter 2 to 0x456 and keep mask and filter 1 unchanged.
	 * 
	 * The default mode is accept-all.
	 */
	public void setReadFilter(short mode, long mask, long filter1, long filter2) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)21, FUNCTION_SET_READ_FILTER, this);

		bb.put((byte)mode);
		bb.putInt((int)mask);
		bb.putInt((int)filter1);
		bb.putInt((int)filter2);

		sendRequest(bb.array());
	}

	/**
	 * Returns the read filter as set by {@link BrickletCAN#setReadFilter(short, long, long, long)}.
	 */
	public ReadFilter getReadFilter() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_READ_FILTER, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ReadFilter obj = new ReadFilter();
		obj.mode = IPConnection.unsignedByte(bb.get());
		obj.mask = IPConnection.unsignedInt(bb.getInt());
		obj.filter1 = IPConnection.unsignedInt(bb.getInt());
		obj.filter2 = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Returns information about different kinds of errors.
	 * 
	 * The write and read error levels indicate the current level of checksum,
	 * acknowledgement, form, bit and stuffing errors during CAN bus write and read
	 * operations.
	 * 
	 * When the write error level extends 255 then the CAN transceiver gets disabled
	 * and no frames can be transmitted or received anymore. The CAN transceiver will
	 * automatically be activated again after the CAN bus is idle for a while.
	 * 
	 * The write and read error levels are not available in read-only transceiver mode
	 * (see {@link BrickletCAN#setConfiguration(short, short, int)}) and are reset to 0 as a side effect of changing
	 * the configuration or the read filter.
	 * 
	 * The write timeout, read register and buffer overflow counts represents the
	 * number of these errors:
	 * 
	 * * A write timeout occurs if a frame could not be transmitted before the
	 *   configured write timeout expired (see {@link BrickletCAN#setConfiguration(short, short, int)}).
	 * * A read register overflow occurs if the read register of the CAN transceiver
	 *   still contains the last received frame when the next frame arrives. In this
	 *   case the newly arrived frame is lost. This happens if the CAN transceiver
	 *   receives more frames than the Bricklet can handle. Using the read filter
	 *   (see {@link BrickletCAN#setReadFilter(short, long, long, long)}) can help to reduce the amount of received frames.
	 *   This count is not exact, but a lower bound, because the Bricklet might not
	 *   able detect all overflows if they occur in rapid succession.
	 * * A read buffer overflow occurs if the read buffer of the Bricklet is already
	 *   full when the next frame should be read from the read register of the CAN
	 *   transceiver. In this case the frame in the read register is lost. This
	 *   happens if the CAN transceiver receives more frames to be added to the read
	 *   buffer than are removed from the read buffer using the {@link BrickletCAN#readFrame()}
	 *   function. Using the {@link BrickletCAN.FrameReadListener} listener ensures that the read buffer
	 *   can not overflow.
	 */
	public ErrorLog getErrorLog() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ERROR_LOG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ErrorLog obj = new ErrorLog();
		obj.writeErrorLevel = IPConnection.unsignedByte(bb.get());
		obj.readErrorLevel = IPConnection.unsignedByte(bb.get());
		obj.transceiverDisabled = (bb.get()) != 0;
		obj.writeTimeoutCount = IPConnection.unsignedInt(bb.getInt());
		obj.readRegisterOverflowCount = IPConnection.unsignedInt(bb.getInt());
		obj.readBufferOverflowCount = IPConnection.unsignedInt(bb.getInt());

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
	 * Adds a FrameRead listener.
	 */
	public void addFrameReadListener(FrameReadListener listener) {
		listenerFrameRead.add(listener);
	}

	/**
	 * Removes a FrameRead listener.
	 */
	public void removeFrameReadListener(FrameReadListener listener) {
		listenerFrameRead.remove(listener);
	}
}
