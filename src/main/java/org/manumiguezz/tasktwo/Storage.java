package org.manumiguezz.tasktwo;

import org.manumiguezz.ComputerComponent;

public class Storage extends ComputerComponent {
    private int capacityGB;
    private String storageType;

    public Storage(String name, String manufacturer, int capacityGB, String storageType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
        this.capacityGB = capacityGB;
        this.storageType = storageType;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public void setCapacityGB(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
}