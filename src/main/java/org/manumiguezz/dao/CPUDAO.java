package org.manumiguezz.dao;

import org.manumiguezz.models.AmdCPU;

import java.util.List;

public interface CPUDAO {
    AmdCPU findById(int id);

    List<AmdCPU> findAll();

    void create(AmdCPU cpu);

    void update(AmdCPU cpu);

    void delete(int id);
}
