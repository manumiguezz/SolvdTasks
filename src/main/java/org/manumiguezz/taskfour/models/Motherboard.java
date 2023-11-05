package org.manumiguezz.taskfour.models;

import java.util.Objects;

public class Motherboard extends ComputerComponent {
    protected String chipset;
    protected String socketType;

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

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("Motherboard working...");
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