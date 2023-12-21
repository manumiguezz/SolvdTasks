package org.manumiguezz.dao;

import org.manumiguezz.models.CoolingSystem;

import java.util.List;

public interface CoolingSystemDAO {
    CoolingSystem findById(int id);

    List<CoolingSystem> findAll();

    void create(CoolingSystem coolingSystem);

    void update(CoolingSystem coolingSystem);

    void delete(int id);
}