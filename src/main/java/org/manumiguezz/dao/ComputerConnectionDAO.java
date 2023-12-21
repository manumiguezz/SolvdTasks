package org.manumiguezz.dao;

import org.manumiguezz.models.ComputerConnection;

import java.util.List;

public interface ComputerConnectionDAO {
    ComputerConnection findById(int id);

    List<ComputerConnection> findAll();

    void create(ComputerConnection computerConnection);

    void update(ComputerConnection computerConnection);

    void delete(int id);
}