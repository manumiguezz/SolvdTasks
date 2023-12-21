package org.manumiguezz.service;

import org.manumiguezz.models.ComputerConnection;

import java.util.List;

public interface ComputerConnectionService {
    ComputerConnection findComputerConnectionById(int computerId, int connectionId);

    List<ComputerConnection> findAllComputerConnections();

    void addNewComputerConnection(ComputerConnection computerConnection);

    void updateComputerConnection(ComputerConnection computerConnection);

    void removeComputerConnection(int computerId, int connectionId);
    // Other business logic methods related to ComputerConnection entity
}