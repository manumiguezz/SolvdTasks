package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"memory_id", "memory_type"})
public class Memory implements Component{
    private int memoryId;
    private String memoryModel;
    private ComponentListener componentListener;
    public Memory() {}

    public Memory(int memoryId, String memoryType, int memoryCapacity) {
        this.memoryId = memoryId;
        this.memoryModel = memoryType;
    }

    public void registerListener(ComponentListener listener) {
        this.componentListener = listener;
    }

    public void notifyListener() {
        if (componentListener != null) {
            componentListener.onComponentChanged(memoryModel, memoryId);
        }
    }

    @JsonProperty
    @XmlAttribute(name = "memory_id")
    public int getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(int memoryId) {
        this.memoryId = memoryId;
    }

    @JsonProperty
    @XmlAttribute(name = "memory_type")
    public String getMemoryModel() {
        return memoryModel;
    }

    public void setMemoryModel(String memoryModel) {
        this.memoryModel = memoryModel;
    }

    @Override
    public int getId() {
        return memoryId;
    }

    @Override
    public String getModel() {
        return memoryModel;
    }

    public ComponentListener getComponentListener() {
        return componentListener;
    }

    public void setComponentListener(ComponentListener componentListener) {
        this.componentListener = componentListener;
    }
}
