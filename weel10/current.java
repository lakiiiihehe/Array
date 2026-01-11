package weel10;


/**
 * Write a description of class current here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class current extends account{

    public current(int no,String name,double balance)
    {
        super(no,name,balance);
    }

 @Override
 public double calculateinterest()
    {
      return super.calculateinterest()*getbalance(); 
    }
}