package org.manumiguezz.taskseven.models;

import org.manumiguezz.taskseven.interfaces.Connectable;
import org.manumiguezz.taskseven.interfaces.Maintainable;

import java.util.Objects;

public final class NetworkAdapter extends ComputerComponent implements Connectable, Maintainable {
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

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("connecting to " + getConnectionType() + "network...");
    }

    @Override
    public void connect() {
        System.out.println("connecting to network");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting from network");
    }

    @Override
    public void performMaintenance() {
        System.out.println("performing maintenance");
    }

    @Override
    public void checkStatus() {
        System.out.println("checking...");
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