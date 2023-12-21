package org.manumiguezz.dao;

import org.manumiguezz.models.ComputerPeripheral;

import java.util.List;

public interface ComputerPeripheralDAO {
    ComputerPeripheral findById(int computerId, int peripheralId);

    List<ComputerPeripheral> findAll();

    void create(ComputerPeripheral computerPeripheral);

    void update(ComputerPeripheral computerPeripheral);

    void delete(int computerId, int peripheralId);
}