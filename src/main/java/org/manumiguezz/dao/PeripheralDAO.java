package org.manumiguezz.dao;

import org.manumiguezz.models.Peripheral;

import java.util.List;

public interface PeripheralDAO {
    Peripheral findById(int id);

    List<Peripheral> findAll();

    void create(Peripheral peripheral);

    void update(Peripheral peripheral);

    void delete(int id);
}