package org.manumiguezz.tasknine;

import java.util.function.UnaryOperator;

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

    public boolean isUserFriendly() {
        return this == WINDOWS || this == MAC; // Considering Windows and macOS as user-friendly
    }

    public void modifyInfo(UnaryOperator<String> modifyType) {
        System.out.println("Modified OS name: " + modifyType.apply(name));
    }
}