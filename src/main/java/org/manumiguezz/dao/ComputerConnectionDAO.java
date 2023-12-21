package org.manumiguezz.dao;

import org.manumiguezz.models.ComputerConnection;

import java.util.List;

public interface ComputerConnectionDAO {
    ComputerConnection findById(int id, int connectionId);

    List<ComputerConnection> findAll();

    void create(ComputerConnection computerConnection);

    void update(ComputerConnection computerConnection);

    void delete(int id, int connectionId);
}