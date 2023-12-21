package org.manumiguezz.dao;

import org.manumiguezz.models.CPU;

import java.util.List;

public interface CPUDAO {
    CPU findById(int id);

    List<CPU> findAll();

    void create(CPU cpu);

    void update(CPU cpu);

    void delete(int id);
}
