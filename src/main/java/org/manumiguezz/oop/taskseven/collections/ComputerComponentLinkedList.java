package org.manumiguezz.oop.taskseven.collections;

import org.manumiguezz.oop.taskseven.models.ComputerComponent;

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
    }

    public List<T> getComponentsByManufacturer(String manufacturer) {
        return components.stream()
                .filter(component -> ((ComputerComponent) component).getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
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