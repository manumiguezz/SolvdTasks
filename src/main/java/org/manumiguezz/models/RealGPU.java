package org.manumiguezz.models;

public class RealGPU implements GPUInterface{
    @Override
    public void render() {
        System.out.println("real gpu rendering");
    }
}
