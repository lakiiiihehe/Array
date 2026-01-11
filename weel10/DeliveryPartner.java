package weel10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    public DeliveryPartner(int id,String name,double basePay)
    {
        this.partnerId = id;
        this.name= name;
        this.basePay=basePay;
    }
    public void setId(int newid){
        this.partnerId=newid;
    
    }
    public int getId()
    {
        return this.partnerId;
    }
    public void setname(String newname){
        this.name=newname;
    
    }
    public String getname()
    {
        return this.name;
    }
    public void setpay(double newpay){
        this.basePay=newpay;
    
    }
    public double getpay()
    {
        return this.basePay;
    }
    public double calculatePayment(){
        return this.basePay;
    }
    public String toString(){
        return "name;"+this.name;
    }

}