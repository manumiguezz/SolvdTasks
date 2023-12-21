package org.manumiguezz.oop.tasknine;

import org.manumiguezz.oop.tasknine.enums.OperatingSystem;
import org.manumiguezz.oop.tasknine.enums.ProcessorType;
import org.manumiguezz.oop.tasknine.enums.StorageDevice;

public class main {

    public static void main(String[] args) {

        ProcessorType.INTEL.concatenateBrand((s1, s2) -> s1 + s2, "_Processor");
        ProcessorType.AMD.concatenateBrand((s1, s2) -> s1 + s2, "_Processor");

        OperatingSystem.WINDOWS.checkStringLength(str -> str.length() > 5, "WindowsOS");
        OperatingSystem.LINUX.checkStringLength(str -> str.length() > 5, "LinuxOS");

        StorageDevice.HDD.printArrayElements(array -> {
            for (Object obj : array) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }, new Object[]{"Storage", "HDD", 1024});

        StorageDevice.SSD.printArrayElements(array -> {
            for (Object obj : array) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }, new Object[]{"Storage", "SSD", 512});
    }
}
