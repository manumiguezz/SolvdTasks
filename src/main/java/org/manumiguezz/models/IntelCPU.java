package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"intel_cpu_id", "intel_cpu_model"})
public class IntelCPU implements Component, CPUInterface{
    private int cpuId;
    private String cpuModel;

    public IntelCPU() {}

    public IntelCPU(int cpuId, String cpuModel) {
        this.cpuId = cpuId;
        this.cpuModel = cpuModel;
    }

    @JsonProperty
    @XmlAttribute(name = "intel_cpu_id")
    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    @JsonProperty
    @XmlAttribute(name = "intel_cpu_model")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    @Override
    public int getId() {
        return cpuId;
    }

    @Override
    public String getModel() {
        return cpuModel;
    }

    @Override
    public void processData(String model) {
        System.out.println("Data processed by Intel:" + model);
    }
}
