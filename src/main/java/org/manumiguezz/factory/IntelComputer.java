package org.manumiguezz.factory;

import org.manumiguezz.models.*;

public class IntelComputer implements ComputerFactory{
    @Override
    public IntelCPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return null;
    }

    @Override
    public Motherboard createMotherboard() {
        return null;
    }

    @Override
    public Memory createMemory() {
        return null;
    }

    @Override
    public Storage createStorage() {
        return null;
    }
}
