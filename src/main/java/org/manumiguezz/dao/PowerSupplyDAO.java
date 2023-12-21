package org.manumiguezz.dao;

import org.manumiguezz.models.PowerSupply;

import java.util.List;

public interface PowerSupplyDAO {
    PowerSupply findById(int id);

    List<PowerSupply> findAll();

    void create(PowerSupply powerSupply);

    void update(PowerSupply powerSupply);

    void delete(int id);
}