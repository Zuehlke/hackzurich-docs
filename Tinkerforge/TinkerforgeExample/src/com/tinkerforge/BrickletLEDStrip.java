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
 * Controls up to 320 RGB LEDs
 */
public class BrickletLEDStrip extends Device {
	public final static int DEVICE_IDENTIFIER = 231;
	public final static String DEVICE_DISPLAY_NAME = "LED Strip Bricklet";

	public final static byte FUNCTION_SET_RGB_VALUES = (byte)1;
	public final static byte FUNCTION_GET_RGB_VALUES = (byte)2;
	public final static byte FUNCTION_SET_FRAME_DURATION = (byte)3;
	public final static byte FUNCTION_GET_FRAME_DURATION = (byte)4;
	public final static byte FUNCTION_GET_SUPPLY_VOLTAGE = (byte)5;
	public final static byte FUNCTION_SET_CLOCK_FREQUENCY = (byte)7;
	public final static byte FUNCTION_GET_CLOCK_FREQUENCY = (byte)8;
	public final static byte FUNCTION_SET_CHIP_TYPE = (byte)9;
	public final static byte FUNCTION_GET_CHIP_TYPE = (byte)10;
	public final static byte FUNCTION_SET_RGBW_VALUES = (byte)11;
	public final static byte FUNCTION_GET_RGBW_VALUES = (byte)12;
	public final static byte FUNCTION_SET_CHANNEL_MAPPING = (byte)13;
	public final static byte FUNCTION_GET_CHANNEL_MAPPING = (byte)14;
	public final static byte FUNCTION_ENABLE_FRAME_RENDERED_CALLBACK = (byte)15;
	public final static byte FUNCTION_DISABLE_FRAME_RENDERED_CALLBACK = (byte)16;
	public final static byte FUNCTION_IS_FRAME_RENDERED_CALLBACK_ENABLED = (byte)17;
	public final static byte FUNCTION_GET_IDENTITY = (byte)255;
	private final static int CALLBACK_FRAME_RENDERED = 6;

	public final static int CHIP_TYPE_WS2801 = 2801;
	public final static int CHIP_TYPE_WS2811 = 2811;
	public final static int CHIP_TYPE_WS2812 = 2812;
	public final static int CHIP_TYPE_LPD8806 = 8806;
	public final static int CHIP_TYPE_APA102 = 102;
	public final static short CHANNEL_MAPPING_RGB = (short)6;
	public final static short CHANNEL_MAPPING_RBG = (short)9;
	public final static short CHANNEL_MAPPING_BRG = (short)33;
	public final static short CHANNEL_MAPPING_BGR = (short)36;
	public final static short CHANNEL_MAPPING_GRB = (short)18;
	public final static short CHANNEL_MAPPING_GBR = (short)24;
	public final static short CHANNEL_MAPPING_RGBW = (short)27;
	public final static short CHANNEL_MAPPING_RGWB = (short)30;
	public final static short CHANNEL_MAPPING_RBGW = (short)39;
	public final static short CHANNEL_MAPPING_RBWG = (short)45;
	public final static short CHANNEL_MAPPING_RWGB = (short)54;
	public final static short CHANNEL_MAPPING_RWBG = (short)57;
	public final static short CHANNEL_MAPPING_GRWB = (short)78;
	public final static short CHANNEL_MAPPING_GRBW = (short)75;
	public final static short CHANNEL_MAPPING_GBWR = (short)108;
	public final static short CHANNEL_MAPPING_GBRW = (short)99;
	public final static short CHANNEL_MAPPING_GWBR = (short)120;
	public final static short CHANNEL_MAPPING_GWRB = (short)114;
	public final static short CHANNEL_MAPPING_BRGW = (short)135;
	public final static short CHANNEL_MAPPING_BRWG = (short)141;
	public final static short CHANNEL_MAPPING_BGRW = (short)147;
	public final static short CHANNEL_MAPPING_BGWR = (short)156;
	public final static short CHANNEL_MAPPING_BWRG = (short)177;
	public final static short CHANNEL_MAPPING_BWGR = (short)180;
	public final static short CHANNEL_MAPPING_WRBG = (short)201;
	public final static short CHANNEL_MAPPING_WRGB = (short)198;
	public final static short CHANNEL_MAPPING_WGBR = (short)216;
	public final static short CHANNEL_MAPPING_WGRB = (short)210;
	public final static short CHANNEL_MAPPING_WBGR = (short)228;
	public final static short CHANNEL_MAPPING_WBRG = (short)225;

	private List<FrameRenderedListener> listenerFrameRendered = new CopyOnWriteArrayList<FrameRenderedListener>();

	public class RGBValues {
		public short[] r = new short[16];
		public short[] g = new short[16];
		public short[] b = new short[16];

