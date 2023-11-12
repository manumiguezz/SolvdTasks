package org.manumiguezz.tasksix.collections;

import org.manumiguezz.tasksix.models.Motherboard;

import java.util.ArrayList;
import java.util.List;

public class MotherboardList {
    private List<Motherboard> motherboards;

    public MotherboardList() {
        this.motherboards = new ArrayList<>();
    }

    public void addMotherboard(Motherboard motherboard) {
        motherboards.add(motherboard);
    }


}