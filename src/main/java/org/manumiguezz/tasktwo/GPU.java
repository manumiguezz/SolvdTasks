package org.manumiguezz.tasktwo;

import org.manumiguezz.ComputerComponent;

public class GPU extends ComputerComponent {
    private int memorySizeGB;
    private String gpuType;

    public GPU(String name, String manufacturer, int memorySizeGB, String gpuType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
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
}