package week7.week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private int itemPrice;
    private int quantity;
    public ShoppingCart(String itemName, int itemPrice, int Quantity)
    {
      this.itemPrice = itemPrice;
      this.itemName = itemName;
      this.quantity= quantity;
    }
    public void setQ(int qua)
    {
        
    }
    public int getQ(int qua)
    {
        this.quantity=qua;
        return this.quantity;
    }
    public double calculatetotal()
    {
        int total = this.quantity * this.itemPrice;
       
        System.out.println("the total is"+total);
         return total;
    }
    public double calculatedistotal(int amt)
    {
        int dtotal = this.quantity* this.itemPrice - amt;
       
        System.out.println("the dis total is"+dtotal);
         return dtotal;
    }
    public void displaycart()
    {
        String dis = this.itemName;
        System.out.println(this.itemName);
        
    }
}