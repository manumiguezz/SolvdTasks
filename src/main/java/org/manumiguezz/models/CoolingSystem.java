package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"cooling_system_id", "cooling_system_type"})
public class CoolingSystem {
    private int coolingSystemId;
    private String coolingSystemType;

    public CoolingSystem() {}

    public CoolingSystem(int coolingSystemId, String coolingSystemType) {
        this.coolingSystemId = coolingSystemId;
        this.coolingSystemType = coolingSystemType;
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
    public String getCoolingSystemType() {
        return coolingSystemType;
    }

    public void setCoolingSystemType(String coolingSystemType) {
        this.coolingSystemType = coolingSystemType;
    }
}
