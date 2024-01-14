package org.manumiguezz.factory;

import org.manumiguezz.models.*;

public class AmdComputer implements ComputerFactory{
    @Override
    public CPUInterface createCPU() {
        return new AmdCPU();
    }

    @Override
    public GPU createGPU() {
        return new GPU();
    }

    @Override
    public Motherboard createMotherboard() {
        return new Motherboard();
    }

    @Override
    public Memory createMemory() {
        return new Memory();
    }

    @Override
    public Storage createStorage() {
        return new Storage();
    }

    @Override
    public PowerSupply createPowerSupply() {
        return new PowerSupply();
    }
}
