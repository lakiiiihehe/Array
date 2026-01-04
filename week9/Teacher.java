package week9;


/**
 * Write a description of class teahcer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    String subject;
    double bonus;

    Teacher(int id, String name, double basicSalary, String subject, double bonus)
    {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }
    //over riding vaneko parent class ko method same child class m ahunu name and parameter 
    
    double calculateAnnualSalary()
    {
        return super.calculateAnnualSalary() + bonus;
    }
}
