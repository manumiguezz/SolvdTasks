package org.manumiguezz.service.impl;

import org.manumiguezz.dao.ComputerDAO;
import org.manumiguezz.models.Computer;
import org.manumiguezz.service.ComputerService;

import java.util.List;

public class ComputerServiceImpl implements ComputerService {
    private final ComputerDAO computerDAO;

    public ComputerServiceImpl(ComputerDAO computerDAO) {
        this.computerDAO = computerDAO;
    }

    @Override
    public Computer findComputerById(int id) {
        return computerDAO.findById(id);
    }

    @Override
    public List<Computer> findAllComputers() {
        return computerDAO.findAll();
    }

    @Override
    public void addNewComputer(Computer computer) {
        computerDAO.create(computer);
    }

    @Override
    public void updateComputer(Computer computer) {
        computerDAO.update(computer);
    }

    @Override
    public void removeComputer(int id) {
        computerDAO.delete(id);
    }
}