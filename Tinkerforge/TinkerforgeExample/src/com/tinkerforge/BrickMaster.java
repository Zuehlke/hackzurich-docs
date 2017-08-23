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
 * Basis to build stacks and has 4 Bricklet ports
 */
public class BrickMaster extends Device {
	public final static int DEVICE_IDENTIFIER = 13;
	public final static String DEVICE_DISPLAY_NAME = "Master Brick";

	public final static byte FUNCTION_GET_STACK_VOLTAGE = (byte)1;
	public final static byte FUNCTION_GET_STACK_CURRENT = (byte)2;
	public final static byte FUNCTION_SET_EXTENSION_TYPE = (byte)3;
	public final static byte FUNCTION_GET_EXTENSION_TYPE = (byte)4;
	public final static byte FUNCTION_IS_CHIBI_PRESENT = (byte)5;
	public final static byte FUNCTION_SET_CHIBI_ADDRESS = (byte)6;
	public final static byte FUNCTION_GET_CHIBI_ADDRESS = (byte)7;
	public final static byte FUNCTION_SET_CHIBI_MASTER_ADDRESS = (byte)8;
	public final static byte FUNCTION_GET_CHIBI_MASTER_ADDRESS = (byte)9;
	public final static byte FUNCTION_SET_CHIBI_SLAVE_ADDRESS = (byte)10;
	public final static byte FUNCTION_GET_CHIBI_SLAVE_ADDRESS = (byte)11;
	public final static byte FUNCTION_GET_CHIBI_SIGNAL_STRENGTH = (byte)12;
	public final static byte FUNCTION_GET_CHIBI_ERROR_LOG = (byte)13;
	public final static byte FUNCTION_SET_CHIBI_FREQUENCY = (byte)14;
	public final static byte FUNCTION_GET_CHIBI_FREQUENCY = (byte)15;
	public final static byte FUNCTION_SET_CHIBI_CHANNEL = (byte)16;
	public final static byte FUNCTION_GET_CHIBI_CHANNEL = (byte)17;
	public final static byte FUNCTION_IS_RS485_PRESENT = (byte)18;
	public final static byte FUNCTION_SET_RS485_ADDRESS = (byte)19;
	public final static byte FUNCTION_GET_RS485_ADDRESS = (byte)20;
	public final static byte FUNCTION_SET_RS485_SLAVE_ADDRESS = (byte)21;
	public final static byte FUNCTION_GET_RS485_SLAVE_ADDRESS = (byte)22;
	public final static byte FUNCTION_GET_RS485_ERROR_LOG = (byte)23;
	public final static byte FUNCTION_SET_RS485_CONFIGURATION = (byte)24;
	public final static byte FUNCTION_GET_RS485_CONFIGURATION = (byte)25;
	public final static byte FUNCTION_IS_WIFI_PRESENT = (byte)26;
	public final static byte FUNCTION_SET_WIFI_CONFIGURATION = (byte)27;
	public final static byte FUNCTION_GET_WIFI_CONFIGURATION = (byte)28;
	public final static byte FUNCTION_SET_WIFI_ENCRYPTION = (byte)29;
	public final static byte FUNCTION_GET_WIFI_ENCRYPTION = (byte)30;
	public final static byte FUNCTION_GET_WIFI_STATUS = (byte)31;
	public final static byte FUNCTION_REFRESH_WIFI_STATUS = (byte)32;
	public final static byte FUNCTION_SET_WIFI_CERTIFICATE = (byte)33;
	public final static byte FUNCTION_GET_WIFI_CERTIFICATE = (byte)34;
	public final static byte FUNCTION_SET_WIFI_POWER_MODE = (byte)35;
	public final static byte FUNCTION_GET_WIFI_POWER_MODE = (byte)36;
	public final static byte FUNCTION_GET_WIFI_BUFFER_INFO = (byte)37;
	public final static byte FUNCTION_SET_WIFI_REGULATORY_DOMAIN = (byte)38;
	public final static byte FUNCTION_GET_WIFI_REGULATORY_DOMAIN = (byte)39;
	public final static byte FUNCTION_GET_USB_VOLTAGE = (byte)40;
	public final static byte FUNCTION_SET_LONG_WIFI_KEY = (byte)41;
	public final static byte FUNCTION_GET_LONG_WIFI_KEY = (byte)42;
	public final static byte FUNCTION_SET_WIFI_HOSTNAME = (byte)43;
	public final static byte FUNCTION_GET_WIFI_HOSTNAME = (byte)44;
	public final static byte FUNCTION_SET_STACK_CURRENT_CALLBACK_PERIOD = (byte)45;
	public final static byte FUNCTION_GET_STACK_CURRENT_CALLBACK_PERIOD = (byte)46;
	public final static byte FUNCTION_SET_STACK_VOLTAGE_CALLBACK_PERIOD = (byte)47;
	public final static byte FUNCTION_GET_STACK_VOLTAGE_CALLBACK_PERIOD = (byte)48;
	public final static byte FUNCTION_SET_USB_VOLTAGE_CALLBACK_PERIOD = (byte)49;
	public final static byte FUNCTION_GET_USB_VOLTAGE_CALLBACK_PERIOD = (byte)50;
	public final static byte FUNCTION_SET_STACK_CURRENT_CALLBACK_THRESHOLD = (byte)51;
	public final static byte FUNCTION_GET_STACK_CURRENT_CALLBACK_THRESHOLD = (byte)52;
	public final static byte FUNCTION_SET_STACK_VOLTAGE_CALLBACK_THRESHOLD = (byte)53;
	public final static byte FUNCTION_GET_STACK_VOLTAGE_CALLBACK_THRESHOLD = (byte)54;
	public final static byte FUNCTION_SET_USB_VOLTAGE_CALLBACK_THRESHOLD = (byte)55;
	public final static byte FUNCTION_GET_USB_VOLTAGE_CALLBACK_THRESHOLD = (byte)56;
	public final static byte FUNCTION_SET_DEBOUNCE_PERIOD = (byte)57;
	public final static byte FUNCTION_GET_DEBOUNCE_PERIOD = (byte)58;
	public final static byte FUNCTION_IS_ETHERNET_PRESENT = (byte)65;
	public final static byte FUNCTION_SET_ETHERNET_CONFIGURATION = (byte)66;
	public final static byte FUNCTION_GET_ETHERNET_CONFIGURATION = (byte)67;
	public final static byte FUNCTION_GET_ETHERNET_STATUS = (byte)68;
	public final static byte FUNCTION_SET_ETHERNET_HOSTNAME = (byte)69;
	public final static byte FUNCTION_SET_ETHERNET_MAC_ADDRESS = (byte)70;
	public final static byte FUNCTION_SET_ETHERNET_WEBSOCKET_CONFIGURATION = (byte)71;
	public final static byte FUNCTION_GET_ETHERNET_WEBSOCKET_CONFIGURATION = (byte)72;
	public final static byte FUNCTION_SET_ETHERNET_AUTHENTICATION_SECRET = (byte)73;
	public final static byte FUNCTION_GET_ETHERNET_AUTHENTICATION_SECRET = (byte)74;
	public final static byte FUNCTION_SET_WIFI_AUTHENTICATION_SECRET = (byte)75;
	public final static byte FUNCTION_GET_WIFI_AUTHENTICATION_SECRET = (byte)76;
	public final static byte FUNCTION_GET_CONNECTION_TYPE = (byte)77;
	public final static byte FUNCTION_IS_WIFI2_PRESENT = (byte)78;
	public final static byte FUNCTION_START_WIFI2_BOOTLOADER = (byte)79;
	public final static byte FUNCTION_WRITE_WIFI2_SERIAL_PORT = (byte)80;
	public final static byte FUNCTION_READ_WIFI2_SERIAL_PORT = (byte)81;
	public final static byte FUNCTION_SET_WIFI2_AUTHENTICATION_SECRET = (byte)82;
	public final static byte FUNCTION_GET_WIFI2_AUTHENTICATION_SECRET = (byte)83;
	public final static byte FUNCTION_SET_WIFI2_CONFIGURATION = (byte)84;
	public final static byte FUNCTION_GET_WIFI2_CONFIGURATION = (byte)85;
	public final static byte FUNCTION_GET_WIFI2_STATUS = (byte)86;
	public final static byte FUNCTION_SET_WIFI2_CLIENT_CONFIGURATION = (byte)87;
	public final static byte FUNCTION_GET_WIFI2_CLIENT_CONFIGURATION = (byte)88;
	public final static byte FUNCTION_SET_WIFI2_CLIENT_HOSTNAME = (byte)89;
	public final static byte FUNCTION_GET_WIFI2_CLIENT_HOSTNAME = (byte)90;
	public final static byte FUNCTION_SET_WIFI2_CLIENT_PASSWORD = (byte)91;
	public final static byte FUNCTION_GET_WIFI2_CLIENT_PASSWORD = (byte)92;
	public final static byte FUNCTION_SET_WIFI2_AP_CONFIGURATION = (byte)93;
	public final static byte FUNCTION_GET_WIFI2_AP_CONFIGURATION = (byte)94;
	public final static byte FUNCTION_SET_WIFI2_AP_PASSWORD = (byte)95;
	public final static byte FUNCTION_GET_WIFI2_AP_PASSWORD = (byte)96;
	public final static byte FUNCTION_SAVE_WIFI2_CONFIGURATION = (byte)97;
	public final static byte FUNCTION_GET_WIFI2_FIRMWARE_VERSION = (byte)98;
	public final static byte FUNCTION_ENABLE_WIFI2_STATUS_LED = (byte)99;
	public final static byte FUNCTION_DISABLE_WIFI2_STATUS_LED = (byte)100;
	public final static byte FUNCTION_IS_WIFI2_STATUS_LED_ENABLED = (byte)101;
	public final static byte FUNCTION_SET_WIFI2_MESH_CONFIGURATION = (byte)102;
	public final static byte FUNCTION_GET_WIFI2_MESH_CONFIGURATION = (byte)103;
	public final static byte FUNCTION_SET_WIFI2_MESH_ROUTER_SSID = (byte)104;
	public final static byte FUNCTION_GET_WIFI2_MESH_ROUTER_SSID = (byte)105;
	public final static byte FUNCTION_SET_WIFI2_MESH_ROUTER_PASSWORD = (byte)106;
	public final static byte FUNCTION_GET_WIFI2_MESH_ROUTER_PASSWORD = (byte)107;
	public final static byte FUNCTION_GET_WIFI2_MESH_COMMON_STATUS = (byte)108;
	public final static byte FUNCTION_GET_WIFI2_MESH_CLIENT_STATUS = (byte)109;
	public final static byte FUNCTION_GET_WIFI2_MESH_AP_STATUS = (byte)110;
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
	private final static int CALLBACK_STACK_CURRENT = 59;
	private final static int CALLBACK_STACK_VOLTAGE = 60;
	private final static int CALLBACK_USB_VOLTAGE = 61;
	private final static int CALLBACK_STACK_CURRENT_REACHED = 62;
	private final static int CALLBACK_STACK_VOLTAGE_REACHED = 63;
	private final static int CALLBACK_USB_VOLTAGE_REACHED = 64;

