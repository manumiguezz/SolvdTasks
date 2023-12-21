package org.manumiguezz.models;

public class Storage {
    private int storageId;
    private String storageType;
    private int storageCapacity;

    public Storage(int storageId, String storageType, int capacity) {
        this.storageId = storageId;
        this.storageType = storageType;
        this.storageCapacity = capacity;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }

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
