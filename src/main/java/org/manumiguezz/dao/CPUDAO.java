package org.manumiguezz.dao;

import org.manumiguezz.models.IntelCPU;

import java.util.List;

public interface CPUDAO {
    IntelCPU findById(int id);

    List<IntelCPU> findAll();

    void create(IntelCPU cpu);

    void update(IntelCPU cpu);

    void delete(int id);
}
