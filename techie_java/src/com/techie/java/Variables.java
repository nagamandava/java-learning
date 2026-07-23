package com.techie.java;

/**
 * Demonstrates the different types of variables in Java:
 * 1. Local Variable
 * 2. Instance Variable
 * 3. Static (Class) Variable
 */
class Var {

    // Instance variable - each object has its own copy.
    // Scope: Entire class.
    int num4 = 40;

    // Static (Class) variable - shared across all objects.
    // Can be accessed directly using the class name.
    static int num5 = 50;

    public void variablesExample() {

        // Local variables - declared inside a method.
        // Scope: Only within this method.
        int num1 = 20;
        int num2 = 30;
        int num3 = num1 + num2;

        System.out.println("Local Variable (num3): " + num3);
        System.out.println("Instance Variable (num4): " + num4);
        System.out.println("Static Variable (num5): " + num5);
    }
}

public class Variables {

    public static void main(String[] args) {

        // Creating an object to access instance members.
        Var variable = new Var();

        // Calling the method to demonstrate local, instance,
        // and static variables.
        variable.variablesExample();

        // Accessing the static variable using the class name
        // (recommended approach).
        System.out.println("Accessing Static Variable using Class Name: " + Var.num5);
    }
}