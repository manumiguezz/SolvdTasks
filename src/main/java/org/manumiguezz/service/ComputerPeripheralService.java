package org.manumiguezz.service;

import java.util.List;

public class ComputerPeripheralService {
    private final ComputerPeripheralDAO computerPeripheralDAO;

    public ComputerPeripheralService(ComputerPeripheralDAO computerPeripheralDAO) {
        this.computerPeripheralDAO = computerPeripheralDAO;
    }

    public ComputerPeripheral findComputerPeripheralById(int computerId, int peripheralId) {
        return computerPeripheralDAO.findById(computerId, peripheralId);
    }

    public List<ComputerPeripheral> findAllComputerPeripherals() {
        return computerPeripheralDAO.findAll();
    }

    public void addNewComputerPeripheral(ComputerPeripheral computerPeripheral) {
        computerPeripheralDAO.create(computerPeripheral);
    }

    public void updateComputerPeripheral(ComputerPeripheral computerPeripheral) {
        computerPeripheralDAO.update(computerPeripheral);
    }

    public void removeComputerPeripheral(int computerId, int peripheralId) {
        computerPeripheralDAO.delete(computerId, peripheralId);
    }


    public List<ComputerPeripheral> findPeripheralsByComputerId(int computerId) {
        return computerPeripheralDAO.findByComputerId(computerId);
    }

    public void removeAllPeripheralsForComputer(int computerId) {
        List<ComputerPeripheral> peripherals = computerPeripheralDAO.findByComputerId(computerId);
        for (ComputerPeripheral peripheral : peripherals) {
            computerPeripheralDAO.delete(computerId, peripheral.getPeripheralId());
        }
    }
}
