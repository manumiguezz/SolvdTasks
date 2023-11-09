package org.manumiguezz.tasktwo.models;

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

    public void playGames (CPU cpu, GPU gpu, CoolingSystem cool) {
        cpu.usingCpu();
        gpu.usingGpu();
        cool.coolingSystemMax();
        System.out.println("playing games...");
    }

    public void playMusic (CPU cpu, Memory memory) {
        cpu.usingCpu();
        memory.usingMemory();
        System.out.println("playing music...");
    }

    public void code (Memory memory) {
        memory.usingMemory();
        System.out.println("coding...");
    }

    public void chatting (NetworkAdapter networkAdapter) {
        networkAdapter.usingNetwork();
        System.out.println("chatting");
    }

    public void seeDetails (CoolingSystem coolingSystem, NetworkAdapter networkAdapter, GPU gpu, CPU cpu,
                            Memory memory, Motherboard motherboard, PowerSupply powerSupply, Storage storage) {
        System.out.println("Info about each component");
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