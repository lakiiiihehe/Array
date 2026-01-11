package weel10;


/**
 * Write a description of class deliveryapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deliveryapp
{
    public static void main(String[] args)
    {
    DeliveryPartner d1= new DeliveryPartner(12,"pathao",24444);
    carDelivery c1 = new carDelivery(11,"ram",5666,6);
    bikeDelivery b1 = new bikeDelivery(11,"juam",5666,6);
    System.out.println(c1);
    System.out.println(c1.calculatePayment());
    System.out.println(b1);
    
    System.out.println(b1.calculatePayment(6));
    
    
    
}
}