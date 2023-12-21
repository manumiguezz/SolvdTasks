package org.manumiguezz.oop.taskeleven.threads;

import org.manumiguezz.oop.taskeleven.utils.ConnectionPool;
import org.manumiguezz.oop.taskeleven.models.Connection;

public class ConnectionRunnable implements Runnable {
    private ConnectionPool connectionPool;

    public ConnectionRunnable(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public void run() {
        try {
            Connection connection = connectionPool.getConnection();
            // Use the connection
            Thread.sleep(1000); // Simulating connection usage
            connectionPool.returnConnection(connection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}