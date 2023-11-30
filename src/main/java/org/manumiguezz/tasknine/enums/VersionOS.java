package org.manumiguezz.tasknine.enums;

import org.manumiguezz.tasknine.enums.OperatingSystem;

enum VersionOS {
    WINDOWS_EXTENDED(OperatingSystem.WINDOWS, "Windows 11"),
    LINUX_EXTENDED(OperatingSystem.LINUX, "Linux Ubuntu 20.04"),
    MAC_EXTENDED(OperatingSystem.MAC, "Mac OS X 10.5");

    private OperatingSystem os;
    private String extendedName;

    VersionOS(OperatingSystem os, String extendedName) {
        this.os = os;
        this.extendedName = extendedName;
    }

    public OperatingSystem getOS() {
        return os;
    }

    public String getExtendedName() {
        return extendedName;
    }
}