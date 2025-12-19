package week7;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    String brand;
    double price;
    public mobile(String b, double p)
    {
        this.brand=b;
        this.price=p;
    }
    void afford()
    {
        if (price<20000)
        {
            System.out.println(brand);
            System.out.println("the price = "+price);
        }
    }
}