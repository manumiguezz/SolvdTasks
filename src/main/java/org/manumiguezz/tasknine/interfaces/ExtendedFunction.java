package org.manumiguezz.tasknine.interfaces;

@FunctionalInterface
public interface ExtendedFunction<T, U, V> {
    V apply(T t, U u, String resolution);
}