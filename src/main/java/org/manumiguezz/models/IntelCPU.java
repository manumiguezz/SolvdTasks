package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"cpu_id", "cpu_model"})
public class IntelCPU implements Component{
    private int cpuId;
    private String cpuModel;

    public IntelCPU() {}

    public IntelCPU(int cpuId, String cpuModel) {
        this.cpuId = cpuId;
        this.cpuModel = cpuModel;
    }

    @JsonProperty
    @XmlAttribute(name = "cpu_id")
    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    @JsonProperty
    @XmlAttribute(name = "cpu_model")
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
}
