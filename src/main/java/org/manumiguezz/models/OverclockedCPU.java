package org.manumiguezz.models;

public class OverclockedCPU implements CPUDecorator {

    @Override
    public String getPerformanceInfo() {
        return "overclocked performance";
    }

    @Override
    public void processData(String model) {
        System.out.println("overclocked processing data");
    }

    @Override
    public void stopProcessing() {
        System.out.println("Overclocked CPU stopped");
    }

    @Override
    public void startProcessing() {
        System.out.println("Overclocked CPU started");
    }
}
