package org.manumiguezz.tasknine.interfaces;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);
}