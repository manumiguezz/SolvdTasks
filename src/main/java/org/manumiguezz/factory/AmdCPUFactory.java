package org.manumiguezz.factory;

import org.manumiguezz.models.AmdCPU;
import org.manumiguezz.models.Component;

public class AmdCPUFactory implements ComponentFactory {


    @Override
    public Component createComponent(int id, String model) {
        AmdCPU cpu = new AmdCPU();
        cpu.setCpuId(id);
        cpu.setCpuModel(model);

        return cpu;
    }
}