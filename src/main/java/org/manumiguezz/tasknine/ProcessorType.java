package org.manumiguezz.tasknine;

import java.util.function.BiFunction;
import java.util.function.Predicate;

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

    public void checkProcessorType(Predicate<ProcessorType> checkType) {
        if (checkType.test(this)) {
            System.out.println(brand + " processor meets the criteria.");
        } else {
            System.out.println(brand + " processor does not meet the criteria.");
        }
    }

    public void concatenateBrand(BiFunction<String, String, String> concatenateFunction, String additionalString) {
        String result = concatenateFunction.apply(brand, additionalString);
        System.out.println("Concatenated String: " + result);
    }
}