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
 * Communicates with RS485/Modbus devices with full- or half-duplex
 */
public class BrickletRS485 extends Device {
	public final static int DEVICE_IDENTIFIER = 277;
	public final static String DEVICE_DISPLAY_NAME = "RS485 Bricklet";

	public final static byte FUNCTION_WRITE_LOW_LEVEL = (byte)1;
	public final static byte FUNCTION_READ_LOW_LEVEL = (byte)2;
	public final static byte FUNCTION_ENABLE_READ_CALLBACK = (byte)3;
	public final static byte FUNCTION_DISABLE_READ_CALLBACK = (byte)4;
	public final static byte FUNCTION_IS_READ_CALLBACK_ENABLED = (byte)5;
	public final static byte FUNCTION_SET_RS485_CONFIGURATION = (byte)6;
	public final static byte FUNCTION_GET_RS485_CONFIGURATION = (byte)7;
	public final static byte FUNCTION_SET_MODBUS_CONFIGURATION = (byte)8;
	public final static byte FUNCTION_GET_MODBUS_CONFIGURATION = (byte)9;
	public final static byte FUNCTION_SET_MODE = (byte)10;
	public final static byte FUNCTION_GET_MODE = (byte)11;
	public final static byte FUNCTION_SET_COMMUNICATION_LED_CONFIG = (byte)12;
	public final static byte FUNCTION_GET_COMMUNICATION_LED_CONFIG = (byte)13;
	public final static byte FUNCTION_SET_ERROR_LED_CONFIG = (byte)14;
	public final static byte FUNCTION_GET_ERROR_LED_CONFIG = (byte)15;
	public final static byte FUNCTION_SET_BUFFER_CONFIG = (byte)16;
	public final static byte FUNCTION_GET_BUFFER_CONFIG = (byte)17;
	public final static byte FUNCTION_GET_BUFFER_STATUS = (byte)18;
	public final static byte FUNCTION_ENABLE_ERROR_COUNT_CALLBACK = (byte)19;
	public final static byte FUNCTION_DISABLE_ERROR_COUNT_CALLBACK = (byte)20;
	public final static byte FUNCTION_IS_ERROR_COUNT_CALLBACK_ENABLED = (byte)21;
	public final static byte FUNCTION_GET_ERROR_COUNT = (byte)22;
	public final static byte FUNCTION_GET_MODBUS_COMMON_ERROR_COUNT = (byte)23;
	public final static byte FUNCTION_MODBUS_SLAVE_REPORT_EXCEPTION = (byte)24;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_READ_COILS_REQUEST_LOW_LEVEL = (byte)25;
	public final static byte FUNCTION_MODBUS_MASTER_READ_COILS = (byte)26;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_READ_HOLDING_REGISTERS_REQUEST_LOW_LEVEL = (byte)27;
	public final static byte FUNCTION_MODBUS_MASTER_READ_HOLDING_REGISTERS = (byte)28;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_COIL_REQUEST = (byte)29;
	public final static byte FUNCTION_MODBUS_MASTER_WRITE_SINGLE_COIL = (byte)30;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_REGISTER_REQUEST = (byte)31;
	public final static byte FUNCTION_MODBUS_MASTER_WRITE_SINGLE_REGISTER = (byte)32;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_COILS_REQUEST = (byte)33;
	public final static byte FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_COILS_LOW_LEVEL = (byte)34;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_REGISTERS_REQUEST = (byte)35;
	public final static byte FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_REGISTERS_LOW_LEVEL = (byte)36;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_READ_DISCRETE_INPUTS_REQUEST_LOW_LEVEL = (byte)37;
	public final static byte FUNCTION_MODBUS_MASTER_READ_DISCRETE_INPUTS = (byte)38;
	public final static byte FUNCTION_MODBUS_SLAVE_ANSWER_READ_INPUT_REGISTERS_REQUEST_LOW_LEVEL = (byte)39;
	public final static byte FUNCTION_MODBUS_MASTER_READ_INPUT_REGISTERS = (byte)40;
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
	private final static int CALLBACK_READ_LOW_LEVEL = 41;
	private final static int CALLBACK_ERROR_COUNT = 42;
	private final static int CALLBACK_MODBUS_SLAVE_READ_COILS_REQUEST = 43;
	private final static int CALLBACK_MODBUS_MASTER_READ_COILS_RESPONSE_LOW_LEVEL = 44;
	private final static int CALLBACK_MODBUS_SLAVE_READ_HOLDING_REGISTERS_REQUEST = 45;
	private final static int CALLBACK_MODBUS_MASTER_READ_HOLDING_REGISTERS_RESPONSE_LOW_LEVEL = 46;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_SINGLE_COIL_REQUEST = 47;
	private final static int CALLBACK_MODBUS_MASTER_WRITE_SINGLE_COIL_RESPONSE = 48;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_SINGLE_REGISTER_REQUEST = 49;
	private final static int CALLBACK_MODBUS_MASTER_WRITE_SINGLE_REGISTER_RESPONSE = 50;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_COILS_REQUEST_LOW_LEVEL = 51;
	private final static int CALLBACK_MODBUS_MASTER_WRITE_MULTIPLE_COILS_RESPONSE = 52;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_REGISTERS_REQUEST_LOW_LEVEL = 53;
	private final static int CALLBACK_MODBUS_MASTER_WRITE_MULTIPLE_REGISTERS_RESPONSE = 54;
	private final static int CALLBACK_MODBUS_SLAVE_READ_DISCRETE_INPUTS_REQUEST = 55;
	private final static int CALLBACK_MODBUS_MASTER_READ_DISCRETE_INPUTS_RESPONSE_LOW_LEVEL = 56;
	private final static int CALLBACK_MODBUS_SLAVE_READ_INPUT_REGISTERS_REQUEST = 57;
	private final static int CALLBACK_MODBUS_MASTER_READ_INPUT_REGISTERS_RESPONSE_LOW_LEVEL = 58;
	private final static int CALLBACK_READ = -41;
	private final static int CALLBACK_MODBUS_MASTER_READ_COILS_RESPONSE = -44;
	private final static int CALLBACK_MODBUS_MASTER_READ_HOLDING_REGISTERS_RESPONSE = -46;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_COILS_REQUEST = -51;
	private final static int CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_REGISTERS_REQUEST = -53;
	private final static int CALLBACK_MODBUS_MASTER_READ_DISCRETE_INPUTS_RESPONSE = -56;
	private final static int CALLBACK_MODBUS_MASTER_READ_INPUT_REGISTERS_RESPONSE = -58;

	public final static int PARITY_NONE = 0;
	public final static int PARITY_ODD = 1;
	public final static int PARITY_EVEN = 2;
	public final static int STOPBITS_1 = 1;
	public final static int STOPBITS_2 = 2;
	public final static int WORDLENGTH_5 = 5;
	public final static int WORDLENGTH_6 = 6;
	public final static int WORDLENGTH_7 = 7;
	public final static int WORDLENGTH_8 = 8;
	public final static int DUPLEX_HALF = 0;
	public final static int DUPLEX_FULL = 1;
	public final static int MODE_RS485 = 0;
	public final static int MODE_MODBUS_MASTER_RTU = 1;
	public final static int MODE_MODBUS_SLAVE_RTU = 2;
	public final static int COMMUNICATION_LED_CONFIG_OFF = 0;
	public final static int COMMUNICATION_LED_CONFIG_ON = 1;
	public final static int COMMUNICATION_LED_CONFIG_SHOW_HEARTBEAT = 2;
	public final static int COMMUNICATION_LED_CONFIG_SHOW_COMMUNICATION = 3;
	public final static int ERROR_LED_CONFIG_OFF = 0;
	public final static int ERROR_LED_CONFIG_ON = 1;
	public final static int ERROR_LED_CONFIG_SHOW_HEARTBEAT = 2;
	public final static int ERROR_LED_CONFIG_SHOW_ERROR = 3;
	public final static int EXCEPTION_CODE_TIMEOUT = -1;
	public final static int EXCEPTION_CODE_SUCCESS = 0;
	public final static int EXCEPTION_CODE_ILLEGAL_FUNCTION = 1;
	public final static int EXCEPTION_CODE_ILLEGAL_DATA_ADDRESS = 2;
	public final static int EXCEPTION_CODE_ILLEGAL_DATA_VALUE = 3;
	public final static int EXCEPTION_CODE_SLAVE_DEVICE_FAILURE = 4;
	public final static int EXCEPTION_CODE_ACKNOWLEDGE = 5;
	public final static int EXCEPTION_CODE_SLAVE_DEVICE_BUSY = 6;
	public final static int EXCEPTION_CODE_MEMORY_PARITY_ERROR = 8;
	public final static int EXCEPTION_CODE_GATEWAY_PATH_UNAVAILABLE = 10;
	public final static int EXCEPTION_CODE_GATEWAY_TARGET_DEVICE_FAILED_TO_RESPOND = 11;
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

