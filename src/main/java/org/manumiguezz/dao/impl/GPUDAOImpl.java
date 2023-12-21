package org.manumiguezz.dao.impl;

import org.manumiguezz.dao.GPUDAO;
import org.manumiguezz.models.GPU;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GPUDAOImpl implements GPUDAO {
    private final Connection connection;

    public GPUDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public GPU findById(int id) {
        GPU gpu = null;
        String query = "SELECT * FROM GPU WHERE gpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    gpu = new GPU(
                            resultSet.getInt("gpu_id"),
                            resultSet.getString("gpu_model")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gpu;
    }

    @Override
    public List<GPU> findAll() {
        List<GPU> gpus = new ArrayList<>();
        String query = "SELECT * FROM GPU";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                GPU gpu = new GPU(
                        resultSet.getInt("gpu_id"),
                        resultSet.getString("gpu_model")
                );
                gpus.add(gpu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gpus;
    }

    @Override
    public void create(GPU gpu) {
        String query = "INSERT INTO GPU (gpu_id, gpu_model) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, gpu.getGpuId());
            statement.setString(2, gpu.getGpuModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(GPU gpu) {
        String query = "UPDATE GPU SET gpu_model = ? WHERE gpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, gpu.getGpuModel());
            statement.setInt(2, gpu.getGpuId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM GPU WHERE gpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}