package week9;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountNumber;
    String name;
    double balance;
    
    BankAccount(int accountNumber,String name,double balance)
    {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        this.balance=this.balance+amount;
    
    }
    double getBalance()
    {
        return this.balance;
    }
    
    
}