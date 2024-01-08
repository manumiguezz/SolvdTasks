package org.manumiguezz.models;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"power_supply_id", "power_supply_model"})
public class PowerSupply {
    private int powerSupplyId;
    private String powerSupplyModel;

    public PowerSupply() {}

    public PowerSupply(int powerSupplyId, String powerSupplyModel) {
        this.powerSupplyId = powerSupplyId;
        this.powerSupplyModel = powerSupplyModel;
    }

    @XmlAttribute(name = "power_supply_id")
    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    @XmlAttribute(name = "power_supply_model")
    public String getPowerSupplyModel() {
        return powerSupplyModel;
    }

    public void setPowerSupplyModel(String powerSupplyModel) {
        this.powerSupplyModel = powerSupplyModel;
    }
}