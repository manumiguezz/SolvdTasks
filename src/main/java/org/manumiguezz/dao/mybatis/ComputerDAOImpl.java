package org.manumiguezz.dao.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.manumiguezz.dao.ComputerDAO;
import org.manumiguezz.models.Computer;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ComputerDAOImpl implements ComputerDAO {
    private static final Logger LOGGER = LogManager.getLogger(UserDAO.class);
    private static SqlSession sqlSession;
    private static final SqlSessionFactory sqlSessionFactory;
    private static Reader reader = null;
    private static ComputerDAO computerMapper;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis.config.xml");
        } catch (IOException e) {
            LOGGER.info(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Override
    public Computer getEntityById(int id) {
        computerMapper = sqlSessionFactory.openSession().getMapper(IComputerDao.class);
        Computer computer = computerMapper.getEntityById(id);
        return computer;
    }

    @Override
    public void insertEntity(Computer computer) {
        try {
            sqlSession = sqlSessionFactory.openSession();
            sqlSession.insert("insertEntity", computer);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void updateEntity(Computer computer) {
        try {
            sqlSession = sqlSessionFactory.openSession();
            sqlSession.update("updateEntity", computer);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Override
    public void removeEntity(int id) {
        computerMapper = sqlSessionFactory.openSession().getMapper(IComputerDao.class);
        computerMapper.removeEntity(id);
    }

    @Override
    public List<Computer> getEntities() {
        computerMapper = sqlSessionFactory.openSession().getMapper(IComputerDao.class);
        List<Computer> list = computerMapper.getEntities();
        return list;
    }