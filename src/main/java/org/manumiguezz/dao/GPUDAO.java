package org.manumiguezz.dao;

import org.manumiguezz.models.GPU;

import java.util.List;

public interface GPUDAO {
    GPU findById(int id);

    List<GPU> findAll();

    void create(GPU gpu);

    void update(GPU gpu);

    void delete(int id);
}