package org.manumiguezz.taskeleven.utils;

import org.manumiguezz.taskeleven.models.Connection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private BlockingQueue<Connection> pool;

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(5);
        for (int i = 0; i < 5; i++) {
            pool.offer(new Connection());
        }
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void returnConnection(Connection connection) {
        pool.offer(connection);
    }
}