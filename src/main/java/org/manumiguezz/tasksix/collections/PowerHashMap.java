package org.manumiguezz.tasksix.collections;

import org.manumiguezz.tasksix.models.PowerSupply;

import java.util.HashMap;
import java.util.Map;

public class PowerHashMap {
    private Map<String, PowerSupply> powerSupplies;

    public PowerHashMap() {
        this.powerSupplies = new HashMap<>();
    }

    public void addPowerSupply(String key, PowerSupply powerSupply) {
        powerSupplies.put(key, powerSupply);
    }

    public void deletePowerSupply(String key, PowerSupply powerSupply) {
        powerSupplies.remove(key, powerSupply);
    }

    public boolean containsPowerSupply(PowerSupply powerSupply) {
        return powerSupplies.containsValue(powerSupply);
    }

    public int getPowerSupplyCount() {
        return powerSupplies.size();
    }

    public void clearPowerSupplies() {
        powerSupplies.clear();
    }

}