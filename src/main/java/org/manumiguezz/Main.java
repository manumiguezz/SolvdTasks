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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public Computer parseXMLStringToComputerObject(String xmlString) {
        try {
            JAXBContext context = JAXBContext.newInstance(Computer.class, Motherboard.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            StringReader reader = new StringReader(xmlString);
            Computer computer = (Computer) unmarshaller.unmarshal(reader);

            return computer;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
