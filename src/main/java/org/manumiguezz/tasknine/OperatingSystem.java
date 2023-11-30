package org.manumiguezz.tasknine;

public enum OperatingSystem {
    WINDOWS("Windows", "GUI"),
    LINUX("Linux", "Command Line"),
    MAC("macOS", "User-Friendly");

    private String name;
    private String interfaceType;

    OperatingSystem(String name, String interfaceType) {
        this.name = name;
        this.interfaceType = interfaceType;
    }

    public String getName() {
        return name;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void displayInfo() {
        System.out.println("OS: " + name + ", Interface: " + interfaceType);
    }
}