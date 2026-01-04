package week9;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher(1, "Ram", 50000, "Math", 20000);
        System.out.println("Teacher Annual Salary: " + t.calculateAnnualSalary());

        Staff s = new Staff(2, "Sita", 160, 500);
        System.out.println("Staff Salary: " + s.calculateSalary());

        System.out.println("College Name: " + Person.collegename);
    }
}
