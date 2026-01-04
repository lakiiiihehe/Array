package week7.week8;


/**
 * Write a description of class mainmethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainmethod
{
    public static void main(String[] args)
    {
        // invoking and instance method
        calculator calc = new calculator();
        calc.displayInfo();// VOID no parameter
        calc.add(10,30);// actual parameter 
        calc.getFixedNumber();
        // variable can be set for return type
        int fixnumb= calc.getFixedNumber();
        System.out.println("the fix number is"+fixnumb);
        calc.multiply(12,4);
        calculator.square(10);     
    }
}