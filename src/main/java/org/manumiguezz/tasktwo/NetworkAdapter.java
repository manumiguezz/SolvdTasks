package org.manumiguezz.tasktwo;

public class NetworkAdapter extends ComputerComponent {
    private int speed;
    private String ConnectionType;

    public NetworkAdapter(String name, String manufacturer, int speed, String connectionType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
        this.speed = speed;
        ConnectionType = connectionType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getConnectionType() {
        return ConnectionType;
    }

    public void setConnectionType(String connectionType) {
        this.ConnectionType = connectionType;
    }
}