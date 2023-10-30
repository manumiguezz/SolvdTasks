package org.manumiguezz.tasktwo;

import org.manumiguezz.tasktwo.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CPU cpu = new CPU("Intel I9", "Intel", 9, "LGA1151");
        GPU gpu = new GPU("GTX 1080", "Nvidia", 8, "Dedicated graphics card");
        Memory memory = new Memory("SuperMemory", "Razer", 32, "DDR4");
        CoolingSystem cool = new CoolingSystem("SuperCool", "Logitech", 600, "Air Cooling");
        Motherboard motherboard = new Motherboard("AMD 820X", "AMD", "X299", "LGA1151");
        NetworkAdapter net = new NetworkAdapter("InetConnect", "TpLink", 8, "Wifi adapter");
        PowerSupply power = new PowerSupply("Corsair RM850X", "Corsair", 850, "Modular");
        Storage internalStorage = new Storage("Kingston 240", "Kingston", 240, "SSD");
        Storage externalStorage = new Storage("WD elements 1TB", "WD", 1000, "External");

        Computer myHomeComputer = new Computer(cpu, gpu, motherboard, memory, internalStorage, power, net, cool);

        System.out.println("activities to do: \n 1. chatting \n 2. playing games \n 3. playing music \n 4. coding");
        System.out.println("choose one with a number");
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
                default:
                    System.out.println("Please choose a correct number (1-4).");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }
}
