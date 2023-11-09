package org.manumiguezz.taskfive.models;

import org.manumiguezz.taskfive.exceptions.*;

public class Computer {

    private static final int maximumTemperature = 80;
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

    public void checkTemperature(int temperature) throws OverheatingException {
        if (temperature > maximumTemperature) {
            throw new OverheatingException("Component temperature is too high: " + temperature + "°C");
        }
    }

    public void validateComponent(String name, String manufacturer, int value) throws InvalidComponentException {
        if (name == null || name.isBlank() || manufacturer == null || manufacturer.isBlank() || value <= 0) {
            throw new InvalidComponentException("Invalid component attributes provided.");
        }
    }

    public void checkPowerStatus(boolean isPowerOn) throws PowerFailureException {
        if (!isPowerOn) {
            throw new PowerFailureException("Power failure detected.");
        }
    }

    public void checkConnection(boolean isConnected) throws ConnectionErrorException {
        if (!isConnected) {
            throw new ConnectionErrorException("Connection error detected.");
        }
    }

    public void checkStorage(int availableSpace) throws InsufficientStorageException {
        int requiredSpace = 100; // Consider 100 units as required space
        if (availableSpace < requiredSpace) {
            throw new InsufficientStorageException("Insufficient storage space detected.");
        }
        // Other logic
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