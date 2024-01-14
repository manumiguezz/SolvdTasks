package org.manumiguezz.utils;

import org.manumiguezz.models.ComponentListener;

public class SystemMonitor implements ComponentListener {
    @Override
    public void onComponentChanged(String componentModel, int componentId) {
        System.out.println("Component with ID " + componentId + " changed to: " + componentModel);
    }
}
