package com.techie.java;

/**
 * Demonstrates the difference between
 * non-static methods and static methods in Java.
 */
class Test {

    /**
     * Non-static (instance) method.
     * Requires an object of the class to invoke it.
     */
    public void totalSum() {

        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Total Sum: " + sum);
    }

    /**
     * Static (class) method.
     * Can be invoked using the class name without creating an object.
     */
    public static void totalValue() {

        int a = 30;
        int b = 70;
        int value = b - a;

        System.out.println("Total Value: " + value);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Create an object to call the non-static method.
        Test test = new Test();
        test.totalSum();

        // Call the static method using the class name.
        Test.totalValue();
    }
}