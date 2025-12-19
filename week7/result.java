package week7;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    double sub1;
    double sub2;
    double sub3;
    
    public result( double s,double u,double b)
    {
    
        this.sub1=s;
        this.sub2=u;
        this.sub3=b;
        
    }
    
    void calc()
    {
        double total= sub1+ sub2+ sub3;
        double percent = total/300 *100;
        System.out.println("the total obtained is:"+total);
        System.out.println("the % obtained is:"+percent);
        
    }
    
}