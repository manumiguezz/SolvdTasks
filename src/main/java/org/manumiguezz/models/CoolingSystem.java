package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"cooling_system_id", "cooling_system_type"})
public class CoolingSystem implements Component{
    private int coolingSystemId;
    private String coolingSystemModel;

    public CoolingSystem() {}

    public CoolingSystem(int coolingSystemId, String coolingSystemType) {
        this.coolingSystemId = coolingSystemId;
        this.coolingSystemModel = coolingSystemType;
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
}
