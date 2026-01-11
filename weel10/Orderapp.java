package weel10;


/**
 * Write a description of class Orderapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orderapp
{
    public static void main (String[] args)
    {
        Order o1=new Order(11,"Ram",778866);
        System.out.println(o1);
        System.out.println(o1.FinalAmount());
        normalOrder n1=new normalOrder(1123,"hari",7766);
        System.out.println(n1);
        System.out.println(n1.FinalAmount());
        premiumOrder p1=new premiumOrder(1145,"subntali",7799966);
        System.out.println(p1);
        System.out.println(p1.FinalAmount(9966));
        
    }
}