package org.manumiguezz.service.impl;

import org.manumiguezz.dao.ComputerConnectionDAO;
import org.manumiguezz.models.ComputerConnection;
import org.manumiguezz.service.ComputerConnectionService;

import java.util.List;

public class ComputerConnectionServiceImpl implements ComputerConnectionService {
    private final ComputerConnectionDAO computerConnectionDAO;

    public ComputerConnectionServiceImpl(ComputerConnectionDAO computerConnectionDAO) {
        this.computerConnectionDAO = computerConnectionDAO;
    }

    @Override
    public ComputerConnection findComputerConnectionById(int computerId, int connectionId) {
        return computerConnectionDAO.findById(computerId, connectionId);
    }

    @Override
    public List<ComputerConnection> findAllComputerConnections() {
        return computerConnectionDAO.findAll();
    }

    @Override
    public void addNewComputerConnection(ComputerConnection computerConnection) {
        computerConnectionDAO.create(computerConnection);
    }

    @Override
    public void updateComputerConnection(ComputerConnection computerConnection) {
        computerConnectionDAO.update(computerConnection);
    }

    @Override
    public void removeComputerConnection(int computerId, int connectionId) {
        computerConnectionDAO.delete(computerId, connectionId);
    }
}