package org.manumiguezz.taskeleven.utils;

import org.manumiguezz.taskeleven.models.Connection;

public class ConnectionUser implements Runnable {
    private final ConnectionPool connectionPool;

    public ConnectionUser(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    @Override
    public void run() {
        try {
            Connection connection = connectionPool.getConnection();
            System.out.println(Thread.currentThread().getName() + " got connection: " + connection);

            Thread.sleep(2000);

            connectionPool.releaseConnection(connection);
            System.out.println(Thread.currentThread().getName() + " released connection: " + connection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}