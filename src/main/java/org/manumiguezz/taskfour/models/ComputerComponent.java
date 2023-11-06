package org.manumiguezz.taskfour.models;

import java.util.Objects;

public abstract class ComputerComponent {
    protected String name;
    protected String manufacturer;
    private final int componentID;

    static {
        System.out.println("performing initialization tasks first");
    }

    private static int totalComponents = 0;

    public ComputerComponent(String name, String manufacturer) {
        totalComponents++;
        this.name = name;
        this.manufacturer = manufacturer;
        this.componentID = totalComponents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static void driversInstall() {
        System.out.println("installing drivers...");
    }

    public abstract void displayDetails();

    public abstract void usingComponent();

    @Override
    public String toString() {
        return "ComputerComponent{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerComponent that = (ComputerComponent) o;
        return Objects.equals(name, that.name) && Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer);
    }
}


