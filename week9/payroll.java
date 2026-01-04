package week9;

public class payroll
{
    public static void main(String[] args)
    {
        permanentEmployee pe = new permanentEmployee(101, "Sita", 50000, 8000, 6000);
        pe.calculateBonus();
        pe.displayEmployee();
        System.out.println("Total Salary: " + pe.calculateTotalSalary());

      

        contractEmployee ce = new contractEmployee(102, "Ram", 1500, 20);
        ce.displayEmployee();
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}
