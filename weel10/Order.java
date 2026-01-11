package weel10;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Order
{
    private int orderId;
    String customerName;
    double amount;
    public Order(int orderId, String name,double amount)
    {
        this.orderId=orderId;
        this.customerName=name;
        this.amount= amount;
    }
    public void setId(int newid)
    {
        this.orderId=newid;
    }
    public int getId()
    {
        return this.orderId;
    }
     public void seName(String newname)
    {
        this.customerName=newname;
    }
    public String getName()
    {
        return this.customerName;
    }
     public void setAmount(double newamt)
    {
        this.amount=newamt;
    }
    public double getAmount()
    {
        return this.amount;
    }
    public double FinalAmount()
    {
        return this.amount;
    }
    public String toString()
    {
        return "id: "+getId()+ " name:"+getName();
    }
}