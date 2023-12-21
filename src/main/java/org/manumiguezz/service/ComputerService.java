package org.manumiguezz.service;

import org.manumiguezz.models.Computer;

import java.util.List;

public interface ComputerService {
    Computer findComputerById(int id);

    List<Computer> findAllComputers();

    void addNewComputer(Computer computer);

    void updateComputer(Computer computer);

    void removeComputer(int id);
}