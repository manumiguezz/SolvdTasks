package org.manumiguezz.taskten.collections;

import org.manumiguezz.tasksix.models.ComputerComponent;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerComponentLinkedList<T extends ComputerComponent> {
    private LinkedList<T> components = new LinkedList<>();
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
        components.add(data);
    }

    public List<T> getComponentsByManufacturer(String manufacturer) {
        return components.stream()
                .filter(component -> component.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public long countComponentsByType(Class<?> type) {
        return components.stream()
                .filter(component -> type.isInstance(component))
                .count();
    }

    public List<String> mapComponentNames() {
        return components.stream()
                .map(ComputerComponent::getName)
                .collect(Collectors.toList());
    }

    public T findAnyComponentByCondition(boolean condition) {
        return components.stream()
                .filter(component -> component.getPrice() > 1000)
                .findAny()
                .orElse(null);
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int size() {
        return size;
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
