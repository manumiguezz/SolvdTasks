package org.manumiguezz.dao;

import org.manumiguezz.models.Motherboard;

import java.util.List;

public interface MotherboardDAO {
    Motherboard findById(int id);

    List<Motherboard> findAll();

    void create(Motherboard motherboard);

    void update(Motherboard motherboard);

    void delete(int id);
}