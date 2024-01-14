package org.manumiguezz.factory;

import org.manumiguezz.models.*;

public interface ComputerFactory {
    IntelCPU createCPU();
    GPU createGPU();
    Motherboard createMotherboard();
    Memory createMemory();
    Storage createStorage();
}
