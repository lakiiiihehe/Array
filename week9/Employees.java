package week9;

public class Employees
{
    public int employeeId;
    public String name;
    public double basicSalary;
    public double bonus;

    public Employees(int employeeId, String name, double basicSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateBonus()
    {
        bonus = 0.1 * basicSalary;
        return bonus;
    }

    void displayEmployee()
    {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
