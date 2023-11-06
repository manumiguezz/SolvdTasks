package org.manumiguezz.taskfour.models;

import java.util.Objects;

public class CPU extends ComputerComponent implements Overclockable, Maintainable {
    protected int cores;
    protected String socketType;

    public CPU(String name, String manufacturer, int cores, String socketType) {
        super(name, manufacturer);
        this.cores = cores;
        this.socketType = socketType;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    @Override
    public void usingComponent() {
        System.out.println("running cpu using a number of " + cores + "...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void overclock() {
        System.out.println("overclock");
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
        CPU cpu = (CPU) o;
        return cores == cpu.cores && Objects.equals(socketType, cpu.socketType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cores, socketType);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cores=" + cores +
                ", socketType='" + socketType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
