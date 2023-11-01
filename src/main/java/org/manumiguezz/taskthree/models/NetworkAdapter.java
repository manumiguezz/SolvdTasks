package org.manumiguezz.taskthree.models;

import java.util.Objects;

public class NetworkAdapter extends ComputerComponent {
    protected int speed;
    protected String ConnectionType;

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

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetworkAdapter that = (NetworkAdapter) o;
        return speed == that.speed && Objects.equals(ConnectionType, that.ConnectionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, ConnectionType);
    }

    @Override
    public String toString() {
        return "NetworkAdapter{" +
                "speed=" + speed +
                ", ConnectionType='" + ConnectionType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}