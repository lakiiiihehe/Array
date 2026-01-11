package weel10;


/**
 * Write a description of class bapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bapp
{
    public static void main(String[] args)
    {
        current c1 = new current(1222,"ram",8867878);
        saving s1 = new saving(1234,"huhu",72647);
        System.out.println("interest: "+c1.calculateinterest());
        System.out.println("interest: "+s1.calculateinterest());
    }
}