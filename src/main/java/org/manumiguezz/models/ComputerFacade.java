package org.manumiguezz.models;

public class ComputerFacade {

    private CPUInterface cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private Memory memory;
    private Storage storage;
    private PowerSupply powerSupply;

    public ComputerFacade(CPUInterface cpu, GPU gpu, Motherboard motherboard, Memory memory, Storage storage, PowerSupply powerSupply) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.memory = memory;
        this.storage = storage;
        this.powerSupply = powerSupply;
    }

   public void startComputer () {
        cpu.startProcessing();
        gpu.startWorking();
        motherboard.startWorking();
        memory.startWorking();
        storage.startWorking();
        powerSupply.startWorking();
   }

   public void shutDownComputer () {
        cpu.stopProcessing();
        gpu.stopWorking();
        motherboard.stopWorking();
        memory.stopWorking();
        storage.stopWorking();
        powerSupply.stopWorking();
   }
}
