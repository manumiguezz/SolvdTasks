package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"cooling_system_id", "cooling_system_type"})
public class CoolingSystem implements Component{
    private int coolingSystemId;
    private String coolingSystemModel;
    private ComponentListener componentListener;
    private CoolingStrategyInterface coolingStrategy;

    public CoolingSystem() {}

    public CoolingSystem(int coolingSystemId, String coolingSystemType) {
        this.coolingSystemId = coolingSystemId;
        this.coolingSystemModel = coolingSystemType;
    }

    public void registerListener(ComponentListener listener) {
        this.componentListener = listener;
    }

    public void notifyListener() {
        if (componentListener != null) {
            componentListener.onComponentChanged(coolingSystemModel, coolingSystemId);
        }
    }

    public void stopWorking() {
        System.out.println("stopped");
    }

    public void startWorking() {
        System.out.println("running");
        coolingStrategy.cool();
    }

    @JsonProperty
    @XmlAttribute(name = "cooling_system_id")
    public int getCoolingSystemId() {
        return coolingSystemId;
    }

    public void setCoolingSystemId(int coolingSystemId) {
        this.coolingSystemId = coolingSystemId;
    }

    @JsonProperty
    @XmlAttribute(name = "cooling_system_type")
    public String getCoolingSystemModel() {
        return coolingSystemModel;
    }

    public void setCoolingSystemModel(String coolingSystemModel) {
        this.coolingSystemModel = coolingSystemModel;
    }

    @Override
    public int getId() {
        return coolingSystemId;
    }

    @Override
    public String getModel() {
        return coolingSystemModel;
    }

    public ComponentListener getComponentListener() {
        return componentListener;
    }

    public void setComponentListener(ComponentListener componentListener) {
        this.componentListener = componentListener;
    }
}