	public final static long EXTENSION_TYPE_CHIBI = 1L;
	public final static long EXTENSION_TYPE_RS485 = 2L;
	public final static long EXTENSION_TYPE_WIFI = 3L;
	public final static long EXTENSION_TYPE_ETHERNET = 4L;
	public final static long EXTENSION_TYPE_WIFI2 = 5L;
	public final static short CHIBI_FREQUENCY_OQPSK_868_MHZ = (short)0;
	public final static short CHIBI_FREQUENCY_OQPSK_915_MHZ = (short)1;
	public final static short CHIBI_FREQUENCY_OQPSK_780_MHZ = (short)2;
	public final static short CHIBI_FREQUENCY_BPSK40_915_MHZ = (short)3;
	public final static char RS485_PARITY_NONE = 'n';
	public final static char RS485_PARITY_EVEN = 'e';
	public final static char RS485_PARITY_ODD = 'o';
	public final static short WIFI_CONNECTION_DHCP = (short)0;
	public final static short WIFI_CONNECTION_STATIC_IP = (short)1;
	public final static short WIFI_CONNECTION_ACCESS_POINT_DHCP = (short)2;
	public final static short WIFI_CONNECTION_ACCESS_POINT_STATIC_IP = (short)3;
	public final static short WIFI_CONNECTION_AD_HOC_DHCP = (short)4;
	public final static short WIFI_CONNECTION_AD_HOC_STATIC_IP = (short)5;
	public final static short WIFI_ENCRYPTION_WPA_WPA2 = (short)0;
	public final static short WIFI_ENCRYPTION_WPA_ENTERPRISE = (short)1;
	public final static short WIFI_ENCRYPTION_WEP = (short)2;
	public final static short WIFI_ENCRYPTION_NO_ENCRYPTION = (short)3;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_FAST = (short)0;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_TLS = (short)1;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_TTLS = (short)2;
	public final static short WIFI_EAP_OPTION_OUTER_AUTH_EAP_PEAP = (short)3;
	public final static short WIFI_EAP_OPTION_INNER_AUTH_EAP_MSCHAP = (short)0;
	public final static short WIFI_EAP_OPTION_INNER_AUTH_EAP_GTC = (short)4;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_CA_CERT = (short)0;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_CLIENT_CERT = (short)8;
	public final static short WIFI_EAP_OPTION_CERT_TYPE_PRIVATE_KEY = (short)16;
	public final static short WIFI_STATE_DISASSOCIATED = (short)0;
	public final static short WIFI_STATE_ASSOCIATED = (short)1;
	public final static short WIFI_STATE_ASSOCIATING = (short)2;
	public final static short WIFI_STATE_ERROR = (short)3;
	public final static short WIFI_STATE_NOT_INITIALIZED_YET = (short)255;
	public final static short WIFI_POWER_MODE_FULL_SPEED = (short)0;
	public final static short WIFI_POWER_MODE_LOW_POWER = (short)1;
	public final static short WIFI_DOMAIN_CHANNEL_1TO11 = (short)0;
	public final static short WIFI_DOMAIN_CHANNEL_1TO13 = (short)1;
	public final static short WIFI_DOMAIN_CHANNEL_1TO14 = (short)2;
	public final static char THRESHOLD_OPTION_OFF = 'x';
	public final static char THRESHOLD_OPTION_OUTSIDE = 'o';
	public final static char THRESHOLD_OPTION_INSIDE = 'i';
	public final static char THRESHOLD_OPTION_SMALLER = '<';
	public final static char THRESHOLD_OPTION_GREATER = '>';
	public final static short ETHERNET_CONNECTION_DHCP = (short)0;
	public final static short ETHERNET_CONNECTION_STATIC_IP = (short)1;
	public final static short CONNECTION_TYPE_NONE = (short)0;
	public final static short CONNECTION_TYPE_USB = (short)1;
	public final static short CONNECTION_TYPE_SPI_STACK = (short)2;
	public final static short CONNECTION_TYPE_CHIBI = (short)3;
	public final static short CONNECTION_TYPE_RS485 = (short)4;
	public final static short CONNECTION_TYPE_WIFI = (short)5;
	public final static short CONNECTION_TYPE_ETHERNET = (short)6;
	public final static short CONNECTION_TYPE_WIFI2 = (short)7;
	public final static short WIFI2_PHY_MODE_B = (short)0;
	public final static short WIFI2_PHY_MODE_G = (short)1;
	public final static short WIFI2_PHY_MODE_N = (short)2;
	public final static short WIFI2_CLIENT_STATUS_IDLE = (short)0;
	public final static short WIFI2_CLIENT_STATUS_CONNECTING = (short)1;
	public final static short WIFI2_CLIENT_STATUS_WRONG_PASSWORD = (short)2;
	public final static short WIFI2_CLIENT_STATUS_NO_AP_FOUND = (short)3;
	public final static short WIFI2_CLIENT_STATUS_CONNECT_FAILED = (short)4;
	public final static short WIFI2_CLIENT_STATUS_GOT_IP = (short)5;
	public final static short WIFI2_CLIENT_STATUS_UNKNOWN = (short)255;
	public final static short WIFI2_AP_ENCRYPTION_OPEN = (short)0;
	public final static short WIFI2_AP_ENCRYPTION_WEP = (short)1;
	public final static short WIFI2_AP_ENCRYPTION_WPA_PSK = (short)2;
	public final static short WIFI2_AP_ENCRYPTION_WPA2_PSK = (short)3;
	public final static short WIFI2_AP_ENCRYPTION_WPA_WPA2_PSK = (short)4;
	public final static short WIFI2_MESH_STATUS_DISABLED = (short)0;
	public final static short WIFI2_MESH_STATUS_WIFI_CONNECTING = (short)1;
	public final static short WIFI2_MESH_STATUS_GOT_IP = (short)2;
	public final static short WIFI2_MESH_STATUS_MESH_LOCAL = (short)3;
	public final static short WIFI2_MESH_STATUS_MESH_ONLINE = (short)4;
	public final static short WIFI2_MESH_STATUS_AP_AVAILABLE = (short)5;
	public final static short WIFI2_MESH_STATUS_AP_SETUP = (short)6;
	public final static short WIFI2_MESH_STATUS_LEAF_AVAILABLE = (short)7;
	public final static short COMMUNICATION_METHOD_NONE = (short)0;
	public final static short COMMUNICATION_METHOD_USB = (short)1;
	public final static short COMMUNICATION_METHOD_SPI_STACK = (short)2;
	public final static short COMMUNICATION_METHOD_CHIBI = (short)3;
	public final static short COMMUNICATION_METHOD_RS485 = (short)4;
	public final static short COMMUNICATION_METHOD_WIFI = (short)5;
	public final static short COMMUNICATION_METHOD_ETHERNET = (short)6;
	public final static short COMMUNICATION_METHOD_WIFI_V2 = (short)7;

	private List<StackCurrentListener> listenerStackCurrent = new CopyOnWriteArrayList<StackCurrentListener>();
	private List<StackVoltageListener> listenerStackVoltage = new CopyOnWriteArrayList<StackVoltageListener>();
	private List<USBVoltageListener> listenerUSBVoltage = new CopyOnWriteArrayList<USBVoltageListener>();
	private List<StackCurrentReachedListener> listenerStackCurrentReached = new CopyOnWriteArrayList<StackCurrentReachedListener>();
	private List<StackVoltageReachedListener> listenerStackVoltageReached = new CopyOnWriteArrayList<StackVoltageReachedListener>();
	private List<USBVoltageReachedListener> listenerUSBVoltageReached = new CopyOnWriteArrayList<USBVoltageReachedListener>();

	public class ChibiErrorLog {
		public int underrun;
		public int crcError;
		public int noAck;
		public int overflow;

		public String toString() {
			return "[" + "underrun = " + underrun + ", " + "crcError = " + crcError + ", " + "noAck = " + noAck + ", " + "overflow = " + overflow + "]";
		}
	}

	public class RS485Configuration {
		public long speed;
		public char parity;
		public short stopbits;

		public String toString() {
			return "[" + "speed = " + speed + ", " + "parity = " + parity + ", " + "stopbits = " + stopbits + "]";
		}
	}

	public class WifiConfiguration {
		public String ssid;
		public short connection;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public int port;

		public String toString() {
			return "[" + "ssid = " + ssid + ", " + "connection = " + connection + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "port = " + port + "]";
		}
	}

	public class WifiEncryption {
		public short encryption;
		public String key;
		public short keyIndex;
		public short eapOptions;
		public int caCertificateLength;
		public int clientCertificateLength;
		public int privateKeyLength;

		public String toString() {
			return "[" + "encryption = " + encryption + ", " + "key = " + key + ", " + "keyIndex = " + keyIndex + ", " + "eapOptions = " + eapOptions + ", " + "caCertificateLength = " + caCertificateLength + ", " + "clientCertificateLength = " + clientCertificateLength + ", " + "privateKeyLength = " + privateKeyLength + "]";
		}
	}

	public class WifiStatus {
		public short[] macAddress = new short[6];
		public short[] bssid = new short[6];
		public short channel;
		public short rssi;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public long rxCount;
		public long txCount;
		public short state;

		public String toString() {
			return "[" + "macAddress = " + Arrays.toString(macAddress) + ", " + "bssid = " + Arrays.toString(bssid) + ", " + "channel = " + channel + ", " + "rssi = " + rssi + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "rxCount = " + rxCount + ", " + "txCount = " + txCount + ", " + "state = " + state + "]";
		}
	}

	public class WifiCertificate {
		public short[] data = new short[32];
		public short dataLength;

		public String toString() {
			return "[" + "data = " + Arrays.toString(data) + ", " + "dataLength = " + dataLength + "]";
		}
	}

	public class WifiBufferInfo {
		public long overflow;
		public int lowWatermark;
		public int used;

		public String toString() {
			return "[" + "overflow = " + overflow + ", " + "lowWatermark = " + lowWatermark + ", " + "used = " + used + "]";
		}
	}

	public class StackCurrentCallbackThreshold {
		public char option;
		public int min;
		public int max;

		public String toString() {
			return "[" + "option = " + option + ", " + "min = " + min + ", " + "max = " + max + "]";
		}
	}

	public class StackVoltageCallbackThreshold {
		public char option;
		public int min;
		public int max;

		public String toString() {
			return "[" + "option = " + option + ", " + "min = " + min + ", " + "max = " + max + "]";
		}
	}

	public class USBVoltageCallbackThreshold {
		public char option;
		public int min;
		public int max;

		public String toString() {
			return "[" + "option = " + option + ", " + "min = " + min + ", " + "max = " + max + "]";
		}
	}

	public class EthernetConfiguration {
		public short connection;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public int port;

		public String toString() {
			return "[" + "connection = " + connection + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "port = " + port + "]";
		}
	}

	public class EthernetStatus {
		public short[] macAddress = new short[6];
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public long rxCount;
		public long txCount;
		public String hostname;

		public String toString() {
			return "[" + "macAddress = " + Arrays.toString(macAddress) + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "rxCount = " + rxCount + ", " + "txCount = " + txCount + ", " + "hostname = " + hostname + "]";
		}
	}

	public class EthernetWebsocketConfiguration {
		public short sockets;
		public int port;

		public String toString() {
			return "[" + "sockets = " + sockets + ", " + "port = " + port + "]";
		}
	}

	public class ReadWifi2SerialPort {
		public short[] data = new short[60];
		public short result;

		public String toString() {
			return "[" + "data = " + Arrays.toString(data) + ", " + "result = " + result + "]";
		}
	}

	public class Wifi2Configuration {
		public int port;
		public int websocketPort;
		public int websitePort;
		public short phyMode;
		public short sleepMode;
		public short website;

		public String toString() {
			return "[" + "port = " + port + ", " + "websocketPort = " + websocketPort + ", " + "websitePort = " + websitePort + ", " + "phyMode = " + phyMode + ", " + "sleepMode = " + sleepMode + ", " + "website = " + website + "]";
		}
	}

	public class Wifi2Status {
		public boolean clientEnabled;
		public short clientStatus;
		public short[] clientIP = new short[4];
		public short[] clientSubnetMask = new short[4];
		public short[] clientGateway = new short[4];
		public short[] clientMACAddress = new short[6];
		public long clientRXCount;
		public long clientTXCount;
		public byte clientRSSI;
		public boolean apEnabled;
		public short[] apIP = new short[4];
		public short[] apSubnetMask = new short[4];
		public short[] apGateway = new short[4];
		public short[] apMACAddress = new short[6];
		public long apRXCount;
		public long apTXCount;
		public short apConnectedCount;

		public String toString() {
			return "[" + "clientEnabled = " + clientEnabled + ", " + "clientStatus = " + clientStatus + ", " + "clientIP = " + Arrays.toString(clientIP) + ", " + "clientSubnetMask = " + Arrays.toString(clientSubnetMask) + ", " + "clientGateway = " + Arrays.toString(clientGateway) + ", " + "clientMACAddress = " + Arrays.toString(clientMACAddress) + ", " + "clientRXCount = " + clientRXCount + ", " + "clientTXCount = " + clientTXCount + ", " + "clientRSSI = " + clientRSSI + ", " + "apEnabled = " + apEnabled + ", " + "apIP = " + Arrays.toString(apIP) + ", " + "apSubnetMask = " + Arrays.toString(apSubnetMask) + ", " + "apGateway = " + Arrays.toString(apGateway) + ", " + "apMACAddress = " + Arrays.toString(apMACAddress) + ", " + "apRXCount = " + apRXCount + ", " + "apTXCount = " + apTXCount + ", " + "apConnectedCount = " + apConnectedCount + "]";
		}
	}

