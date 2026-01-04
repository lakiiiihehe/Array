package week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    double overdraft;
    CurrentAccount(int accountNumber,String name,double balance,double overdraft )
    {
       super(accountNumber,name,balance);
       this.overdraft=overdraft;
    }
    boolean withdraw(double amount)
{
    if (amount <= balance + overdraft)
    {
        balance = balance - amount;
        return true;
    }
    else
    {
        return false;
    }
}

}