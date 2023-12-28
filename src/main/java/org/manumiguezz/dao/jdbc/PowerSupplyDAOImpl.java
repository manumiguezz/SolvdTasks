package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.PowerSupplyDAO;
import org.manumiguezz.models.PowerSupply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PowerSupplyDAOImpl implements PowerSupplyDAO {
    private final Connection connection;

    public PowerSupplyDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public PowerSupply findById(int id) {
        PowerSupply powerSupply = null;
        String query = "SELECT * FROM PowerSupply WHERE power_supply_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    powerSupply = new PowerSupply(
                            resultSet.getInt("power_supply_id"),
                            resultSet.getString("power_supply_model")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return powerSupply;
    }

    @Override
    public List<PowerSupply> findAll() {
        List<PowerSupply> powerSupplies = new ArrayList<>();
        String query = "SELECT * FROM PowerSupply";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                PowerSupply powerSupply = new PowerSupply(
                        resultSet.getInt("power_supply_id"),
                        resultSet.getString("power_supply_model")
                );
                powerSupplies.add(powerSupply);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return powerSupplies;
    }

    @Override
    public void create(PowerSupply powerSupply) {
        String query = "INSERT INTO PowerSupply (power_supply_id, power_supply_model) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, powerSupply.getPowerSupplyId());
            statement.setString(2, powerSupply.getPowerSupplyModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(PowerSupply powerSupply) {
        String query = "UPDATE PowerSupply SET power_supply_model = ? WHERE power_supply_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, powerSupply.getPowerSupplyModel());
            statement.setInt(2, powerSupply.getPowerSupplyId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM PowerSupply WHERE power_supply_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}