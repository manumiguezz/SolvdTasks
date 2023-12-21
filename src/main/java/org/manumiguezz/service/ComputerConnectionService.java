package org.manumiguezz.service;

import org.manumiguezz.dao.ComputerConnectionDAO;
import org.manumiguezz.models.ComputerConnection;

import java.util.List;

public class ComputerConnectionService {
    private final ComputerConnectionDAO computerConnectionDAO;

    public ComputerConnectionService(ComputerConnectionDAO computerConnectionDAO) {
        this.computerConnectionDAO = computerConnectionDAO;
    }

    public ComputerConnection findComputerConnectionById(int computerId, int connectionId) {
        return computerConnectionDAO.findById(computerId, connectionId);
    }

    public List<ComputerConnection> findAllComputerConnections() {
        return computerConnectionDAO.findAll();
    }

    public void addNewComputerConnection(ComputerConnection computerConnection) {
        computerConnectionDAO.create(computerConnection);
    }

    public void updateComputerConnection(ComputerConnection computerConnection) {
        computerConnectionDAO.update(computerConnection);
    }

    public void removeComputerConnection(int computerId, int connectionId) {
        computerConnectionDAO.delete(computerId, connectionId);
    }

    // Additional Functionality Example:

    public List<ComputerConnection> findConnectionsByComputerId(int computerId) {
        return computerConnectionDAO.findByComputerId(computerId);
    }

    public void removeAllConnectionsForComputer(int computerId) {
        List<ComputerConnection> connections = computerConnectionDAO.findByComputerId(computerId);
        for (ComputerConnection connection : connections) {
            computerConnectionDAO.delete(computerId, connection.getConnectionId());
        }
    }
}