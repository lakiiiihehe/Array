package weel10;


/**
 * Write a description of class account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class account
{
    private int no;
    private String name;
    private double balance;
    public account(int no,String name,double balance)
    {
        this.no=no;
        this.name=name;
        this.balance=balance;
    }
    public void seno(int newno)
    {
        this.no=newno;
    }
    public int getno()
    {
        return this.no;
    
    }
    public void setname( String newname)
    {
        this.name=newname;
    }
    public String getname()
    {
        return this.name;
    
    }
    public void setbalance(double newbalance)
    {
        this.balance=newbalance;
    }
    public double getbalance()
    {
        return this.balance;
    
    }
    public double calculateinterest()
    {
      return 0.7;  
    }
}