package org.manumiguezz.tasktwo;

public class CPU extends ComputerComponent {
    private int cores;
    private String socketType;

    public CPU(String name, String manufacturer, int cores, String socketType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
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
}