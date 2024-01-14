package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.PowerSupply;

public class PowerSupplyFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        PowerSupply powerSupply = new PowerSupply();
        powerSupply.setPowerSupplyId(id);
        powerSupply.setPowerSupplyModel(model);
        return powerSupply;
    }
}
