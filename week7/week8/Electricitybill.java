package week7.week8;


/**
 * Write a description of class Electricitybill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Electricitybill
{
    private String consumerName;
    private int unitsConsumed;
    
    public Electricitybill(String name, int unit)
    {
        this.consumerName = name;
        this.unitsConsumed = unit;
        
    }
    public void setU( )
    {
        
    }
    public int getU(int qua)
    {
        this.unitsConsumed=qua;
        return this.unitsConsumed;
    }
    public double calculateBill()
    {
       int first= 100*5;
       int second = (this.unitsConsumed -100)*8;
       double fi = first +second;
       System.out.println("the total is :"+fi);
       return fi;
       
    }
}