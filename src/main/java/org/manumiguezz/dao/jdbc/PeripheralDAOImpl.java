package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.PeripheralDAO;
import org.manumiguezz.models.Peripheral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeripheralDAOImpl implements PeripheralDAO {
    private final Connection connection;

    public PeripheralDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Peripheral findById(int id) {
        Peripheral peripheral = null;
        String query = "SELECT * FROM Peripheral WHERE peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    peripheral = new Peripheral(
                            resultSet.getInt("peripheral_id"),
                            resultSet.getString("peripheral_type"),
                            resultSet.getString("peripheral_model")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peripheral;
    }

    @Override
    public List<Peripheral> findAll() {
        List<Peripheral> peripherals = new ArrayList<>();
        String query = "SELECT * FROM Peripheral";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Peripheral peripheral = new Peripheral(
                        resultSet.getInt("peripheral_id"),
                        resultSet.getString("peripheral_type"),
                        resultSet.getString("peripheral_model")
                );
                peripherals.add(peripheral);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peripherals;
    }

    @Override
    public void create(Peripheral peripheral) {
        String query = "INSERT INTO Peripheral (peripheral_id, peripheral_type, peripheral_model) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, peripheral.getPeripheralId());
            statement.setString(2, peripheral.getPeripheralType());
            statement.setString(3, peripheral.getPeripheralModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Peripheral peripheral) {
        String query = "UPDATE Peripheral SET peripheral_type = ?, peripheral_model = ? WHERE peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, peripheral.getPeripheralType());
            statement.setString(2, peripheral.getPeripheralModel());
            statement.setInt(3, peripheral.getPeripheralId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Peripheral WHERE peripheral_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}