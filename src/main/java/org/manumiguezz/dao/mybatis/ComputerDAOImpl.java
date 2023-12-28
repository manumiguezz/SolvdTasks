package org.manumiguezz.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.manumiguezz.dao.ComputerDAO;
import org.manumiguezz.models.Computer;
import java.util.List;

public class ComputerDAOImpl implements ComputerDAO {
    private final SqlSession sqlSession;

    public ComputerDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Computer findById(int id) {
        try(SqlSession session = sqlSession) {
            return session.selectOne("org.manumiguezz.dao.mapper.ComputerMapper.findById", id);
        }
    }

    @Override
    public List<Computer> findAll() {
        try(SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.mapper.ComputerMapper.findAll");
        }
    }

    @Override
    public void create(Computer computer) {
        try(SqlSession session = sqlSession) {
            session.insert("org.manumiguezz.dao.mapper.ComputerMapper.create", computer);
            session.commit();
        }
    }

    @Override
    public void update(Computer computer) {
        try(SqlSession session = sqlSession) {
            session.update("org.manumiguezz.dao.mapper.ComputerMapper.update", computer);
            session.commit();
        }
    }

    @Override
    public void delete(int id) {
        try(SqlSession session = sqlSession) {
            session.delete("org.manumiguezz.dao.mapper.ComputerMapper.delete", id);
            session.commit();
        }
    }

    @Override
    public List<Computer> findByBrand(String brand) {
        try(SqlSession session = sqlSession) {
            return session.selectList("org.manumiguezz.dao.mapper.ComputerMapper.findByMotherboardId", brand);
        }
    }
}