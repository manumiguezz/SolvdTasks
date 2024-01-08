package org.manumiguezz.models;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"motherboard_id", "motherboard_model"})
public class Motherboard {
    private int motherboardId;
    private String motherboardModel;

    public Motherboard() {}

    public Motherboard(int motherboardId, String motherboardModel) {
        this.motherboardId = motherboardId;
        this.motherboardModel = motherboardModel;
    }

    @XmlAttribute(name = "motherboard_id")
    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    @XmlAttribute(name = "motherboard_model")
    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }
}