package org.manumiguezz.taskthree;

import org.manumiguezz.taskthree.models.*;

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

        System.out.println("activities to do: \n 1. chatting \n 2. playing games \n 3. playing music \n 4. coding \n 5. display computer details");
        System.out.println("choose one with a number:");
        int activity = 0;
        try {
            activity = scanner.nextInt();

            switch (activity) {
                case 1:
                    myHomeComputer.chatting(net);
                    break;
                case 2:
                    myHomeComputer.playGames(cpu, gpu, cool);
                    break;
                case 3:
                    myHomeComputer.playMusic(cpu, memory);
                    break;
                case 4:
                    myHomeComputer.code(memory);
                    break;
                case 5:
                    myHomeComputer.seeDetails(cool, net, gpu, cpu, memory, motherboard, power, internalStorage);
                    break;
                default:
                    System.out.println("Please choose a correct number (1-5).");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }
}
