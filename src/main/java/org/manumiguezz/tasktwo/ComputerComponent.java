package org.manumiguezz.tasktwo;

public class ComputerComponent {
    private String name;
    private String manufacturer;

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

    public void displayDetails() {
        System.out.println("This is the info about " + name + ":");
        System.out.println("Component: " + name);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
