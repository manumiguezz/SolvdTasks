package org.manumiguezz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.models.Computer;

import javax.xml.bind.JAXBContext;
import java.io.File;
import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File computerXml = new File ("src/main/resources/xml/computer.xml");

    }
}
