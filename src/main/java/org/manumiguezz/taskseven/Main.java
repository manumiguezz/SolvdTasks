package org.manumiguezz.taskseven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.manumiguezz.taskseven.collections.ComputerComponentLinkedList;
import org.manumiguezz.taskseven.exceptions.*;
import org.manumiguezz.taskseven.models.*;

import java.util.Scanner;

public class Main {
    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ComputerComponent cpu = new CPU("Intel I9", "Intel", 9, "LGA1151");
        ComputerComponent gpu = new GPU("GTX 1080", "Nvidia", 8, "Dedicated graphics card");
        ComputerComponent memory = new Memory("SuperMemory", "Razer", 32, "DDR4");
        ComputerComponent cool = new CoolingSystem("SuperCool", "Logitech", 600, "Air Cooling");
        ComputerComponent motherboard = new Motherboard("AMD 820X", "AMD", "X299", "LGA1151");
        ComputerComponent net = new NetworkAdapter("InetConnect", "TpLink", 8, "Wifi adapter");
        ComputerComponent power = new PowerSupply("Corsair RM850X", "Corsair", 850, "Modular");
        ComputerComponent internalStorage = new Storage("Kingston 240", "Kingston", 240, "SSD");
        ComputerComponent externalStorage = new Storage("WD elements 1TB", "WD", 1000, "External");

        Computer myHomeComputer = new Computer((CPU) cpu,(GPU) gpu,(Motherboard) motherboard,(Memory) memory,(Storage) internalStorage,(PowerSupply) power,(NetworkAdapter) net,(CoolingSystem) cool);
        String filename = "IvanThanksForYourClasses.txt";

        ComputerComponentLinkedList<ComputerComponent> computerComponentList = new ComputerComponentLinkedList<>();
        computerComponentList.add(cpu);
        computerComponentList.add(gpu);
        computerComponentList.add(memory);
        computerComponentList.add(cool);
        computerComponentList.add(motherboard);
        computerComponentList.add(net);
        computerComponentList.add(power);
        computerComponentList.add(internalStorage);

        logger.info("starting computer activities...");

        logger.info("activities to do: \n 1. chatting \n 2. playing games " +
                "\n 3. playing music \n 4. coding \n 5. display computer details, and check status  " +
                "\n 6. check temperature \n 7. validate component \n 8. check power status " +
                "\n 9 check connection status \n 10. check storage \n 11. read computer file");
        logger.info("choose one with a number:");

        try {
            int activity = scanner.nextInt();

            switch (activity) {
                case 1:
                    myHomeComputer.chatting((NetworkAdapter) net, (PowerSupply) power);
                    break;
                case 2:
                    myHomeComputer.playGames((CPU) cpu, (GPU) gpu, (CoolingSystem) cool, (PowerSupply) power);
                    break;
                case 3:
                    myHomeComputer.playMusic((CPU) cpu, (Memory) memory, (NetworkAdapter) net, (PowerSupply) power);
                    break;
                case 4:
                    myHomeComputer.code((Memory) memory, (CPU) cpu, (PowerSupply) power);
                    break;
                case 5:
                    myHomeComputer.seeDetails(cool, net, gpu, cpu, memory, motherboard, power, internalStorage);
                    computerComponentList.display();
                    break;
                case 6:
                    try {
                        myHomeComputer.checkTemperature(80);
                    } catch (OverheatingException e) {
                        logger.warn("Overheating detected: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        myHomeComputer.validateComponent("Invalid", "Attributes", -5);
                    } catch (InvalidComponentException e) {
                        logger.warn("Invalid component detected: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        myHomeComputer.checkPowerStatus(false);
                    } catch (PowerFailureException e) {
                        logger.fatal("Power failure detected: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        myHomeComputer.checkConnection(false);
                    } catch (ConnectionErrorException e) {
                        logger.warn("Connection error detected: " + e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        myHomeComputer.checkStorage(50);
                    } catch (InsufficientStorageException e) {
                        logger.warn("Insufficient storage space detected: " + e.getMessage());
                    }
                    break;
                case 11:
                    try {
                        myHomeComputer.readFromFile(filename);
                    } catch (Exception e) {
                        logger.warn("An error occurred while reading the file: " + e.getMessage(), e);
                    }
                    break;
                default:
                    logger.info("Please choose a correct number (1-11).");
                    break;
            }
        } catch (Exception e) {
            logger.warn("Invalid input. Please enter a valid number.");
        } finally {
            logger.info("computer has turned off...");
            scanner.close();
        }



    }
}