	private List<ReadLowLevelListener> listenerReadLowLevel = new CopyOnWriteArrayList<ReadLowLevelListener>();
	private List<ErrorCountListener> listenerErrorCount = new CopyOnWriteArrayList<ErrorCountListener>();
	private List<ModbusSlaveReadCoilsRequestListener> listenerModbusSlaveReadCoilsRequest = new CopyOnWriteArrayList<ModbusSlaveReadCoilsRequestListener>();
	private List<ModbusMasterReadCoilsResponseLowLevelListener> listenerModbusMasterReadCoilsResponseLowLevel = new CopyOnWriteArrayList<ModbusMasterReadCoilsResponseLowLevelListener>();
	private List<ModbusSlaveReadHoldingRegistersRequestListener> listenerModbusSlaveReadHoldingRegistersRequest = new CopyOnWriteArrayList<ModbusSlaveReadHoldingRegistersRequestListener>();
	private List<ModbusMasterReadHoldingRegistersResponseLowLevelListener> listenerModbusMasterReadHoldingRegistersResponseLowLevel = new CopyOnWriteArrayList<ModbusMasterReadHoldingRegistersResponseLowLevelListener>();
	private List<ModbusSlaveWriteSingleCoilRequestListener> listenerModbusSlaveWriteSingleCoilRequest = new CopyOnWriteArrayList<ModbusSlaveWriteSingleCoilRequestListener>();
	private List<ModbusMasterWriteSingleCoilResponseListener> listenerModbusMasterWriteSingleCoilResponse = new CopyOnWriteArrayList<ModbusMasterWriteSingleCoilResponseListener>();
	private List<ModbusSlaveWriteSingleRegisterRequestListener> listenerModbusSlaveWriteSingleRegisterRequest = new CopyOnWriteArrayList<ModbusSlaveWriteSingleRegisterRequestListener>();
	private List<ModbusMasterWriteSingleRegisterResponseListener> listenerModbusMasterWriteSingleRegisterResponse = new CopyOnWriteArrayList<ModbusMasterWriteSingleRegisterResponseListener>();
	private List<ModbusSlaveWriteMultipleCoilsRequestLowLevelListener> listenerModbusSlaveWriteMultipleCoilsRequestLowLevel = new CopyOnWriteArrayList<ModbusSlaveWriteMultipleCoilsRequestLowLevelListener>();
	private List<ModbusMasterWriteMultipleCoilsResponseListener> listenerModbusMasterWriteMultipleCoilsResponse = new CopyOnWriteArrayList<ModbusMasterWriteMultipleCoilsResponseListener>();
	private List<ModbusSlaveWriteMultipleRegistersRequestLowLevelListener> listenerModbusSlaveWriteMultipleRegistersRequestLowLevel = new CopyOnWriteArrayList<ModbusSlaveWriteMultipleRegistersRequestLowLevelListener>();
	private List<ModbusMasterWriteMultipleRegistersResponseListener> listenerModbusMasterWriteMultipleRegistersResponse = new CopyOnWriteArrayList<ModbusMasterWriteMultipleRegistersResponseListener>();
	private List<ModbusSlaveReadDiscreteInputsRequestListener> listenerModbusSlaveReadDiscreteInputsRequest = new CopyOnWriteArrayList<ModbusSlaveReadDiscreteInputsRequestListener>();
	private List<ModbusMasterReadDiscreteInputsResponseLowLevelListener> listenerModbusMasterReadDiscreteInputsResponseLowLevel = new CopyOnWriteArrayList<ModbusMasterReadDiscreteInputsResponseLowLevelListener>();
	private List<ModbusSlaveReadInputRegistersRequestListener> listenerModbusSlaveReadInputRegistersRequest = new CopyOnWriteArrayList<ModbusSlaveReadInputRegistersRequestListener>();
	private List<ModbusMasterReadInputRegistersResponseLowLevelListener> listenerModbusMasterReadInputRegistersResponseLowLevel = new CopyOnWriteArrayList<ModbusMasterReadInputRegistersResponseLowLevelListener>();
	private List<ReadListener> listenerRead = new CopyOnWriteArrayList<ReadListener>();
	private List<ModbusMasterReadCoilsResponseListener> listenerModbusMasterReadCoilsResponse = new CopyOnWriteArrayList<ModbusMasterReadCoilsResponseListener>();
	private List<ModbusMasterReadHoldingRegistersResponseListener> listenerModbusMasterReadHoldingRegistersResponse = new CopyOnWriteArrayList<ModbusMasterReadHoldingRegistersResponseListener>();
	private List<ModbusSlaveWriteMultipleCoilsRequestListener> listenerModbusSlaveWriteMultipleCoilsRequest = new CopyOnWriteArrayList<ModbusSlaveWriteMultipleCoilsRequestListener>();
	private List<ModbusSlaveWriteMultipleRegistersRequestListener> listenerModbusSlaveWriteMultipleRegistersRequest = new CopyOnWriteArrayList<ModbusSlaveWriteMultipleRegistersRequestListener>();
	private List<ModbusMasterReadDiscreteInputsResponseListener> listenerModbusMasterReadDiscreteInputsResponse = new CopyOnWriteArrayList<ModbusMasterReadDiscreteInputsResponseListener>();
	private List<ModbusMasterReadInputRegistersResponseListener> listenerModbusMasterReadInputRegistersResponse = new CopyOnWriteArrayList<ModbusMasterReadInputRegistersResponseListener>();

	public class ReadLowLevel {
		public int messageLength;
		public int messageChunkOffset;
		public char[] messageChunkData = new char[60];

		public String toString() {
			return "[" + "messageLength = " + messageLength + ", " + "messageChunkOffset = " + messageChunkOffset + ", " + "messageChunkData = " + Arrays.toString(messageChunkData) + "]";
		}
	}

	public class RS485Configuration {
		public long baudrate;
		public int parity;
		public int stopbits;
		public int wordlength;
		public int duplex;

		public String toString() {
			return "[" + "baudrate = " + baudrate + ", " + "parity = " + parity + ", " + "stopbits = " + stopbits + ", " + "wordlength = " + wordlength + ", " + "duplex = " + duplex + "]";
		}
	}

	public class ModbusConfiguration {
		public int slaveAddress;
		public long masterRequestTimeout;

		public String toString() {
			return "[" + "slaveAddress = " + slaveAddress + ", " + "masterRequestTimeout = " + masterRequestTimeout + "]";
		}
	}

	public class BufferConfig {
		public int sendBufferSize;
		public int receiveBufferSize;

		public String toString() {
			return "[" + "sendBufferSize = " + sendBufferSize + ", " + "receiveBufferSize = " + receiveBufferSize + "]";
		}
	}

	public class BufferStatus {
		public int sendBufferUsed;
		public int receiveBufferUsed;

		public String toString() {
			return "[" + "sendBufferUsed = " + sendBufferUsed + ", " + "receiveBufferUsed = " + receiveBufferUsed + "]";
		}
	}

	public class ErrorCount {
		public long overrunErrorCount;
		public long parityErrorCount;

		public String toString() {
			return "[" + "overrunErrorCount = " + overrunErrorCount + ", " + "parityErrorCount = " + parityErrorCount + "]";
		}
	}

	public class ModbusCommonErrorCount {
		public long timeoutErrorCount;
		public long checksumErrorCount;
		public long frameTooBigErrorCount;
		public long illegalFunctionErrorCount;
		public long illegalDataAddressErrorCount;
		public long illegalDataValueErrorCount;
		public long slaveDeviceFailureErrorCount;

