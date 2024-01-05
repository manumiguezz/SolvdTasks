package org.manumiguezz.models;


public class Motherboard {
    private int motherboardId;
    private String motherboardModel;

    public Motherboard(int motherboardId, String motherboardModel) {
        this.motherboardId = motherboardId;
        this.motherboardModel = motherboardModel;
    }

    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }
}