package org.manumiguezz.dao.impl;

import org.manumiguezz.dao.MotherboardDAO;
import org.manumiguezz.models.Motherboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotherboardDAOImpl implements MotherboardDAO {
    private final Connection connection;

    public MotherboardDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Motherboard findById(int id) {
        Motherboard motherboard = null;
        String query = "SELECT * FROM Motherboard WHERE motherboard_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    motherboard = new Motherboard(
                            resultSet.getInt("motherboard_id"),
                            resultSet.getString("motherboard_model")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return motherboard;
    }

    @Override
    public List<Motherboard> findAll() {
        List<Motherboard> motherboards = new ArrayList<>();
        String query = "SELECT * FROM Motherboard";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Motherboard motherboard = new Motherboard(
                        resultSet.getInt("motherboard_id"),
                        resultSet.getString("motherboard_model")
                );
                motherboards.add(motherboard);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return motherboards;
    }

    @Override
    public void create(Motherboard motherboard) {
        String query = "INSERT INTO Motherboard (motherboard_model) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, motherboard.getMotherboardModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Motherboard motherboard) {
        String query = "UPDATE Motherboard SET motherboard_model = ? WHERE motherboard_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, motherboard.getMotherboardModel());
            statement.setInt(2, motherboard.getMotherboardId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Motherboard WHERE motherboard_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}