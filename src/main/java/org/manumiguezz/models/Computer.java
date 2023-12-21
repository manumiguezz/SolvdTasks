package org.manumiguezz.models;

public class Computer {
    private int computerId;
    private String computerName;
    private int motherboardId;
    private int powerSupplyId;
    private int coolingSystemId;

    public Computer(int computerId, String computerName, int motherboardId, int powerSupplyId, int coolingSystemId) {
        this.computerId = computerId;
        this.computerName = computerName;
        this.motherboardId = motherboardId;
        this.powerSupplyId = powerSupplyId;
        this.coolingSystemId = coolingSystemId;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    public int getCoolingSystemId() {
        return coolingSystemId;
    }

    public void setCoolingSystemId(int coolingSystemId) {
        this.coolingSystemId = coolingSystemId;
    }
}