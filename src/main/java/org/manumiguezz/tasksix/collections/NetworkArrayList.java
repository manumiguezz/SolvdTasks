package org.manumiguezz.tasksix.collections;

import org.manumiguezz.tasksix.models.NetworkAdapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NetworkArrayList {
    private List<NetworkAdapter> networkAdapters;

    public NetworkArrayList() {
        this.networkAdapters = new ArrayList<>();
    }

    public void addNetworkAdapter(NetworkAdapter networkAdapter) {
        networkAdapters.add(networkAdapter);
    }

    public void deleteNetworkAdapter(NetworkAdapter networkAdapter) {
        networkAdapters.remove(networkAdapter);
    }

    public Set<NetworkAdapter> getAllNetworkAdapters() {
        return new HashSet<>(networkAdapters);
    }

    public void clearNetworkAdapters() {
        networkAdapters.clear();
    }

}