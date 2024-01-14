package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.CoolingSystem;

public class CoolingSystemFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        CoolingSystem coolingSystem = new CoolingSystem();
        coolingSystem.setCoolingSystemId(id);
        coolingSystem.setCoolingSystemModel(model);
        return coolingSystem;
    }
}
