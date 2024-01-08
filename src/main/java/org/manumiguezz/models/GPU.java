package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GPU {
    private int gpuId;
    private String gpuModel;

    public GPU() {}

    public GPU(int gpuId, String gpuModel) {
        this.gpuId = gpuId;
        this.gpuModel = gpuModel;
    }

    @XmlAttribute
    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    @XmlAttribute
    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
}
