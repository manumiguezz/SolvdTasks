package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.StorageDAO;
import org.manumiguezz.models.Storage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StorageDAOImpl implements StorageDAO {
    private final Connection connection;

    public StorageDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Storage findById(int id) {
        Storage storage = null;
        String query = "SELECT * FROM Storage WHERE storage_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    storage = new Storage(
                            resultSet.getInt("storage_id"),
                            resultSet.getString("storage_type"),
                            resultSet.getInt("storage_capacity")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storage;
    }

    @Override
    public List<Storage> findAll() {
        List<Storage> storages = new ArrayList<>();
        String query = "SELECT * FROM Storage";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Storage storage = new Storage(
                        resultSet.getInt("storage_id"),
                        resultSet.getString("storage_type"),
                        resultSet.getInt("storage_capacity")
                );
                storages.add(storage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return storages;
    }

    @Override
    public void create(Storage storage) {
        String query = "INSERT INTO Storage (storage_id, storage_type, storage_capacity) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, storage.getStorageId());
            statement.setString(2, storage.getStorageType());
            statement.setInt(3, storage.getStorageCapacity());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Storage storage) {
        String query = "UPDATE Storage SET storage_type = ?, storage_capacity = ? WHERE storage_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, storage.getStorageType());
            statement.setInt(2, storage.getStorageCapacity());
            statement.setInt(3, storage.getStorageId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Storage WHERE storage_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}