package org.manumiguezz.oop.tasknine.interfaces;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);
}