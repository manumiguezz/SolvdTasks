package org.manumiguezz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"storage_id", "storage_type"})
public class Storage {
    private int storageId;
    private String storageType;
    private int storageCapacity;

    public Storage() {}

    public Storage(int storageId, String storageType, int capacity) {
        this.storageId = storageId;
        this.storageType = storageType;
        this.storageCapacity = capacity;
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
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
