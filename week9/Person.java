package week9;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    int id;
    String name ;
    double BasicSalary;
    static String collegename ="Islington";
    Person(int id,String name, double BasicSalary)
    {
       this.id=id;
       this.name=name;
       this.BasicSalary=BasicSalary;

    }
    double calculateAnnualSalary(){
        double annual =BasicSalary*12;
        return annual;
    }
}