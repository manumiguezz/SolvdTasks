package org.manumiguezz.taskthree.models;

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

    public void playGames (ComputerComponent cpu, ComputerComponent gpu, ComputerComponent cool) {
        cpu.usingComponent();
        gpu.usingComponent();
        cool.usingComponent();
        System.out.println("playing games...");
    }

    public void playMusic (ComputerComponent cpu, ComputerComponent memory) {
        cpu.usingComponent();
        memory.usingComponent();
        System.out.println("playing music...");
    }

    public void code (ComputerComponent memory) {
        memory.usingComponent();
        System.out.println("coding...");
    }

    public void chatting (ComputerComponent networkAdapter) {
        networkAdapter.usingComponent();
        System.out.println("chatting");
    }

    public void seeDetails (ComputerComponent coolingSystem, ComputerComponent networkAdapter, ComputerComponent gpu, ComputerComponent cpu,
                            ComputerComponent memory, ComputerComponent motherboard, ComputerComponent powerSupply, ComputerComponent storage) {
        System.out.println("Info about each component:");
        gpu.displayDetails();
        cpu.displayDetails();
        motherboard.displayDetails();
        memory.displayDetails();
        storage.displayDetails();
        powerSupply.displayDetails();
        coolingSystem.displayDetails();
        networkAdapter.displayDetails();

    }
}