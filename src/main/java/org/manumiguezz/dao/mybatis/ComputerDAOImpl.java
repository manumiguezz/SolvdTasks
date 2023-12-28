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
        return sqlSession.selectOne("org.manumiguezz.dao.mapper.ComputerMapper.findById", id);
    }

    @Override
    public List<Computer> findAll() {
        return sqlSession.selectList("org.manumiguezz.dao.mapper.ComputerMapper.findAll");
    }

    @Override
    public void create(Computer computer) {
        sqlSession.insert("org.manumiguezz.dao.mapper.ComputerMapper.create", computer);
    }

    @Override
    public void update(Computer computer) {
        sqlSession.update("org.manumiguezz.dao.mapper.ComputerMapper.update", computer);
    }

    @Override
    public void delete(int id) {
        sqlSession.delete("org.manumiguezz.dao.mapper.ComputerMapper.delete", id);
    }

    @Override
    public List<Computer> findByBrand(String brand) {
        return sqlSession.selectList("org.manumiguezz.dao.mapper.ComputerMapper.findByMotherboardId", brand);
    }
}