package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.CoolingSystemDAO;
import org.manumiguezz.models.CoolingSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoolingSystemDAOImpl implements CoolingSystemDAO {
    private final Connection connection;

    public CoolingSystemDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public CoolingSystem findById(int id) {
        CoolingSystem coolingSystem = null;
        String query = "SELECT * FROM CoolingSystem WHERE cooling_system_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    coolingSystem = new CoolingSystem(
                            resultSet.getInt("cooling_system_id"),
                            resultSet.getString("cooling_system_type")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coolingSystem;
    }

    @Override
    public List<CoolingSystem> findAll() {
        List<CoolingSystem> coolingSystems = new ArrayList<>();
        String query = "SELECT * FROM CoolingSystem";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                CoolingSystem coolingSystem = new CoolingSystem(
                        resultSet.getInt("cooling_system_id"),
                        resultSet.getString("cooling_system_type")
                );
                coolingSystems.add(coolingSystem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coolingSystems;
    }

    @Override
    public void create(CoolingSystem coolingSystem) {
        String query = "INSERT INTO CoolingSystem (cooling_system_id, cooling_system_type) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, coolingSystem.getCoolingSystemId());
            statement.setString(2, coolingSystem.getCoolingSystemModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(CoolingSystem coolingSystem) {
        String query = "UPDATE CoolingSystem SET cooling_system_type = ? WHERE cooling_system_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, coolingSystem.getCoolingSystemModel());
            statement.setInt(2, coolingSystem.getCoolingSystemId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM CoolingSystem WHERE cooling_system_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
