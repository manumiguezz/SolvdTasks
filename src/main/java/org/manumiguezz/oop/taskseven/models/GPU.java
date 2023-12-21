package org.manumiguezz.oop.taskseven.models;

import org.manumiguezz.oop.taskseven.interfaces.Boosteable;
import org.manumiguezz.oop.taskseven.interfaces.Maintainable;
import org.manumiguezz.oop.taskten.interfaces.Overclockable;

import java.util.Objects;

public final class GPU extends ComputerComponent implements Overclockable, Boosteable, Maintainable {
    protected int memorySizeGB;
    protected String gpuType;

    public GPU(String name, String manufacturer, int memorySizeGB, String gpuType) {
        super(name, manufacturer);
        this.memorySizeGB = memorySizeGB;
        this.gpuType = gpuType;
    }

    public int getMemorySizeGB() {
        return memorySizeGB;
    }

    public void setMemorySizeGB(int memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    @Override
    public void usingComponent() {
        System.out.println("using " + gpuType + "...");
    }

    @Override
    public void overclock() {
        System.out.println("overclock");
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
    public void boost() {
        System.out.println("boosting...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GPU gpu = (GPU) o;
        return memorySizeGB == gpu.memorySizeGB && Objects.equals(gpuType, gpu.gpuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memorySizeGB, gpuType);
    }

    @Override
    public String toString() {
        return "GPU{" +
                "memorySizeGB=" + memorySizeGB +
                ", gpuType='" + gpuType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public void displayDetails() {
        System.out.println("Your component " + this.name + " is manufactured by " + this.manufacturer);
    }
}