package weel10;


/**
 * Write a description of class carDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class carDelivery extends DeliveryPartner
{
    private int order;
    
    public carDelivery(int id,String name,double basePay,int order)
    {
        super(id,name,basePay);
        this.order=order;
    }
    public void setorder(int neworder){
        this.order=neworder;
    
    }
    public int getorder()
    {
        return this.order;
    }
    @Override
    public double calculatePayment(){
        double sal= super.calculatePayment()*this.order;
        return sal;
    }
    public double calculatePayment(int extra){
        double sal= super.calculatePayment()*this.order;
        return sal+getpay()*extra;
    }
    public String toString(){
        return "name;"+getname();
    }
    
    
}