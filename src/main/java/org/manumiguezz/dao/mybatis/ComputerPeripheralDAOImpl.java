package org.manumiguezz.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.manumiguezz.dao.ComputerPeripheralDAO;
import org.manumiguezz.models.ComputerPeripheral;
import java.util.List;
import java.util.Map;

public class ComputerPeripheralDAOImpl implements ComputerPeripheralDAO {
    private final SqlSession sqlSession;

    public ComputerPeripheralDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public ComputerPeripheral findById(int computerId, int peripheralId) {
        try (SqlSession session = sqlSession) {
            return session.selectOne("org.manumiguezz.dao.ComputerPeripheralMapper.findById", Map.of("id", computerId, "peripheralId", peripheralId));
        }
    }

    @Override
    public List<ComputerPeripheral> findAll() {
        try (SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.ComputerPeripheralMapper.findAll");
        }
    }

    @Override
    public void create(ComputerPeripheral computerPeripheral) {
        try (SqlSession session = sqlSession) {
            session.insert("org.manumiguezz.dao.ComputerPeripheralMapper.create", computerPeripheral);
            session.commit();
        }
    }

    @Override
    public void update(ComputerPeripheral computerPeripheral) {
        try (SqlSession session = sqlSession) {
            session.update("org.manumiguezz.dao.ComputerPeripheralMapper.update", computerPeripheral);
            session.commit();
        }
    }

    @Override
    public void delete(int computerId, int peripheralId) {
        try (SqlSession session = sqlSession) {
            session.delete("org.manumiguezz.dao.ComputerPeripheralMapper.delete", Map.of("id", computerId, "peripheralId", peripheralId));
            session.commit();
        }
    }

    @Override
    public List<ComputerPeripheral> findByComputerId(int computerId) {
        try (SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.ComputerPeripheralMapper.findByComputerId", computerId);
        }
    }
}