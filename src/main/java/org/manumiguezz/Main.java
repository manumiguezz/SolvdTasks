package org.manumiguezz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.models.Computer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) throws JAXBException, JsonProcessingException {
        Scanner scanner = new Scanner(System.in);

        JAXBContext context = JAXBContext.newInstance(Computer.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Computer computerJaxb = (Computer) unmarshaller.unmarshal(new File("src/main/resources/xml/computer.xml"));

        System.out.println("name" + computerJaxb.getComputerName());

        String filePath = "src/main/resources/json/computer.json";
        ObjectMapper objectMapper = new ObjectMapper();
        Computer computerJson = objectMapper.readValue(filePath, Computer.class);

    }
}
