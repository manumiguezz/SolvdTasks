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
        try (SqlSession session = sqlSession) {
            return session.selectOne("org.manumiguezz.dao.ComputerConnectionMapper.findById", id);
        }
    }

    @Override
    public List<ComputerConnection> findAll() {
        try (SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.ComputerConnectionMapper.findAll");
        }
    }

    @Override
    public void create(ComputerConnection computerConnection) {
        try (SqlSession session = sqlSession) {
            session.insert("org.manumiguezz.dao.ComputerConnectionMapper.create", computerConnection);
            session.commit();
        }
    }

    @Override
    public void update(ComputerConnection computerConnection) {
        try (SqlSession session = sqlSession) {
            session.update("org.manumiguezz.dao.ComputerConnectionMapper.update", computerConnection);
            session.commit();
        }
    }

    @Override
    public void delete(int id, int connectionId) {
        try (SqlSession session = sqlSession) {
            session.delete("org.manumiguezz.dao.ComputerConnectionMapper.delete", id);
            session.commit();
        }
    }

    @Override
    public List<ComputerConnection> findByComputerId(int computerId) {
        try (SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.ComputerConnectionMapper.findByComputerId", computerId);
        }
    }
}