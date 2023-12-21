package org.manumiguezz.service.impl;

import org.manumiguezz.dao.ComputerPeripheralDAO;
import org.manumiguezz.models.ComputerPeripheral;
import org.manumiguezz.service.ComputerPeripheralService;

import java.util.List;

public class ComputerPeripheralServiceImpl implements ComputerPeripheralService {
    private final ComputerPeripheralDAO computerPeripheralDAO;

    public ComputerPeripheralServiceImpl(ComputerPeripheralDAO computerPeripheralDAO) {
        this.computerPeripheralDAO = computerPeripheralDAO;
    }

    @Override
    public ComputerPeripheral findComputerPeripheralById(int computerId, int peripheralId) {
        return computerPeripheralDAO.findById(computerId, peripheralId);
    }

    @Override
    public List<ComputerPeripheral> findAllComputerPeripherals() {
        return computerPeripheralDAO.findAll();
    }

    @Override
    public void addNewComputerPeripheral(ComputerPeripheral computerPeripheral) {
        computerPeripheralDAO.create(computerPeripheral);
    }

    @Override
    public void updateComputerPeripheral(ComputerPeripheral computerPeripheral) {
        computerPeripheralDAO.update(computerPeripheral);
    }

    @Override
    public void removeComputerPeripheral(int computerId, int peripheralId) {
        computerPeripheralDAO.delete(computerId, peripheralId);
    }
}
