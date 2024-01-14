package org.manumiguezz.models;

public class ProxyGPU implements GPUInterface{
    private RealGPU realGPU;

    public ProxyGPU(RealGPU realGPU) {
        this.realGPU = realGPU;
    }

    private void createRealGPU() {
        if (realGPU == null) {
            realGPU = new RealGPU();
        }
    }

    @Override
    public void render() {
        createRealGPU();

        System.out.println("Proxy GPU handling additional tasks before rendering.");

        realGPU.render();

        System.out.println("Proxy GPU handling additional tasks after rendering.");
    }
}
