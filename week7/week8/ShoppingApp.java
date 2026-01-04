package week7.week8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args)
    {
       
        ShoppingCart s1 = new ShoppingCart("gobera",634,67);
        s1.getQ();
        s1.calculatetotal();
        s1.calculatedistotal(68);
        s1.displaycart();
        
        
    }
}