	public class Wifi2ClientConfiguration {
		public boolean enable;
		public String ssid;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public short[] macAddress = new short[6];
		public short[] bssid = new short[6];

		public String toString() {
			return "[" + "enable = " + enable + ", " + "ssid = " + ssid + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "macAddress = " + Arrays.toString(macAddress) + ", " + "bssid = " + Arrays.toString(bssid) + "]";
		}
	}

	public class Wifi2APConfiguration {
		public boolean enable;
		public String ssid;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public short encryption;
		public boolean hidden;
		public short channel;
		public short[] macAddress = new short[6];

		public String toString() {
			return "[" + "enable = " + enable + ", " + "ssid = " + ssid + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "encryption = " + encryption + ", " + "hidden = " + hidden + ", " + "channel = " + channel + ", " + "macAddress = " + Arrays.toString(macAddress) + "]";
		}
	}

	public class Wifi2MeshConfiguration {
		public boolean enable;
		public short[] rootIP = new short[4];
		public short[] rootSubnetMask = new short[4];
		public short[] rootGateway = new short[4];
		public short[] routerBSSID = new short[6];
		public short[] groupID = new short[6];
		public String groupSSIDPrefix;
		public short[] gatewayIP = new short[4];
		public int gatewayPort;

		public String toString() {
			return "[" + "enable = " + enable + ", " + "rootIP = " + Arrays.toString(rootIP) + ", " + "rootSubnetMask = " + Arrays.toString(rootSubnetMask) + ", " + "rootGateway = " + Arrays.toString(rootGateway) + ", " + "routerBSSID = " + Arrays.toString(routerBSSID) + ", " + "groupID = " + Arrays.toString(groupID) + ", " + "groupSSIDPrefix = " + groupSSIDPrefix + ", " + "gatewayIP = " + Arrays.toString(gatewayIP) + ", " + "gatewayPort = " + gatewayPort + "]";
		}
	}

	public class Wifi2MeshCommonStatus {
		public short status;
		public boolean rootNode;
		public boolean rootCandidate;
		public int connectedNodes;
		public long rxCount;
		public long txCount;

		public String toString() {
			return "[" + "status = " + status + ", " + "rootNode = " + rootNode + ", " + "rootCandidate = " + rootCandidate + ", " + "connectedNodes = " + connectedNodes + ", " + "rxCount = " + rxCount + ", " + "txCount = " + txCount + "]";
		}
	}

	public class Wifi2MeshClientStatus {
		public String hostname;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public short[] macAddress = new short[6];

		public String toString() {
			return "[" + "hostname = " + hostname + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "macAddress = " + Arrays.toString(macAddress) + "]";
		}
	}

	public class Wifi2MeshAPStatus {
		public String ssid;
		public short[] ip = new short[4];
		public short[] subnetMask = new short[4];
		public short[] gateway = new short[4];
		public short[] macAddress = new short[6];

