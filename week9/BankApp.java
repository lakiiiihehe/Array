package week9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args)
    {
        CurrentAccount c1= new CurrentAccount(3444,"ram",10000,5000);
        c1.deposit(5000);
        c1.withdraw(2000);
        System.out.println("total current acc balance = "+c1.getBalance());
        SavingAccount s1= new SavingAccount(3455,"yam",100000,5);
        s1.deposit(5000);
        
        
        System.out.println("total saving acc balance = "+s1.getBalance());
        System.out.println("totalinterest = "+s1.calculateInterest());
        
    }
}