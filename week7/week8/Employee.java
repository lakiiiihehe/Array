package week7.week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    public Employee(double salary)
    {
        this.basicSalary=salary;
    }
    public void setSal( double sal)
    {
        this.basicSalary=sal;
    }
    public double getSal()
    {
        return this.basicSalary;
        
    }
     public double bonusSalary()
    {
        double fin = getSal();
        double calc = getSal() *0.20;       
        
        return calc;
    }
}