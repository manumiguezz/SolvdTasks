package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyName;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "computer")
public class Computer {
    private int computerId;
    private String computerName;
    private int cpuId;
    private int gpuId;
    private int motherboardId;
    private int memoryId;
    private int storageId;
    private int networkAdapterId;
    private int coolingSystemId;
    private int powerSupplyId;


    private String cpuModel;
    private String gpuModel;
    private String motherboardModel;
    private String memoryModel;
    private String storageModel;
    private String networkAdapterModel;
    private String coolingSystemModel;
    private String powerSupplyModel;

    public Computer() {}

    public Computer(int computerId, String computerName, int cpuId, int gpuId, int motherboardId, int memoryId, int storageId, int networkAdapterId, int coolingSystemId, int powerSupplyId, String cpuModel, String gpuModel, String motherboardModel, String memoryModel, String storageModel, String networkAdapterModel, String coolingSystemModel, String powerSupplyModel) {
        this.computerId = computerId;
        this.computerName = computerName;
        this.cpuId = cpuId;
        this.gpuId = gpuId;
        this.motherboardId = motherboardId;
        this.memoryId = memoryId;
        this.storageId = storageId;
        this.networkAdapterId = networkAdapterId;
        this.coolingSystemId = coolingSystemId;
        this.powerSupplyId = powerSupplyId;
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
        this.motherboardModel = motherboardModel;
        this.memoryModel = memoryModel;
        this.storageModel = storageModel;
        this.networkAdapterModel = networkAdapterModel;
        this.coolingSystemModel = coolingSystemModel;
        this.powerSupplyModel = powerSupplyModel;
    }

    @JsonProperty
    @XmlAttribute
    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    @JsonProperty
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

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
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

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    public String getMemoryModel() {
        return memoryModel;
    }

    public void setMemoryModel(String memoryModel) {
        this.memoryModel = memoryModel;
    }

    public String getStorageModel() {
        return storageModel;
    }

    public void setStorageModel(String storageModel) {
        this.storageModel = storageModel;
    }

    public String getNetworkAdapterModel() {
        return networkAdapterModel;
    }

    public void setNetworkAdapterModel(String networkAdapterModel) {
        this.networkAdapterModel = networkAdapterModel;
    }

    public String getCoolingSystemModel() {
        return coolingSystemModel;
    }

    public void setCoolingSystemModel(String coolingSystemModel) {
        this.coolingSystemModel = coolingSystemModel;
    }

    public String getPowerSupplyModel() {
        return powerSupplyModel;
    }

    public void setPowerSupplyModel(String powerSupplyModel) {
        this.powerSupplyModel = powerSupplyModel;
    }
}