package org.manumiguezz.taskeleven.collections;

import org.manumiguezz.taskten.models.Motherboard;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
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

    public void useReflection() throws Exception {
        Class<?> motherboardClass = Motherboard.class;

        Field[] fields = motherboardClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
        }

        Constructor<?>[] constructors = motherboardClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
        }

        Method[] methods = motherboardClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
        }

        Constructor<?> constructor = motherboardClass.getConstructor();
        Object motherboardObject = constructor.newInstance();

        Method someMethod = motherboardClass.getDeclaredMethod("someMethod");
        someMethod.invoke(motherboardObject);
    }
}
