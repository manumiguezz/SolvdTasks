package org.manumiguezz.tasknine;

import java.util.function.BiConsumer;

public enum ConnectionType {
    WIFI("Wireless", true),
    ETHERNET("Wired", false);

    private String type;
    private boolean isWireless;

    ConnectionType(String type, boolean isWireless) {
        this.type = type;
        this.isWireless = isWireless;
    }

    public String getType() {
        return type;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void displayDetails() {
        System.out.println("Connection Type: " + type + ", Wireless: " + isWireless);
    }

    public boolean isSecure() {
        return this == WIFI;
    }

    public void analyzeConnection(BiConsumer<ConnectionType, Boolean> analyzeType) {
        analyzeType.accept(this, isWireless);
    }
}