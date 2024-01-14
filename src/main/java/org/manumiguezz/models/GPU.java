package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"gpu_id", "gpu_model"})
public class GPU implements Component{
    private int gpuId;
    private String gpuModel;
    private ComponentListener componentListener;

    public GPU() {}

    public GPU(int gpuId, String gpuModel) {
        this.gpuId = gpuId;
        this.gpuModel = gpuModel;
    }

    public void registerListener(ComponentListener listener) {
        this.componentListener = listener;
    }

    public void notifyListener() {
        if (componentListener != null) {
            componentListener.onComponentChanged(gpuModel, gpuId);
        }
    }

    public void stopWorking() {
        System.out.println("stopped");
    }

    public void startWorking() {
        System.out.println("running");
    }

    @JsonProperty
    @XmlAttribute(name = "gpu_id")
    public int getGpuId() {
        return gpuId;
    }

    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
        notifyListener();
    }

    @JsonProperty
    @XmlAttribute(name = "gpu_model")
    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
        notifyListener();
    }

    @Override
    public int getId() {
        return gpuId;
    }

    @Override
    public String getModel() {
        return gpuModel;
    }

    public ComponentListener getComponentListener() {
        return componentListener;
    }

    public void setComponentListener(ComponentListener componentListener) {
        this.componentListener = componentListener;
    }
}
