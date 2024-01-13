package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"gpu_id", "gpu_model"})
public class GPU implements Component{
    private int gpuId;
    private String gpuModel;

    public GPU() {}

    public GPU(int gpuId, String gpuModel) {
        this.gpuId = gpuId;
        this.gpuModel = gpuModel;
    }

    @JsonProperty
    @XmlAttribute(name = "gpu_id")
    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    @JsonProperty
    @XmlAttribute(name = "gpu_model")
    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    @Override
    public int getId() {
        return gpuId;
    }

    @Override
    public String getModel() {
        return gpuModel;
    }
}
