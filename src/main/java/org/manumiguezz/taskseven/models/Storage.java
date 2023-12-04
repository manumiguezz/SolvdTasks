package org.manumiguezz.taskseven.models;

import org.manumiguezz.taskseven.interfaces.Maintainable;
import org.manumiguezz.taskseven.interfaces.Storable;

import java.util.Objects;

public final class Storage extends ComputerComponent implements Storable, Maintainable {
    protected int capacityGB;
    protected String storageType;

    public Storage(String name, String manufacturer, int capacityGB, String storageType) {
        super(name, manufacturer);
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

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("Storage working...");
    }

    @Override
    public void performMaintenance() {
        System.out.println("performing maintenance");
    }

    @Override
    public void checkStatus() {
        System.out.println("checking...");
    }

    @Override
    public void readData() {
        System.out.println("reading...");
    }

    @Override
    public void writeData() {
        System.out.println("writing...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Storage storage = (Storage) o;
        return capacityGB == storage.capacityGB && Objects.equals(storageType, storage.storageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacityGB, storageType);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "capacityGB=" + capacityGB +
                ", storageType='" + storageType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}