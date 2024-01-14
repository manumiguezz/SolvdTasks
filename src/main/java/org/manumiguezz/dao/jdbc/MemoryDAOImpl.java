package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.MemoryDAO;
import org.manumiguezz.models.Memory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemoryDAOImpl implements MemoryDAO {
    private final Connection connection;

    public MemoryDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Memory findById(int id) {
        Memory memory = null;
        String query = "SELECT * FROM Memory WHERE memory_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    memory = new Memory(
                            resultSet.getInt("memory_id"),
                            resultSet.getString("memory_type"),
                            resultSet.getInt("memory_capacity")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memory;
    }

    @Override
    public List<Memory> findAll() {
        List<Memory> memories = new ArrayList<>();
        String query = "SELECT * FROM Memory";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Memory memory = new Memory(
                        resultSet.getInt("memory_id"),
                        resultSet.getString("memory_type"),
                        resultSet.getInt("memory_capacity")
                );
                memories.add(memory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memories;
    }

    @Override
    public void create(Memory memory) {
        String query = "INSERT INTO Memory (memory_id, memory_type, memory_capacity) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, memory.getMemoryId());
            statement.setString(2, memory.getMemoryModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Memory memory) {
        String query = "UPDATE Memory SET memory_type = ?, memory_capacity = ? WHERE memory_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, memory.getMemoryModel());
            statement.setInt(3, memory.getMemoryId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM Memory WHERE memory_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}