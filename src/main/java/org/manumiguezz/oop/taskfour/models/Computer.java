package org.manumiguezz.oop.taskfour.models;

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
    public void playGames (CPU cpu, GPU gpu, CoolingSystem cool, PowerSupply power) {
        power.powerOn();
        cool.boost();
        cpu.overclock();
        gpu.overclock();
        System.out.println("playing games...");
        power.powerOff();
    }
    public void playMusic (CPU cpu, Memory memory, NetworkAdapter net, PowerSupply power) {
        power.powerOn();
        cpu.boost();
        memory.usingComponent();
        net.connect();
        System.out.println("playing music...");
        net.disconnect();
        power.powerOff();
    }
    public void code (Memory memory, CPU cpu, PowerSupply power) {
        power.powerOn();
        cpu.boost();
        memory.writeData();
        System.out.println("coding...");
        power.powerOff();
    }
    public void chatting (NetworkAdapter networkAdapter, PowerSupply power) {
        power.powerOn();
        networkAdapter.connect();
        System.out.println("chatting");
        networkAdapter.disconnect();
        power.powerOff();
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