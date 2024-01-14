package org.manumiguezz.factory;

import org.manumiguezz.models.Component;
import org.manumiguezz.models.Storage;

public class StorageFactory implements ComponentFactory{
    @Override
    public Component createComponent(int id, String model) {
        Storage storage = new Storage();
        storage.setStorageId(id);
        storage.setStorageModel(model);
        return storage;
    }
}
