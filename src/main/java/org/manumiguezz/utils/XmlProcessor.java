package org.manumiguezz.utils;

import org.manumiguezz.models.Computer;
import org.manumiguezz.models.Motherboard;

import javax.xml.bind.*;
import java.io.StringReader;

public class XmlProcessor {
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