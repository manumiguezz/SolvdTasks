package org.manumiguezz.tasktwo.models;

public class NetworkAdapter extends ComputerComponent {
    private int speed;
    private String ConnectionType;

    public NetworkAdapter(String name, String manufacturer, int speed, String connectionType) {
        super(name, manufacturer);
        this.speed = speed;
        this.ConnectionType = connectionType;
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

    public void usingNetwork () {
        System.out.println("connecting to " + getConnectionType() + "network...");
    }
}