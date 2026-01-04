package week9;

public class contractEmployee extends Employees
{
    public int workingDays;

    public contractEmployee(int employeeId, String name, double dailyWage, int workingDays)
    {
        super(employeeId, name, dailyWage);
        this.workingDays = workingDays;
    }

    double calculateTotalSalary()
    {
        return basicSalary * workingDays;
    }
}
