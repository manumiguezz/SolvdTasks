package org.manumiguezz.oop.taskthree.models;

import java.util.Objects;

public class Memory extends ComputerComponent {
    protected int sizeGb;
    protected String memoryType;

    public Memory(String name, String manufacturer, int sizeGb, String memoryType) {
        super(name, manufacturer);
        this.sizeGb = sizeGb;
        this.memoryType = memoryType;
    }

    public int getSizeGb() {
        return sizeGb;
    }

    public void setSizeGb(int sizeGb) {
        this.sizeGb = sizeGb;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Your component " + name + " is manufactured by " + manufacturer);
    }

    @Override
    public void usingComponent() {
        System.out.println("using the total capacity of " + sizeGb + "gb...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Memory memory = (Memory) o;
        return sizeGb == memory.sizeGb && Objects.equals(memoryType, memory.memoryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sizeGb, memoryType);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "sizeGb=" + sizeGb +
                ", memoryType='" + memoryType + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
