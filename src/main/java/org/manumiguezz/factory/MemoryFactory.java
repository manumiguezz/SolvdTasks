package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.Memory;

public class MemoryFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        Memory memory = new Memory();
        memory.setMemoryId(id);
        memory.setMemoryModel(model);
        return memory;
    }
}
