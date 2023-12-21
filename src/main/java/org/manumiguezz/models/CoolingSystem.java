package org.manumiguezz.models;

public class CoolingSystem {
    private int coolingSystemId;
    private String coolingSystemType;

    public CoolingSystem(int coolingSystemId, String coolingSystemType) {
        this.coolingSystemId = coolingSystemId;
        this.coolingSystemType = coolingSystemType;
    }

    public int getCoolingSystemId() {
        return coolingSystemId;
    }

    public void setCoolingSystemId(int coolingSystemId) {
        this.coolingSystemId = coolingSystemId;
    }

    public String getCoolingSystemType() {
        return coolingSystemType;
    }

    public void setCoolingSystemType(String coolingSystemType) {
        this.coolingSystemType = coolingSystemType;
    }
}