		public String toString() {
			return "[" + "timeoutErrorCount = " + timeoutErrorCount + ", " + "checksumErrorCount = " + checksumErrorCount + ", " + "frameTooBigErrorCount = " + frameTooBigErrorCount + ", " + "illegalFunctionErrorCount = " + illegalFunctionErrorCount + ", " + "illegalDataAddressErrorCount = " + illegalDataAddressErrorCount + ", " + "illegalDataValueErrorCount = " + illegalDataValueErrorCount + ", " + "slaveDeviceFailureErrorCount = " + slaveDeviceFailureErrorCount + "]";
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

	public class Read {
		public char[] message = new char[-1];

		public Read(char[] message) {
			this.message = message;
		}

		public String toString() {
			return "[" + "message = " + Arrays.toString(message) + "]";
		}
	}

	/**
	 * This listener is called if new data is available.
	 * 
	 * To enable this listener, use {@link BrickletRS485#enableReadCallback()}.
	 */
	public interface ReadLowLevelListener extends DeviceListener {
		public void readLowLevel(int messageLength, int messageChunkOffset, char[] messageChunkData);
	}

	/**
	 * This listener is called if a new error occurs. It returns
	 * the current overrun and parity error count.
	 */
	public interface ErrorCountListener extends DeviceListener {
		public void errorCount(long overrunErrorCount, long parityErrorCount);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to read coils. The parameters are
	 * request ID of the request, the starting address and the number of coils to
	 * be read as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerReadCoilsRequest(int, boolean[])}.
	 */
	public interface ModbusSlaveReadCoilsRequestListener extends DeviceListener {
		public void modbusSlaveReadCoilsRequest(int requestID, long startingAddress, int count);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read coils.
	 * 
	 * The parameters are request ID
	 * of the request, exception code of the response and the data as received by the
	 * response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception code
	 * is greater than zero then the number represents a Modbus exception code. If it is
	 * less than zero then it represents other errors. For example, -1 indicates that
	 * the request timed out or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadCoilsResponseLowLevelListener extends DeviceListener {
		public void modbusMasterReadCoilsResponseLowLevel(int requestID, int exceptionCode, int coilsLength, int coilsChunkOffset, boolean[] coilsChunkData);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to read holding registers. The parameters
	 * are request ID of the request, the starting address and the number of holding
	 * registers to be read as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerReadHoldingRegistersRequest(int, int[])}.
	 */
	public interface ModbusSlaveReadHoldingRegistersRequestListener extends DeviceListener {
		public void modbusSlaveReadHoldingRegistersRequest(int requestID, long startingAddress, int count);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read holding registers.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timed out or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadHoldingRegistersResponseLowLevelListener extends DeviceListener {
		public void modbusMasterReadHoldingRegistersResponseLowLevel(int requestID, int exceptionCode, int holdingRegistersLength, int holdingRegistersChunkOffset, int[] holdingRegistersChunkData);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write a single coil. The parameters
	 * are request ID of the request, the coil address and the value of coil to be
	 * written as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteSingleCoilRequest(int)}.
	 */
	public interface ModbusSlaveWriteSingleCoilRequestListener extends DeviceListener {
		public void modbusSlaveWriteSingleCoilRequest(int requestID, long coilAddress, boolean coilValue);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to write a single coil.
	 * 
	 * The parameters are
	 * request ID of the request and exception code of the response.
	 * 
	 * Any non-zero exception code indicates a problem.
	 * If the exception code is greater than zero then the number represents a Modbus
	 * exception code. If it is less than zero then it represents other errors. For
	 * example, -1 indicates that the request timed out or that the master did not receive
	 * any valid response of the request within the master request timeout period as set
	 * by {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterWriteSingleCoilResponseListener extends DeviceListener {
		public void modbusMasterWriteSingleCoilResponse(int requestID, int exceptionCode);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write a single register. The parameters
	 * are request ID of the request, the register address and the register value to
	 * be written as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteSingleRegisterRequest(int)}.
	 */
	public interface ModbusSlaveWriteSingleRegisterRequestListener extends DeviceListener {
		public void modbusSlaveWriteSingleRegisterRequest(int requestID, long registerAddress, int registerValue);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to write a single register.
	 * 
	 * The parameters are
	 * request ID of the request and exception code of the response.
	 * 
	 * Any non-zero exception code
	 * indicates a problem. If the exception code is greater than zero then the number
	 * represents a Modbus exception code. If it is less than zero then it represents
	 * other errors. For example, -1 indicates that the request timed out or that the
	 * master did not receive any valid response of the request within the master request
	 * timeout period as set by {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterWriteSingleRegisterResponseListener extends DeviceListener {
		public void modbusMasterWriteSingleRegisterResponse(int requestID, int exceptionCode);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write multiple coils. The parameters
	 * are request ID of the request, the starting address and the data to be written as
	 * received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteMultipleCoilsRequest(int)}.
	 */
	public interface ModbusSlaveWriteMultipleCoilsRequestLowLevelListener extends DeviceListener {
		public void modbusSlaveWriteMultipleCoilsRequestLowLevel(int requestID, long startingAddress, int coilsLength, int coilsChunkOffset, boolean[] coilsChunkData);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read coils.
	 * 
	 * The parameters are
	 * request ID of the request and exception code of the response.
	 * 
	 * Any non-zero exception code
	 * indicates a problem. If the exception code is greater than zero then the number
	 * represents a Modbus exception code. If it is less than zero then it represents
	 * other errors. For example, -1 indicates that the request timedout or that the
	 * master did not receive any valid response of the request within the master request
	 * timeout period as set by {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterWriteMultipleCoilsResponseListener extends DeviceListener {
		public void modbusMasterWriteMultipleCoilsResponse(int requestID, int exceptionCode);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write multiple registers. The parameters
	 * are request ID of the request, the starting address and the data to be written as
	 * received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteMultipleRegistersRequest(int)}.
	 */
	public interface ModbusSlaveWriteMultipleRegistersRequestLowLevelListener extends DeviceListener {
		public void modbusSlaveWriteMultipleRegistersRequestLowLevel(int requestID, long startingAddress, int registersLength, int registersChunkOffset, int[] registersChunkData);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to write multiple registers.
	 * 
	 * The parameters
	 * are request ID of the request and exception code of the response.
	 * 
	 * Any non-zero
	 * exception code indicates a problem. If the exception code is greater than zero then
	 * the number represents a Modbus exception code. If it is less than zero then it
	 * represents other errors. For example, -1 indicates that the request timedout or
	 * that the master did not receive any valid response of the request within the master
	 * request timeout period as set by {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterWriteMultipleRegistersResponseListener extends DeviceListener {
		public void modbusMasterWriteMultipleRegistersResponse(int requestID, int exceptionCode);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to read discrete inputs. The parameters
	 * are request ID of the request, the starting address and the number of discrete
	 * inputs to be read as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerReadDiscreteInputsRequest(int, boolean[])}.
	 */
	public interface ModbusSlaveReadDiscreteInputsRequestListener extends DeviceListener {
		public void modbusSlaveReadDiscreteInputsRequest(int requestID, long startingAddress, int count);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read discrete inputs.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timedout or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadDiscreteInputsResponseLowLevelListener extends DeviceListener {
		public void modbusMasterReadDiscreteInputsResponseLowLevel(int requestID, int exceptionCode, int discreteInputsLength, int discreteInputsChunkOffset, boolean[] discreteInputsChunkData);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to read input registers. The parameters
	 * are request ID of the request, the starting address and the number of input
	 * registers to be read as received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerReadInputRegistersRequest(int, int[])}.
	 */
	public interface ModbusSlaveReadInputRegistersRequestListener extends DeviceListener {
		public void modbusSlaveReadInputRegistersRequest(int requestID, long startingAddress, int count);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read input registers.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timedout or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadInputRegistersResponseLowLevelListener extends DeviceListener {
		public void modbusMasterReadInputRegistersResponseLowLevel(int requestID, int exceptionCode, int inputRegistersLength, int inputRegistersChunkOffset, int[] inputRegistersChunkData);
	}

	/**
	 * This listener is called if new data is available.
	 * 
	 * To enable this listener, use {@link BrickletRS485#enableReadCallback()}.
	 */
	public interface ReadListener extends DeviceListener {
		public void read(char[] message);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read coils.
	 * 
	 * The parameters are request ID
	 * of the request, exception code of the response and the data as received by the
	 * response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception code
	 * is greater than zero then the number represents a Modbus exception code. If it is
	 * less than zero then it represents other errors. For example, -1 indicates that
	 * the request timed out or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadCoilsResponseListener extends DeviceListener {
		public void modbusMasterReadCoilsResponse(int requestID, int exceptionCode, boolean[] coils);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read holding registers.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timed out or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadHoldingRegistersResponseListener extends DeviceListener {
		public void modbusMasterReadHoldingRegistersResponse(int requestID, int exceptionCode, int[] holdingRegisters);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write multiple coils. The parameters
	 * are request ID of the request, the starting address and the data to be written as
	 * received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteMultipleCoilsRequest(int)}.
	 */
	public interface ModbusSlaveWriteMultipleCoilsRequestListener extends DeviceListener {
		public void modbusSlaveWriteMultipleCoilsRequest(int requestID, long startingAddress, boolean[] coils);
	}

	/**
	 * This listener is called only in Modbus slave mode when the slave receives a
	 * valid request from a Modbus master to write multiple registers. The parameters
	 * are request ID of the request, the starting address and the data to be written as
	 * received by the request.
	 * 
	 * To send a response of this request use {@link BrickletRS485#modbusSlaveAnswerWriteMultipleRegistersRequest(int)}.
	 */
	public interface ModbusSlaveWriteMultipleRegistersRequestListener extends DeviceListener {
		public void modbusSlaveWriteMultipleRegistersRequest(int requestID, long startingAddress, int[] registers);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read discrete inputs.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timedout or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadDiscreteInputsResponseListener extends DeviceListener {
		public void modbusMasterReadDiscreteInputsResponse(int requestID, int exceptionCode, boolean[] discreteInputs);
	}

	/**
	 * This listener is called only in Modbus master mode when the master receives a
	 * valid response of a request to read input registers.
	 * 
	 * The parameters are
	 * request ID of the request, exception code of the response and the data as received
	 * by the response.
	 * 
	 * Any non-zero exception code indicates a problem. If the exception
	 * code is greater than zero then the number represents a Modbus exception code. If
	 * it is less than zero then it represents other errors. For example, -1 indicates that
	 * the request timedout or that the master did not receive any valid response of the
	 * request within the master request timeout period as set by
	 * {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public interface ModbusMasterReadInputRegistersResponseListener extends DeviceListener {
		public void modbusMasterReadInputRegistersResponse(int requestID, int exceptionCode, int[] inputRegisters);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickletRS485(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 0;
		responseExpected[IPConnection.unsignedByte(FUNCTION_WRITE_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_READ_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_READ_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_READ_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_READ_CALLBACK_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MODBUS_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MODBUS_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_MODE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_COMMUNICATION_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_COMMUNICATION_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ERROR_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ERROR_LED_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_BUFFER_CONFIG)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_BUFFER_CONFIG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_BUFFER_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_ERROR_COUNT_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_ERROR_COUNT_CALLBACK)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_ERROR_COUNT_CALLBACK_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ERROR_COUNT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_MODBUS_COMMON_ERROR_COUNT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_REPORT_EXCEPTION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_READ_COILS_REQUEST_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_READ_COILS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_READ_HOLDING_REGISTERS_REQUEST_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_READ_HOLDING_REGISTERS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_COIL_REQUEST)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_WRITE_SINGLE_COIL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_REGISTER_REQUEST)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_WRITE_SINGLE_REGISTER)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_COILS_REQUEST)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_COILS_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_REGISTERS_REQUEST)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_REGISTERS_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_READ_DISCRETE_INPUTS_REQUEST_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_READ_DISCRETE_INPUTS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_SLAVE_ANSWER_READ_INPUT_REGISTERS_REQUEST_LOW_LEVEL)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_MODBUS_MASTER_READ_INPUT_REGISTERS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
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

		highLevelCallbacks[-CALLBACK_READ] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_READ_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int messageLength = IPConnection.unsignedShort(bb.getShort());
				int messageChunkOffset = IPConnection.unsignedShort(bb.getShort());
				char[] messageChunkData = new char[60];
				for (int i = 0; i < 60; i++) {
					messageChunkData[i] = (char)(bb.get());
				}

				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_READ];
				int messageChunkLength = Math.min(messageLength - messageChunkOffset, 60);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (messageChunkOffset == 0) { // stream starts
						highLevelCallback.data = new char[messageLength];
						highLevelCallback.length = messageChunkLength;

						System.arraycopy(messageChunkData, 0, (char[])highLevelCallback.data, 0, messageChunkLength);

						if (highLevelCallback.length >= messageLength) { // stream complete
							for (ReadListener listener: listenerRead) {
								listener.read((char[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (messageChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ReadListener listener: listenerRead) {
							listener.read((char[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(messageChunkData, 0, (char[])highLevelCallback.data, highLevelCallback.length, messageChunkLength);
						highLevelCallback.length += messageChunkLength;

						if (highLevelCallback.length >= messageLength) { // stream complete
							for (ReadListener listener: listenerRead) {
								listener.read((char[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ReadLowLevelListener listener: listenerReadLowLevel) {
					listener.readLowLevel(messageLength, messageChunkOffset, messageChunkData);
				}
			}
		};

		callbacks[CALLBACK_ERROR_COUNT] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				long overrunErrorCount = IPConnection.unsignedInt(bb.getInt());
				long parityErrorCount = IPConnection.unsignedInt(bb.getInt());

				for (ErrorCountListener listener: listenerErrorCount) {
					listener.errorCount(overrunErrorCount, parityErrorCount);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_READ_COILS_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int count = IPConnection.unsignedShort(bb.getShort());

				for (ModbusSlaveReadCoilsRequestListener listener: listenerModbusSlaveReadCoilsRequest) {
					listener.modbusSlaveReadCoilsRequest(requestID, startingAddress, count);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_COILS_RESPONSE] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_MASTER_READ_COILS_RESPONSE_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());
				int coilsLength = IPConnection.unsignedShort(bb.getShort());
				int coilsChunkOffset = IPConnection.unsignedShort(bb.getShort());
				byte[] coilsChunkDataBits = new byte[58];
				bb.get(coilsChunkDataBits);
				boolean[] coilsChunkData = new boolean[464];
				for (int i = 0; i < 464; i++) {
					coilsChunkData[i] = (coilsChunkDataBits[i / 8] & (1 << (i % 8))) != 0;
				}


				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_COILS_RESPONSE];
				int coilsChunkLength = Math.min(coilsLength - coilsChunkOffset, 464);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (coilsChunkOffset == 0) { // stream starts
						highLevelCallback.data = new boolean[coilsLength];
						highLevelCallback.length = coilsChunkLength;

						System.arraycopy(coilsChunkData, 0, (boolean[])highLevelCallback.data, 0, coilsChunkLength);

						if (highLevelCallback.length >= coilsLength) { // stream complete
							for (ModbusMasterReadCoilsResponseListener listener: listenerModbusMasterReadCoilsResponse) {
								listener.modbusMasterReadCoilsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (coilsChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusMasterReadCoilsResponseListener listener: listenerModbusMasterReadCoilsResponse) {
							listener.modbusMasterReadCoilsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(coilsChunkData, 0, (boolean[])highLevelCallback.data, highLevelCallback.length, coilsChunkLength);
						highLevelCallback.length += coilsChunkLength;

						if (highLevelCallback.length >= coilsLength) { // stream complete
							for (ModbusMasterReadCoilsResponseListener listener: listenerModbusMasterReadCoilsResponse) {
								listener.modbusMasterReadCoilsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusMasterReadCoilsResponseLowLevelListener listener: listenerModbusMasterReadCoilsResponseLowLevel) {
					listener.modbusMasterReadCoilsResponseLowLevel(requestID, exceptionCode, coilsLength, coilsChunkOffset, coilsChunkData);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_READ_HOLDING_REGISTERS_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int count = IPConnection.unsignedShort(bb.getShort());

				for (ModbusSlaveReadHoldingRegistersRequestListener listener: listenerModbusSlaveReadHoldingRegistersRequest) {
					listener.modbusSlaveReadHoldingRegistersRequest(requestID, startingAddress, count);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_HOLDING_REGISTERS_RESPONSE] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_MASTER_READ_HOLDING_REGISTERS_RESPONSE_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());
				int holdingRegistersLength = IPConnection.unsignedShort(bb.getShort());
				int holdingRegistersChunkOffset = IPConnection.unsignedShort(bb.getShort());
				int[] holdingRegistersChunkData = new int[29];
				for (int i = 0; i < 29; i++) {
					holdingRegistersChunkData[i] = IPConnection.unsignedShort(bb.getShort());
				}

				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_HOLDING_REGISTERS_RESPONSE];
				int holdingRegistersChunkLength = Math.min(holdingRegistersLength - holdingRegistersChunkOffset, 29);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (holdingRegistersChunkOffset == 0) { // stream starts
						highLevelCallback.data = new int[holdingRegistersLength];
						highLevelCallback.length = holdingRegistersChunkLength;

						System.arraycopy(holdingRegistersChunkData, 0, (int[])highLevelCallback.data, 0, holdingRegistersChunkLength);

						if (highLevelCallback.length >= holdingRegistersLength) { // stream complete
							for (ModbusMasterReadHoldingRegistersResponseListener listener: listenerModbusMasterReadHoldingRegistersResponse) {
								listener.modbusMasterReadHoldingRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (holdingRegistersChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusMasterReadHoldingRegistersResponseListener listener: listenerModbusMasterReadHoldingRegistersResponse) {
							listener.modbusMasterReadHoldingRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(holdingRegistersChunkData, 0, (int[])highLevelCallback.data, highLevelCallback.length, holdingRegistersChunkLength);
						highLevelCallback.length += holdingRegistersChunkLength;

						if (highLevelCallback.length >= holdingRegistersLength) { // stream complete
							for (ModbusMasterReadHoldingRegistersResponseListener listener: listenerModbusMasterReadHoldingRegistersResponse) {
								listener.modbusMasterReadHoldingRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusMasterReadHoldingRegistersResponseLowLevelListener listener: listenerModbusMasterReadHoldingRegistersResponseLowLevel) {
					listener.modbusMasterReadHoldingRegistersResponseLowLevel(requestID, exceptionCode, holdingRegistersLength, holdingRegistersChunkOffset, holdingRegistersChunkData);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_WRITE_SINGLE_COIL_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long coilAddress = IPConnection.unsignedInt(bb.getInt());
				boolean coilValue = (bb.get()) != 0;

				for (ModbusSlaveWriteSingleCoilRequestListener listener: listenerModbusSlaveWriteSingleCoilRequest) {
					listener.modbusSlaveWriteSingleCoilRequest(requestID, coilAddress, coilValue);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_MASTER_WRITE_SINGLE_COIL_RESPONSE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());

				for (ModbusMasterWriteSingleCoilResponseListener listener: listenerModbusMasterWriteSingleCoilResponse) {
					listener.modbusMasterWriteSingleCoilResponse(requestID, exceptionCode);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_WRITE_SINGLE_REGISTER_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long registerAddress = IPConnection.unsignedInt(bb.getInt());
				int registerValue = IPConnection.unsignedShort(bb.getShort());

				for (ModbusSlaveWriteSingleRegisterRequestListener listener: listenerModbusSlaveWriteSingleRegisterRequest) {
					listener.modbusSlaveWriteSingleRegisterRequest(requestID, registerAddress, registerValue);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_MASTER_WRITE_SINGLE_REGISTER_RESPONSE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());

				for (ModbusMasterWriteSingleRegisterResponseListener listener: listenerModbusMasterWriteSingleRegisterResponse) {
					listener.modbusMasterWriteSingleRegisterResponse(requestID, exceptionCode);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_COILS_REQUEST] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_COILS_REQUEST_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int coilsLength = IPConnection.unsignedShort(bb.getShort());
				int coilsChunkOffset = IPConnection.unsignedShort(bb.getShort());
				byte[] coilsChunkDataBits = new byte[55];
				bb.get(coilsChunkDataBits);
				boolean[] coilsChunkData = new boolean[440];
				for (int i = 0; i < 440; i++) {
					coilsChunkData[i] = (coilsChunkDataBits[i / 8] & (1 << (i % 8))) != 0;
				}


				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_COILS_REQUEST];
				int coilsChunkLength = Math.min(coilsLength - coilsChunkOffset, 440);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (coilsChunkOffset == 0) { // stream starts
						highLevelCallback.data = new boolean[coilsLength];
						highLevelCallback.length = coilsChunkLength;

						System.arraycopy(coilsChunkData, 0, (boolean[])highLevelCallback.data, 0, coilsChunkLength);

						if (highLevelCallback.length >= coilsLength) { // stream complete
							for (ModbusSlaveWriteMultipleCoilsRequestListener listener: listenerModbusSlaveWriteMultipleCoilsRequest) {
								listener.modbusSlaveWriteMultipleCoilsRequest(requestID, startingAddress, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (coilsChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusSlaveWriteMultipleCoilsRequestListener listener: listenerModbusSlaveWriteMultipleCoilsRequest) {
							listener.modbusSlaveWriteMultipleCoilsRequest(requestID, startingAddress, (boolean[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(coilsChunkData, 0, (boolean[])highLevelCallback.data, highLevelCallback.length, coilsChunkLength);
						highLevelCallback.length += coilsChunkLength;

						if (highLevelCallback.length >= coilsLength) { // stream complete
							for (ModbusSlaveWriteMultipleCoilsRequestListener listener: listenerModbusSlaveWriteMultipleCoilsRequest) {
								listener.modbusSlaveWriteMultipleCoilsRequest(requestID, startingAddress, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusSlaveWriteMultipleCoilsRequestLowLevelListener listener: listenerModbusSlaveWriteMultipleCoilsRequestLowLevel) {
					listener.modbusSlaveWriteMultipleCoilsRequestLowLevel(requestID, startingAddress, coilsLength, coilsChunkOffset, coilsChunkData);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_MASTER_WRITE_MULTIPLE_COILS_RESPONSE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());

				for (ModbusMasterWriteMultipleCoilsResponseListener listener: listenerModbusMasterWriteMultipleCoilsResponse) {
					listener.modbusMasterWriteMultipleCoilsResponse(requestID, exceptionCode);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_REGISTERS_REQUEST] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_REGISTERS_REQUEST_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int registersLength = IPConnection.unsignedShort(bb.getShort());
				int registersChunkOffset = IPConnection.unsignedShort(bb.getShort());
				int[] registersChunkData = new int[27];
				for (int i = 0; i < 27; i++) {
					registersChunkData[i] = IPConnection.unsignedShort(bb.getShort());
				}

				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_SLAVE_WRITE_MULTIPLE_REGISTERS_REQUEST];
				int registersChunkLength = Math.min(registersLength - registersChunkOffset, 27);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (registersChunkOffset == 0) { // stream starts
						highLevelCallback.data = new int[registersLength];
						highLevelCallback.length = registersChunkLength;

						System.arraycopy(registersChunkData, 0, (int[])highLevelCallback.data, 0, registersChunkLength);

						if (highLevelCallback.length >= registersLength) { // stream complete
							for (ModbusSlaveWriteMultipleRegistersRequestListener listener: listenerModbusSlaveWriteMultipleRegistersRequest) {
								listener.modbusSlaveWriteMultipleRegistersRequest(requestID, startingAddress, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (registersChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusSlaveWriteMultipleRegistersRequestListener listener: listenerModbusSlaveWriteMultipleRegistersRequest) {
							listener.modbusSlaveWriteMultipleRegistersRequest(requestID, startingAddress, (int[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(registersChunkData, 0, (int[])highLevelCallback.data, highLevelCallback.length, registersChunkLength);
						highLevelCallback.length += registersChunkLength;

						if (highLevelCallback.length >= registersLength) { // stream complete
							for (ModbusSlaveWriteMultipleRegistersRequestListener listener: listenerModbusSlaveWriteMultipleRegistersRequest) {
								listener.modbusSlaveWriteMultipleRegistersRequest(requestID, startingAddress, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusSlaveWriteMultipleRegistersRequestLowLevelListener listener: listenerModbusSlaveWriteMultipleRegistersRequestLowLevel) {
					listener.modbusSlaveWriteMultipleRegistersRequestLowLevel(requestID, startingAddress, registersLength, registersChunkOffset, registersChunkData);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_MASTER_WRITE_MULTIPLE_REGISTERS_RESPONSE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());

				for (ModbusMasterWriteMultipleRegistersResponseListener listener: listenerModbusMasterWriteMultipleRegistersResponse) {
					listener.modbusMasterWriteMultipleRegistersResponse(requestID, exceptionCode);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_READ_DISCRETE_INPUTS_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int count = IPConnection.unsignedShort(bb.getShort());

				for (ModbusSlaveReadDiscreteInputsRequestListener listener: listenerModbusSlaveReadDiscreteInputsRequest) {
					listener.modbusSlaveReadDiscreteInputsRequest(requestID, startingAddress, count);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_DISCRETE_INPUTS_RESPONSE] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_MASTER_READ_DISCRETE_INPUTS_RESPONSE_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());
				int discreteInputsLength = IPConnection.unsignedShort(bb.getShort());
				int discreteInputsChunkOffset = IPConnection.unsignedShort(bb.getShort());
				byte[] discreteInputsChunkDataBits = new byte[58];
				bb.get(discreteInputsChunkDataBits);
				boolean[] discreteInputsChunkData = new boolean[464];
				for (int i = 0; i < 464; i++) {
					discreteInputsChunkData[i] = (discreteInputsChunkDataBits[i / 8] & (1 << (i % 8))) != 0;
				}


				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_DISCRETE_INPUTS_RESPONSE];
				int discreteInputsChunkLength = Math.min(discreteInputsLength - discreteInputsChunkOffset, 464);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (discreteInputsChunkOffset == 0) { // stream starts
						highLevelCallback.data = new boolean[discreteInputsLength];
						highLevelCallback.length = discreteInputsChunkLength;

						System.arraycopy(discreteInputsChunkData, 0, (boolean[])highLevelCallback.data, 0, discreteInputsChunkLength);

						if (highLevelCallback.length >= discreteInputsLength) { // stream complete
							for (ModbusMasterReadDiscreteInputsResponseListener listener: listenerModbusMasterReadDiscreteInputsResponse) {
								listener.modbusMasterReadDiscreteInputsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (discreteInputsChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusMasterReadDiscreteInputsResponseListener listener: listenerModbusMasterReadDiscreteInputsResponse) {
							listener.modbusMasterReadDiscreteInputsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(discreteInputsChunkData, 0, (boolean[])highLevelCallback.data, highLevelCallback.length, discreteInputsChunkLength);
						highLevelCallback.length += discreteInputsChunkLength;

						if (highLevelCallback.length >= discreteInputsLength) { // stream complete
							for (ModbusMasterReadDiscreteInputsResponseListener listener: listenerModbusMasterReadDiscreteInputsResponse) {
								listener.modbusMasterReadDiscreteInputsResponse(requestID, exceptionCode, (boolean[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusMasterReadDiscreteInputsResponseLowLevelListener listener: listenerModbusMasterReadDiscreteInputsResponseLowLevel) {
					listener.modbusMasterReadDiscreteInputsResponseLowLevel(requestID, exceptionCode, discreteInputsLength, discreteInputsChunkOffset, discreteInputsChunkData);
				}
			}
		};

		callbacks[CALLBACK_MODBUS_SLAVE_READ_INPUT_REGISTERS_REQUEST] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				long startingAddress = IPConnection.unsignedInt(bb.getInt());
				int count = IPConnection.unsignedShort(bb.getShort());

				for (ModbusSlaveReadInputRegistersRequestListener listener: listenerModbusSlaveReadInputRegistersRequest) {
					listener.modbusSlaveReadInputRegistersRequest(requestID, startingAddress, count);
				}
			}
		};

		highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_INPUT_REGISTERS_RESPONSE] = new IPConnection.DeviceHighLevelCallback();
		callbacks[CALLBACK_MODBUS_MASTER_READ_INPUT_REGISTERS_RESPONSE_LOW_LEVEL] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int requestID = IPConnection.unsignedByte(bb.get());
				int exceptionCode = (bb.get());
				int inputRegistersLength = IPConnection.unsignedShort(bb.getShort());
				int inputRegistersChunkOffset = IPConnection.unsignedShort(bb.getShort());
				int[] inputRegistersChunkData = new int[29];
				for (int i = 0; i < 29; i++) {
					inputRegistersChunkData[i] = IPConnection.unsignedShort(bb.getShort());
				}

				IPConnection.DeviceHighLevelCallback highLevelCallback = highLevelCallbacks[-CALLBACK_MODBUS_MASTER_READ_INPUT_REGISTERS_RESPONSE];
				int inputRegistersChunkLength = Math.min(inputRegistersLength - inputRegistersChunkOffset, 29);

				if (highLevelCallback.data == null) { // no stream in-progress
					if (inputRegistersChunkOffset == 0) { // stream starts
						highLevelCallback.data = new int[inputRegistersLength];
						highLevelCallback.length = inputRegistersChunkLength;

						System.arraycopy(inputRegistersChunkData, 0, (int[])highLevelCallback.data, 0, inputRegistersChunkLength);

						if (highLevelCallback.length >= inputRegistersLength) { // stream complete
							for (ModbusMasterReadInputRegistersResponseListener listener: listenerModbusMasterReadInputRegistersResponse) {
								listener.modbusMasterReadInputRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					} else { // ignore tail of current stream, wait for next stream start
					}
				} else { // stream in-progress
					if (inputRegistersChunkOffset != highLevelCallback.length) { // stream out-of-sync
						highLevelCallback.data = null;
						highLevelCallback.length = 0;

						for (ModbusMasterReadInputRegistersResponseListener listener: listenerModbusMasterReadInputRegistersResponse) {
							listener.modbusMasterReadInputRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
						}
					} else { // stream in-sync
						System.arraycopy(inputRegistersChunkData, 0, (int[])highLevelCallback.data, highLevelCallback.length, inputRegistersChunkLength);
						highLevelCallback.length += inputRegistersChunkLength;

						if (highLevelCallback.length >= inputRegistersLength) { // stream complete
							for (ModbusMasterReadInputRegistersResponseListener listener: listenerModbusMasterReadInputRegistersResponse) {
								listener.modbusMasterReadInputRegistersResponse(requestID, exceptionCode, (int[])highLevelCallback.data);
							}

							highLevelCallback.data = null;
							highLevelCallback.length = 0;
						}
					}
				}

				for (ModbusMasterReadInputRegistersResponseLowLevelListener listener: listenerModbusMasterReadInputRegistersResponseLowLevel) {
					listener.modbusMasterReadInputRegistersResponseLowLevel(requestID, exceptionCode, inputRegistersLength, inputRegistersChunkOffset, inputRegistersChunkData);
				}
			}
		};
	}

	/**
	 * Writes characters to the RS485 interface. The characters can be binary data,
	 * ASCII or similar is not necessary.
	 * 
	 * The return value is the number of characters that were written.
	 * 
	 * See {@link BrickletRS485#setRS485Configuration(long, int, int, int, int)} for configuration possibilities
	 * regarding baudrate, parity and so on.
	 */
	public int writeLowLevel(int messageLength, int messageChunkOffset, char[] messageChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_WRITE_LOW_LEVEL, this);

		bb.putShort((short)messageLength);
		bb.putShort((short)messageChunkOffset);
		for (int i = 0; i < 60; i++) {
			bb.put((byte)messageChunkData[i]);
		}

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int messageChunkWritten = IPConnection.unsignedByte(bb.get());

		return messageChunkWritten;
	}

	/**
	 * Returns up to *length* characters from receive buffer.
	 * 
	 * Instead of polling with this function, you can also use
	 * callbacks. But note that this function will return available
	 * data only when the read listener is disabled.
	 * See {@link BrickletRS485#enableReadCallback()} and {@link BrickletRS485.ReadListener} listener.
	 */
	public ReadLowLevel readLowLevel(int length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_READ_LOW_LEVEL, this);

		bb.putShort((short)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ReadLowLevel obj = new ReadLowLevel();
		obj.messageLength = IPConnection.unsignedShort(bb.getShort());
		obj.messageChunkOffset = IPConnection.unsignedShort(bb.getShort());
		for (int i = 0; i < 60; i++) {
			obj.messageChunkData[i] = (char)(bb.get());
		}

		return obj;
	}

	/**
	 * Enables the {@link BrickletRS485.ReadListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void enableReadCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_READ_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the {@link BrickletRS485.ReadListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void disableReadCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_READ_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the {@link BrickletRS485.ReadListener} listener is enabled,
	 * *false* otherwise.
	 */
	public boolean isReadCallbackEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_READ_CALLBACK_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Sets the configuration for the RS485 communication. Available options:
	 * 
	 * * Baudrate between 100 and 2000000 baud.
	 * * Parity of none, odd or even.
	 * * Stopbits can be 1 or 2.
	 * * Word length of 5 to 8.
	 * * Half- or Full-Duplex.
	 * 
	 * The default is: 115200 baud, parity none, 1 stop bit, word length 8, half duplex.
	 */
	public void setRS485Configuration(long baudrate, int parity, int stopbits, int wordlength, int duplex) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)16, FUNCTION_SET_RS485_CONFIGURATION, this);

		bb.putInt((int)baudrate);
		bb.put((byte)parity);
		bb.put((byte)stopbits);
		bb.put((byte)wordlength);
		bb.put((byte)duplex);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletRS485#setRS485Configuration(long, int, int, int, int)}.
	 */
	public RS485Configuration getRS485Configuration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_RS485_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		RS485Configuration obj = new RS485Configuration();
		obj.baudrate = IPConnection.unsignedInt(bb.getInt());
		obj.parity = IPConnection.unsignedByte(bb.get());
		obj.stopbits = IPConnection.unsignedByte(bb.get());
		obj.wordlength = IPConnection.unsignedByte(bb.get());
		obj.duplex = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the configuration for the RS485 Modbus communication. Available options:
	 * 
	 * * Slave Address: Address to be used as the Modbus slave address in Modbus slave mode. Valid Modbus slave address range is 1 to 247.
	 * * Master Request Timeout: Specifies how long the master should wait for a response from a slave in milliseconds when in Modbus master mode.
	 * 
	 * The default is: Slave Address = 1 and Master Request Timeout = 1000 milliseconds (1 second).
	 */
	public void setModbusConfiguration(int slaveAddress, long masterRequestTimeout) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_MODBUS_CONFIGURATION, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)masterRequestTimeout);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletRS485#setModbusConfiguration(int, long)}.
	 */
	public ModbusConfiguration getModbusConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MODBUS_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ModbusConfiguration obj = new ModbusConfiguration();
		obj.slaveAddress = IPConnection.unsignedByte(bb.get());
		obj.masterRequestTimeout = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Sets the mode of the Bricklet in which it operates. Available options are
	 * 
	 * * RS485,
	 * * Modbus Master RTU and
	 * * Modbus Slave RTU.
	 * 
	 * The default is: RS485 mode.
	 */
	public void setMode(int mode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_MODE, this);

		bb.put((byte)mode);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletRS485#setMode(int)}.
	 */
	public int getMode() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MODE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int mode = IPConnection.unsignedByte(bb.get());

		return mode;
	}

	/**
	 * Sets the communication LED configuration. By default the LED shows
	 * communication traffic, it flickers once for every 10 received data packets.
	 * 
	 * You can also turn the LED permanently on/off or show a heartbeat.
	 * 
	 * If the Bricklet is in bootloader mode, the LED is off.
	 */
	public void setCommunicationLEDConfig(int config) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_COMMUNICATION_LED_CONFIG, this);

		bb.put((byte)config);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletRS485#setCommunicationLEDConfig(int)}
	 */
	public int getCommunicationLEDConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_COMMUNICATION_LED_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int config = IPConnection.unsignedByte(bb.get());

		return config;
	}

	/**
	 * Sets the error LED configuration.
	 * 
	 * By default the error LED turns on if there is any error (see {@link BrickletRS485.ErrorCountListener}
	 * callback). If you call this function with the SHOW ERROR option again, the LED
	 * will turn off until the next error occurs.
	 * 
	 * You can also turn the LED permanently on/off or show a heartbeat.
	 * 
	 * If the Bricklet is in bootloader mode, the LED is off.
	 */
	public void setErrorLEDConfig(int config) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_ERROR_LED_CONFIG, this);

		bb.put((byte)config);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickletRS485#setErrorLEDConfig(int)}.
	 */
	public int getErrorLEDConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ERROR_LED_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int config = IPConnection.unsignedByte(bb.get());

		return config;
	}

	/**
	 * Sets the send and receive buffer size in byte. In sum there is
	 * 10240 byte (10kb) buffer available and the minimum buffer size
	 * is 1024 byte (1kb) for both.
	 * 
	 * The current buffer content is lost if this function is called.
	 * 
	 * The send buffer holds data that is given by {@link BrickletRS485#write(char[])} and
	 * can not be written yet. The receive buffer holds data that is
	 * received through RS485 but could not yet be send to the
	 * user, either by {@link BrickletRS485#read(int)} or through {@link BrickletRS485.ReadListener} listener.
	 * 
	 * The default configuration is 5120 byte (5kb) per buffer.
	 */
	public void setBufferConfig(int sendBufferSize, int receiveBufferSize) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_BUFFER_CONFIG, this);

		bb.putShort((short)sendBufferSize);
		bb.putShort((short)receiveBufferSize);

		sendRequest(bb.array());
	}

	/**
	 * Returns the buffer configuration as set by {@link BrickletRS485#setBufferConfig(int, int)}.
	 */
	public BufferConfig getBufferConfig() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_BUFFER_CONFIG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		BufferConfig obj = new BufferConfig();
		obj.sendBufferSize = IPConnection.unsignedShort(bb.getShort());
		obj.receiveBufferSize = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Returns the currently used bytes for the send and received buffer.
	 * 
	 * See {@link BrickletRS485#setBufferConfig(int, int)} for buffer size configuration.
	 */
	public BufferStatus getBufferStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_BUFFER_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		BufferStatus obj = new BufferStatus();
		obj.sendBufferUsed = IPConnection.unsignedShort(bb.getShort());
		obj.receiveBufferUsed = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Enables the {@link BrickletRS485.ErrorCountListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void enableErrorCountCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_ERROR_COUNT_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Disables the {@link BrickletRS485.ErrorCountListener} listener.
	 * 
	 * By default the listener is disabled.
	 */
	public void disableErrorCountCallback() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_ERROR_COUNT_CALLBACK, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the {@link BrickletRS485.ErrorCountListener} listener is enabled,
	 * *false* otherwise.
	 */
	public boolean isErrorCountCallbackEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_ERROR_COUNT_CALLBACK_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Returns the current number of overrun and parity errors.
	 */
	public ErrorCount getErrorCount() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ERROR_COUNT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ErrorCount obj = new ErrorCount();
		obj.overrunErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.parityErrorCount = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Returns the current number of errors occurred in Modbus mode.
	 * 
	 * * Timeout Error Count: Number of timeouts occurred.
	 * * Checksum Error Count: Number of failures due to Modbus frame CRC16 checksum mismatch.
	 * * Frame Too Big Error Count: Number of times frames were rejected because they exceeded maximum Modbus frame size which is 256 bytes.
	 * * Illegal Function Error Count: Number of errors when an unimplemented or illegal function is requested. This corresponds to Modbus exception code 1.
	 * * Illegal Data Address Error Count: Number of errors due to invalid data address. This corresponds to Modbus exception code 2.
	 * * Illegal Data Value Error Count: Number of errors due to invalid data value. This corresponds to Modbus exception code 3.
	 * * Slave Device Failure Error Count: Number of errors occurred on the slave device which were unrecoverable. This corresponds to Modbus exception code 4.
	 */
	public ModbusCommonErrorCount getModbusCommonErrorCount() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_MODBUS_COMMON_ERROR_COUNT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ModbusCommonErrorCount obj = new ModbusCommonErrorCount();
		obj.timeoutErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.checksumErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.frameTooBigErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.illegalFunctionErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.illegalDataAddressErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.illegalDataValueErrorCount = IPConnection.unsignedInt(bb.getInt());
		obj.slaveDeviceFailureErrorCount = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * In Modbus slave mode this function can be used to report a Modbus exception for
	 * a Modbus master request.
	 * 
	 * * Request ID: Request ID of the request received by the slave.
	 * * Exception Code: Modbus exception code to report to the Modbus master.
	 */
	public void modbusSlaveReportException(int requestID, int exceptionCode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_MODBUS_SLAVE_REPORT_EXCEPTION, this);

		bb.put((byte)requestID);
		bb.put((byte)exceptionCode);

		sendRequest(bb.array());
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read coils.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Coils: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadCoilsRequestListener} listener
	 * with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadCoilsRequestLowLevel(int requestID, int coilsLength, int coilsChunkOffset, boolean[] coilsChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_MODBUS_SLAVE_ANSWER_READ_COILS_REQUEST_LOW_LEVEL, this);

		bb.put((byte)requestID);
		bb.putShort((short)coilsLength);
		bb.putShort((short)coilsChunkOffset);

		byte[] coilsChunkDataBits = new byte[59];
		Arrays.fill(coilsChunkDataBits, (byte)0);

		for (int i = 0; i < 472; i++) {
			if (coilsChunkData[i]) {
				coilsChunkDataBits[i / 8] |= 1 << (i % 8);
			}
		}
		for (int i = 0; i < 59; i++) {
			bb.put(coilsChunkDataBits[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to read coils from a slave. This
	 * function creates a Modbus function code 1 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the read.
	 * * Count: Number of coils to read.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterReadCoilsResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be
	 * matched with the Request ID returned from this function to verify that the listener
	 * is indeed for a particular request.
	 */
	public int modbusMasterReadCoils(int slaveAddress, long startingAddress, int count) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_MODBUS_MASTER_READ_COILS, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)count);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read holding registers.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Holding Registers: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadHoldingRegistersRequestListener}
	 * listener with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadHoldingRegistersRequestLowLevel(int requestID, int holdingRegistersLength, int holdingRegistersChunkOffset, int[] holdingRegistersChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)71, FUNCTION_MODBUS_SLAVE_ANSWER_READ_HOLDING_REGISTERS_REQUEST_LOW_LEVEL, this);

		bb.put((byte)requestID);
		bb.putShort((short)holdingRegistersLength);
		bb.putShort((short)holdingRegistersChunkOffset);
		for (int i = 0; i < 29; i++) {
			bb.putShort((short)holdingRegistersChunkData[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to read holding registers from a slave.
	 * This function creates a Modbus function code 3 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the read.
	 * * Count: Number of holding registers to read.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterReadHoldingRegistersResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterReadHoldingRegisters(int slaveAddress, long startingAddress, int count) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_MODBUS_MASTER_READ_HOLDING_REGISTERS, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)count);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * write a single coil.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveWriteSingleCoilRequestListener}
	 * listener with the Request ID as provided by the arguments of the listener.
	 */
	public void modbusSlaveAnswerWriteSingleCoilRequest(int requestID) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_COIL_REQUEST, this);

		bb.put((byte)requestID);

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to write a single coil of a slave.
	 * This function creates a Modbus function code 5 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Coil Address: Address of the coil.
	 * * Coil Value: Value to be written.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteSingleCoilResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteSingleCoil(int slaveAddress, long coilAddress, boolean coilValue) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)14, FUNCTION_MODBUS_MASTER_WRITE_SINGLE_COIL, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)coilAddress);
		bb.put((byte)(coilValue ? 1 : 0));

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * write a single register.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveWriteSingleRegisterRequestListener}
	 * listener with the Request ID, Register Address and Register Value as provided by
	 * the arguments of the listener.
	 */
	public void modbusSlaveAnswerWriteSingleRegisterRequest(int requestID) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_SINGLE_REGISTER_REQUEST, this);

		bb.put((byte)requestID);

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to write a single register of a
	 * slave. This function creates a Modbus function code 6 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Register Address: Address of the register.
	 * * Register Value: Value to be written.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteSingleRegisterResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteSingleRegister(int slaveAddress, long registerAddress, int registerValue) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_MODBUS_MASTER_WRITE_SINGLE_REGISTER, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)registerAddress);
		bb.putShort((short)registerValue);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * write multiple coils.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveWriteMultipleCoilsRequestListener}
	 * listener with the Request ID of the listener.
	 */
	public void modbusSlaveAnswerWriteMultipleCoilsRequest(int requestID) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_COILS_REQUEST, this);

		bb.put((byte)requestID);

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to write multiple coils of a slave.
	 * This function creates a Modbus function code 15 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the write.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteMultipleCoilsResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteMultipleCoilsLowLevel(int slaveAddress, long startingAddress, int coilsLength, int coilsChunkOffset, boolean[] coilsChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_COILS_LOW_LEVEL, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)coilsLength);
		bb.putShort((short)coilsChunkOffset);

		byte[] coilsChunkDataBits = new byte[55];
		Arrays.fill(coilsChunkDataBits, (byte)0);

		for (int i = 0; i < 440; i++) {
			if (coilsChunkData[i]) {
				coilsChunkDataBits[i / 8] |= 1 << (i % 8);
			}
		}
		for (int i = 0; i < 55; i++) {
			bb.put(coilsChunkDataBits[i]);
		}

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * write multiple registers.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveWriteMultipleRegistersRequestListener}
	 * listener with the Request ID of the listener.
	 */
	public void modbusSlaveAnswerWriteMultipleRegistersRequest(int requestID) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_MODBUS_SLAVE_ANSWER_WRITE_MULTIPLE_REGISTERS_REQUEST, this);

		bb.put((byte)requestID);

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to write multiple registers of a slave.
	 * This function creates a Modbus function code 16 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting Address of the write.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteMultipleRegistersResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteMultipleRegistersLowLevel(int slaveAddress, long startingAddress, int registersLength, int registersChunkOffset, int[] registersChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)71, FUNCTION_MODBUS_MASTER_WRITE_MULTIPLE_REGISTERS_LOW_LEVEL, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)registersLength);
		bb.putShort((short)registersChunkOffset);
		for (int i = 0; i < 27; i++) {
			bb.putShort((short)registersChunkData[i]);
		}

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read discrete inputs.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Discrete Inputs: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadDiscreteInputsRequestListener}
	 * listener with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadDiscreteInputsRequestLowLevel(int requestID, int discreteInputsLength, int discreteInputsChunkOffset, boolean[] discreteInputsChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_MODBUS_SLAVE_ANSWER_READ_DISCRETE_INPUTS_REQUEST_LOW_LEVEL, this);

		bb.put((byte)requestID);
		bb.putShort((short)discreteInputsLength);
		bb.putShort((short)discreteInputsChunkOffset);

		byte[] discreteInputsChunkDataBits = new byte[59];
		Arrays.fill(discreteInputsChunkDataBits, (byte)0);

		for (int i = 0; i < 472; i++) {
			if (discreteInputsChunkData[i]) {
				discreteInputsChunkDataBits[i / 8] |= 1 << (i % 8);
			}
		}
		for (int i = 0; i < 59; i++) {
			bb.put(discreteInputsChunkDataBits[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to read discrete inputs from a slave.
	 * This function creates a Modbus function code 2 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the read.
	 * * Count: Number of discrete inputs to read.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterReadDiscreteInputsResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterReadDiscreteInputs(int slaveAddress, long startingAddress, int count) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_MODBUS_MASTER_READ_DISCRETE_INPUTS, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)count);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read input registers.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Input Registers: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadInputRegistersRequestListener} listener
	 * with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadInputRegistersRequestLowLevel(int requestID, int inputRegistersLength, int inputRegistersChunkOffset, int[] inputRegistersChunkData) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)71, FUNCTION_MODBUS_SLAVE_ANSWER_READ_INPUT_REGISTERS_REQUEST_LOW_LEVEL, this);

		bb.put((byte)requestID);
		bb.putShort((short)inputRegistersLength);
		bb.putShort((short)inputRegistersChunkOffset);
		for (int i = 0; i < 29; i++) {
			bb.putShort((short)inputRegistersChunkData[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * In Modbus master mode this function can be used to read input registers from a slave.
	 * This function creates a Modbus function code 4 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the read.
	 * * Count: Number of input registers to read.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterReadInputRegistersResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterReadInputRegisters(int slaveAddress, long startingAddress, int count) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)15, FUNCTION_MODBUS_MASTER_READ_INPUT_REGISTERS, this);

		bb.put((byte)slaveAddress);
		bb.putInt((int)startingAddress);
		bb.putShort((short)count);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int requestID = IPConnection.unsignedByte(bb.get());

		return requestID;
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
	 * Returns the current bootloader mode, see {@link BrickletRS485#setBootloaderMode(int)}.
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
	 * {@link BrickletRS485#setWriteFirmwarePointer(long)} before. The firmware is written
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
	 * Returns the configuration as set by {@link BrickletRS485#setStatusLEDConfig(int)}
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
	 * Writes characters to the RS485 interface. The characters can be binary data,
	 * ASCII or similar is not necessary.
	 * 
	 * The return value is the number of characters that were written.
	 * 
	 * See {@link BrickletRS485#setRS485Configuration(long, int, int, int, int)} for configuration possibilities
	 * regarding baudrate, parity and so on.
	 */
	public int write(char[] message) throws TimeoutException, NotConnectedException {
		if (message.length > 65535) {
			throw new IllegalArgumentException("Message can be at most 65535 items long");
		}

		int ret;
		int messageLength = message.length;
		int messageChunkOffset = 0;
		char[] messageChunkData = new char[60];
		int messageChunkLength;
		int messageWritten;

		if (messageLength == 0) {
			Arrays.fill(messageChunkData, '\0');

			ret = writeLowLevel(messageLength, messageChunkOffset, messageChunkData);
			messageWritten = ret;
		} else {
			messageWritten = 0;

			synchronized (streamMutex) {
				while (messageChunkOffset < messageLength) {
					messageChunkLength = Math.min(messageLength - messageChunkOffset, 60);

					System.arraycopy(message, messageChunkOffset, messageChunkData, 0, messageChunkLength);
					Arrays.fill(messageChunkData, messageChunkLength, 60, '\0');

					ret = writeLowLevel(messageLength, messageChunkOffset, messageChunkData);
					messageWritten += ret;

					if (ret < 60) {
						break; // either last chunk or short write
					}

					messageChunkOffset += 60;
				}
			}
		}

		return messageWritten;
	}

	/**
	 * Returns up to *length* characters from receive buffer.
	 * 
	 * Instead of polling with this function, you can also use
	 * callbacks. But note that this function will return available
	 * data only when the read listener is disabled.
	 * See {@link BrickletRS485#enableReadCallback()} and {@link BrickletRS485.ReadListener} listener.
	 */
	public char[] read(int length) throws StreamOutOfSyncException, TimeoutException, NotConnectedException {
		ReadLowLevel ret;
		char[] message = null; // stop the compiler from wrongly complaining that this variable is used unassigned
		int messageLength;
		int messageChunkOffset;
		int messageChunkLength;
		boolean messageOutOfSync;
		int messageCurrentLength;

		synchronized (streamMutex) {
			ret = readLowLevel(length);
			messageLength = ret.messageLength;
			messageChunkOffset = ret.messageChunkOffset;
			messageOutOfSync = messageChunkOffset != 0;

			if (!messageOutOfSync) {
				message = new char[messageLength];
				messageChunkLength = Math.min(messageLength - messageChunkOffset, 60);

				System.arraycopy(ret.messageChunkData, 0, message, 0, messageChunkLength);

				messageCurrentLength = messageChunkLength;

				while (messageCurrentLength < messageLength) {
					ret = readLowLevel(length);
					messageLength = ret.messageLength;
					messageOutOfSync = ret.messageChunkOffset != messageCurrentLength;

					if (messageOutOfSync) {
						break;
					}

					messageChunkLength = Math.min(messageLength - messageChunkOffset, 60);

					System.arraycopy(ret.messageChunkData, 0, message, messageCurrentLength, messageChunkLength);

					messageCurrentLength += messageChunkLength;
				}
			}

			if (messageOutOfSync) { // discard remaining stream to bring it back in-sync
				while (ret.messageChunkOffset + 60 < messageLength) {
					ret = readLowLevel(length);
					messageLength = ret.messageLength;
				}

				throw new StreamOutOfSyncException("Message stream is out-of-sync");
			}
		}

		return message;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read coils.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Coils: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadCoilsRequestListener} listener
	 * with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadCoilsRequest(int requestID, boolean[] coils) throws TimeoutException, NotConnectedException {
		if (coils.length > 65535) {
			throw new IllegalArgumentException("Coils can be at most 65535 items long");
		}

		int coilsLength = coils.length;
		int coilsChunkOffset = 0;
		boolean[] coilsChunkData = new boolean[472];
		int coilsChunkLength;

		if (coilsLength == 0) {
			Arrays.fill(coilsChunkData, false);

			modbusSlaveAnswerReadCoilsRequestLowLevel(requestID, coilsLength, coilsChunkOffset, coilsChunkData);
		} else {
			synchronized (streamMutex) {
				while (coilsChunkOffset < coilsLength) {
					coilsChunkLength = Math.min(coilsLength - coilsChunkOffset, 472);

					System.arraycopy(coils, coilsChunkOffset, coilsChunkData, 0, coilsChunkLength);
					Arrays.fill(coilsChunkData, coilsChunkLength, 472, false);

					modbusSlaveAnswerReadCoilsRequestLowLevel(requestID, coilsLength, coilsChunkOffset, coilsChunkData);
					coilsChunkOffset += 472;
				}
			}
		}
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read holding registers.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Holding Registers: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadHoldingRegistersRequestListener}
	 * listener with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadHoldingRegistersRequest(int requestID, int[] holdingRegisters) throws TimeoutException, NotConnectedException {
		if (holdingRegisters.length > 65535) {
			throw new IllegalArgumentException("Holding Registers can be at most 65535 items long");
		}

		int holdingRegistersLength = holdingRegisters.length;
		int holdingRegistersChunkOffset = 0;
		int[] holdingRegistersChunkData = new int[29];
		int holdingRegistersChunkLength;

		if (holdingRegistersLength == 0) {
			Arrays.fill(holdingRegistersChunkData, 0);

			modbusSlaveAnswerReadHoldingRegistersRequestLowLevel(requestID, holdingRegistersLength, holdingRegistersChunkOffset, holdingRegistersChunkData);
		} else {
			synchronized (streamMutex) {
				while (holdingRegistersChunkOffset < holdingRegistersLength) {
					holdingRegistersChunkLength = Math.min(holdingRegistersLength - holdingRegistersChunkOffset, 29);

					System.arraycopy(holdingRegisters, holdingRegistersChunkOffset, holdingRegistersChunkData, 0, holdingRegistersChunkLength);
					Arrays.fill(holdingRegistersChunkData, holdingRegistersChunkLength, 29, 0);

					modbusSlaveAnswerReadHoldingRegistersRequestLowLevel(requestID, holdingRegistersLength, holdingRegistersChunkOffset, holdingRegistersChunkData);
					holdingRegistersChunkOffset += 29;
				}
			}
		}
	}

	/**
	 * In Modbus master mode this function can be used to write multiple coils of a slave.
	 * This function creates a Modbus function code 15 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting address of the write.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteMultipleCoilsResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteMultipleCoils(int slaveAddress, long startingAddress, boolean[] coils) throws TimeoutException, NotConnectedException {
		if (coils.length > 65535) {
			throw new IllegalArgumentException("Coils can be at most 65535 items long");
		}

		int ret = 0; // stop the compiler from wrongly complaining that this variable is used unassigned YYY2
		int coilsLength = coils.length;
		int coilsChunkOffset = 0;
		boolean[] coilsChunkData = new boolean[440];
		int coilsChunkLength;

		if (coilsLength == 0) {
			Arrays.fill(coilsChunkData, false);

			ret = modbusMasterWriteMultipleCoilsLowLevel(slaveAddress, startingAddress, coilsLength, coilsChunkOffset, coilsChunkData);
		} else {
			synchronized (streamMutex) {
				while (coilsChunkOffset < coilsLength) {
					coilsChunkLength = Math.min(coilsLength - coilsChunkOffset, 440);

					System.arraycopy(coils, coilsChunkOffset, coilsChunkData, 0, coilsChunkLength);
					Arrays.fill(coilsChunkData, coilsChunkLength, 440, false);

					ret = modbusMasterWriteMultipleCoilsLowLevel(slaveAddress, startingAddress, coilsLength, coilsChunkOffset, coilsChunkData);
					coilsChunkOffset += 440;
				}
			}
		}

		return ret;
	}

	/**
	 * In Modbus master mode this function can be used to write multiple registers of a slave.
	 * This function creates a Modbus function code 16 request.
	 * 
	 * * Slave Address: Address of the target Modbus slave.
	 * * Starting Address: Starting Address of the write.
	 * 
	 * Upon success the function will return a non-zero request ID which will represent
	 * the current request initiated by the Modbus master. In case of failure the returned
	 * request ID will be 0.
	 * 
	 * When successful this function will also invoke the {@link BrickletRS485.ModbusMasterWriteMultipleRegistersResponseListener}
	 * callback. In this listener the Request ID provided by the listener argument must be matched
	 * with the Request ID returned from this function to verify that the listener is indeed for a
	 * particular request.
	 */
	public int modbusMasterWriteMultipleRegisters(int slaveAddress, long startingAddress, int[] registers) throws TimeoutException, NotConnectedException {
		if (registers.length > 65535) {
			throw new IllegalArgumentException("Registers can be at most 65535 items long");
		}

		int ret = 0; // stop the compiler from wrongly complaining that this variable is used unassigned YYY2
		int registersLength = registers.length;
		int registersChunkOffset = 0;
		int[] registersChunkData = new int[27];
		int registersChunkLength;

		if (registersLength == 0) {
			Arrays.fill(registersChunkData, 0);

			ret = modbusMasterWriteMultipleRegistersLowLevel(slaveAddress, startingAddress, registersLength, registersChunkOffset, registersChunkData);
		} else {
			synchronized (streamMutex) {
				while (registersChunkOffset < registersLength) {
					registersChunkLength = Math.min(registersLength - registersChunkOffset, 27);

					System.arraycopy(registers, registersChunkOffset, registersChunkData, 0, registersChunkLength);
					Arrays.fill(registersChunkData, registersChunkLength, 27, 0);

					ret = modbusMasterWriteMultipleRegistersLowLevel(slaveAddress, startingAddress, registersLength, registersChunkOffset, registersChunkData);
					registersChunkOffset += 27;
				}
			}
		}

		return ret;
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read discrete inputs.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Discrete Inputs: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadDiscreteInputsRequestListener}
	 * listener with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadDiscreteInputsRequest(int requestID, boolean[] discreteInputs) throws TimeoutException, NotConnectedException {
		if (discreteInputs.length > 65535) {
			throw new IllegalArgumentException("Discrete Inputs can be at most 65535 items long");
		}

		int discreteInputsLength = discreteInputs.length;
		int discreteInputsChunkOffset = 0;
		boolean[] discreteInputsChunkData = new boolean[472];
		int discreteInputsChunkLength;

		if (discreteInputsLength == 0) {
			Arrays.fill(discreteInputsChunkData, false);

			modbusSlaveAnswerReadDiscreteInputsRequestLowLevel(requestID, discreteInputsLength, discreteInputsChunkOffset, discreteInputsChunkData);
		} else {
			synchronized (streamMutex) {
				while (discreteInputsChunkOffset < discreteInputsLength) {
					discreteInputsChunkLength = Math.min(discreteInputsLength - discreteInputsChunkOffset, 472);

					System.arraycopy(discreteInputs, discreteInputsChunkOffset, discreteInputsChunkData, 0, discreteInputsChunkLength);
					Arrays.fill(discreteInputsChunkData, discreteInputsChunkLength, 472, false);

					modbusSlaveAnswerReadDiscreteInputsRequestLowLevel(requestID, discreteInputsLength, discreteInputsChunkOffset, discreteInputsChunkData);
					discreteInputsChunkOffset += 472;
				}
			}
		}
	}

	/**
	 * In Modbus slave mode this function can be used to answer a master request to
	 * read input registers.
	 * 
	 * * Request ID: Request ID of the corresponding request that is being answered.
	 * * Input Registers: Data that is to be sent to the Modbus master for the corresponding request.
	 * 
	 * This function must be called from the {@link BrickletRS485.ModbusSlaveReadInputRegistersRequestListener} listener
	 * with the Request ID as provided by the argument of the listener.
	 */
	public void modbusSlaveAnswerReadInputRegistersRequest(int requestID, int[] inputRegisters) throws TimeoutException, NotConnectedException {
		if (inputRegisters.length > 65535) {
			throw new IllegalArgumentException("Input Registers can be at most 65535 items long");
		}

		int inputRegistersLength = inputRegisters.length;
		int inputRegistersChunkOffset = 0;
		int[] inputRegistersChunkData = new int[29];
		int inputRegistersChunkLength;

		if (inputRegistersLength == 0) {
			Arrays.fill(inputRegistersChunkData, 0);

			modbusSlaveAnswerReadInputRegistersRequestLowLevel(requestID, inputRegistersLength, inputRegistersChunkOffset, inputRegistersChunkData);
		} else {
			synchronized (streamMutex) {
				while (inputRegistersChunkOffset < inputRegistersLength) {
					inputRegistersChunkLength = Math.min(inputRegistersLength - inputRegistersChunkOffset, 29);

					System.arraycopy(inputRegisters, inputRegistersChunkOffset, inputRegistersChunkData, 0, inputRegistersChunkLength);
					Arrays.fill(inputRegistersChunkData, inputRegistersChunkLength, 29, 0);

					modbusSlaveAnswerReadInputRegistersRequestLowLevel(requestID, inputRegistersLength, inputRegistersChunkOffset, inputRegistersChunkData);
					inputRegistersChunkOffset += 29;
				}
			}
		}
	}

	/**
	 * Adds a ReadLowLevel listener.
	 */
	public void addReadLowLevelListener(ReadLowLevelListener listener) {
		listenerReadLowLevel.add(listener);
	}

	/**
	 * Removes a ReadLowLevel listener.
	 */
	public void removeReadLowLevelListener(ReadLowLevelListener listener) {
		listenerReadLowLevel.remove(listener);
	}

	/**
	 * Adds a ErrorCount listener.
	 */
	public void addErrorCountListener(ErrorCountListener listener) {
		listenerErrorCount.add(listener);
	}

	/**
	 * Removes a ErrorCount listener.
	 */
	public void removeErrorCountListener(ErrorCountListener listener) {
		listenerErrorCount.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveReadCoilsRequest listener.
	 */
	public void addModbusSlaveReadCoilsRequestListener(ModbusSlaveReadCoilsRequestListener listener) {
		listenerModbusSlaveReadCoilsRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveReadCoilsRequest listener.
	 */
	public void removeModbusSlaveReadCoilsRequestListener(ModbusSlaveReadCoilsRequestListener listener) {
		listenerModbusSlaveReadCoilsRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadCoilsResponseLowLevel listener.
	 */
	public void addModbusMasterReadCoilsResponseLowLevelListener(ModbusMasterReadCoilsResponseLowLevelListener listener) {
		listenerModbusMasterReadCoilsResponseLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadCoilsResponseLowLevel listener.
	 */
	public void removeModbusMasterReadCoilsResponseLowLevelListener(ModbusMasterReadCoilsResponseLowLevelListener listener) {
		listenerModbusMasterReadCoilsResponseLowLevel.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveReadHoldingRegistersRequest listener.
	 */
	public void addModbusSlaveReadHoldingRegistersRequestListener(ModbusSlaveReadHoldingRegistersRequestListener listener) {
		listenerModbusSlaveReadHoldingRegistersRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveReadHoldingRegistersRequest listener.
	 */
	public void removeModbusSlaveReadHoldingRegistersRequestListener(ModbusSlaveReadHoldingRegistersRequestListener listener) {
		listenerModbusSlaveReadHoldingRegistersRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadHoldingRegistersResponseLowLevel listener.
	 */
	public void addModbusMasterReadHoldingRegistersResponseLowLevelListener(ModbusMasterReadHoldingRegistersResponseLowLevelListener listener) {
		listenerModbusMasterReadHoldingRegistersResponseLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadHoldingRegistersResponseLowLevel listener.
	 */
	public void removeModbusMasterReadHoldingRegistersResponseLowLevelListener(ModbusMasterReadHoldingRegistersResponseLowLevelListener listener) {
		listenerModbusMasterReadHoldingRegistersResponseLowLevel.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteSingleCoilRequest listener.
	 */
	public void addModbusSlaveWriteSingleCoilRequestListener(ModbusSlaveWriteSingleCoilRequestListener listener) {
		listenerModbusSlaveWriteSingleCoilRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteSingleCoilRequest listener.
	 */
	public void removeModbusSlaveWriteSingleCoilRequestListener(ModbusSlaveWriteSingleCoilRequestListener listener) {
		listenerModbusSlaveWriteSingleCoilRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterWriteSingleCoilResponse listener.
	 */
	public void addModbusMasterWriteSingleCoilResponseListener(ModbusMasterWriteSingleCoilResponseListener listener) {
		listenerModbusMasterWriteSingleCoilResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterWriteSingleCoilResponse listener.
	 */
	public void removeModbusMasterWriteSingleCoilResponseListener(ModbusMasterWriteSingleCoilResponseListener listener) {
		listenerModbusMasterWriteSingleCoilResponse.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteSingleRegisterRequest listener.
	 */
	public void addModbusSlaveWriteSingleRegisterRequestListener(ModbusSlaveWriteSingleRegisterRequestListener listener) {
		listenerModbusSlaveWriteSingleRegisterRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteSingleRegisterRequest listener.
	 */
	public void removeModbusSlaveWriteSingleRegisterRequestListener(ModbusSlaveWriteSingleRegisterRequestListener listener) {
		listenerModbusSlaveWriteSingleRegisterRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterWriteSingleRegisterResponse listener.
	 */
	public void addModbusMasterWriteSingleRegisterResponseListener(ModbusMasterWriteSingleRegisterResponseListener listener) {
		listenerModbusMasterWriteSingleRegisterResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterWriteSingleRegisterResponse listener.
	 */
	public void removeModbusMasterWriteSingleRegisterResponseListener(ModbusMasterWriteSingleRegisterResponseListener listener) {
		listenerModbusMasterWriteSingleRegisterResponse.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteMultipleCoilsRequestLowLevel listener.
	 */
	public void addModbusSlaveWriteMultipleCoilsRequestLowLevelListener(ModbusSlaveWriteMultipleCoilsRequestLowLevelListener listener) {
		listenerModbusSlaveWriteMultipleCoilsRequestLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteMultipleCoilsRequestLowLevel listener.
	 */
	public void removeModbusSlaveWriteMultipleCoilsRequestLowLevelListener(ModbusSlaveWriteMultipleCoilsRequestLowLevelListener listener) {
		listenerModbusSlaveWriteMultipleCoilsRequestLowLevel.remove(listener);
	}

	/**
	 * Adds a ModbusMasterWriteMultipleCoilsResponse listener.
	 */
	public void addModbusMasterWriteMultipleCoilsResponseListener(ModbusMasterWriteMultipleCoilsResponseListener listener) {
		listenerModbusMasterWriteMultipleCoilsResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterWriteMultipleCoilsResponse listener.
	 */
	public void removeModbusMasterWriteMultipleCoilsResponseListener(ModbusMasterWriteMultipleCoilsResponseListener listener) {
		listenerModbusMasterWriteMultipleCoilsResponse.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteMultipleRegistersRequestLowLevel listener.
	 */
	public void addModbusSlaveWriteMultipleRegistersRequestLowLevelListener(ModbusSlaveWriteMultipleRegistersRequestLowLevelListener listener) {
		listenerModbusSlaveWriteMultipleRegistersRequestLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteMultipleRegistersRequestLowLevel listener.
	 */
	public void removeModbusSlaveWriteMultipleRegistersRequestLowLevelListener(ModbusSlaveWriteMultipleRegistersRequestLowLevelListener listener) {
		listenerModbusSlaveWriteMultipleRegistersRequestLowLevel.remove(listener);
	}

	/**
	 * Adds a ModbusMasterWriteMultipleRegistersResponse listener.
	 */
	public void addModbusMasterWriteMultipleRegistersResponseListener(ModbusMasterWriteMultipleRegistersResponseListener listener) {
		listenerModbusMasterWriteMultipleRegistersResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterWriteMultipleRegistersResponse listener.
	 */
	public void removeModbusMasterWriteMultipleRegistersResponseListener(ModbusMasterWriteMultipleRegistersResponseListener listener) {
		listenerModbusMasterWriteMultipleRegistersResponse.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveReadDiscreteInputsRequest listener.
	 */
	public void addModbusSlaveReadDiscreteInputsRequestListener(ModbusSlaveReadDiscreteInputsRequestListener listener) {
		listenerModbusSlaveReadDiscreteInputsRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveReadDiscreteInputsRequest listener.
	 */
	public void removeModbusSlaveReadDiscreteInputsRequestListener(ModbusSlaveReadDiscreteInputsRequestListener listener) {
		listenerModbusSlaveReadDiscreteInputsRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadDiscreteInputsResponseLowLevel listener.
	 */
	public void addModbusMasterReadDiscreteInputsResponseLowLevelListener(ModbusMasterReadDiscreteInputsResponseLowLevelListener listener) {
		listenerModbusMasterReadDiscreteInputsResponseLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadDiscreteInputsResponseLowLevel listener.
	 */
	public void removeModbusMasterReadDiscreteInputsResponseLowLevelListener(ModbusMasterReadDiscreteInputsResponseLowLevelListener listener) {
		listenerModbusMasterReadDiscreteInputsResponseLowLevel.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveReadInputRegistersRequest listener.
	 */
	public void addModbusSlaveReadInputRegistersRequestListener(ModbusSlaveReadInputRegistersRequestListener listener) {
		listenerModbusSlaveReadInputRegistersRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveReadInputRegistersRequest listener.
	 */
	public void removeModbusSlaveReadInputRegistersRequestListener(ModbusSlaveReadInputRegistersRequestListener listener) {
		listenerModbusSlaveReadInputRegistersRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadInputRegistersResponseLowLevel listener.
	 */
	public void addModbusMasterReadInputRegistersResponseLowLevelListener(ModbusMasterReadInputRegistersResponseLowLevelListener listener) {
		listenerModbusMasterReadInputRegistersResponseLowLevel.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadInputRegistersResponseLowLevel listener.
	 */
	public void removeModbusMasterReadInputRegistersResponseLowLevelListener(ModbusMasterReadInputRegistersResponseLowLevelListener listener) {
		listenerModbusMasterReadInputRegistersResponseLowLevel.remove(listener);
	}

	/**
	 * Adds a Read listener.
	 */
	public void addReadListener(ReadListener listener) {
		listenerRead.add(listener);
	}

	/**
	 * Removes a Read listener.
	 */
	public void removeReadListener(ReadListener listener) {
		listenerRead.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadCoilsResponse listener.
	 */
	public void addModbusMasterReadCoilsResponseListener(ModbusMasterReadCoilsResponseListener listener) {
		listenerModbusMasterReadCoilsResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadCoilsResponse listener.
	 */
	public void removeModbusMasterReadCoilsResponseListener(ModbusMasterReadCoilsResponseListener listener) {
		listenerModbusMasterReadCoilsResponse.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadHoldingRegistersResponse listener.
	 */
	public void addModbusMasterReadHoldingRegistersResponseListener(ModbusMasterReadHoldingRegistersResponseListener listener) {
		listenerModbusMasterReadHoldingRegistersResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadHoldingRegistersResponse listener.
	 */
	public void removeModbusMasterReadHoldingRegistersResponseListener(ModbusMasterReadHoldingRegistersResponseListener listener) {
		listenerModbusMasterReadHoldingRegistersResponse.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteMultipleCoilsRequest listener.
	 */
	public void addModbusSlaveWriteMultipleCoilsRequestListener(ModbusSlaveWriteMultipleCoilsRequestListener listener) {
		listenerModbusSlaveWriteMultipleCoilsRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteMultipleCoilsRequest listener.
	 */
	public void removeModbusSlaveWriteMultipleCoilsRequestListener(ModbusSlaveWriteMultipleCoilsRequestListener listener) {
		listenerModbusSlaveWriteMultipleCoilsRequest.remove(listener);
	}

	/**
	 * Adds a ModbusSlaveWriteMultipleRegistersRequest listener.
	 */
	public void addModbusSlaveWriteMultipleRegistersRequestListener(ModbusSlaveWriteMultipleRegistersRequestListener listener) {
		listenerModbusSlaveWriteMultipleRegistersRequest.add(listener);
	}

	/**
	 * Removes a ModbusSlaveWriteMultipleRegistersRequest listener.
	 */
	public void removeModbusSlaveWriteMultipleRegistersRequestListener(ModbusSlaveWriteMultipleRegistersRequestListener listener) {
		listenerModbusSlaveWriteMultipleRegistersRequest.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadDiscreteInputsResponse listener.
	 */
	public void addModbusMasterReadDiscreteInputsResponseListener(ModbusMasterReadDiscreteInputsResponseListener listener) {
		listenerModbusMasterReadDiscreteInputsResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadDiscreteInputsResponse listener.
	 */
	public void removeModbusMasterReadDiscreteInputsResponseListener(ModbusMasterReadDiscreteInputsResponseListener listener) {
		listenerModbusMasterReadDiscreteInputsResponse.remove(listener);
	}

	/**
	 * Adds a ModbusMasterReadInputRegistersResponse listener.
	 */
	public void addModbusMasterReadInputRegistersResponseListener(ModbusMasterReadInputRegistersResponseListener listener) {
		listenerModbusMasterReadInputRegistersResponse.add(listener);
	}

	/**
	 * Removes a ModbusMasterReadInputRegistersResponse listener.
	 */
	public void removeModbusMasterReadInputRegistersResponseListener(ModbusMasterReadInputRegistersResponseListener listener) {
		listenerModbusMasterReadInputRegistersResponse.remove(listener);
	}
}
