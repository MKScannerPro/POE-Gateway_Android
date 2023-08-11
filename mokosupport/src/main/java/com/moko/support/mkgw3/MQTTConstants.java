package com.moko.support.mkgw3;

public class MQTTConstants {
    // CONFIG
    public static final int CONFIG_MSG_ID_REBOOT = 1000;
    public static final int CONFIG_MSG_ID_BUTTON_RESET = 1001;
    public static final int CONFIG_MSG_ID_NETWORK_REPORT_INTERVAL = 1003;
    public static final int CONFIG_MSG_ID_RECONNECT_TIMEOUT = 1005;
    public static final int CONFIG_MSG_ID_OTA = 1006;
    public static final int CONFIG_MSG_ID_NTP_SERVER = 1008;
    public static final int CONFIG_MSG_ID_SYSTEM_TIME = 1009;
    public static final int CONFIG_MSG_ID_COMMUNICATION_TIMEOUT = 1010;
    public static final int CONFIG_MSG_ID_INDICATOR_STATUS = 1011;
    public static final int CONFIG_MSG_ID_RESET = 1013;
    public static final int CONFIG_MSG_ID_ADV_SWITCH = 1015;
    public static final int CONFIG_MSG_ID_WIFI_SETTINGS = 1020;
    public static final int CONFIG_MSG_ID_WIFI_CERT_FILE = 1021;
    public static final int CONFIG_MSG_ID_NETWORK_SETTINGS = 1023;
    public static final int CONFIG_MSG_ID_NETWORK_TYPE = 1024;
    public static final int CONFIG_MSG_ID_ETHERNET_PARAMS = 1025;
    public static final int CONFIG_MSG_ID_MQTT_SETTINGS = 1030;
    public static final int CONFIG_MSG_ID_MQTT_CERT_FILE = 1031;
    public static final int CONFIG_MSG_ID_SCAN_CONFIG = 1040;
    public static final int CONFIG_MSG_ID_FILTER_RELATIONSHIP = 1041;
    public static final int CONFIG_MSG_ID_FILTER_RSSI = 1042;
    public static final int CONFIG_MSG_ID_FILTER_MAC_ADDRESS = 1043;
    public static final int CONFIG_MSG_ID_FILTER_ADV_NAME = 1044;
    public static final int CONFIG_MSG_ID_FILTER_IBEACON = 1046;
    public static final int CONFIG_MSG_ID_FILTER_UID = 1047;
    public static final int CONFIG_MSG_ID_FILTER_URL = 1048;
    public static final int CONFIG_MSG_ID_FILTER_TLM = 1049;
    public static final int CONFIG_MSG_ID_FILTER_BXP_DEVICE_INFO = 1050;
    public static final int CONFIG_MSG_ID_FILTER_BXP_ACC = 1051;
    public static final int CONFIG_MSG_ID_FILTER_BXP_TH = 1052;
    public static final int CONFIG_MSG_ID_FILTER_BXP_BUTTON = 1053;
    public static final int CONFIG_MSG_ID_FILTER_BXP_TAG = 1054;
    public static final int CONFIG_MSG_ID_FILTER_PIR = 1055;
    public static final int CONFIG_MSG_ID_FILTER_OTHER = 1056;
    public static final int CONFIG_MSG_ID_DUPLICATE_DATA_FILTER = 1057;
    public static final int CONFIG_MSG_ID_DATA_REPORT_TIMEOUT = 1058;
    public static final int CONFIG_MSG_ID_UPLOAD_DATA_OPTION= 1059;
    public static final int CONFIG_MSG_ID_FILTER_PHY = 1060;
    public static final int CONFIG_MSG_ID_BEACON_PARAMS = 1061;
    public static final int CONFIG_MSG_ID_BLE_BXP_BUTTON_CONNECT = 1100;
    public static final int CONFIG_MSG_ID_BLE_BXP_BUTTON_INFO = 1102;
    public static final int CONFIG_MSG_ID_BLE_BXP_BUTTON_STATUS = 1104;
    public static final int CONFIG_MSG_ID_BLE_BXP_BUTTON_DISMISS_ALARM = 1106;
    public static final int CONFIG_MSG_ID_BLE_DISCONNECT = 1200;
    public static final int CONFIG_MSG_ID_BLE_DFU = 1202;
    public static final int CONFIG_MSG_ID_BLE_OTHER_CONNECT = 1300;
    public static final int CONFIG_MSG_ID_BLE_OTHER_INFO = 1303;
    public static final int CONFIG_MSG_ID_BLE_OTHER_CHANGE_NOTIFY_ENABLE = 1305;
    public static final int CONFIG_MSG_ID_BLE_OTHER_READ_CHAR_VALUE = 1307;
    public static final int CONFIG_MSG_ID_BLE_OTHER_WRITE_CHAR_VALUE = 1309;
    // READ
    public static final int READ_MSG_ID_BUTTON_RESET = 2001;
    public static final int READ_MSG_ID_DEVICE_INFO = 2002;
    public static final int READ_MSG_ID_NETWORK_REPORT_INTERVAL = 2003;
    public static final int READ_MSG_ID_RECONNECT_TIMEOUT = 2005;
    public static final int READ_MSG_ID_NTP_SERVER = 2008;
    public static final int READ_MSG_ID_SYSTEM_TIME = 2009;
    public static final int READ_MSG_ID_COMMUNICATION_TIMEOUT = 2010;
    public static final int READ_MSG_ID_INDICATOR_STATUS = 2011;
    public static final int READ_MSG_ID_DEVICE_STATUS = 2012;
    public static final int READ_MSG_ID_ADV_STATE = 2016;
    public static final int READ_MSG_ID_WIFI_SETTINGS = 2020;
    public static final int READ_MSG_ID_NETWORK_SETTINGS = 2023;
    public static final int READ_MSG_ID_NETWORK_TYPE = 2024;
    public static final int READ_MSG_ID_ETHERNET_PARAMS = 2025;
    public static final int READ_MSG_ID_MQTT_SETTINGS = 2030;
    public static final int READ_MSG_ID_SCAN_CONFIG = 2040;
    public static final int READ_MSG_ID_FILTER_RELATIONSHIP = 2041;
    public static final int READ_MSG_ID_FILTER_RSSI = 2042;
    public static final int READ_MSG_ID_FILTER_MAC_ADDRESS = 2043;
    public static final int READ_MSG_ID_FILTER_ADV_NAME = 2044;
    public static final int READ_MSG_ID_FILTER_RAW_DATA_SWITCH = 2045;
    public static final int READ_MSG_ID_FILTER_IBEACON = 2046;
    public static final int READ_MSG_ID_FILTER_UID = 2047;
    public static final int READ_MSG_ID_FILTER_URL = 2048;
    public static final int READ_MSG_ID_FILTER_TLM = 2049;
    public static final int READ_MSG_ID_FILTER_BXP_BUTTON = 2053;
    public static final int READ_MSG_ID_FILTER_BXP_TAG = 2054;
    public static final int READ_MSG_ID_FILTER_PIR = 2055;
    public static final int READ_MSG_ID_FILTER_OTHER = 2056;
    public static final int READ_MSG_ID_DUPLICATE_DATA_FILTER = 2057;
    public static final int READ_MSG_ID_DATA_REPORT_TIMEOUT = 2058;
    public static final int READ_MSG_ID_UPLOAD_DATA_OPTION = 2059;
    public static final int READ_MSG_ID_FILTER_PHY = 2060;
    public static final int READ_MSG_ID_BEACON_PARAMS = 2061;
    public static final int READ_MSG_ID_BLE_CONNECTED_LIST = 2201;
    // NOTIFY
    public static final int NOTIFY_MSG_ID_NETWORKING_STATUS = 3004;
    public static final int NOTIFY_MSG_ID_OTA_RESULT = 3007;
    public static final int NOTIFY_MSG_ID_BUTTON_RESET = 3014;
    public static final int NOTIFY_MSG_ID_WIFI_CERT_RESULT = 3022;
    public static final int NOTIFY_MSG_ID_MQTT_CERT_RESULT = 3032;
    public static final int NOTIFY_MSG_ID_BLE_SCAN_RESULT = 3070;
    public static final int NOTIFY_MSG_ID_BLE_BXP_BUTTON_CONNECT_RESULT = 3101;
    public static final int NOTIFY_MSG_ID_BLE_BXP_BUTTON_INFO = 3103;
    public static final int NOTIFY_MSG_ID_BLE_BXP_BUTTON_STATUS = 3105;
    public static final int NOTIFY_MSG_ID_BLE_BXP_BUTTON_DISMISS_ALARM = 3107;
    public static final int NOTIFY_MSG_ID_BLE_BXP_BUTTON_DISCONNECTED = 3108;
    public static final int NOTIFY_MSG_ID_BLE_DFU_PERCENT = 3203;
    public static final int NOTIFY_MSG_ID_BLE_DFU_RESULT = 3204;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_CONNECT_RESULT = 3301;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_DISCONNECTED = 3302;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_INFO = 3304;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_CHANGE_NOTIFY_ENABLE = 3306;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_READ_CHAR_VALUE = 3308;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_WRITE_CHAR_VALUE = 3310;
    public static final int NOTIFY_MSG_ID_BLE_OTHER_NOTIFY_CHAR_VALUE = 3311;
    public static final int NOTIFY_MSG_ID_OFFLINE = 3999;
}
