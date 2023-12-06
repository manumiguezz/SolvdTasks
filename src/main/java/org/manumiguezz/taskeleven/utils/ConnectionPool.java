package org.manumiguezz.taskeleven.utils;

import org.manumiguezz.taskeleven.models.Connection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private final BlockingQueue<Connection> pool;

    private ConnectionPool(int size) {
        this.pool = new ArrayBlockingQueue<>(size);
        initializePool(size);
    }

    private void initializePool(int size) {
        for (int i = 0; i < size; i++) {
            Connection connection = createConnection();
            pool.offer(connection);
        }
    }

    public static ConnectionPool createConnectionPool(int size) {
        return new ConnectionPool(size);
    }

    public Connection getConnection() throws InterruptedException {
        // Retrieve a connection from the pool
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }

    private Connection createConnection() {
        return new Connection("url", "username", "password");
    }
}
