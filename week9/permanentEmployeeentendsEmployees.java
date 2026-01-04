package week9;


/**
 * Write a description of class permanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class permanentEmployee extends Employees
{
    public int hra;
    public double da;
    
    double calculateTotalSalary()
    {
        double total=this.basicSalary+hra+da+bonus;
    }
}