package org.manumiguezz.models;

public class CPU {
    private int cpuId;
    private String cpuModel;

    public CPU(int cpuId, String cpuModel) {
        this.cpuId = cpuId;
        this.cpuModel = cpuModel;
    }

    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
}
