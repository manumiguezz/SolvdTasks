package org.manumiguezz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.models.Computer;
import org.manumiguezz.models.ComputerBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) throws JAXBException, JsonProcessingException {
        Scanner scanner = new Scanner(System.in);

        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer myComputer = computerBuilder
                .setCpuModel("intel i7")
                .setCpuId(1)
                .setGpuModel("amd rx 870x")
                .setGpuId(1)
                .setMotherboardModel("amd ax20")
                .setMotherboardId(1)
                .setMemoryModel("asus ddr4")
                .setMemoryId(1)
                .setStorageModel("corsair 1tb")
                .setStorageId(1)
                .setNetworkAdapterModel("tplink 4423")
                .setNetworkAdapterId(1)
                .setPowerSupplyModel("corsair 700w")
                .setPowerSupplyId(1)
                .build();


        JAXBContext context = JAXBContext.newInstance(Computer.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Computer computerJaxb = (Computer) unmarshaller.unmarshal(new File("src/main/resources/xml/computer.xml"));

        System.out.println("name" + computerJaxb.getComputerName());

        String jsonFilePath = "src/main/resources/json/computer.json";
        ObjectMapper objectMapper = new ObjectMapper();
        Computer computerJson = objectMapper.readValue(jsonFilePath, Computer.class);

        String xmlFilePath = "src/main/resource/xml/computer.xml";

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(xmlFilePath));

            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        System.out.println("Start Element: " + reader.getLocalName());
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        String text = reader.getText().trim();
                        if (!text.isEmpty()) {
                            System.out.println("Text: " + text);
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        System.out.println("End Element: " + reader.getLocalName());
                        break;
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

