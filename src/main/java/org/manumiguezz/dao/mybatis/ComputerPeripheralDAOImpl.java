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
        return sqlSession.selectOne("org.manumiguezz.dao.ComputerPeripheralMapper.findById", Map.of("id", computerId, "peripheralId", peripheralId));
    }

    @Override
    public List<ComputerPeripheral> findAll() {
        return sqlSession.selectList("org.manumiguezz.dao.ComputerPeripheralMapper.findAll");
    }

    @Override
    public void create(ComputerPeripheral computerPeripheral) {
        sqlSession.insert("org.manumiguezz.dao.ComputerPeripheralMapper.create", computerPeripheral);
    }

    @Override
    public void update(ComputerPeripheral computerPeripheral) {
        sqlSession.update("org.manumiguezz.dao.ComputerPeripheralMapper.update", computerPeripheral);
    }

    @Override
    public void delete(int computerId, int peripheralId) {
        sqlSession.delete("org.manumiguezz.dao.ComputerPeripheralMapper.delete", Map.of("id", computerId, "peripheralId", peripheralId));
    }

    @Override
    public List<ComputerPeripheral> findByComputerId(int computerId) {
        return sqlSession.selectList("org.manumiguezz.dao.ComputerPeripheralMapper.findByComputerId", computerId);
    }
}