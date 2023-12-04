package org.manumiguezz.taskten.collections;

import org.manumiguezz.taskten.models.Motherboard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

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

    public Map<Integer, Motherboard> transformToMap() {
        return motherboards.stream()
                .collect(Collectors.toMap(Motherboard::getId, motherboard -> motherboard));
    }

    public Set<Motherboard> filterAndCollect(boolean condition) {
        return motherboards.stream()
                .filter(motherboard -> motherboard.getManufacturer().equals("ASUS")) // Example condition: Manufacturer equals "ASUS"
                .collect(Collectors.toSet());
    }

    public boolean checkAnyMatch(boolean condition) {
        return motherboards.stream()
                .anyMatch(motherboard -> motherboard.getType().equals("Gaming"));// Example condition: Type equals "Gaming"
    }

    public Map<String, List<Motherboard>> groupByManufacturer() {
        return motherboards.stream()
                .collect(Collectors.groupingBy(Motherboard::getManufacturer));
    }
}
