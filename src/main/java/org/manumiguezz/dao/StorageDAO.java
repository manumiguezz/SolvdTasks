package org.manumiguezz.dao;

import org.manumiguezz.models.Storage;

import java.util.List;

public interface StorageDAO {
    Storage findById(int id);

    List<Storage> findAll();

    void create(Storage storage);

    void update(Storage storage);

    void delete(int id);
}