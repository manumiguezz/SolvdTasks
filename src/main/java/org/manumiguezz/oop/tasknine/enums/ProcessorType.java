package org.manumiguezz.oop.tasknine.enums;

import org.manumiguezz.oop.tasknine.interfaces.ExtendedFunction;
import org.manumiguezz.oop.tasknine.interfaces.MyFunction;
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

    public void analyzePerformance(MyFunction<ProcessorType, String> performanceAnalyzer) {
        String performance = performanceAnalyzer.apply(this);
        System.out.println("Performance analysis for " + brand + " processor: " + performance);
    }

    public void benchmark(ExtendedFunction<ProcessorType, String, Integer> benchmarkFunction, String software, String resolution) {
        int score = benchmarkFunction.apply(this, software, resolution);
        System.out.println("Benchmark score for " + brand + " processor running " + software + " at " + resolution + ": " + score);
    }
}