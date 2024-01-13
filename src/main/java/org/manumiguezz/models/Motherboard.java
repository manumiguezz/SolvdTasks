package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"motherboard_id", "motherboard_model"})
public class Motherboard implements Component{
    private int motherboardId;
    private String motherboardModel;

    public Motherboard() {}

    public Motherboard(int motherboardId, String motherboardModel) {
        this.motherboardId = motherboardId;
        this.motherboardModel = motherboardModel;
    }

    @JsonProperty
    @XmlAttribute(name = "motherboard_id")
    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    @JsonProperty
    @XmlAttribute(name = "motherboard_model")
    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    @Override
    public int getId() {
        return motherboardId;
    }

    @Override
    public String getModel() {
        return motherboardModel;
    }
}