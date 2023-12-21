package org.manumiguezz.models;

public class ComputerConnection {
    private int computerId;
    private int connectionId;

    public ComputerConnection(int computerId, int connectionId) {
        this.computerId = computerId;
        this.connectionId = connectionId;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }
}
