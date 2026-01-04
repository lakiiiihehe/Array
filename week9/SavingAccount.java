package week9;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    double interestrate;
    SavingAccount(int accountNumber,String name,double balance,double interestrate )
    {
       super(accountNumber,name,balance);
       this.interestrate=interestrate;
    }
    double calculateInterest(){
        return balance*interestrate/100;
    }
    
    
}