package org.manumiguezz.tasktwo;

public class PowerSupply extends ComputerComponent{

    private int wattsCertificate;
    private String powerSupplyType;

    public PowerSupply(String name, String manufacturer, int wattsCertificate, String powerSupplyType) {
        super.setName(name);
        super.setManufacturer(manufacturer);
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
}
