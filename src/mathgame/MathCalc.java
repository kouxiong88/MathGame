package mathgame;

/**
 * This class contains the methods for the different math operations
 * 
 * @author Tommy Yang, Tenzin Dhargye
 */
public class MathCalc {
    
    /**
     * This method adds the two given integers together
     * 
     * @param a Integer to be added with b
     * @param b Integer to be added with a
     * @return The sum of the two values as an integer
     * @author Tommy Yang
     */
    public static int sum(int a, int b) {
        
        int sum = a + b;
        return sum;
    }
    
    /**
     * This method multiples the two given integers together
     * 
     * @param a Integer to be multiplied with b
     * @param b Integer to be multiplied with a
     * @return The product of the two values as an integer
     * @author Tommy Yang
     */
    public static int product(int a, int b) {
        
        int product = a * b;
        return product;
    }


    /**
     * This method divides one number from another
     * It also type casts the result of a double into an integer
     * 
     * @param a Value of numerator
     * @param b Value of denominator
     * @return The quotient of the values as a double
     * @author Tenzin Dhargye
     */
    public static double mathDiv(double a, double b)
    {
        double answer = a / b;
        int iAnswer = (int)answer;
        return iAnswer;
    }


    /**
     * This method subtracts one number from another
     * 
     * @param a Value to be subtracted from
     * @param b Value to subtract from a
     * @return The difference between the two values as an integer
     * @author Tenzin Dhargye
     */
    public static int mathSub(int a, int b)
    {
        int answer = a - b; 
        return answer;
    }


    
    
}
