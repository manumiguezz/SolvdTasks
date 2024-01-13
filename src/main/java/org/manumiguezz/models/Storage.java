package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"storage_id", "storage_type"})
public class Storage implements Component{
    private int storageId;
    private String storageModel;

    public Storage() {}

    public Storage(int storageId, String storageType, int capacity) {
        this.storageId = storageId;
        this.storageModel = storageType;
    }

    @JsonProperty
    @XmlAttribute(name = "storage_id")
    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

    @JsonProperty
    @XmlAttribute(name = "storage_type")
    public String getStorageModel() {
        return storageModel;
    }

    public void setStorageModel(String storageModel) {
        this.storageModel = storageModel;
    }

    @Override
    public int getId() {
        return storageId;
    }

    @Override
    public String getModel() {
        return storageModel;
    }
}
