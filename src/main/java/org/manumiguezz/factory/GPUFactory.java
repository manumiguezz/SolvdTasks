package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.GPU;

public class GPUFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        GPU gpu = new GPU();
        gpu.setGpuId(id);
        gpu.setGpuModel(model);
        return gpu;
    }
}
