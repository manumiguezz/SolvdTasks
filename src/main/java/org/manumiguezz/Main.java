package org.manumiguezz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.utils.ConnectionPool;

import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        ConnectionPool connectionPool = ConnectionPool.getInstance();

        Scanner scanner = new Scanner(System.in);

    }
}
