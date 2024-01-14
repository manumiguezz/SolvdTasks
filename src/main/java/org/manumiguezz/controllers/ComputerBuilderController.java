package org.manumiguezz.controllers;

import org.manumiguezz.models.ComputerBuilderModel;
import org.manumiguezz.views.ComputerBuilderView;

public class ComputerBuilderController {
    private ComputerBuilderModel model;
    private ComputerBuilderView view;

    public ComputerBuilderController(ComputerBuilderModel model, ComputerBuilderView view) {
        this.model = model;
        this.view = view;
    }

    public void buildComputer(String cpuModel, String gpuModel, String motherboardModel, String memoryModel, String storageModel, String coolingSystemModel, String powerSupplyModel) {
        model.setCpuModel(cpuModel);
        model.setGpuModel(gpuModel);
        model.setMemoryModel(memoryModel);
        model.setCoolingSystemModel(coolingSystemModel);
        model.setMotherboardModel(motherboardModel);
        model.setPowerSupplyModel(powerSupplyModel);
        model.setStorageModel(storageModel);

        view.displayComputerInformation(
                model.getCpuModel(),
                model.getGpuModel(),
                model.getMemoryModel(),
                model.getCoolingSystemModel(),
                model.getMotherboardModel(),
                model.getPowerSupplyModel(),
                model.getStorageModel()
        );
    }

}

