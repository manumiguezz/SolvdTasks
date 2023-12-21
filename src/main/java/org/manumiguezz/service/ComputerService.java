package org.manumiguezz.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.Main;
import org.manumiguezz.dao.ComputerDAO;
import org.manumiguezz.models.Computer;

import java.util.List;

public class ComputerService {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    private final ComputerDAO computerDAO;

    public ComputerService(ComputerDAO computerDAO) {
        this.computerDAO = computerDAO;
    }

    public Computer findComputerById(int id) {
        return computerDAO.findById(id);
    }

    public List<Computer> findAllComputers() {
        return computerDAO.findAll();
    }

    public void addNewComputer(Computer computer) {
        computerDAO.create(computer);
    }

    public void updateComputer(Computer computer) {
        computerDAO.update(computer);
    }

    public void removeComputer(int id) {
        computerDAO.delete(id);
    }

    public List<Computer> findComputersByBrand(String brand) {
        return computerDAO.findByBrand(brand);
    }
}