		public String toString() {
			return "[" + "r = " + Arrays.toString(r) + ", " + "g = " + Arrays.toString(g) + ", " + "b = " + Arrays.toString(b) + "]";
		}
	}

	public class RGBWValues {
		public short[] r = new short[12];
		public short[] g = new short[12];
		public short[] b = new short[12];
		public short[] w = new short[12];

		public String toString() {
			return "[" + "r = " + Arrays.toString(r) + ", " + "g = " + Arrays.toString(g) + ", " + "b = " + Arrays.toString(b) + ", " + "w = " + Arrays.toString(w) + "]";
		}
	}

	/**
	 * This listener is triggered directly after a new frame is rendered. The
	 * parameter is the number of LEDs in that frame.
	 * 
	 * You should send the data for the next frame directly after this listener
	 * was triggered.
	 * 
	 * For an explanation of the general approach see {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])}.
	 */
	public interface FrameRenderedListener extends DeviceListener {
		public void frameRendered(int length);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickletLEDStrip(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 3;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RGB_VALUES)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RGB_VALUES)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_FRAME_DURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_FRAME_DURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_SUPPLY_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CLOCK_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CLOCK_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIP_TYPE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIP_TYPE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RGBW_VALUES)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RGBW_VALUES)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHANNEL_MAPPING)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHANNEL_MAPPING)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_FRAME_RENDERED_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_FRAME_RENDERED_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_FRAME_RENDERED_CALLBACK_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_IDENTITY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;

		callbacks[CALLBACK_FRAME_RENDERED] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int length = IPConnection.unsignedShort(bb.getShort());

				for (FrameRenderedListener listener: listenerFrameRendered) {
					listener.frameRendered(length);
				}
			}
		};
	}

	/**
	 * Sets the RGB values for the LEDs with the given *length* starting
	 * from *index*.
	 * 
	 * To make the colors show correctly you need to configure the chip type
	 * ({@link BrickletLEDStrip#setChipType(int)}) and a 3-channel channel mapping ({@link BrickletLEDStrip#setChannelMapping(short)})
	 * according to the connected LEDs.
	 * 
	 * The maximum length is 16, the index goes from 0 to 319 and the rgb values
	 * have 8 bits each.
	 * 
	 * Example: If you set
	 * 
	 * * index to 5,
	 * * length to 3,
	 * * r to [255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
	 * * g to [0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] and
	 * * b to [0, 0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	 * 
	 * the LED with index 5 will be red, 6 will be green and 7 will be blue.
	 * 
	 * \note Depending on the LED circuitry colors can be permuted.
	 * 
	 * The colors will be transfered to actual LEDs when the next
	 * frame duration ends, see {@link BrickletLEDStrip#setFrameDuration(int)}.
	 * 
	 * Generic approach:
	 * 
	 * * Set the frame duration to a value that represents
	 *   the number of frames per second you want to achieve.
	 * * Set all of the LED colors for one frame.
	 * * Wait for the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * * Set all of the LED colors for next frame.
	 * * Wait for the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * * and so on.
	 * 
	 * This approach ensures that you can change the LED colors with
	 * a fixed frame rate.
	 * 
	 * The actual number of controllable LEDs depends on the number of free
	 * Bricklet ports. See :ref:`here &lt;led_strip_bricklet_ram_constraints&gt;` for more
	 * information. A call of {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])} with index + length above the
	 * bounds is ignored completely.
	 */
	public void setRGBValues(int index, short length, short[] r, short[] g, short[] b) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)59, FUNCTION_SET_RGB_VALUES, this);

		bb.putShort((short)index);
		bb.put((byte)length);
		for (int i = 0; i < 16; i++) {
			bb.put((byte)r[i]);
		}
		for (int i = 0; i < 16; i++) {
			bb.put((byte)g[i]);
		}
		for (int i = 0; i < 16; i++) {
			bb.put((byte)b[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns RGB value with the given *length* starting from the
	 * given *index*.
	 * 
	 * The values are the last values that were set by {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])}.
	 */
	public RGBValues getRGBValues(int index, short length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)11, FUNCTION_GET_RGB_VALUES, this);

		bb.putShort((short)index);
		bb.put((byte)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		RGBValues obj = new RGBValues();
		for (int i = 0; i < 16; i++) {
			obj.r[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 16; i++) {
			obj.g[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 16; i++) {
			obj.b[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
	}

	/**
	 * Sets the frame duration in ms.
	 * 
	 * Example: If you want to achieve 20 frames per second, you should
	 * set the frame duration to 50ms (50ms * 20 = 1 second).
	 * 
	 * For an explanation of the general approach see {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])}.
	 * 
	 * Default value: 100ms (10 frames per second).
	 */
	public void setFrameDuration(int duration) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_FRAME_DURATION, this);

		bb.putShort((short)duration);

		sendRequest(bb.array());
	}

	/**
	 * Returns the frame duration in ms as set by {@link BrickletLEDStrip#setFrameDuration(int)}.
	 */
	public int getFrameDuration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_FRAME_DURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int duration = IPConnection.unsignedShort(bb.getShort());

		return duration;
	}

	/**
	 * Returns the current supply voltage of the LEDs. The voltage is given in mV.
	 */
	public int getSupplyVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_SUPPLY_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Sets the frequency of the clock in Hz. The range is 10000Hz (10kHz) up to
	 * 2000000Hz (2MHz).
	 * 
	 * The Bricklet will choose the nearest achievable frequency, which may
	 * be off by a few Hz. You can get the exact frequency that is used by
	 * calling {@link BrickletLEDStrip#getClockFrequency()}.
	 * 
	 * If you have problems with flickering LEDs, they may be bits flipping. You
	 * can fix this by either making the connection between the LEDs and the
	 * Bricklet shorter or by reducing the frequency.
	 * 
	 * With a decreasing frequency your maximum frames per second will decrease
	 * too.
	 * 
	 * The default value is 1.66MHz.
	 * 
	 * \note
	 *  The frequency in firmware version 2.0.0 is fixed at 2MHz.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public void setClockFrequency(long frequency) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_CLOCK_FREQUENCY, this);

		bb.putInt((int)frequency);

		sendRequest(bb.array());
	}

	/**
	 * Returns the currently used clock frequency as set by {@link BrickletLEDStrip#setClockFrequency(long)}.
	 * 
	 * .. versionadded:: 2.0.1$nbsp;(Plugin)
	 */
	public long getClockFrequency() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CLOCK_FREQUENCY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long frequency = IPConnection.unsignedInt(bb.getInt());

		return frequency;
	}

	/**
	 * Sets the type of the LED driver chip. We currently support the chips
	 * 
	 * * WS2801,
	 * * WS2811,
	 * * WS2812 / SK6812 / NeoPixel RGB,
	 * * SK6812RGBW / NeoPixel RGBW (Chip Type = WS2812),
	 * * LPD8806 and
	 * * APA102 / DotStar.
	 * 
	 * The default value is WS2801 (2801).
	 * 
	 * .. versionadded:: 2.0.2$nbsp;(Plugin)
	 */
	public void setChipType(int chip) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_CHIP_TYPE, this);

		bb.putShort((short)chip);

		sendRequest(bb.array());
	}

	/**
	 * Returns the currently used chip type as set by {@link BrickletLEDStrip#setChipType(int)}.
	 * 
	 * .. versionadded:: 2.0.2$nbsp;(Plugin)
	 */
	public int getChipType() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIP_TYPE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int chip = IPConnection.unsignedShort(bb.getShort());

		return chip;
	}

	/**
	 * Sets the RGBW values for the LEDs with the given *length* starting
	 * from *index*.
	 * 
	 * To make the colors show correctly you need to configure the chip type
	 * ({@link BrickletLEDStrip#setChipType(int)}) and a 4-channel channel mapping ({@link BrickletLEDStrip#setChannelMapping(short)})
	 * according to the connected LEDs.
	 * 
	 * The maximum length is 12, the index goes from 0 to 239 and the rgbw values
	 * have 8 bits each.
	 * 
	 * Example: If you set
	 * 
	 * * index to 5,
	 * * length to 4,
	 * * r to [255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
	 * * g to [0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
	 * * b to [0, 0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0] and
	 * * w to [0, 0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	 * 
	 * the LED with index 5 will be red, 6 will be green, 7 will be blue and 8 will be white.
	 * 
	 * \note Depending on the LED circuitry colors can be permuted.
	 * 
	 * The colors will be transfered to actual LEDs when the next
	 * frame duration ends, see {@link BrickletLEDStrip#setFrameDuration(int)}.
	 * 
	 * Generic approach:
	 * 
	 * * Set the frame duration to a value that represents
	 *   the number of frames per second you want to achieve.
	 * * Set all of the LED colors for one frame.
	 * * Wait for the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * * Set all of the LED colors for next frame.
	 * * Wait for the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * * and so on.
	 * 
	 * This approach ensures that you can change the LED colors with
	 * a fixed frame rate.
	 * 
	 * The actual number of controllable LEDs depends on the number of free
	 * Bricklet ports. See :ref:`here &lt;led_strip_bricklet_ram_constraints&gt;` for more
	 * information. A call of {@link BrickletLEDStrip#setRGBWValues(int, short, short[], short[], short[], short[])} with index + length above the
	 * bounds is ignored completely.
	 * 
	 * The LPD8806 LED driver chips have 7-bit channels for RGB. Internally the LED
	 * Strip Bricklets divides the 8-bit values set using this function by 2 to make
	 * them 7-bit. Therefore, you can just use the normal value range (0-255) for
	 * LPD8806 LEDs.
	 * 
	 * The brightness channel of the APA102 LED driver chips has 5-bit. Internally the
	 * LED Strip Bricklets divides the 8-bit values set using this function by 8 to make
	 * them 5-bit. Therefore, you can just use the normal value range (0-255) for
	 * the brightness channel of APA102 LEDs.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public void setRGBWValues(int index, short length, short[] r, short[] g, short[] b, short[] w) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)59, FUNCTION_SET_RGBW_VALUES, this);

		bb.putShort((short)index);
		bb.put((byte)length);
		for (int i = 0; i < 12; i++) {
			bb.put((byte)r[i]);
		}
		for (int i = 0; i < 12; i++) {
			bb.put((byte)g[i]);
		}
		for (int i = 0; i < 12; i++) {
			bb.put((byte)b[i]);
		}
		for (int i = 0; i < 12; i++) {
			bb.put((byte)w[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns RGBW values with the given *length* starting from the
	 * given *index*.
	 * 
	 * The values are the last values that were set by {@link BrickletLEDStrip#setRGBWValues(int, short, short[], short[], short[], short[])}.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public RGBWValues getRGBWValues(int index, short length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)11, FUNCTION_GET_RGBW_VALUES, this);

		bb.putShort((short)index);
		bb.put((byte)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		RGBWValues obj = new RGBWValues();
		for (int i = 0; i < 12; i++) {
			obj.r[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 12; i++) {
			obj.g[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 12; i++) {
			obj.b[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 12; i++) {
			obj.w[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
	}

	/**
	 * Sets the channel mapping for the connected LEDs.
	 * 
	 * {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])} and {@link BrickletLEDStrip#setRGBWValues(int, short, short[], short[], short[], short[])} take the data in RGB(W) order.
	 * But the connected LED driver chips might have their 3 or 4 channels in a
	 * different order. For example, the WS2801 chips typically use BGR order, the
	 * WS2812 chips typically use GRB order and the APA102 chips typically use WBGR
	 * order.
	 * 
	 * The APA102 chips are special. They have three 8-bit channels for RGB
	 * and an additional 5-bit channel for the overall brightness of the RGB LED
	 * making them 4-channel chips. Internally the brightness channel is the first
	 * channel, therefore one of the Wxyz channel mappings should be used. Then
	 * the W channel controls the brightness.
	 * 
	 * If a 3-channel mapping is selected then {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])} has to be used.
	 * Calling {@link BrickletLEDStrip#setRGBWValues(int, short, short[], short[], short[], short[])} with a 3-channel mapping will produce incorrect
	 * results. Vice-versa if a 4-channel mapping is selected then
	 * {@link BrickletLEDStrip#setRGBWValues(int, short, short[], short[], short[], short[])} has to be used. Calling {@link BrickletLEDStrip#setRGBValues(int, short, short[], short[], short[])} with a
	 * 4-channel mapping will produce incorrect results.
	 * 
	 * The default value is BGR (36).
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public void setChannelMapping(short mapping) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_CHANNEL_MAPPING, this);

		bb.put((byte)mapping);

		sendRequest(bb.array());
	}

	/**
	 * Returns the currently used channel mapping as set by {@link BrickletLEDStrip#setChannelMapping(short)}.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public short getChannelMapping() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHANNEL_MAPPING, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short mapping = IPConnection.unsignedByte(bb.get());

		return mapping;
	}

	/**
	 * Enables the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * 
	 * By default the listener is enabled.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public void enableFrameRenderedCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_FRAME_RENDERED_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the {@link BrickletLEDStrip.FrameRenderedListener} listener.
	 * 
	 * By default the listener is enabled.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public void disableFrameRenderedCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_FRAME_RENDERED_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the {@link BrickletLEDStrip.FrameRenderedListener} listener is enabled, *false* otherwise.
	 * 
	 * .. versionadded:: 2.0.6$nbsp;(Plugin)
	 */
	public boolean isFrameRenderedCallbackEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_FRAME_RENDERED_CALLBACK_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
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
	 * Adds a FrameRendered listener.
	 */
	public void addFrameRenderedListener(FrameRenderedListener listener) {
		listenerFrameRendered.add(listener);
	}

	/**
	 * Removes a FrameRendered listener.
	 */
	public void removeFrameRenderedListener(FrameRenderedListener listener) {
		listenerFrameRendered.remove(listener);
	}
}
