package org.manumiguezz.tasktwo;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel I9", "Intel", 9, "LGA1151");
        GPU gpu = new GPU("GTX 1080", "Nvidia", 8, "Dedicated graphics card");
        Memory memory = new Memory("SuperMemory", "Razer", 32, "DDR4");
        CoolingSystem cool = new CoolingSystem("SuperCool", "Logitech", 600, "Air Cooling");
        Motherboard motherboard = new Motherboard("AMD 820X", "AMD", "X299", "LGA1151");
        NetworkAdapter net = new NetworkAdapter("InetConnect", "TpLink", 8, "Wifi adapter");
        PowerSupply power = new PowerSupply("Corsair RM850X", "Corsair", 850, "Modular");
        Storage internalStorage = new Storage("Kingston 240", "Kingston", 240, "SSD");
        Storage externalStorage = new Storage("WD elements 1TB", "WD", 1000, "External");


        System.out.println("info about my computer and each component:");
        cpu.displayDetails();
        memory.displayDetails();
        memory.displayDetails();
        cool.displayDetails();
        motherboard.displayDetails();
        net.displayDetails();
        power.displayDetails();
        internalStorage.displayDetails();
        externalStorage.displayDetails();
    }
}
