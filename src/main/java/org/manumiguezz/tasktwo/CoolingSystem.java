package org.manumiguezz.tasktwo;

import org.manumiguezz.ComputerComponent;

public class CoolingSystem extends ComputerComponent {
    private int fanSpeed;
    private String coolingType;

    public CoolingSystem(String name, String manufacturer, int fanSpeed, String coolingType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
        this.fanSpeed = fanSpeed;
        this.coolingType = coolingType;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }
}