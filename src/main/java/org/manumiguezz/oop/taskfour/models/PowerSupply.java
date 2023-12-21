package org.manumiguezz.oop.taskfour.models;

import org.manumiguezz.oop.taskfour.interfaces.Maintainable;
import org.manumiguezz.oop.taskfour.interfaces.Powerable;

import java.util.Objects;

public final class PowerSupply extends ComputerComponent implements Powerable, Maintainable {

    protected int wattsCertificate;
    protected String powerSupplyType;

    public PowerSupply(String name, String manufacturer, int wattsCertificate, String powerSupplyType) {
        super(name, manufacturer);
        this.wattsCertificate = wattsCertificate;
        this.powerSupplyType = powerSupplyType;
    }

    public int getWattsCertificate() {
        return wattsCertificate;
    }

    public void setWattsCertificate(int wattsCertificate) {
        this.wattsCertificate = wattsCertificate;
    }

    public String getPowerSupplyType() {
        return powerSupplyType;
    }

    public void setPowerSupplyType(String powerSupplyType) {
        this.powerSupplyType = powerSupplyType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("Power supply...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PowerSupply that = (PowerSupply) o;
        return wattsCertificate == that.wattsCertificate && Objects.equals(powerSupplyType, that.powerSupplyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wattsCertificate, powerSupplyType);
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "wattsCertificate=" + wattsCertificate +
                ", powerSupplyType='" + powerSupplyType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public void performMaintenance() {
        System.out.println("performing maintenance");
    }

    @Override
    public void checkStatus() {
        System.out.println("checking...");
    }

    @Override
    public void powerOn() {
        System.out.println("starting up");
    }

    @Override
    public void powerOff() {
        System.out.println("shutting down");
    }
}
