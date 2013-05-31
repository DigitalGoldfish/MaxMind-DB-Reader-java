package com.maxmind.maxminddb;

import java.net.InetAddress;

class Log {

    static void debug(String string, byte[] buffer) {
        String binary = "";
        for (byte b : buffer) {
            binary += Integer.toBinaryString(b & 0xFF) + " ";
        }
        Log.debug(string, binary);

    }

    static void debug(String name, InetAddress address) {
        Log.debug(name, address.toString());
    }

    static void debug(String name, long offset) {
        Log.debug(name, String.valueOf(offset));
    }

    static void debug(String name, int value) {
        Log.debug(name, String.valueOf(value));
    }

    private static void debug(String string, byte b) {
        Log.debug(string, Integer.toBinaryString(b & 0xFF));
    }

    static void debug(String name, String value) {
        debug(name + ": " + value);
    }

    static void debugNewLine() {
        System.out.println();
    }

    static void debug(String message) {
        System.out.println(message);
    }

}