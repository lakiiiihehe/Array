package week7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    String brand;
    int ram;
    double price;


public laptop(String b, int r, double p)
{
    this.brand=b;
    this.ram=r;
    this.price=p;
    
}
void great()
{
    if (ram>8)
    {
        System.out.println(brand);
        System.out.println("RAM :"+ram);
        System.out.println(price);
        
    }
}

}