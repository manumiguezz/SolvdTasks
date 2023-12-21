package org.manumiguezz.dao.impl;

import org.manumiguezz.dao.ComputerConnectionDAO;
import org.manumiguezz.models.ComputerConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComputerConnectionDAOImpl implements ComputerConnectionDAO {
    private final Connection connection;

    public ComputerConnectionDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ComputerConnection findById(int id, int connectionId) {
        ComputerConnection computerConnection = null;
        String query = "SELECT * FROM ComputerConnection WHERE connection_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    computerConnection = new ComputerConnection(
                            resultSet.getInt("computer_id"),
                            resultSet.getInt("connection_id")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerConnection;
    }

    @Override
    public List<ComputerConnection> findAll() {
        List<ComputerConnection> computerConnections = new ArrayList<>();
        String query = "SELECT * FROM ComputerConnection";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                ComputerConnection computerConnection = new ComputerConnection(
                        resultSet.getInt("computer_id"),
                        resultSet.getInt("connection_id")
                );
                computerConnections.add(computerConnection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerConnections;
    }

    @Override
    public void create(ComputerConnection computerConnection) {
        String query = "INSERT INTO ComputerConnection (computer_id, connection_id) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerConnection.getComputerId());
            statement.setInt(2, computerConnection.getConnectionId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ComputerConnection computerConnection) {
        String query = "UPDATE ComputerConnection SET computer_id = ? WHERE connection_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerConnection.getComputerId());
            statement.setInt(2, computerConnection.getConnectionId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id, int connectionId) {
        String query = "DELETE FROM ComputerConnection WHERE connection_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ComputerConnection> findByComputerId(int computerId) {
        List<ComputerConnection> computerConnections = new ArrayList<>();
        String query = "SELECT * FROM ComputerConnection WHERE computer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, computerId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ComputerConnection computerConnection = new ComputerConnection(
                            resultSet.getInt("computer_id"),
                            resultSet.getInt("connection_id")
                    );
                    computerConnections.add(computerConnection);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerConnections;
    }
}