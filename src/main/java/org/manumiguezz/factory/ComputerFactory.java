package org.manumiguezz.factory;

import org.manumiguezz.models.*;

public interface ComputerFactory {
    CPUInterface createCPU();
    GPU createGPU();
    Motherboard createMotherboard();
    Memory createMemory();
    Storage createStorage();
}
