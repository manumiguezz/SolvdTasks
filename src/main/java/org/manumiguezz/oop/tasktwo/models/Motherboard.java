package org.manumiguezz.oop.tasktwo.models;

public class Motherboard extends ComputerComponent {
    private String chipset;
    private String socketType;

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
}