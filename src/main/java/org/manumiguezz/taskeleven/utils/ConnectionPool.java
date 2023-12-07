package org.manumiguezz.taskeleven.connectionpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private BlockingQueue<Connection> pool;

    // Implement a lazy-initialized, thread-safe singleton instance of the pool

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(5);
        for (int i = 0; i < 5; i++) {
            pool.offer(new Connection());
        }
    }

    // Method to get a connection from the pool
    public Connection getConnection() throws InterruptedException {
        return pool.take(); // Blocking call, waits if the pool is empty
    }

    public void returnConnection(Connection connection) {
        pool.offer(connection);
    }
}