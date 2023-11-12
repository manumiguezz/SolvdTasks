package org.manumiguezz.tasksix.collections;

import org.manumiguezz.tasksix.models.Memory;

import java.util.HashSet;
import java.util.Set;

public class MemoryHashSet {
    private Set<Memory> memories;

    public MemoryHashSet() {
        this.memories = new HashSet<>();
    }

    public void addMemory(Memory memory) {
        memories.add(memory);
    }

    public void deleteMemory(Memory memory) {
        memories.remove(memory);
    }

}