package org.manumiguezz.factory;

import org.manumiguezz.models.*;

public class IntelComputer implements ComputerFactory{

    @Override
    public CPUInterface createCPU() {
        return new IntelCPU();
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
}
