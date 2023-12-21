package org.manumiguezz.models;

import org.manumiguezz.interfaces.Connectable;
import org.manumiguezz.interfaces.Maintainable;

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
        int availableConnections = 5;
        int threadsRequestingConnection = 7;

        for (int i = 0; i < threadsRequestingConnection; i++) {
            if (availableConnections > 0) {
                new Thread(() -> {
                    try {
                        System.out.println("Connecting to the network...");
                        Thread.sleep(1000);
                        System.out.println("Connected to the network.");
                        disconnect();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
                availableConnections--;
            } else {
                System.out.println("Waiting for the next available connection...");
            }
        }
    }

    @Override
    public void disconnect() {
        int connectedClients = 5;

        for (int i = 0; i < connectedClients; i++) {
            new Thread(() -> {
                try {
                    System.out.println("Disconnecting from the network...");
                    Thread.sleep(500);
                    System.out.println("Disconnected from the network.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
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