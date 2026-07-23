package com.techie.java;

/**
 * Demonstrates Java Naming Conventions:
 *
 * 1. Package names:
 *    - Should be lowercase.
 *    - Common format: com.company.project
 *
 * 2. Class names:
 *    - Follow PascalCase (UpperCamelCase).
 *    - First letter of every word should be uppercase.
 *    - Avoid spaces and underscores.
 *    - Use meaningful nouns.
 *
 * 3. Variables:
 *    - Follow camelCase.
 *    - First word starts with lowercase, following words start with uppercase.
 *
 * 4. Methods:
 *    - Follow camelCase.
 *    - Usually represent actions, so use verbs.
 *
 * 5. Constants:
 *    - Use uppercase letters with underscores.
 */
public class NamingConventions {

    // Instance variables follow camelCase naming convention.
    int totalAmount = 50;
    String firstName = "Naga";

    // Constants follow UPPERCASE_WITH_UNDERSCORE convention.
    static final int MAX_USERS = 100;

    /**
     * Method names follow camelCase and usually represent actions.
     */
    public void calculateTotalAmount() {

        int firstAmount = 90;
        int secondAmount = 440;

        int finalAmount = firstAmount + secondAmount;

        System.out.println("Total Amount: " + finalAmount);
    }

    public static void main(String[] args) {

        NamingConventions example = new NamingConventions();

        example.calculateTotalAmount();

        System.out.println("Maximum Users: " + MAX_USERS);
    }
}