		public String toString() {
			return "[" + "ssid = " + ssid + ", " + "ip = " + Arrays.toString(ip) + ", " + "subnetMask = " + Arrays.toString(subnetMask) + ", " + "gateway = " + Arrays.toString(gateway) + ", " + "macAddress = " + Arrays.toString(macAddress) + "]";
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
	 * {@link BrickMaster#setStackCurrentCallbackPeriod(long)}. The parameter is the current
	 * of the sensor.
	 * 
	 * The {@link BrickMaster.StackCurrentListener} listener is only triggered if the current has changed
	 * since the last triggering.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface StackCurrentListener extends DeviceListener {
		public void stackCurrent(int current);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickMaster#setStackVoltageCallbackPeriod(long)}. The parameter is the voltage
	 * of the sensor.
	 * 
	 * The {@link BrickMaster.StackVoltageListener} listener is only triggered if the voltage has changed
	 * since the last triggering.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface StackVoltageListener extends DeviceListener {
		public void stackVoltage(int voltage);
	}

	/**
	 * This listener is triggered periodically with the period that is set by
	 * {@link BrickMaster#setUSBVoltageCallbackPeriod(long)}. The parameter is the USB
	 * voltage in mV.
	 * 
	 * The {@link BrickMaster.USBVoltageListener} listener is only triggered if the USB voltage has changed
	 * since the last triggering.
	 * 
	 * Does not work with hardware version 2.1.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface USBVoltageListener extends DeviceListener {
		public void usbVoltage(int voltage);
	}

	/**
	 * This listener is triggered when the threshold as set by
	 * {@link BrickMaster#setStackCurrentCallbackThreshold(char, int, int)} is reached.
	 * The parameter is the stack current in mA.
	 * 
	 * If the threshold keeps being reached, the listener is triggered periodically
	 * with the period as set by {@link BrickMaster#setDebouncePeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface StackCurrentReachedListener extends DeviceListener {
		public void stackCurrentReached(int current);
	}

	/**
	 * This listener is triggered when the threshold as set by
	 * {@link BrickMaster#setStackVoltageCallbackThreshold(char, int, int)} is reached.
	 * The parameter is the stack voltage in mV.
	 * 
	 * If the threshold keeps being reached, the listener is triggered periodically
	 * with the period as set by {@link BrickMaster#setDebouncePeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface StackVoltageReachedListener extends DeviceListener {
		public void stackVoltageReached(int voltage);
	}

	/**
	 * This listener is triggered when the threshold as set by
	 * {@link BrickMaster#setUSBVoltageCallbackThreshold(char, int, int)} is reached.
	 * The parameter is the voltage of the sensor.
	 * 
	 * If the threshold keeps being reached, the listener is triggered periodically
	 * with the period as set by {@link BrickMaster#setDebouncePeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public interface USBVoltageReachedListener extends DeviceListener {
		public void usbVoltageReached(int voltage);
	}

	/**
	 * Creates an object with the unique device ID \c uid. and adds it to
	 * the IP Connection \c ipcon.
	 */
	public BrickMaster(String uid, IPConnection ipcon) {
		super(uid, ipcon);

		apiVersion[0] = 2;
		apiVersion[1] = 0;
		apiVersion[2] = 4;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_CURRENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_EXTENSION_TYPE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_EXTENSION_TYPE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_CHIBI_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_MASTER_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_MASTER_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_SIGNAL_STRENGTH)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_ERROR_LOG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_FREQUENCY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_CHIBI_CHANNEL)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CHIBI_CHANNEL)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_RS485_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_SLAVE_ADDRESS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_ERROR_LOG)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_RS485_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_WIFI_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_ENCRYPTION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_ENCRYPTION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_REFRESH_WIFI_STATUS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_CERTIFICATE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_CERTIFICATE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_POWER_MODE)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_POWER_MODE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_BUFFER_INFO)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_REGULATORY_DOMAIN)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_REGULATORY_DOMAIN)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_USB_VOLTAGE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_LONG_WIFI_KEY)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_LONG_WIFI_KEY)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_HOSTNAME)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_HOSTNAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STACK_CURRENT_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_CURRENT_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STACK_VOLTAGE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_VOLTAGE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_USB_VOLTAGE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_USB_VOLTAGE_CALLBACK_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STACK_CURRENT_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_CURRENT_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_STACK_VOLTAGE_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_STACK_VOLTAGE_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_USB_VOLTAGE_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_USB_VOLTAGE_CALLBACK_THRESHOLD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_DEBOUNCE_PERIOD)] = RESPONSE_EXPECTED_FLAG_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_DEBOUNCE_PERIOD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_ETHERNET_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ETHERNET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ETHERNET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ETHERNET_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ETHERNET_HOSTNAME)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ETHERNET_MAC_ADDRESS)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ETHERNET_WEBSOCKET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ETHERNET_WEBSOCKET_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_ETHERNET_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_ETHERNET_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_CONNECTION_TYPE)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_WIFI2_PRESENT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_START_WIFI2_BOOTLOADER)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_WRITE_WIFI2_SERIAL_PORT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_READ_WIFI2_SERIAL_PORT)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_AUTHENTICATION_SECRET)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_CLIENT_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_CLIENT_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_CLIENT_HOSTNAME)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_CLIENT_HOSTNAME)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_CLIENT_PASSWORD)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_CLIENT_PASSWORD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_AP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_AP_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_AP_PASSWORD)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_AP_PASSWORD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SAVE_WIFI2_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_FIRMWARE_VERSION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_ENABLE_WIFI2_STATUS_LED)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_DISABLE_WIFI2_STATUS_LED)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_IS_WIFI2_STATUS_LED_ENABLED)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_MESH_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_CONFIGURATION)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_MESH_ROUTER_SSID)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_ROUTER_SSID)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_SET_WIFI2_MESH_ROUTER_PASSWORD)] = RESPONSE_EXPECTED_FLAG_FALSE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_ROUTER_PASSWORD)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_COMMON_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_CLIENT_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
		responseExpected[IPConnection.unsignedByte(FUNCTION_GET_WIFI2_MESH_AP_STATUS)] = RESPONSE_EXPECTED_FLAG_ALWAYS_TRUE;
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

		callbacks[CALLBACK_STACK_CURRENT] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int current = IPConnection.unsignedShort(bb.getShort());

				for (StackCurrentListener listener: listenerStackCurrent) {
					listener.stackCurrent(current);
				}
			}
		};

		callbacks[CALLBACK_STACK_VOLTAGE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int voltage = IPConnection.unsignedShort(bb.getShort());

				for (StackVoltageListener listener: listenerStackVoltage) {
					listener.stackVoltage(voltage);
				}
			}
		};

		callbacks[CALLBACK_USB_VOLTAGE] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int voltage = IPConnection.unsignedShort(bb.getShort());

				for (USBVoltageListener listener: listenerUSBVoltage) {
					listener.usbVoltage(voltage);
				}
			}
		};

		callbacks[CALLBACK_STACK_CURRENT_REACHED] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int current = IPConnection.unsignedShort(bb.getShort());

				for (StackCurrentReachedListener listener: listenerStackCurrentReached) {
					listener.stackCurrentReached(current);
				}
			}
		};

		callbacks[CALLBACK_STACK_VOLTAGE_REACHED] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int voltage = IPConnection.unsignedShort(bb.getShort());

				for (StackVoltageReachedListener listener: listenerStackVoltageReached) {
					listener.stackVoltageReached(voltage);
				}
			}
		};

		callbacks[CALLBACK_USB_VOLTAGE_REACHED] = new IPConnection.DeviceCallbackListener() {
			public void callback(byte[] packet) {
				ByteBuffer bb = ByteBuffer.wrap(packet, 8, packet.length - 8);
				bb.order(ByteOrder.LITTLE_ENDIAN);

				int voltage = IPConnection.unsignedShort(bb.getShort());

				for (USBVoltageReachedListener listener: listenerUSBVoltageReached) {
					listener.usbVoltageReached(voltage);
				}
			}
		};
	}

	/**
	 * Returns the stack voltage in mV. The stack voltage is the
	 * voltage that is supplied via the stack, i.e. it is given by a
	 * Step-Down or Step-Up Power Supply.
	 */
	public int getStackVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Returns the stack current in mA. The stack current is the
	 * current that is drawn via the stack, i.e. it is given by a
	 * Step-Down or Step-Up Power Supply.
	 */
	public int getStackCurrent() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_CURRENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int current = IPConnection.unsignedShort(bb.getShort());

		return current;
	}

	/**
	 * Writes the extension type to the EEPROM of a specified extension.
	 * The extension is either 0 or 1 (0 is the on the bottom, 1 is the one on top,
	 * if only one extension is present use 0).
	 * 
	 * Possible extension types:
	 * 
	 * \verbatim
	 *  "Type", "Description"
	 * 
	 *  "1",    "Chibi"
	 *  "2",    "RS485"
	 *  "3",    "WIFI"
	 *  "4",    "Ethernet"
	 *  "5",    "WIFI 2.0"
	 * \endverbatim
	 * 
	 * The extension type is already set when bought and it can be set with the
	 * Brick Viewer, it is unlikely that you need this function.
	 */
	public void setExtensionType(short extension, long exttype) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_EXTENSION_TYPE, this);

		bb.put((byte)extension);
		bb.putInt((int)exttype);

		sendRequest(bb.array());
	}

	/**
	 * Returns the type for a given extension as set by {@link BrickMaster#setExtensionType(short, long)}.
	 */
	public long getExtensionType(short extension) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_EXTENSION_TYPE, this);

		bb.put((byte)extension);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long exttype = IPConnection.unsignedInt(bb.getInt());

		return exttype;
	}

	/**
	 * Returns *true* if a Chibi Extension is available to be used by the Master Brick.
	 */
	public boolean isChibiPresent() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_CHIBI_PRESENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the address (1-255) belonging to the Chibi Extension.
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 */
	public void setChibiAddress(short address) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_CHIBI_ADDRESS, this);

		bb.put((byte)address);

		sendRequest(bb.array());
	}

	/**
	 * Returns the address as set by {@link BrickMaster#setChibiAddress(short)}.
	 */
	public short getChibiAddress() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_ADDRESS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets the address (1-255) of the Chibi Master. This address is used if the
	 * Chibi Extension is used as slave (i.e. it does not have a USB connection).
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 */
	public void setChibiMasterAddress(short address) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_CHIBI_MASTER_ADDRESS, this);

		bb.put((byte)address);

		sendRequest(bb.array());
	}

	/**
	 * Returns the address as set by {@link BrickMaster#setChibiMasterAddress(short)}.
	 */
	public short getChibiMasterAddress() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_MASTER_ADDRESS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets up to 254 slave addresses. Valid addresses are in range 1-255. 0 has a
	 * special meaning, it is used as list terminator and not allowed as normal slave
	 * address. The address numeration (via \c num parameter) has to be used
	 * ascending from 0. For example: If you use the Chibi Extension in Master mode
	 * (i.e. the stack has an USB connection) and you want to talk to three other
	 * Chibi stacks with the slave addresses 17, 23, and 42, you should call with
	 * ``(0, 17)``, ``(1, 23)``, ``(2, 42)`` and ``(3, 0)``. The last call with
	 * ``(3, 0)`` is a list terminator and indicates that the Chibi slave address
	 * list contains 3 addresses in this case.
	 * 
	 * It is possible to set the addresses with the Brick Viewer, that will take care
	 * of correct address numeration and list termination.
	 * 
	 * The slave addresses will be saved in the EEPROM of the Chibi Extension, they
	 * don't have to be set on every startup.
	 */
	public void setChibiSlaveAddress(short num, short address) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_CHIBI_SLAVE_ADDRESS, this);

		bb.put((byte)num);
		bb.put((byte)address);

		sendRequest(bb.array());
	}

	/**
	 * Returns the slave address for a given \c num as set by
	 * {@link BrickMaster#setChibiSlaveAddress(short, short)}.
	 */
	public short getChibiSlaveAddress(short num) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_CHIBI_SLAVE_ADDRESS, this);

		bb.put((byte)num);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Returns the signal strength in dBm. The signal strength updates every time a
	 * packet is received.
	 */
	public short getChibiSignalStrength() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_SIGNAL_STRENGTH, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short signalStrength = IPConnection.unsignedByte(bb.get());

		return signalStrength;
	}

	/**
	 * Returns underrun, CRC error, no ACK and overflow error counts of the Chibi
	 * communication. If these errors start rising, it is likely that either the
	 * distance between two Chibi stacks is becoming too big or there are
	 * interferences.
	 */
	public ChibiErrorLog getChibiErrorLog() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_ERROR_LOG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ChibiErrorLog obj = new ChibiErrorLog();
		obj.underrun = IPConnection.unsignedShort(bb.getShort());
		obj.crcError = IPConnection.unsignedShort(bb.getShort());
		obj.noAck = IPConnection.unsignedShort(bb.getShort());
		obj.overflow = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the Chibi frequency range for the Chibi Extension. Possible values are:
	 * 
	 * \verbatim
	 *  "Type", "Description"
	 * 
	 *  "0",    "OQPSK 868MHz (Europe)"
	 *  "1",    "OQPSK 915MHz (US)"
	 *  "2",    "OQPSK 780MHz (China)"
	 *  "3",    "BPSK40 915MHz"
	 * \endverbatim
	 * 
	 * It is possible to set the frequency with the Brick Viewer and it will be
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 */
	public void setChibiFrequency(short frequency) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_CHIBI_FREQUENCY, this);

		bb.put((byte)frequency);

		sendRequest(bb.array());
	}

	/**
	 * Returns the frequency value as set by {@link BrickMaster#setChibiFrequency(short)}.
	 */
	public short getChibiFrequency() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_FREQUENCY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short frequency = IPConnection.unsignedByte(bb.get());

		return frequency;
	}

	/**
	 * Sets the channel used by the Chibi Extension. Possible channels are
	 * different for different frequencies:
	 * 
	 * \verbatim
	 *  "Frequency",             "Possible Channels"
	 * 
	 *  "OQPSK 868MHz (Europe)", "0"
	 *  "OQPSK 915MHz (US)",     "1, 2, 3, 4, 5, 6, 7, 8, 9, 10"
	 *  "OQPSK 780MHz (China)",  "0, 1, 2, 3"
	 *  "BPSK40 915MHz",         "1, 2, 3, 4, 5, 6, 7, 8, 9, 10"
	 * \endverbatim
	 * 
	 * It is possible to set the channel with the Brick Viewer and it will be
	 * saved in the EEPROM of the Chibi Extension, it does not
	 * have to be set on every startup.
	 */
	public void setChibiChannel(short channel) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_CHIBI_CHANNEL, this);

		bb.put((byte)channel);

		sendRequest(bb.array());
	}

	/**
	 * Returns the channel as set by {@link BrickMaster#setChibiChannel(short)}.
	 */
	public short getChibiChannel() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CHIBI_CHANNEL, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short channel = IPConnection.unsignedByte(bb.get());

		return channel;
	}

	/**
	 * Returns *true* if a RS485 Extension is available to be used by the Master Brick.
	 */
	public boolean isRS485Present() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_RS485_PRESENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the address (0-255) belonging to the RS485 Extension.
	 * 
	 * Set to 0 if the RS485 Extension should be the RS485 Master (i.e.
	 * connected to a PC via USB).
	 * 
	 * It is possible to set the address with the Brick Viewer and it will be
	 * saved in the EEPROM of the RS485 Extension, it does not
	 * have to be set on every startup.
	 */
	public void setRS485Address(short address) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_RS485_ADDRESS, this);

		bb.put((byte)address);

		sendRequest(bb.array());
	}

	/**
	 * Returns the address as set by {@link BrickMaster#setRS485Address(short)}.
	 */
	public short getRS485Address() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_RS485_ADDRESS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Sets up to 255 slave addresses. Valid addresses are in range 1-255. 0 has a
	 * special meaning, it is used as list terminator and not allowed as normal slave
	 * address. The address numeration (via ``num`` parameter) has to be used
	 * ascending from 0. For example: If you use the RS485 Extension in Master mode
	 * (i.e. the stack has an USB connection) and you want to talk to three other
	 * RS485 stacks with the addresses 17, 23, and 42, you should call with
	 * ``(0, 17)``, ``(1, 23)``, ``(2, 42)`` and ``(3, 0)``. The last call with
	 * ``(3, 0)`` is a list terminator and indicates that the RS485 slave address list
	 * contains 3 addresses in this case.
	 * 
	 * It is possible to set the addresses with the Brick Viewer, that will take care
	 * of correct address numeration and list termination.
	 * 
	 * The slave addresses will be saved in the EEPROM of the Chibi Extension, they
	 * don't have to be set on every startup.
	 */
	public void setRS485SlaveAddress(short num, short address) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_SET_RS485_SLAVE_ADDRESS, this);

		bb.put((byte)num);
		bb.put((byte)address);

		sendRequest(bb.array());
	}

	/**
	 * Returns the slave address for a given ``num`` as set by
	 * {@link BrickMaster#setRS485SlaveAddress(short, short)}.
	 */
	public short getRS485SlaveAddress(short num) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_GET_RS485_SLAVE_ADDRESS, this);

		bb.put((byte)num);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short address = IPConnection.unsignedByte(bb.get());

		return address;
	}

	/**
	 * Returns CRC error counts of the RS485 communication.
	 * If this counter starts rising, it is likely that the distance
	 * between the RS485 nodes is too big or there is some kind of
	 * interference.
	 */
	public int getRS485ErrorLog() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_RS485_ERROR_LOG, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int crcError = IPConnection.unsignedShort(bb.getShort());

		return crcError;
	}

	/**
	 * Sets the configuration of the RS485 Extension. Speed is given in baud. The
	 * Master Brick will try to match the given baud rate as exactly as possible.
	 * The maximum recommended baud rate is 2000000 (2Mbit/s).
	 * Possible values for parity are 'n' (none), 'e' (even) and 'o' (odd).
	 * Possible values for stop bits are 1 and 2.
	 * 
	 * If your RS485 is unstable (lost messages etc.), the first thing you should
	 * try is to decrease the speed. On very large bus (e.g. 1km), you probably
	 * should use a value in the range of 100000 (100kbit/s).
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 */
	public void setRS485Configuration(long speed, char parity, short stopbits) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)14, FUNCTION_SET_RS485_CONFIGURATION, this);

		bb.putInt((int)speed);
		bb.put((byte)parity);
		bb.put((byte)stopbits);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickMaster#setRS485Configuration(long, char, short)}.
	 */
	public RS485Configuration getRS485Configuration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_RS485_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		RS485Configuration obj = new RS485Configuration();
		obj.speed = IPConnection.unsignedInt(bb.getInt());
		obj.parity = (char)(bb.get());
		obj.stopbits = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns *true* if a WIFI Extension is available to be used by the Master Brick.
	 */
	public boolean isWifiPresent() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_WIFI_PRESENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the configuration of the WIFI Extension. The ``ssid`` can have a max length
	 * of 32 characters. Possible values for ``connection`` are:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "DHCP"
	 *  "1", "Static IP"
	 *  "2", "Access Point: DHCP"
	 *  "3", "Access Point: Static IP"
	 *  "4", "Ad Hoc: DHCP"
	 *  "5", "Ad Hoc: Static IP"
	 * \endverbatim
	 * 
	 * If you set ``connection`` to one of the static IP options then you have to
	 * supply ``ip``, ``subnet_mask`` and ``gateway`` as an array of size 4 (first
	 * element of the array is the least significant byte of the address). If
	 * ``connection`` is set to one of the DHCP options then ``ip``, ``subnet_mask``
	 * and ``gateway`` are ignored, you can set them to 0.
	 * 
	 * The last parameter is the port that your program will connect to. The
	 * default port, that is used by brickd, is 4223.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the WIFI configuration.
	 */
	public void setWifiConfiguration(String ssid, short connection, short[] ip, short[] subnetMask, short[] gateway, int port) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)55, FUNCTION_SET_WIFI_CONFIGURATION, this);

		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)ssid.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}
		bb.put((byte)connection);
		for (int i = 0; i < 4; i++) {
			bb.put((byte)ip[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)subnetMask[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)gateway[i]);
		}
		bb.putShort((short)port);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickMaster#setWifiConfiguration(String, short, short[], short[], short[], int)}.
	 */
	public WifiConfiguration getWifiConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiConfiguration obj = new WifiConfiguration();
		obj.ssid = IPConnection.string(bb, 32);
		obj.connection = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.port = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the encryption of the WIFI Extension. The first parameter is the
	 * type of the encryption. Possible values are:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "WPA/WPA2"
	 *  "1", "WPA Enterprise (EAP-FAST, EAP-TLS, EAP-TTLS, PEAP)"
	 *  "2", "WEP"
	 *  "3", "No Encryption"
	 * \endverbatim
	 * 
	 * The ``key`` has a max length of 50 characters and is used if ``encryption``
	 * is set to 0 or 2 (WPA/WPA2 or WEP). Otherwise the value is ignored.
	 * 
	 * For WPA/WPA2 the key has to be at least 8 characters long. If you want to set
	 * a key with more than 50 characters, see {@link BrickMaster#setLongWifiKey(String)}.
	 * 
	 * For WEP the key has to be either 10 or 26 hexadecimal digits long. It is
	 * possible to set the WEP ``key_index`` (1-4). If you don't know your
	 * ``key_index``, it is likely 1.
	 * 
	 * If you choose WPA Enterprise as encryption, you have to set ``eap_options`` and
	 * the length of the certificates (for other encryption types these parameters
	 * are ignored). The certificate length are given in byte and the certificates
	 * themselves can be set with {@link BrickMaster#setWifiCertificate(int, short[], short)}. ``eap_options`` consist
	 * of the outer authentication (bits 1-2), inner authentication (bit 3) and
	 * certificate type (bits 4-5):
	 * 
	 * \verbatim
	 *  "Option", "Bits", "Description"
	 * 
	 *  "outer authentication", "1-2", "0=EAP-FAST, 1=EAP-TLS, 2=EAP-TTLS, 3=EAP-PEAP"
	 *  "inner authentication", "3", "0=EAP-MSCHAP, 1=EAP-GTC"
	 *  "certificate type", "4-5", "0=CA Certificate, 1=Client Certificate, 2=Private Key"
	 * \endverbatim
	 * 
	 * Example for EAP-TTLS + EAP-GTC + Private Key: ``option = 2 | (1 &lt;&lt; 2) | (2 &lt;&lt; 3)``.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the Wi-Fi encryption.
	 */
	public void setWifiEncryption(short encryption, String key, short keyIndex, short eapOptions, int caCertificateLength, int clientCertificateLength, int privateKeyLength) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)67, FUNCTION_SET_WIFI_ENCRYPTION, this);

		bb.put((byte)encryption);
		for (int i = 0; i < 50; i++) {
			try {
				bb.put((byte)key.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}
		bb.put((byte)keyIndex);
		bb.put((byte)eapOptions);
		bb.putShort((short)caCertificateLength);
		bb.putShort((short)clientCertificateLength);
		bb.putShort((short)privateKeyLength);

		sendRequest(bb.array());
	}

	/**
	 * Returns the encryption as set by {@link BrickMaster#setWifiEncryption(short, String, short, short, int, int, int)}.
	 * 
	 * \note
	 *  Since Master Brick Firmware version 2.4.4 the key is not returned anymore.
	 */
	public WifiEncryption getWifiEncryption() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_ENCRYPTION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiEncryption obj = new WifiEncryption();
		obj.encryption = IPConnection.unsignedByte(bb.get());
		obj.key = IPConnection.string(bb, 50);
		obj.keyIndex = IPConnection.unsignedByte(bb.get());
		obj.eapOptions = IPConnection.unsignedByte(bb.get());
		obj.caCertificateLength = IPConnection.unsignedShort(bb.getShort());
		obj.clientCertificateLength = IPConnection.unsignedShort(bb.getShort());
		obj.privateKeyLength = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Returns the status of the WIFI Extension. The ``state`` is updated automatically,
	 * all of the other parameters are updated on startup and every time
	 * {@link BrickMaster#refreshWifiStatus()} is called.
	 * 
	 * Possible states are:
	 * 
	 * \verbatim
	 *  "State", "Description"
	 * 
	 *  "0", "Disassociated"
	 *  "1", "Associated"
	 *  "2", "Associating"
	 *  "3", "Error"
	 *  "255", "Not initialized yet"
	 * \endverbatim
	 */
	public WifiStatus getWifiStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiStatus obj = new WifiStatus();
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.bssid[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.channel = IPConnection.unsignedByte(bb.get());
		obj.rssi = (bb.getShort());
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.rxCount = IPConnection.unsignedInt(bb.getInt());
		obj.txCount = IPConnection.unsignedInt(bb.getInt());
		obj.state = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Refreshes the Wi-Fi status (see {@link BrickMaster#getWifiStatus()}). To read the status
	 * of the Wi-Fi module, the Master Brick has to change from data mode to
	 * command mode and back. This transaction and the readout itself is
	 * unfortunately time consuming. This means, that it might take some ms
	 * until the stack with attached WIFI Extension reacts again after this
	 * function is called.
	 */
	public void refreshWifiStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_REFRESH_WIFI_STATUS, this);


		sendRequest(bb.array());
	}

	/**
	 * This function is used to set the certificate as well as password and username
	 * for WPA Enterprise. To set the username use index 0xFFFF,
	 * to set the password use index 0xFFFE. The max length of username and
	 * password is 32.
	 * 
	 * The certificate is written in chunks of size 32 and the index is used as
	 * the index of the chunk. ``data_length`` should nearly always be 32. Only
	 * the last chunk can have a length that is not equal to 32.
	 * 
	 * The starting index of the CA Certificate is 0, of the Client Certificate
	 * 10000 and for the Private Key 20000. Maximum sizes are 1312, 1312 and
	 * 4320 byte respectively.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after uploading the certificate.
	 * 
	 * It is recommended to use the Brick Viewer to set the certificate, username
	 * and password.
	 */
	public void setWifiCertificate(int index, short[] data, short dataLength) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)43, FUNCTION_SET_WIFI_CERTIFICATE, this);

		bb.putShort((short)index);
		for (int i = 0; i < 32; i++) {
			bb.put((byte)data[i]);
		}
		bb.put((byte)dataLength);

		sendRequest(bb.array());
	}

	/**
	 * Returns the certificate for a given index as set by {@link BrickMaster#setWifiCertificate(int, short[], short)}.
	 */
	public WifiCertificate getWifiCertificate(int index) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)10, FUNCTION_GET_WIFI_CERTIFICATE, this);

		bb.putShort((short)index);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiCertificate obj = new WifiCertificate();
		for (int i = 0; i < 32; i++) {
			obj.data[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.dataLength = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the power mode of the WIFI Extension. Possible modes are:
	 * 
	 * \verbatim
	 *  "Mode", "Description"
	 * 
	 *  "0", "Full Speed (high power consumption, high throughput)"
	 *  "1", "Low Power (low power consumption, low throughput)"
	 * \endverbatim
	 * 
	 * The default value is 0 (Full Speed).
	 */
	public void setWifiPowerMode(short mode) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_WIFI_POWER_MODE, this);

		bb.put((byte)mode);

		sendRequest(bb.array());
	}

	/**
	 * Returns the power mode as set by {@link BrickMaster#setWifiPowerMode(short)}.
	 */
	public short getWifiPowerMode() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_POWER_MODE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short mode = IPConnection.unsignedByte(bb.get());

		return mode;
	}

	/**
	 * Returns informations about the Wi-Fi receive buffer. The Wi-Fi
	 * receive buffer has a max size of 1500 byte and if data is transfered
	 * too fast, it might overflow.
	 * 
	 * The return values are the number of overflows, the low watermark
	 * (i.e. the smallest number of bytes that were free in the buffer) and
	 * the bytes that are currently used.
	 * 
	 * You should always try to keep the buffer empty, otherwise you will
	 * have a permanent latency. A good rule of thumb is, that you can transfer
	 * 1000 messages per second without problems.
	 * 
	 * Try to not send more then 50 messages at a time without any kind of
	 * break between them.
	 */
	public WifiBufferInfo getWifiBufferInfo() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_BUFFER_INFO, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		WifiBufferInfo obj = new WifiBufferInfo();
		obj.overflow = IPConnection.unsignedInt(bb.getInt());
		obj.lowWatermark = IPConnection.unsignedShort(bb.getShort());
		obj.used = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the regulatory domain of the WIFI Extension. Possible domains are:
	 * 
	 * \verbatim
	 *  "Domain", "Description"
	 * 
	 *  "0", "FCC: Channel 1-11 (N/S America, Australia, New Zealand)"
	 *  "1", "ETSI: Channel 1-13 (Europe, Middle East, Africa)"
	 *  "2", "TELEC: Channel 1-14 (Japan)"
	 * \endverbatim
	 * 
	 * The default value is 1 (ETSI).
	 */
	public void setWifiRegulatoryDomain(short domain) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_SET_WIFI_REGULATORY_DOMAIN, this);

		bb.put((byte)domain);

		sendRequest(bb.array());
	}

	/**
	 * Returns the regulatory domain as set by {@link BrickMaster#setWifiRegulatoryDomain(short)}.
	 */
	public short getWifiRegulatoryDomain() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_REGULATORY_DOMAIN, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short domain = IPConnection.unsignedByte(bb.get());

		return domain;
	}

	/**
	 * Returns the USB voltage in mV. Does not work with hardware version 2.1.
	 */
	public int getUSBVoltage() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_USB_VOLTAGE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		int voltage = IPConnection.unsignedShort(bb.getShort());

		return voltage;
	}

	/**
	 * Sets a long Wi-Fi key (up to 63 chars, at least 8 chars) for WPA encryption.
	 * This key will be used
	 * if the key in {@link BrickMaster#setWifiEncryption(short, String, short, short, int, int, int)} is set to "-". In the old protocol,
	 * a payload of size 63 was not possible, so the maximum key length was 50 chars.
	 * 
	 * With the new protocol this is possible, since we didn't want to break API,
	 * this function was added additionally.
	 * 
	 * .. versionadded:: 2.0.2$nbsp;(Firmware)
	 */
	public void setLongWifiKey(String key) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_LONG_WIFI_KEY, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)key.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the encryption key as set by {@link BrickMaster#setLongWifiKey(String)}.
	 * 
	 * \note
	 *  Since Master Brick firmware version 2.4.4 the key is not returned anymore.
	 * 
	 * .. versionadded:: 2.0.2$nbsp;(Firmware)
	 */
	public String getLongWifiKey() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_LONG_WIFI_KEY, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String key = IPConnection.string(bb, 64);

		return key;
	}

	/**
	 * Sets the hostname of the WIFI Extension. The hostname will be displayed
	 * by access points as the hostname in the DHCP clients table.
	 * 
	 * Setting an empty String will restore the default hostname.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setWifiHostname(String hostname) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)24, FUNCTION_SET_WIFI_HOSTNAME, this);

		for (int i = 0; i < 16; i++) {
			try {
				bb.put((byte)hostname.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the hostname as set by {@link BrickMaster#setWifiHostname(String)}.
	 * 
	 * An empty String means, that the default hostname is used.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public String getWifiHostname() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_HOSTNAME, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String hostname = IPConnection.string(bb, 16);

		return hostname;
	}

	/**
	 * Sets the period in ms with which the {@link BrickMaster.StackCurrentListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickMaster.StackCurrentListener} listener is only triggered if the current has changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setStackCurrentCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_STACK_CURRENT_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickMaster#setStackCurrentCallbackPeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public long getStackCurrentCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_CURRENT_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickMaster.StackVoltageListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickMaster.StackVoltageListener} listener is only triggered if the voltage has changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setStackVoltageCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_STACK_VOLTAGE_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickMaster#setStackVoltageCallbackPeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public long getStackVoltageCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_VOLTAGE_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the period in ms with which the {@link BrickMaster.USBVoltageListener} listener is triggered
	 * periodically. A value of 0 turns the listener off.
	 * 
	 * The {@link BrickMaster.USBVoltageListener} listener is only triggered if the voltage has changed
	 * since the last triggering.
	 * 
	 * The default value is 0.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setUSBVoltageCallbackPeriod(long period) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_USB_VOLTAGE_CALLBACK_PERIOD, this);

		bb.putInt((int)period);

		sendRequest(bb.array());
	}

	/**
	 * Returns the period as set by {@link BrickMaster#setUSBVoltageCallbackPeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public long getUSBVoltageCallbackPeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_USB_VOLTAGE_CALLBACK_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long period = IPConnection.unsignedInt(bb.getInt());

		return period;
	}

	/**
	 * Sets the thresholds for the {@link BrickMaster.StackCurrentReachedListener} listener.
	 * 
	 * The following options are possible:
	 * 
	 * \verbatim
	 *  "Option", "Description"
	 * 
	 *  "'x'",    "Listener is turned off"
	 *  "'o'",    "Listener is triggered when the current is *outside* the min and max values"
	 *  "'i'",    "Listener is triggered when the current is *inside* the min and max values"
	 *  "'&lt;'",    "Listener is triggered when the current is smaller than the min value (max is ignored)"
	 *  "'&gt;'",    "Listener is triggered when the current is greater than the min value (max is ignored)"
	 * \endverbatim
	 * 
	 * The default value is ('x', 0, 0).
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setStackCurrentCallbackThreshold(char option, int min, int max) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_STACK_CURRENT_CALLBACK_THRESHOLD, this);

		bb.put((byte)option);
		bb.putShort((short)min);
		bb.putShort((short)max);

		sendRequest(bb.array());
	}

	/**
	 * Returns the threshold as set by {@link BrickMaster#setStackCurrentCallbackThreshold(char, int, int)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public StackCurrentCallbackThreshold getStackCurrentCallbackThreshold() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_CURRENT_CALLBACK_THRESHOLD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		StackCurrentCallbackThreshold obj = new StackCurrentCallbackThreshold();
		obj.option = (char)(bb.get());
		obj.min = IPConnection.unsignedShort(bb.getShort());
		obj.max = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the thresholds for the {@link BrickMaster.StackVoltageReachedListener} listener.
	 * 
	 * The following options are possible:
	 * 
	 * \verbatim
	 *  "Option", "Description"
	 * 
	 *  "'x'",    "Listener is turned off"
	 *  "'o'",    "Listener is triggered when the voltage is *outside* the min and max values"
	 *  "'i'",    "Listener is triggered when the voltage is *inside* the min and max values"
	 *  "'&lt;'",    "Listener is triggered when the voltage is smaller than the min value (max is ignored)"
	 *  "'&gt;'",    "Listener is triggered when the voltage is greater than the min value (max is ignored)"
	 * \endverbatim
	 * 
	 * The default value is ('x', 0, 0).
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setStackVoltageCallbackThreshold(char option, int min, int max) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_STACK_VOLTAGE_CALLBACK_THRESHOLD, this);

		bb.put((byte)option);
		bb.putShort((short)min);
		bb.putShort((short)max);

		sendRequest(bb.array());
	}

	/**
	 * Returns the threshold as set by {@link BrickMaster#setStackVoltageCallbackThreshold(char, int, int)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public StackVoltageCallbackThreshold getStackVoltageCallbackThreshold() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_STACK_VOLTAGE_CALLBACK_THRESHOLD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		StackVoltageCallbackThreshold obj = new StackVoltageCallbackThreshold();
		obj.option = (char)(bb.get());
		obj.min = IPConnection.unsignedShort(bb.getShort());
		obj.max = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the thresholds for the {@link BrickMaster.USBVoltageReachedListener} listener.
	 * 
	 * The following options are possible:
	 * 
	 * \verbatim
	 *  "Option", "Description"
	 * 
	 *  "'x'",    "Listener is turned off"
	 *  "'o'",    "Listener is triggered when the voltage is *outside* the min and max values"
	 *  "'i'",    "Listener is triggered when the voltage is *inside* the min and max values"
	 *  "'&lt;'",    "Listener is triggered when the voltage is smaller than the min value (max is ignored)"
	 *  "'&gt;'",    "Listener is triggered when the voltage is greater than the min value (max is ignored)"
	 * \endverbatim
	 * 
	 * The default value is ('x', 0, 0).
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setUSBVoltageCallbackThreshold(char option, int min, int max) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_USB_VOLTAGE_CALLBACK_THRESHOLD, this);

		bb.put((byte)option);
		bb.putShort((short)min);
		bb.putShort((short)max);

		sendRequest(bb.array());
	}

	/**
	 * Returns the threshold as set by {@link BrickMaster#setUSBVoltageCallbackThreshold(char, int, int)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public USBVoltageCallbackThreshold getUSBVoltageCallbackThreshold() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_USB_VOLTAGE_CALLBACK_THRESHOLD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		USBVoltageCallbackThreshold obj = new USBVoltageCallbackThreshold();
		obj.option = (char)(bb.get());
		obj.min = IPConnection.unsignedShort(bb.getShort());
		obj.max = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the period in ms with which the threshold listeners
	 * 
	 * * {@link BrickMaster.StackCurrentReachedListener},
	 * * {@link BrickMaster.StackVoltageReachedListener},
	 * * {@link BrickMaster.USBVoltageReachedListener}
	 * 
	 * are triggered, if the thresholds
	 * 
	 * * {@link BrickMaster#setStackCurrentCallbackThreshold(char, int, int)},
	 * * {@link BrickMaster#setStackVoltageCallbackThreshold(char, int, int)},
	 * * {@link BrickMaster#setUSBVoltageCallbackThreshold(char, int, int)}
	 * 
	 * keep being reached.
	 * 
	 * The default value is 100.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public void setDebouncePeriod(long debounce) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)12, FUNCTION_SET_DEBOUNCE_PERIOD, this);

		bb.putInt((int)debounce);

		sendRequest(bb.array());
	}

	/**
	 * Returns the debounce period as set by {@link BrickMaster#setDebouncePeriod(long)}.
	 * 
	 * .. versionadded:: 2.0.5$nbsp;(Firmware)
	 */
	public long getDebouncePeriod() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_DEBOUNCE_PERIOD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		long debounce = IPConnection.unsignedInt(bb.getInt());

		return debounce;
	}

	/**
	 * Returns *true* if a Ethernet Extension is available to be used by the Master
	 * Brick.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public boolean isEthernetPresent() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_ETHERNET_PRESENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Sets the configuration of the Ethernet Extension. Possible values for
	 * ``connection`` are:
	 * 
	 * \verbatim
	 *  "Value", "Description"
	 * 
	 *  "0", "DHCP"
	 *  "1", "Static IP"
	 * \endverbatim
	 * 
	 * If you set ``connection`` to static IP options then you have to supply ``ip``,
	 * ``subnet_mask`` and ``gateway`` as an array of size 4 (first element of the
	 * array is the least significant byte of the address). If ``connection`` is set
	 * to the DHCP options then ``ip``, ``subnet_mask`` and ``gateway`` are ignored,
	 * you can set them to 0.
	 * 
	 * The last parameter is the port that your program will connect to. The
	 * default port, that is used by brickd, is 4223.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the Ethernet configuration.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public void setEthernetConfiguration(short connection, short[] ip, short[] subnetMask, short[] gateway, int port) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)23, FUNCTION_SET_ETHERNET_CONFIGURATION, this);

		bb.put((byte)connection);
		for (int i = 0; i < 4; i++) {
			bb.put((byte)ip[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)subnetMask[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)gateway[i]);
		}
		bb.putShort((short)port);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickMaster#setEthernetConfiguration(short, short[], short[], short[], int)}.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public EthernetConfiguration getEthernetConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ETHERNET_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		EthernetConfiguration obj = new EthernetConfiguration();
		obj.connection = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.port = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Returns the status of the Ethernet Extension.
	 * 
	 * ``mac_address``, ``ip``, ``subnet_mask`` and ``gateway`` are given as an array.
	 * The first element of the array is the least significant byte of the address.
	 * 
	 * ``rx_count`` and ``tx_count`` are the number of bytes that have been
	 * received/send since last restart.
	 * 
	 * ``hostname`` is the currently used hostname.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public EthernetStatus getEthernetStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ETHERNET_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		EthernetStatus obj = new EthernetStatus();
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.rxCount = IPConnection.unsignedInt(bb.getInt());
		obj.txCount = IPConnection.unsignedInt(bb.getInt());
		obj.hostname = IPConnection.string(bb, 32);

		return obj;
	}

	/**
	 * Sets the hostname of the Ethernet Extension. The hostname will be displayed
	 * by access points as the hostname in the DHCP clients table.
	 * 
	 * Setting an empty String will restore the default hostname.
	 * 
	 * The current hostname can be discovered with {@link BrickMaster#getEthernetStatus()}.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public void setEthernetHostname(String hostname) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)40, FUNCTION_SET_ETHERNET_HOSTNAME, this);

		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)hostname.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Sets the MAC address of the Ethernet Extension. The Ethernet Extension should
	 * come configured with a valid MAC address, that is also written on a
	 * sticker of the extension itself.
	 * 
	 * The MAC address can be read out again with {@link BrickMaster#getEthernetStatus()}.
	 * 
	 * .. versionadded:: 2.1.0$nbsp;(Firmware)
	 */
	public void setEthernetMACAddress(short[] macAddress) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)14, FUNCTION_SET_ETHERNET_MAC_ADDRESS, this);

		for (int i = 0; i < 6; i++) {
			bb.put((byte)macAddress[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * Sets the Ethernet WebSocket configuration. The first parameter sets the number of socket
	 * connections that are reserved for WebSockets. The range is 0-7. The connections
	 * are shared with the plain sockets. Example: If you set the connections to 3,
	 * there will be 3 WebSocket and 4 plain socket connections available.
	 * 
	 * The second parameter is the port for the WebSocket connections. The port can
	 * not be the same as the port for the plain socket connections.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the Ethernet configuration.
	 * 
	 * The default values are 3 for the socket connections and 4280 for the port.
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public void setEthernetWebsocketConfiguration(short sockets, int port) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)11, FUNCTION_SET_ETHERNET_WEBSOCKET_CONFIGURATION, this);

		bb.put((byte)sockets);
		bb.putShort((short)port);

		sendRequest(bb.array());
	}

	/**
	 * Returns the configuration as set by {@link BrickMaster#setEthernetConfiguration(short, short[], short[], short[], int)}.
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public EthernetWebsocketConfiguration getEthernetWebsocketConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ETHERNET_WEBSOCKET_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		EthernetWebsocketConfiguration obj = new EthernetWebsocketConfiguration();
		obj.sockets = IPConnection.unsignedByte(bb.get());
		obj.port = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Sets the Ethernet authentication secret. The secret can be a string of up to 64
	 * characters. An empty string disables the authentication.
	 * 
	 * See the :ref:`authentication tutorial &lt;tutorial_authentication&gt;` for more
	 * information.
	 * 
	 * The secret is stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the Ethernet authentication secret.
	 * 
	 * The default value is an empty string (authentication disabled).
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public void setEthernetAuthenticationSecret(String secret) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_ETHERNET_AUTHENTICATION_SECRET, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)secret.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the authentication secret as set by
	 * {@link BrickMaster#setEthernetAuthenticationSecret(String)}.
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public String getEthernetAuthenticationSecret() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_ETHERNET_AUTHENTICATION_SECRET, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String secret = IPConnection.string(bb, 64);

		return secret;
	}

	/**
	 * Sets the WIFI authentication secret. The secret can be a string of up to 64
	 * characters. An empty string disables the authentication.
	 * 
	 * See the :ref:`authentication tutorial &lt;tutorial_authentication&gt;` for more
	 * information.
	 * 
	 * The secret is stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * It is recommended to use the Brick Viewer to set the WIFI authentication secret.
	 * 
	 * The default value is an empty string (authentication disabled).
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public void setWifiAuthenticationSecret(String secret) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_WIFI_AUTHENTICATION_SECRET, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)secret.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the authentication secret as set by
	 * {@link BrickMaster#setWifiAuthenticationSecret(String)}.
	 * 
	 * .. versionadded:: 2.2.0$nbsp;(Firmware)
	 */
	public String getWifiAuthenticationSecret() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI_AUTHENTICATION_SECRET, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String secret = IPConnection.string(bb, 64);

		return secret;
	}

	/**
	 * Returns the type of the connection over which this function was called.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public short getConnectionType() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_CONNECTION_TYPE, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short connectionType = IPConnection.unsignedByte(bb.get());

		return connectionType;
	}

	/**
	 * Returns *true* if a WIFI Extension 2.0 is available to be used by the Master
	 * Brick.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public boolean isWifi2Present() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_WIFI2_PRESENT, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean present = (bb.get()) != 0;

		return present;
	}

	/**
	 * Starts the bootloader of the WIFI Extension 2.0. Returns 0 on success.
	 * Afterwards the {@link BrickMaster#writeWifi2SerialPort(short[], short)} and {@link BrickMaster#readWifi2SerialPort(short)}
	 * functions can be used to communicate with the bootloader to flash a new
	 * firmware.
	 * 
	 * The bootloader should only be started over a USB connection. It cannot be
	 * started over a WIFI2 connection, see the {@link BrickMaster#getConnectionType()} function.
	 * 
	 * It is recommended to use the Brick Viewer to update the firmware of the WIFI
	 * Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public byte startWifi2Bootloader() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_START_WIFI2_BOOTLOADER, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		byte result = (bb.get());

		return result;
	}

	/**
	 * Writes up to 60 bytes (number of bytes to be written specified by ``length``)
	 * to the serial port of the bootloader of the WIFI Extension 2.0. Returns 0 on
	 * success.
	 * 
	 * Before this function can be used the bootloader has to be started using the
	 * {@link BrickMaster#startWifi2Bootloader()} function.
	 * 
	 * It is recommended to use the Brick Viewer to update the firmware of the WIFI
	 * Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public byte writeWifi2SerialPort(short[] data, short length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)69, FUNCTION_WRITE_WIFI2_SERIAL_PORT, this);

		for (int i = 0; i < 60; i++) {
			bb.put((byte)data[i]);
		}
		bb.put((byte)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		byte result = (bb.get());

		return result;
	}

	/**
	 * Reads up to 60 bytes (number of bytes to be read specified by ``length``)
	 * from the serial port of the bootloader of the WIFI Extension 2.0.
	 * Returns the number of actually read bytes.
	 * 
	 * Before this function can be used the bootloader has to be started using the
	 * {@link BrickMaster#startWifi2Bootloader()} function.
	 * 
	 * It is recommended to use the Brick Viewer to update the firmware of the WIFI
	 * Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public ReadWifi2SerialPort readWifi2SerialPort(short length) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)9, FUNCTION_READ_WIFI2_SERIAL_PORT, this);

		bb.put((byte)length);

		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		ReadWifi2SerialPort obj = new ReadWifi2SerialPort();
		for (int i = 0; i < 60; i++) {
			obj.data[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.result = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the WIFI authentication secret. The secret can be a string of up to 64
	 * characters. An empty string disables the authentication. The default value is
	 * an empty string (authentication disabled).
	 * 
	 * See the :ref:`authentication tutorial &lt;tutorial_authentication&gt;` for more
	 * information.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2AuthenticationSecret(String secret) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_WIFI2_AUTHENTICATION_SECRET, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)secret.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the WIFI authentication secret as set by
	 * {@link BrickMaster#setWifi2AuthenticationSecret(String)}.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public String getWifi2AuthenticationSecret() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_AUTHENTICATION_SECRET, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String secret = IPConnection.string(bb, 64);

		return secret;
	}

	/**
	 * Sets the general configuration of the WIFI Extension 2.0.
	 * 
	 * The ``port`` parameter sets the port number that your programm will connect
	 * to. The default value is 4223.
	 * 
	 * The ``websocket_port`` parameter sets the WebSocket port number that your
	 * JavaScript programm will connect to. The default value is 4280.
	 * 
	 * The ``website_port`` parameter sets the port number for the website of the
	 * WIFI Extension 2.0. The default value is 80.
	 * 
	 * The ``phy_mode`` parameter sets the specific wireless network mode to be used.
	 * Possible values are B, G and N. The default value is G.
	 * 
	 * The ``sleep_mode`` parameter is currently unused.
	 * 
	 * The ``website`` parameter is used to enable or disable the web interface of
	 * the WIFI Extension 2.0, which is available from firmware version 2.0.1. Note
	 * that, for firmware version 2.0.3 and older, to disable the the web interface
	 * the ``website_port`` parameter must be set to 1 and greater than 1 to enable
	 * the web interface. For firmware version 2.0.4 and later, setting this parameter
	 * to 1 will enable the web interface and setting it to 0 will disable the web
	 * interface.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2Configuration(int port, int websocketPort, int websitePort, short phyMode, short sleepMode, short website) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)17, FUNCTION_SET_WIFI2_CONFIGURATION, this);

		bb.putShort((short)port);
		bb.putShort((short)websocketPort);
		bb.putShort((short)websitePort);
		bb.put((byte)phyMode);
		bb.put((byte)sleepMode);
		bb.put((byte)website);

		sendRequest(bb.array());
	}

	/**
	 * Returns the general configuration as set by {@link BrickMaster#setWifi2Configuration(int, int, int, short, short, short)}.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public Wifi2Configuration getWifi2Configuration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2Configuration obj = new Wifi2Configuration();
		obj.port = IPConnection.unsignedShort(bb.getShort());
		obj.websocketPort = IPConnection.unsignedShort(bb.getShort());
		obj.websitePort = IPConnection.unsignedShort(bb.getShort());
		obj.phyMode = IPConnection.unsignedByte(bb.get());
		obj.sleepMode = IPConnection.unsignedByte(bb.get());
		obj.website = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Returns the client and access point status of the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public Wifi2Status getWifi2Status() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2Status obj = new Wifi2Status();
		obj.clientEnabled = (bb.get()) != 0;
		obj.clientStatus = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 4; i++) {
			obj.clientIP[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.clientSubnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.clientGateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.clientMACAddress[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.clientRXCount = IPConnection.unsignedInt(bb.getInt());
		obj.clientTXCount = IPConnection.unsignedInt(bb.getInt());
		obj.clientRSSI = (bb.get());
		obj.apEnabled = (bb.get()) != 0;
		for (int i = 0; i < 4; i++) {
			obj.apIP[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.apSubnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.apGateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.apMACAddress[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.apRXCount = IPConnection.unsignedInt(bb.getInt());
		obj.apTXCount = IPConnection.unsignedInt(bb.getInt());
		obj.apConnectedCount = IPConnection.unsignedByte(bb.get());

		return obj;
	}

	/**
	 * Sets the client specific configuration of the WIFI Extension 2.0.
	 * 
	 * The ``enable`` parameter enables or disables the client part of the
	 * WIFI Extension 2.0. The default value is *true*.
	 * 
	 * The ``ssid`` parameter sets the SSID (up to 32 characters) of the access point
	 * to connect to.
	 * 
	 * If the ``ip`` parameter is set to all zero then ``subnet_mask`` and ``gateway``
	 * parameters are also set to all zero and DHCP is used for IP address configuration.
	 * Otherwise those three parameters can be used to configure a static IP address.
	 * The default configuration is DHCP.
	 * 
	 * If the ``mac_address`` parameter is set to all zero then the factory MAC
	 * address is used. Otherwise this parameter can be used to set a custom MAC
	 * address.
	 * 
	 * If the ``bssid`` parameter is set to all zero then WIFI Extension 2.0 will
	 * connect to any access point that matches the configured SSID. Otherwise this
	 * parameter can be used to make the WIFI Extension 2.0 only connect to an
	 * access point if SSID and BSSID match.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2ClientConfiguration(boolean enable, String ssid, short[] ip, short[] subnetMask, short[] gateway, short[] macAddress, short[] bssid) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)65, FUNCTION_SET_WIFI2_CLIENT_CONFIGURATION, this);

		bb.put((byte)(enable ? 1 : 0));
		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)ssid.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)ip[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)subnetMask[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)gateway[i]);
		}
		for (int i = 0; i < 6; i++) {
			bb.put((byte)macAddress[i]);
		}
		for (int i = 0; i < 6; i++) {
			bb.put((byte)bssid[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the client configuration as set by {@link BrickMaster#setWifi2ClientConfiguration(boolean, String, short[], short[], short[], short[], short[])}.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public Wifi2ClientConfiguration getWifi2ClientConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_CLIENT_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2ClientConfiguration obj = new Wifi2ClientConfiguration();
		obj.enable = (bb.get()) != 0;
		obj.ssid = IPConnection.string(bb, 32);
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.bssid[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
	}

	/**
	 * Sets the client hostname (up to 32 characters) of the WIFI Extension 2.0. The
	 * hostname will be displayed by access points as the hostname in the DHCP clients
	 * table.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2ClientHostname(String hostname) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)40, FUNCTION_SET_WIFI2_CLIENT_HOSTNAME, this);

		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)hostname.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the client hostname as set by {@link BrickMaster#setWifi2ClientHostname(String)}.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public String getWifi2ClientHostname() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_CLIENT_HOSTNAME, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String hostname = IPConnection.string(bb, 32);

		return hostname;
	}

	/**
	 * Sets the client password (up to 63 chars) for WPA/WPA2 encryption.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2ClientPassword(String password) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_WIFI2_CLIENT_PASSWORD, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)password.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the client password as set by {@link BrickMaster#setWifi2ClientPassword(String)}.
	 * 
	 * \note
	 *  Since WIFI Extension 2.0 firmware version 2.1.3 the password is not
	 *  returned anymore.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public String getWifi2ClientPassword() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_CLIENT_PASSWORD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String password = IPConnection.string(bb, 64);

		return password;
	}

	/**
	 * Sets the access point specific configuration of the WIFI Extension 2.0.
	 * 
	 * The ``enable`` parameter enables or disables the access point part of the
	 * WIFI Extension 2.0. The default value is true.
	 * 
	 * The ``ssid`` parameter sets the SSID (up to 32 characters) of the access point.
	 * 
	 * If the ``ip`` parameter is set to all zero then ``subnet_mask`` and ``gateway``
	 * parameters are also set to all zero and DHCP is used for IP address configuration.
	 * Otherwise those three parameters can be used to configure a static IP address.
	 * The default configuration is DHCP.
	 * 
	 * The ``encryption`` parameter sets the encryption mode to be used. Possible
	 * values are Open (no encryption), WEP or WPA/WPA2 PSK. The default value is
	 * WPA/WPA2 PSK. Use the {@link BrickMaster#setWifi2APPassword(String)} function to set the encryption
	 * password.
	 * 
	 * The ``hidden`` parameter makes the access point hide or show its SSID.
	 * The default value is *false*.
	 * 
	 * The ``channel`` parameter sets the channel (1 to 13) of the access point.
	 * The default value is 1.
	 * 
	 * If the ``mac_address`` parameter is set to all zero then the factory MAC
	 * address is used. Otherwise this parameter can be used to set a custom MAC
	 * address.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2APConfiguration(boolean enable, String ssid, short[] ip, short[] subnetMask, short[] gateway, short encryption, boolean hidden, short channel, short[] macAddress) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)62, FUNCTION_SET_WIFI2_AP_CONFIGURATION, this);

		bb.put((byte)(enable ? 1 : 0));
		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)ssid.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)ip[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)subnetMask[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)gateway[i]);
		}
		bb.put((byte)encryption);
		bb.put((byte)(hidden ? 1 : 0));
		bb.put((byte)channel);
		for (int i = 0; i < 6; i++) {
			bb.put((byte)macAddress[i]);
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the access point configuration as set by {@link BrickMaster#setWifi2APConfiguration(boolean, String, short[], short[], short[], short, boolean, short, short[])}.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public Wifi2APConfiguration getWifi2APConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_AP_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2APConfiguration obj = new Wifi2APConfiguration();
		obj.enable = (bb.get()) != 0;
		obj.ssid = IPConnection.string(bb, 32);
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.encryption = IPConnection.unsignedByte(bb.get());
		obj.hidden = (bb.get()) != 0;
		obj.channel = IPConnection.unsignedByte(bb.get());
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
	}

	/**
	 * Sets the access point password (up to 63 chars) for the configured encryption
	 * mode, see {@link BrickMaster#setWifi2APConfiguration(boolean, String, short[], short[], short[], short, boolean, short, short[])}.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void setWifi2APPassword(String password) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_WIFI2_AP_PASSWORD, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)password.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Returns the access point password as set by {@link BrickMaster#setWifi2APPassword(String)}.
	 * 
	 * \note
	 *  Since WIFI Extension 2.0 firmware version 2.1.3 the password is not
	 *  returned anymore.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public String getWifi2APPassword() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_AP_PASSWORD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String password = IPConnection.string(bb, 64);

		return password;
	}

	/**
	 * All configuration functions for the WIFI Extension 2.0 do not change the
	 * values permanently. After configuration this function has to be called to
	 * permanently store the values.
	 * 
	 * The values are stored in the EEPROM and only applied on startup. That means
	 * you have to restart the Master Brick after configuration.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public short saveWifi2Configuration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_SAVE_WIFI2_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short result = IPConnection.unsignedByte(bb.get());

		return result;
	}

	/**
	 * Returns the current version of the WIFI Extension 2.0 firmware (major, minor, revision).
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public short[] getWifi2FirmwareVersion() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_FIRMWARE_VERSION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		short[] firmwareVersion = new short[3];
		for (int i = 0; i < 3; i++) {
			firmwareVersion[i] = IPConnection.unsignedByte(bb.get());
		}

		return firmwareVersion;
	}

	/**
	 * Turns the green status LED of the WIFI Extension 2.0 on.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void enableWifi2StatusLED() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_ENABLE_WIFI2_STATUS_LED, this);


		sendRequest(bb.array());
	}

	/**
	 * Turns the green status LED of the WIFI Extension 2.0 off.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public void disableWifi2StatusLED() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_WIFI2_STATUS_LED, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the green status LED of the WIFI Extension 2.0 is turned on.
	 * 
	 * .. versionadded:: 2.4.0$nbsp;(Firmware)
	 */
	public boolean isWifi2StatusLEDEnabled() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_IS_WIFI2_STATUS_LED_ENABLED, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		boolean enabled = (bb.get()) != 0;

		return enabled;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Sets the mesh specific configuration of the WIFI Extension 2.0.
	 * 
	 * The ``enable`` parameter enables or disables the mesh part of the
	 * WIFI Extension 2.0. The default value is *false*. The mesh part cannot be
	 * enabled together with the client and access-point part.
	 * 
	 * If the ``root_ip`` parameter is set to all zero then ``root_subnet_mask``
	 * and ``root_gateway`` parameters are also set to all zero and DHCP is used for
	 * IP address configuration. Otherwise those three parameters can be used to
	 * configure a static IP address. The default configuration is DHCP.
	 * 
	 * If the ``router_bssid`` parameter is set to all zero then the information is
	 * taken from Wi-Fi scan when connecting the SSID as set by
	 * {@link BrickMaster#setWifi2MeshRouterSSID(String)}. This only works if the the SSID is not hidden.
	 * In case the router has hidden SSID this parameter must be specified, otherwise
	 * the node will not be able to reach the mesh router.
	 * 
	 * The ``group_id`` and the ``group_ssid_prefix`` parameters identifies a
	 * particular mesh network and nodes configured with same ``group_id`` and the
	 * ``group_ssid_prefix`` are considered to be in the same mesh network.
	 * 
	 * The ``gateway_ip`` and the ``gateway_port`` parameters specifies the location
	 * of the brickd that supports mesh feature.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public void setWifi2MeshConfiguration(boolean enable, short[] rootIP, short[] rootSubnetMask, short[] rootGateway, short[] routerBSSID, short[] groupID, String groupSSIDPrefix, short[] gatewayIP, int gatewayPort) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)55, FUNCTION_SET_WIFI2_MESH_CONFIGURATION, this);

		bb.put((byte)(enable ? 1 : 0));
		for (int i = 0; i < 4; i++) {
			bb.put((byte)rootIP[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)rootSubnetMask[i]);
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)rootGateway[i]);
		}
		for (int i = 0; i < 6; i++) {
			bb.put((byte)routerBSSID[i]);
		}
		for (int i = 0; i < 6; i++) {
			bb.put((byte)groupID[i]);
		}
		for (int i = 0; i < 16; i++) {
			try {
				bb.put((byte)groupSSIDPrefix.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}
		for (int i = 0; i < 4; i++) {
			bb.put((byte)gatewayIP[i]);
		}
		bb.putShort((short)gatewayPort);

		sendRequest(bb.array());
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the mesh configuration as set by {@link BrickMaster#setWifi2MeshConfiguration(boolean, short[], short[], short[], short[], short[], String, short[], int)}.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public Wifi2MeshConfiguration getWifi2MeshConfiguration() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_CONFIGURATION, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2MeshConfiguration obj = new Wifi2MeshConfiguration();
		obj.enable = (bb.get()) != 0;
		for (int i = 0; i < 4; i++) {
			obj.rootIP[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.rootSubnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.rootGateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.routerBSSID[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.groupID[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.groupSSIDPrefix = IPConnection.string(bb, 16);
		for (int i = 0; i < 4; i++) {
			obj.gatewayIP[i] = IPConnection.unsignedByte(bb.get());
		}
		obj.gatewayPort = IPConnection.unsignedShort(bb.getShort());

		return obj;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Sets the mesh router SSID of the WIFI Extension 2.0.
	 * It is used to specify the mesh router to connect to.
	 * 
	 * Note that even though in the argument of this function a 32 characters long SSID
	 * is allowed, in practice valid SSID should have a maximum of 31 characters. This
	 * is due to a bug in the mesh library that we use in the firmware of the extension.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public void setWifi2MeshRouterSSID(String ssid) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)40, FUNCTION_SET_WIFI2_MESH_ROUTER_SSID, this);

		for (int i = 0; i < 32; i++) {
			try {
				bb.put((byte)ssid.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the mesh router SSID as set by {@link BrickMaster#setWifi2MeshRouterSSID(String)}.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public String getWifi2MeshRouterSSID() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_ROUTER_SSID, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String ssid = IPConnection.string(bb, 32);

		return ssid;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Sets the mesh router password (up to 64 characters) for WPA/WPA2 encryption.
	 * The password will be used to connect to the mesh router.
	 * 
	 * To apply configuration changes to the WIFI Extension 2.0 the
	 * {@link BrickMaster#saveWifi2Configuration()} function has to be called and the Master Brick
	 * has to be restarted afterwards.
	 * 
	 * It is recommended to use the Brick Viewer to configure the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public void setWifi2MeshRouterPassword(String password) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)72, FUNCTION_SET_WIFI2_MESH_ROUTER_PASSWORD, this);

		for (int i = 0; i < 64; i++) {
			try {
				bb.put((byte)password.charAt(i));
			} catch(Exception e) {
				bb.put((byte)0);
			}
		}

		sendRequest(bb.array());
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the mesh router password as set by {@link BrickMaster#setWifi2MeshRouterPassword(String)}.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public String getWifi2MeshRouterPassword() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_ROUTER_PASSWORD, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		String password = IPConnection.string(bb, 64);

		return password;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the common mesh status of the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public Wifi2MeshCommonStatus getWifi2MeshCommonStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_COMMON_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2MeshCommonStatus obj = new Wifi2MeshCommonStatus();
		obj.status = IPConnection.unsignedByte(bb.get());
		obj.rootNode = (bb.get()) != 0;
		obj.rootCandidate = (bb.get()) != 0;
		obj.connectedNodes = IPConnection.unsignedShort(bb.getShort());
		obj.rxCount = IPConnection.unsignedInt(bb.getInt());
		obj.txCount = IPConnection.unsignedInt(bb.getInt());

		return obj;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the mesh client status of the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public Wifi2MeshClientStatus getWifi2MeshClientStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_CLIENT_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2MeshClientStatus obj = new Wifi2MeshClientStatus();
		obj.hostname = IPConnection.string(bb, 32);
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
	}

	/**
	 * Requires WIFI Extension 2.0 firmware 2.1.0.
	 * 
	 * Returns the mesh AP status of the WIFI Extension 2.0.
	 * 
	 * .. versionadded:: 2.4.2$nbsp;(Firmware)
	 */
	public Wifi2MeshAPStatus getWifi2MeshAPStatus() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_GET_WIFI2_MESH_AP_STATUS, this);


		byte[] response = sendRequest(bb.array());

		bb = ByteBuffer.wrap(response, 8, response.length - 8);
		bb.order(ByteOrder.LITTLE_ENDIAN);

		Wifi2MeshAPStatus obj = new Wifi2MeshAPStatus();
		obj.ssid = IPConnection.string(bb, 32);
		for (int i = 0; i < 4; i++) {
			obj.ip[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.subnetMask[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 4; i++) {
			obj.gateway[i] = IPConnection.unsignedByte(bb.get());
		}
		for (int i = 0; i < 6; i++) {
			obj.macAddress[i] = IPConnection.unsignedByte(bb.get());
		}

		return obj;
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
	 * {@link BrickMaster#setSPITFPBaudrate(char, long)}. If the dynamic baudrate is disabled, the baudrate
	 * as set by {@link BrickMaster#setSPITFPBaudrate(char, long)} will be used statically.
	 * 
	 * The minimum dynamic baudrate has a value range of 400000 to 2000000 baud.
	 * 
	 * By default dynamic baudrate is enabled and the minimum dynamic baudrate is 400000.
	 * 
	 * .. versionadded:: 2.4.6$nbsp;(Firmware)
	 */
	public void setSPITFPBaudrateConfig(boolean enableDynamicBaudrate, long minimumDynamicBaudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE_CONFIG, this);

		bb.put((byte)(enableDynamicBaudrate ? 1 : 0));
		bb.putInt((int)minimumDynamicBaudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate config, see {@link BrickMaster#setSPITFPBaudrateConfig(boolean, long)}.
	 * 
	 * .. versionadded:: 2.4.6$nbsp;(Firmware)
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
	 * .. versionadded:: 2.4.3$nbsp;(Firmware)
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
	 * interference (see {@link BrickMaster#getSPITFPErrorCount(char)}) you can decrease the
	 * baudrate.
	 * 
	 * If the dynamic baudrate feature is enabled, the baudrate set by this
	 * function corresponds to the maximum baudrate (see {@link BrickMaster#setSPITFPBaudrateConfig(boolean, long)}).
	 * 
	 * Regulatory testing is done with the default baudrate. If CE compatability
	 * or similar is necessary in you applications we recommend to not change
	 * the baudrate.
	 * 
	 * The default baudrate for all ports is 1400000.
	 * 
	 * .. versionadded:: 2.4.3$nbsp;(Firmware)
	 */
	public void setSPITFPBaudrate(char brickletPort, long baudrate) throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)13, FUNCTION_SET_SPITFP_BAUDRATE, this);

		bb.put((byte)brickletPort);
		bb.putInt((int)baudrate);

		sendRequest(bb.array());
	}

	/**
	 * Returns the baudrate for a given Bricklet port, see {@link BrickMaster#setSPITFPBaudrate(char, long)}.
	 * 
	 * .. versionadded:: 2.4.3$nbsp;(Firmware)
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
	 * .. versionadded:: 2.4.3$nbsp;(Firmware)
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
	 * 
	 * .. versionadded:: 2.3.2$nbsp;(Firmware)
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
	 * 
	 * .. versionadded:: 2.3.2$nbsp;(Firmware)
	 */
	public void disableStatusLED() throws TimeoutException, NotConnectedException {
		ByteBuffer bb = ipcon.createRequestPacket((byte)8, FUNCTION_DISABLE_STATUS_LED, this);


		sendRequest(bb.array());
	}

	/**
	 * Returns *true* if the status LED is enabled, *false* otherwise.
	 * 
	 * .. versionadded:: 2.3.2$nbsp;(Firmware)
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
	 * Adds a StackCurrent listener.
	 */
	public void addStackCurrentListener(StackCurrentListener listener) {
		listenerStackCurrent.add(listener);
	}

	/**
	 * Removes a StackCurrent listener.
	 */
	public void removeStackCurrentListener(StackCurrentListener listener) {
		listenerStackCurrent.remove(listener);
	}

	/**
	 * Adds a StackVoltage listener.
	 */
	public void addStackVoltageListener(StackVoltageListener listener) {
		listenerStackVoltage.add(listener);
	}

	/**
	 * Removes a StackVoltage listener.
	 */
	public void removeStackVoltageListener(StackVoltageListener listener) {
		listenerStackVoltage.remove(listener);
	}

	/**
	 * Adds a USBVoltage listener.
	 */
	public void addUSBVoltageListener(USBVoltageListener listener) {
		listenerUSBVoltage.add(listener);
	}

	/**
	 * Removes a USBVoltage listener.
	 */
	public void removeUSBVoltageListener(USBVoltageListener listener) {
		listenerUSBVoltage.remove(listener);
	}

	/**
	 * Adds a StackCurrentReached listener.
	 */
	public void addStackCurrentReachedListener(StackCurrentReachedListener listener) {
		listenerStackCurrentReached.add(listener);
	}

	/**
	 * Removes a StackCurrentReached listener.
	 */
	public void removeStackCurrentReachedListener(StackCurrentReachedListener listener) {
		listenerStackCurrentReached.remove(listener);
	}

	/**
	 * Adds a StackVoltageReached listener.
	 */
	public void addStackVoltageReachedListener(StackVoltageReachedListener listener) {
		listenerStackVoltageReached.add(listener);
	}

	/**
	 * Removes a StackVoltageReached listener.
	 */
	public void removeStackVoltageReachedListener(StackVoltageReachedListener listener) {
		listenerStackVoltageReached.remove(listener);
	}

	/**
	 * Adds a USBVoltageReached listener.
	 */
	public void addUSBVoltageReachedListener(USBVoltageReachedListener listener) {
		listenerUSBVoltageReached.add(listener);
	}

	/**
	 * Removes a USBVoltageReached listener.
	 */
	public void removeUSBVoltageReachedListener(USBVoltageReachedListener listener) {
		listenerUSBVoltageReached.remove(listener);
	}
}
