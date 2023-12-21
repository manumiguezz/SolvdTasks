package org.manumiguezz.models;

import org.manumiguezz.interfaces.Maintainable;

import java.util.Objects;

public final class Motherboard extends ComputerComponent implements Maintainable {
    protected String chipset;
    protected String socketType;
    private int id;
    private String type;

    public Motherboard(String name, String manufacturer, String chipset, String socketType) {
        super(name, manufacturer);
        this.chipset = chipset;
        this.socketType = socketType;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public final void controlBios(){
        System.out.println("initializing bios...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("Motherboard working...");
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
        Motherboard that = (Motherboard) o;
        return Objects.equals(chipset, that.chipset) && Objects.equals(socketType, that.socketType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chipset, socketType);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "chipset='" + chipset + '\'' +
                ", socketType='" + socketType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}