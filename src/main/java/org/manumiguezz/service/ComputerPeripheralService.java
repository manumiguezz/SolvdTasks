package org.manumiguezz.service;

import org.manumiguezz.models.ComputerPeripheral;

import java.util.List;

public interface ComputerPeripheralService {
    ComputerPeripheral findComputerPeripheralById(int computerId, int peripheralId);

    List<ComputerPeripheral> findAllComputerPeripherals();

    void addNewComputerPeripheral(ComputerPeripheral computerPeripheral);

    void updateComputerPeripheral(ComputerPeripheral computerPeripheral);

    void removeComputerPeripheral(int computerId, int peripheralId);
    // Other business logic methods related to ComputerPeripheral entity
}