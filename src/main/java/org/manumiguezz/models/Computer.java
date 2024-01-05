package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Computer {
    private int computerId;
    private String computerName;
    private int motherboardId;
    private int powerSupplyId;
    private int coolingSystemId;

    private int memoryId;
    private int networkAdapterId;
    private int cpuId;
    private int gpuId;

    public Computer(int computerId, String computerName, int motherboardId, int powerSupplyId, int coolingSystemId, int memoryId, int networkAdapterId, int cpuId, int gpuId) {
        this.computerId = computerId;
        this.computerName = computerName;
        this.motherboardId = motherboardId;
        this.powerSupplyId = powerSupplyId;
        this.coolingSystemId = coolingSystemId;
        this.memoryId = memoryId;
        this.networkAdapterId = networkAdapterId;
        this.cpuId = cpuId;
        this.gpuId = gpuId;
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

    @XmlElementWrapper(name = "motherboards")
    @XmlElement(name = "motherboard")
    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    @XmlElementWrapper(name = "powerSupplies")
    @XmlElement(name = "powerSupply")
    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    @XmlElementWrapper(name = "coolingSystems")
    @XmlElement(name = "coolingSystem")
    public int getCoolingSystemId() {
        return coolingSystemId;
    }

    public void setCoolingSystemId(int coolingSystemId) {
        this.coolingSystemId = coolingSystemId;
    }

    @XmlElementWrapper(name = "memories")
    @XmlElement(name = "memory")
    public int getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(int memoryId) {
        this.memoryId = memoryId;
    }

    @XmlElementWrapper(name = "networkAdapters")
    @XmlElement(name = "networkAdapters")
    public int getNetworkAdapterId() {
        return networkAdapterId;
    }

    public void setNetworkAdapterId(int networkAdapterId) {
        this.networkAdapterId = networkAdapterId;
    }

    @XmlElementWrapper(name = "cpus")
    @XmlElement(name = "cpu")
    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    @XmlElementWrapper(name = "gpus")
    @XmlElement(name = "gpu")
    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }
}