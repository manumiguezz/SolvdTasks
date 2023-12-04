package org.manumiguezz.taskten.collections;

import org.manumiguezz.tasksix.models.ComputerComponent;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComputerComponentLinkedList<T extends ComputerComponent> {
    private Node<T> head;
    private int size;

    public ComputerComponentLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public List<T> getComponentsByManufacturer(String manufacturer) {
        return componentsAsStream()
                .filter(component -> component.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public int size() {
        return size;
    }

    public List<T> collectToList() {
        return componentsAsStream().collect(Collectors.toList());
    }

    public long countComponents() {
        return componentsAsStream().count();
    }

    public boolean anyMatch(Predicate<T> predicate) {
        return componentsAsStream().anyMatch(predicate);
    }

    private LinkedList<T> componentsToList() {
        LinkedList<T> list = new LinkedList<>();
        Node<T> current = head;
        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }
        return list;
    }

    private Stream<T> componentsAsStream() {
        return componentsToList().stream();
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
