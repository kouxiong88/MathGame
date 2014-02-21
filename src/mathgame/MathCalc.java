/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class contains the methods for the different math operations
 * 
 * @author Tommy Yang, 
 */
public class MathCalc {
    
    /**
     * This method adds the two given integers together
     * @author Tommy Yang
     * @param a Integer to be added with b
     * @param b Integer to be added with a
     * @return The sum of the two values as an integer
     */
    public static int sum(int a, int b) {
        
        int sum = a + b;
        
        return sum;
    }
    
    /**
     * This method multiples the two given integers together
     * @author Tommy Yang
     * @param a Integer to be multiplied with b
     * @param b Integer to be multiplied with a
     * @return The product of the two values as an integer
     */
    public static int product(int a, int b) {
        
        int product = a * b;
        
        return product;
    }

     //Start Code by Tenzin Dhargye
    // method that divide two number.
    public static double mathDiv(double a, double b)
    {
        double answer = a / b; // divide two double variable
        int iAnswer = (int)answer; // type cast the double value answer to integer 
        return iAnswer; // return iAnswer to calling method
    }

    //method that subtract.
    public static int mathSub(int a, int b)
    {
        int answer = a - b; // subtract two double variable
        return answer; // return answer to calling method
    }

    //End Code by Tenzin Dhargye

    
    
}
