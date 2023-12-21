package org.manumiguezz.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ConnectionPool.class);
    private static String url;
    private static String username;
    private static String password;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}