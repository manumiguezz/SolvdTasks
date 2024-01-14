package org.manumiguezz.models;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public Computer build() {
        return computer;
    }

    public ComputerBuilder setCpuModel (String cpuModel) {
        computer.setCpuModel(cpuModel);
        return this;
    }

    public ComputerBuilder setCpuId (int cpuId) {
        computer.setCpuId(cpuId);
        return this;
    }

    public ComputerBuilder setGpuModel (String gpuModel) {
        computer.setGpuModel(gpuModel);
        return this;
    }

    public ComputerBuilder setGpuId (int gpuId) {
        computer.setGpuId(gpuId);
        return this;
    }

    public ComputerBuilder setMotherboardModel (String motherboardModel) {
        computer.setMotherboardModel(motherboardModel);
        return this;
    }

    public ComputerBuilder setMotherboardId (int motherboardId) {
        computer.setMotherboardId(motherboardId);
        return this;
    }

    public ComputerBuilder setMemoryModel (String memoryModel) {
        computer.setMemoryModel(memoryModel);
        return this;
    }

    public ComputerBuilder setMemoryId (int memoryId) {
        computer.setMemoryId(memoryId);
        return this;
    }

    public ComputerBuilder setStorageModel (String storageModel) {
        computer.setStorageModel(storageModel);
        return this;
    }

    public ComputerBuilder setStorageId (int storageId) {
        computer.setStorageId(storageId);
        return this;
    }

    public ComputerBuilder setNetworkAdapterModel (String networkAdapterModel) {
        computer.setNetworkAdapterModel(networkAdapterModel);
        return this;
    }

    public ComputerBuilder setNetworkAdapterId (int networkAdapterId) {
        computer.setNetworkAdapterId(networkAdapterId);
        return this;
    }

    public ComputerBuilder setPowerSupplyModel (String powerSupplyModel) {
        computer.setPowerSupplyModel(powerSupplyModel);
        return this;
    }

    public ComputerBuilder setPowerSupplyId (int powerSupplyId) {
        computer.setPowerSupplyId(powerSupplyId);
        return this;
    }
}
