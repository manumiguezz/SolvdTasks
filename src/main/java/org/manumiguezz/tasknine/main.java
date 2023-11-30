package org.manumiguezz.tasknine;

import java.util.function.Function;
import java.util.function.Supplier;

public class main {

    Function<Integer, String> intToString = (num) -> "Number: " + num;

    Supplier<Double> getRandom = () -> Math.random();

}
