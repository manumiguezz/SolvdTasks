package org.manumiguezz.models;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"cpu_id", "cpu_model"})
public class CPU {
    private int cpuId;
    private String cpuModel;

    public CPU() {}

    public CPU(int cpuId, String cpuModel) {
        this.cpuId = cpuId;
        this.cpuModel = cpuModel;
    }

    @XmlAttribute(name = "cpu_id")
    public int getCpuId() {
        return cpuId;
    }

    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    @XmlAttribute(name = "cpu_model")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
}
