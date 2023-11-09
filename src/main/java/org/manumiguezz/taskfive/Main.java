package org.manumiguezz.taskfive;

import org.manumiguezz.taskfive.exceptions.ConnectionErrorException;
import org.manumiguezz.taskfive.exceptions.InvalidComponentException;
import org.manumiguezz.taskfive.exceptions.OverheatingException;
import org.manumiguezz.taskfive.exceptions.PowerFailureException;
import org.manumiguezz.taskfive.models.*;

import java.util.Scanner;

public class Main {
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

        System.out.println("activities to do: \n 1. chatting \n 2. playing games " +
                "\n 3. playing music \n 4. coding \n 5. display computer details, and check status  " +
                "\n 6. check temperature \n 7. validate component \n 8. check power status " +
                "\n 9 check connection status \n 10. ");
        System.out.println("choose one with a number:");
        int activity = 0;
        try {
            activity = scanner.nextInt();

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
                    break;
                case 6:
                    try {
                        myHomeComputer.checkTemperature(80);
                    } catch (OverheatingException e) {
                        System.out.println("Overheating detected: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        myHomeComputer.validateComponent("Invalid", "Attributes", -5);
                    } catch (InvalidComponentException e) {
                        System.out.println("Invalid component detected: " + e.getMessage());
                    }
                case 8:
                    try {
                        myHomeComputer.checkPowerStatus(false);
                    } catch (PowerFailureException e) {
                        System.out.println("Power failure detected: " + e.getMessage());
                    }
                case 9:
                    try {
                        myHomeComputer.checkConnection(false);
                    } catch (ConnectionErrorException e) {
                        System.out.println("Connection error detected: " + e.getMessage());
                    }
                default:
                    System.out.println("Please choose a correct number (1-5).");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }
}
