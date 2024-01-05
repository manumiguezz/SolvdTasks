package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PowerSupply {
    private int powerSupplyId;
    private String powerSupplyModel;

    public PowerSupply(int powerSupplyId, String powerSupplyModel) {
        this.powerSupplyId = powerSupplyId;
        this.powerSupplyModel = powerSupplyModel;
    }

    @XmlAttribute
    public int getPowerSupplyId() {
        return powerSupplyId;
    }

    public void setPowerSupplyId(int powerSupplyId) {
        this.powerSupplyId = powerSupplyId;
    }

    @XmlAttribute
    public String getPowerSupplyModel() {
        return powerSupplyModel;
    }

    public void setPowerSupplyModel(String powerSupplyModel) {
        this.powerSupplyModel = powerSupplyModel;
    }
}