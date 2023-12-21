package org.manumiguezz.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ConnectionPool.class);
    private static String url;
    private static String username;
    private static String password;
    private static int maxPoolSize;
    private static final List<Connection> connectionPool = new ArrayList<>();
    private static final List<Connection> usedConnections = new ArrayList<>();



    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}