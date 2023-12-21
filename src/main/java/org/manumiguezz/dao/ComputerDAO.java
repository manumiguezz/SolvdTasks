package org.manumiguezz.dao;

import org.manumiguezz.models.Computer;

import java.util.List;

public interface ComputerDAO {
    Computer findById(int id);

    List<Computer> findAll();

    void create(Computer computer);

    void update(Computer computer);

    void delete(int id);

    List<Computer> findByBrand(String brand);
}