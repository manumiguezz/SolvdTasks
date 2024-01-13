package org.manumiguezz.factory;
import org.manumiguezz.models.Component;

public interface ComponentFactory {
    Component createComponent(int id, String model);
}