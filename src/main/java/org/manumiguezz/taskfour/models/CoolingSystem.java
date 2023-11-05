package org.manumiguezz.taskfour.models;

import java.util.Objects;

public class CoolingSystem extends ComputerComponent {
    protected int fanSpeed;
    protected String coolingType;

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

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        int maximumPerformance = fanSpeed + 2;
        System.out.println("taking fan speed to maximum: " + fanSpeed + "...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CoolingSystem that = (CoolingSystem) o;
        return fanSpeed == that.fanSpeed && Objects.equals(coolingType, that.coolingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fanSpeed, coolingType);
    }

    @Override
    public String toString() {
        return "CoolingSystem{" +
                "fanSpeed=" + fanSpeed +
                ", coolingType='" + coolingType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}