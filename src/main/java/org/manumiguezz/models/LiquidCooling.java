package org.manumiguezz.models;

public class LiquidCooling implements CoolingStrategyInterface{
    @Override
    public void cool() {
        System.out.println("liquid cooling started");
    }
}
