package org.manumiguezz.models;

public class ComputerPeripheral {
    private int computerPeripheralId;
    private int peripheralId;

    public ComputerPeripheral(int computerPeripheralId, int peripheralId) {
        this.computerPeripheralId = computerPeripheralId;
        this.peripheralId = peripheralId;
    }

    public int getComputerPeripheralId() {
        return computerPeripheralId;
    }

    public void setComputerPeripheralId(int computerPeripheralId) {
        this.computerPeripheralId = computerPeripheralId;
    }

    public int getPeripheralId() {
        return peripheralId;
    }

    public void setPeripheralId(int peripheralId) {
        this.peripheralId = peripheralId;
    }
}
