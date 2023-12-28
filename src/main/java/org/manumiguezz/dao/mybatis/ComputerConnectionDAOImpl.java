package org.manumiguezz.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.manumiguezz.dao.ComputerConnectionDAO;
import org.manumiguezz.models.ComputerConnection;
import java.util.List;

public class ComputerConnectionDAOImpl implements ComputerConnectionDAO {
    private final SqlSession sqlSession;

    public ComputerConnectionDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public ComputerConnection findById(int id, int connectionId) {
        return sqlSession.selectOne("org.manumiguezz.dao.ComputerConnectionMapper.findById", id);
    }

    @Override
    public List<ComputerConnection> findAll() {
        return sqlSession.selectList("org.manumiguezz.dao.ComputerConnectionMapper.findAll");
    }

    @Override
    public void create(ComputerConnection computerConnection) {
        sqlSession.insert("org.manumiguezz.dao.ComputerConnectionMapper.create", computerConnection);
    }

    @Override
    public void update(ComputerConnection computerConnection) {
        sqlSession.update("org.manumiguezz.dao.ComputerConnectionMapper.update", computerConnection);
    }

    @Override
    public void delete(int id, int connectionId) {
        sqlSession.delete("org.manumiguezz.dao.ComputerConnectionMapper.delete", id);
    }

    @Override
    public List<ComputerConnection> findByComputerId(int computerId) {
        return sqlSession.selectList("org.manumiguezz.dao.ComputerConnectionMapper.findByComputerId", computerId);
    }
}