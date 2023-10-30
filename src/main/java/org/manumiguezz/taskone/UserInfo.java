package org.manumiguezz.taskone;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] parameters) {

//      conditional in case not entered information
        if (parameters.length == 3) {

            String firstName = parameters [0];
            String lastName = parameters [1];
            int age = Integer.parseInt(parameters[2]);

            printUserInfo(firstName, lastName, age);

        } else {
            exceptionPrint();
        }
    }

//  printing method
    public static void printUserInfo(String firstName, String lastName, int age) {
        System.out.println("Hi " + firstName + " " + lastName + ", you are " + age + " years old ;)");
    }

//  printing method on not entered information exception
    public static void exceptionPrint() {

//      initializing scanner to get information
        Scanner scanner = new Scanner(System.in);

        System.out.println("_________________________________________");

        System.out.println("Hi! your information wasnt received :(");

        System.out.println("please enter your User info to print");

        System.out.println("_________________________________________");

//      asking for information
        System.out.print("Your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Your age: ");
        int age = scanner.nextInt();

        System.out.println("_________________________________________");

        printUserInfo(firstName, lastName, age);
    }
}
