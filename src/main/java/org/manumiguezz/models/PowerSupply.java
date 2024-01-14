package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"power_supply_id", "power_supply_model"})
public class PowerSupply implements Component{
    private int powerSupplyId;
    private String powerSupplyModel;
    private ComponentListener componentListener;

    public PowerSupply() {}

    public PowerSupply(int powerSupplyId, String powerSupplyModel) {
        this.powerSupplyId = powerSupplyId;
        this.powerSupplyModel = powerSupplyModel;
    }

    public void registerListener(ComponentListener listener) {
        this.componentListener = listener;
    }

    public void notifyListener() {
        if (componentListener != null) {
            componentListener.onComponentChanged(powerSupplyModel, powerSupplyId);
        }
    }

    public void stopWorking() {
        System.out.println("stopped");
    }

    public void startWorking() {
        System.out.println("running");
    }

    @JsonProperty
    @XmlAttribute(name = "power_supply_id")
    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    @JsonProperty
    @XmlAttribute(name = "power_supply_model")
    public String getPowerSupplyModel() {
        return powerSupplyModel;
    }

    public void setPowerSupplyModel(String powerSupplyModel) {
        this.powerSupplyModel = powerSupplyModel;
    }

    @Override
    public int getId() {
        return powerSupplyId;
    }

    @Override
    public String getModel() {
        return powerSupplyModel;
    }

    public ComponentListener getComponentListener() {
        return componentListener;
    }

    public void setComponentListener(ComponentListener componentListener) {
        this.componentListener = componentListener;
    }
}