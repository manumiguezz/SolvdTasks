package org.manumiguezz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.models.Computer;
import org.manumiguezz.models.Motherboard;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) throws JAXBException {
        Scanner scanner = new Scanner(System.in);

        JAXBContext context = JAXBContext.newInstance(Computer.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Computer computer = (Computer) unmarshaller.unmarshal(new File("src/main/resources/xml/computer.xml"));

        System.out.println("name" + computer.getComputerName());
    }
}
