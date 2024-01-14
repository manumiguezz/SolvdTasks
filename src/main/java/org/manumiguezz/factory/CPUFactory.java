package org.manumiguezz.factory;

import org.manumiguezz.models.IntelCPU;
import org.manumiguezz.models.Component;

public class CPUFactory implements ComponentFactory {


    @Override
    public Component createComponent(int id, String model) {
        IntelCPU cpu = new IntelCPU();
        cpu.setCpuId(id);
        cpu.setCpuModel(model);

        return cpu;
    }
}