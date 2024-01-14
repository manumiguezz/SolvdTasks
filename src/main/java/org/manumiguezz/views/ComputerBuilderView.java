package org.manumiguezz.views;

public class ComputerBuilderView {

    public void displayComputerInformation(String cpuModel, String gpuModel, String motherboardModel, String memoryModel, String storageModel, String coolingSystemModel, String powerSupplyModel) {
        System.out.println("CPU Model: " + cpuModel);
        System.out.println("GPU Model: " + gpuModel);
        System.out.println("Motherboard Model: " + motherboardModel);
        System.out.println("Memory Model: " + memoryModel);
        System.out.println("Storage Model: " + storageModel);
        System.out.println("Cooling System Model: " + coolingSystemModel);
        System.out.println("Power Supply System Model: " + powerSupplyModel);
    }
}
