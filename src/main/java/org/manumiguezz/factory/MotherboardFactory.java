package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.Motherboard;

public class MotherboardFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        Motherboard motherboard = new Motherboard();
        motherboard.setMotherboardId(id);
        motherboard.setMotherboardModel(model);
        return motherboard;
    }
}
