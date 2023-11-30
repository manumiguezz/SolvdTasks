package org.manumiguezz.tasknine;

public enum ProcessorType {
    INTEL("Intel"),
    AMD("AMD");

    private String brand;

    ProcessorType(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printDetails() {
        System.out.println("Processor Brand: " + brand);
    }
}