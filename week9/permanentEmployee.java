package week9;

public class permanentEmployee extends Employees
{
    public int hra;
    public int da;

    public permanentEmployee(int employeeId, String name, double basicSalary, int hra, int da)
    {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateTotalSalary()
    {
        return basicSalary + hra + da + bonus;
    }
}
