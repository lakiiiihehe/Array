package week7.week8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;
    
    public BankAccount(int acc, double bal, String name)
    {
        this.accountNumber=acc;
        this.balance=bal;
        this.name= name;
        
        
    }
    public void setBal(double bal)
    {
        this.balance=bal;
    }
    public double getBal()
    {
        return this.balance;
    }
    
    public void deposit(double amount){
    
        this.balance= this.balance + amount;
        System.out.println("the total balance after deposit is"+this.balance);
    }
    public boolean withdraw(double amt)
    {
        if(amt<this.balance)
        {
            this.balance -= amt; 
            System.out.println("the total balance is"+this.balance);
            return true;
            
            
        }
        else
        {
            System.out.println("the total balance is"+this.balance);
            return false;
        }
       
    }
}