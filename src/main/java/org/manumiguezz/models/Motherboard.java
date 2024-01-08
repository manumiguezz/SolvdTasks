package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Motherboard {
    private int motherboardId;
    private String motherboardModel;

    public Motherboard(int motherboardId, String motherboardModel) {
        this.motherboardId = motherboardId;
        this.motherboardModel = motherboardModel;
    }

    @XmlAttribute
    public int getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

    @XmlAttribute
    public String getMotherboardModel() {
        return motherboardModel;
    }

    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }
}