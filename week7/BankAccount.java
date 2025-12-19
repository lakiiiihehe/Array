package week7;
import java.util.Scanner;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accNo;
    String name;
    double balance;
    public BankAccount( int n, String name, double b)
    {
        this.accNo = n;
        this.name=name;
        this.balance=b;
    }
    Scanner scan = new Scanner(System.in);
    void deposit()
    {
        System.out.println("Do you want to deposit(y|n)");
        char input =scan.next().charAt(0);
        
        if( input=='y')
        {
        System.out.println("Enter the amount to deposit");
        double amount= scan.nextDouble();
        double afterDeposit = balance+amount;
        System.out.println("Account no:"+accNo);
        System.out.println("Name: "+name);
        System.out.println("The total amount was = Rs"+balance);
        System.out.println("Your total amount is = Rs"+afterDeposit);
        }
        else
        {
            System.out.println("The total amount was = Rs"+balance);
            
        }
        
        
    
        
    }
    void withdraw()
    {
        System.out.println("Do you want to Withdraw(y|n)");
        char input =scan.next().charAt(0);
        
        if( input=='y')
        {
        System.out.println("Enter the amount to withdraw");
        double amount= scan.nextDouble();
        double afterDeposit = balance-amount;
        System.out.println("Account no:"+accNo);
        System.out.println("Name: "+name);
        System.out.println("The total amount was = Rs"+balance);
        System.out.println("Your total amount is = Rs"+afterDeposit);
        }
        else
        {
            System.out.println("The total amount was = Rs"+balance);
            
        }
        
    }
    
}