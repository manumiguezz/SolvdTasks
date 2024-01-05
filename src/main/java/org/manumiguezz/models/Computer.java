package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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

    @XmlAttribute
    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    @XmlAttribute
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @XmlAttribute
    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    @XmlAttribute
    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    @XmlAttribute
    public int getCoolingSystemId() {
        return coolingSystemId;
    }

    public void setCoolingSystemId(int coolingSystemId) {
        this.coolingSystemId = coolingSystemId;
    }
}