package org.manumiguezz.factory;

import org.manumiguezz.models.CPU;
import org.manumiguezz.models.Component;

public class CPUFactory implements ComponentFactory {


    @Override
    public Component createComponent(int id, String model) {
        CPU cpu = new CPU();
        cpu.setCpuId(id);
        cpu.setCpuModel(model);

        return cpu;
    }
}