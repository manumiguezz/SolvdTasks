package org.manumiguezz.tasknine;

import java.util.function.Consumer;
import java.util.function.Function;

public enum StorageDevice {
    HDD("Hard Disk Drive", 1024),
    SSD("Solid State Drive", 512);

    private String type;
    private int capacityGB;

    StorageDevice(String type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }

    public String getType() {
        return type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public void printSpecs() {
        System.out.println("Type: " + type + ", Capacity: " + capacityGB + "GB");
    }

    public boolean isFastStorage() {
        return this == SSD;
    }

    public void checkStorageDevice(Function<StorageDevice, String> checkType) {
        System.out.println(checkType.apply(this));
    }

    public void printArrayElements(Consumer<Object[]> printArrayConsumer, Object[] array) {
        printArrayConsumer.accept(array);
    }
}