package org.manumiguezz.dao.jdbc;

import org.manumiguezz.dao.CPUDAO;
import org.manumiguezz.models.IntelCPU;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CPUDAOImpl implements CPUDAO {
    private final Connection connection;

    public CPUDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public IntelCPU findById(int id) {
        IntelCPU cpu = null;
        String query = "SELECT * FROM CPU WHERE cpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    cpu = new IntelCPU(
                            resultSet.getInt("cpu_id"),
                            resultSet.getString("cpu_model")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cpu;
    }

    @Override
    public List<IntelCPU> findAll() {
        List<IntelCPU> cpus = new ArrayList<>();
        String query = "SELECT * FROM CPU";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                IntelCPU cpu = new IntelCPU(
                        resultSet.getInt("cpu_id"),
                        resultSet.getString("cpu_model")
                );
                cpus.add(cpu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cpus;
    }

    @Override
    public void create(IntelCPU cpu) {
        String query = "INSERT INTO CPU (cpu_id, cpu_model) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cpu.getCpuId());
            statement.setString(2, cpu.getCpuModel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(IntelCPU cpu) {
        String query = "UPDATE CPU SET cpu_model = ? WHERE cpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cpu.getCpuModel());
            statement.setInt(2, cpu.getCpuId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM CPU WHERE cpu_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}