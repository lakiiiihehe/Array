package weel10;


/**
 * Write a description of class saving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class saving extends account
{
    public saving(int no,String name,double balance)
    {
        super(no,name,balance);
    }
 @Override
 public double calculateinterest()
    {
      return super.calculateinterest()*getbalance(); 
    }
}