package org.manumiguezz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.controllers.ComputerBuilderController;
import org.manumiguezz.models.*;
import org.manumiguezz.utils.SystemMonitor;
import org.manumiguezz.views.ComputerBuilderView;

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

        IntelCPU cpu = new IntelCPU();
        SystemMonitor systemMonitor = new SystemMonitor();
        cpu.registerListener(systemMonitor);

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
                .setNetworkAdapterModel("tp link 4423")
                .setNetworkAdapterId(1)
                .setPowerSupplyModel("corsair 700w")
                .setPowerSupplyId(1)
                .build();


        ComputerBuilderModel model = new ComputerBuilderModel();
        ComputerBuilderView view = new ComputerBuilderView();
        ComputerBuilderController controller = new ComputerBuilderController(model, view);

        controller.buildComputer("intel i7", "AMD 560x", "asus g50", "corsair ddr4", "asus 500gb", "corsair cooling", "asus 700w");

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

