package org.manumiguezz.tasktwo.models;
import org.manumiguezz.tasktwo.models.*;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private Memory memory;
    private Storage storage;
    private PowerSupply powerSupply;
    private NetworkAdapter networkAdapter;
    private CoolingSystem coolingSystem;

    public Computer(CPU cpu, GPU gpu, Motherboard motherboard, Memory memory, Storage storage, PowerSupply powerSupply, NetworkAdapter networkAdapter, CoolingSystem coolingSystem) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.storage = storage;
        this.powerSupply = powerSupply;
        this.networkAdapter = networkAdapter;
        this.coolingSystem = coolingSystem;
    }

    public static void playGames () {
        System.out.println("playing games...");
    }

    public static void playMusic () {
        System.out.println("playing music...");
    }

    public static void code () {
        System.out.println("coding...");
    }
}