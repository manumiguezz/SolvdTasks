package org.manumiguezz.taskseven.collections;

import org.manumiguezz.taskseven.models.Motherboard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MotherboardList {
    private List<Motherboard> motherboards;

    public MotherboardList() {
        this.motherboards = new ArrayList<>();
    }

    public void addMotherboard(Motherboard motherboard) {
        motherboards.add(motherboard);
    }

    public Set<Motherboard> getAllMotherboards() {
        return new HashSet<>(motherboards);
    }

    public void clearMotherboards() {
        motherboards.clear();
    }



}