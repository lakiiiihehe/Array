package week7.week8;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public void displayInfo()
    {
        System.out.println("Welcome to calc");
    }
    // void return type + params
    public void add(int a, int b)// formal parameter
    {
      System.out.println("The sum of two numbers are:"+(a+b));  
    }
    // int return type no parms
    public int getFixedNumber()
    {
        return 20;
    }
    // return type with params
    public int multiply(int a, int b)
    {
        return a*b;
    }
    
    // static method
    // return type and params
    public static int square(int a)
    {
        return a*a;
    }
}