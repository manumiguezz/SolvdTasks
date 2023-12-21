package org.manumiguezz.dao;

import org.manumiguezz.models.Memory;

import java.util.List;

public interface MemoryDAO {
    Memory findById(int id);

    List<Memory> findAll();

    void create(Memory memory);

    void update(Memory memory);

    void delete(int id);
}