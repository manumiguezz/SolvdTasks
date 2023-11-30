package org.manumiguezz.tasknine;

public enum ExternalDevices {
    MOUSE("Mouse", "Pointing Device"),
    KEYBOARD("Keyboard", "Input Device"),
    MONITOR("Monitor", "Output Device");

    private String name;
    private String deviceType;

    ExternalDevices(String name, String deviceType) {
        this.name = name;
        this.deviceType = deviceType;
    }

    public String getName() {
        return name;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void showInfo() {
        System.out.println(name + ": " + deviceType);
    }

    public boolean isInputDevice() {
        return this == MOUSE || this == KEYBOARD;
    }
}