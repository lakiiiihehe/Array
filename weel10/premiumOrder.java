package weel10;


/**
 * Write a description of class premiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class premiumOrder extends Order
{
  public premiumOrder(int orderId, String name,double amount)
    {
        super(orderId,name, amount);
        
    }
    @Override
    public double FinalAmount()
    {
        return this.amount;
    }
    public double FinalAmount(double discount)
    {
       return super.FinalAmount()-discount;
    }
    public String toString()
    {
        return "id: "+getId()+ " name:"+getName();
    }

}