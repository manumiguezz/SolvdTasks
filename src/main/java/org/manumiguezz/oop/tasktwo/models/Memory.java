package org.manumiguezz.oop.tasktwo.models;

public class Memory extends ComputerComponent {
    private int sizeGb;
    private String memoryType;

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

    public void usingMemory () {
        System.out.println("using the total capacity of " + sizeGb + "gb...");
    }
}
