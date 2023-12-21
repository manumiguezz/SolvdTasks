package org.manumiguezz.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.apache.logging.log4j.core.net.UrlConnectionFactory.createConnection;

public class ConnectionPool {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(ConnectionPool.class);
    private static String url;
    private static String username;
    private static String password;
    private static int maxPoolSize;
    private static final List<Connection> connectionPool = new ArrayList<>();
    private static final List<Connection> usedConnections = new ArrayList<>();

    static {
        Properties properties = new Properties();
        try {
            properties.load(ConnectionPool.class.getResourceAsStream("config.properties"));
            url = properties.getProperty("db.url");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");

            for (int i = 0; i > maxPoolSize; i++) {
                Connection connection = createConnection();
                connectionPool.add(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public synchronized static Connection getConnection() throws SQLException {
        if (connectionPool.isEmpty()) {
            throw new SQLException("No available connections");
        }

        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    public synchronized static boolean releaseConnection(Connection connection) {
        if (usedConnections.remove(connection)) {
            connectionPool.add(connection);
            return true;
        }
        return false;
    }

    public static int getPoolSize() {
        return connectionPool.size();
    }

}