package com.techie.corejava;

/**
 * Demonstrates different types of method parameters in Java:
 *
 * 1. Actual Parameters (Arguments):
 *    - Values passed when calling a method.
 *
 * 2. Formal Parameters:
 *    - Variables defined in the method declaration that receive values.
 *
 * 3. Method with parameters and return value.
 * 4. Method without parameters and with return value.
 */
class MethodParametersExample {

    /**
     * Method without parameters and without return value.
     * 
     * The variables a and b are local variables.
     * The calculated value is passed to the display() method.
     */
    public void add() {

        int a = 11;
        int b = 22;

        int sum = a + b;
        int value=b+a;

        // Passing sum as an actual parameter (argument)
        display(sum);
        displaySecond(value);
    }

    /**
     * Method without parameters but with return value.
     *
     * @return subtraction result
     */
    public int subtract() {

        int a = 11;
        int b = 22;

        int result = b - a;

        return result;
    }

    /**
     * Method with parameter and return value.
     *
     * @param value formal parameter that receives the value from add()
     * @return the same value
     */
    public void display(int sum) {

        System.out.println("Output from display method: " + sum);

        //return value;
    }
    public int displaySecond(int value) {
    	  System.out.println("Output from displaysecond method: " + value);
        return value;
    }
}


public class MethodParameters {

    public static void main(String[] args) {

        // Creating object to access non-static methods
        MethodParametersExample method = new MethodParametersExample();

        // Calling method without parameters
        method.add();
   

        // Calling method with return value and storing result
        int subtractionResult = method.subtract();

        System.out.println("Subtraction result: " + subtractionResult);

        // Directly printing returned value from method call
        System.out.println("Subtraction result using direct method call: " 
                + method.subtract());
        
    
    }
}