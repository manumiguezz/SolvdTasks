package org.manumiguezz.models;

public class Peripheral {
    private int peripheralId;
    private String peripheralType;
    private String peripheralModel;

    public Peripheral(int peripheralId, String peripheralType, String peripheralModel) {
        this.peripheralId = peripheralId;
        this.peripheralType = peripheralType;
        this.peripheralModel = peripheralModel;
    }

    public int getPeripheralId() {
        return peripheralId;
    }

    public void setPeripheralId(int peripheralId) {
        this.peripheralId = peripheralId;
    }

    public String getPeripheralType() {
        return peripheralType;
    }

    public void setPeripheralType(String peripheralType) {
        this.peripheralType = peripheralType;
    }

    public String getPeripheralModel() {
        return peripheralModel;
    }

    public void setPeripheralModel(String peripheralModel) {
        this.peripheralModel = peripheralModel;
    }
}
