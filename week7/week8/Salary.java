package week7.week8;


/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public static void main(String[] args)
    {
        Employee e1= new Employee(544254.245);
        e1.getSal();
        System.out.println("the bonus amt is:"+e1.bonusSalary());
        
    }
    
}