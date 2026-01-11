package weel10;


/**
 * Write a description of class app here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class app
{
    public static void main (String[] args)
    {
        science s1= new science(12,"haha",30,1);
        management m1 = new management(23,"kjkj",60,1);
        
        
        System.out.println(s1);
        System.out.println(s1.calculateResult());
        System.out.println(m1);
        System.out.println(m1.calculateResult());
        
    }
}