package org.manumiguezz;

public class UserInfo {
    public static void main(String[] parameters) {

        if (parameters.length == 3) {

            String firstName = parameters [0];
            String lastName = parameters[1];
            int age = Integer.parseInt(parameters[2]);

            printUserInfo(firstName, lastName, age);

        } else {
            System.out.println("User information wasnt received :(");
        }
    }

    public static void printUserInfo(String firstName, String lastName, int age) {
        System.out.println("Hi " + firstName + " " + lastName + ", you are " + age + "years old ;)");
    }
}
