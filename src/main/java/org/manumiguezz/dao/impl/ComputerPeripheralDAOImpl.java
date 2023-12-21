package org.manumiguezz.dao.impl;

import org.manumiguezz.dao.ComputerPeripheralDAO;
import org.manumiguezz.models.ComputerPeripheral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComputerPeripheralDAOImpl implements ComputerPeripheralDAO {
    private final Connection connection;

    public ComputerPeripheralDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ComputerPeripheral findById(int computerId, int peripheralId) {
        ComputerPeripheral computerPeripheral = null;
        String query = "SELECT * FROM ComputerPeripheral WHERE computer_id = ? AND peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerId);
            statement.setInt(2, peripheralId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    computerPeripheral = new ComputerPeripheral(
                            resultSet.getInt("computer_id"),
                            resultSet.getInt("peripheral_id")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerPeripheral;
    }

    @Override
    public List<ComputerPeripheral> findAll() {
        List<ComputerPeripheral> computerPeripherals = new ArrayList<>();
        String query = "SELECT * FROM ComputerPeripheral";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                ComputerPeripheral computerPeripheral = new ComputerPeripheral(
                        resultSet.getInt("computer_id"),
                        resultSet.getInt("peripheral_id")
                );
                computerPeripherals.add(computerPeripheral);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerPeripherals;
    }

    @Override
    public void create(ComputerPeripheral computerPeripheral) {
        String query = "INSERT INTO ComputerPeripheral (computer_id, peripheral_id) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerPeripheral.getComputerPeripheralId());
            statement.setInt(2, computerPeripheral.getPeripheralId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ComputerPeripheral computerPeripheral) {
        String query = "UPDATE ComputerPeripheral SET computer_id = ? WHERE peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerPeripheral.getComputerPeripheralId());
            statement.setInt(2, computerPeripheral.getPeripheralId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int computerId, int peripheralId) {
        String query = "DELETE FROM ComputerPeripheral WHERE computer_id = ? AND peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerId);
            statement.setInt(2, peripheralId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}