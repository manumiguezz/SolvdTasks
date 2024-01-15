package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.ComputerDAO;
import org.manumiguezz.models.Computer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComputerDAOImpl implements ComputerDAO {
    private final Connection connection;

    public ComputerDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Computer findById(int id) {
        Computer computer = null;
        String query = "SELECT * FROM Computer WHERE computer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    computer = new Computer();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computer;
    }

    @Override
    public List<Computer> findAll() {
        List<Computer> computers = new ArrayList<>();
        String query = "SELECT * FROM Computer";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Computer computer = new Computer();
                computers.add(computer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computers;
    }

    @Override
    public void create(Computer computer) {
        String query = "INSERT INTO Computer (computer_name, motherboard_id, power_supply_id, cooling_system_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, computer.getComputerName());
            statement.setInt(2, computer.getMotherboardId());
            statement.setInt(3, computer.getPowerSupplyId());
            statement.setInt(4, computer.getCoolingSystemId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Computer computer) {
        String query = "UPDATE Computer SET computer_name = ?, motherboard_id = ?, power_supply_id = ?, cooling_system_id = ? WHERE computer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, computer.getComputerName());
            statement.setInt(2, computer.getMotherboardId());
            statement.setInt(3, computer.getPowerSupplyId());
            statement.setInt(4, computer.getCoolingSystemId());
            statement.setInt(5, computer.getComputerId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Computer WHERE computer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Computer> findByBrand(String brand) {
        List<Computer> computers = new ArrayList<>();
        String query = "SELECT * FROM Computer WHERE brand = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, brand);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Computer computer = new Computer();
                    computers.add(computer);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computers;
    }
}