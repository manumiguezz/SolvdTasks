package org.manumiguezz.models;

public class AirCooling implements CoolingStrategyInterface{
    @Override
    public void cool() {
        System.out.println("air cooling started");
    }
}
