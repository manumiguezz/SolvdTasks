package org.manumiguezz.tasktwo.models;

public class CoolingSystem extends ComputerComponent {
    private int fanSpeed;
    private String coolingType;

    public CoolingSystem(String name, String manufacturer, int fanSpeed, String coolingType) {
        super(name, manufacturer);
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

    public void coolingSystemMax() {
        int maximumPerformance = fanSpeed + 2;
        System.out.println("taking fan speed to maximum: " + fanSpeed + "...");
    }


}