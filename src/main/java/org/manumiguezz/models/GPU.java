package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GPU {
    private int gpuId;
    private String gpuModel;

    public GPU(int gpuId, String gpuModel) {
        this.gpuId = gpuId;
        this.gpuModel = gpuModel;
    }

    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
}
