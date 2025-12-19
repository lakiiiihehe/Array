package week7;
import java.util.Scanner;


/**
 * Write a description of class book1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainmethod
{
    public static void main(String[] args)
    {
        System.out.println("book");
        book b1 = new book();
        b1.title ="ramayan";
        b1.price= 500;
        b1.author="memyself";
        book b2 = new book();
        b2.title ="hariom";
        b2.price= 50;
        b2.author="mself";
        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.author);
        System.out.println(b2.title);
        System.out.println(b2.price);
        System.out.println(b2.author);
        
        System.out.println("");
        System.out.println("Rectamgle");
        recta d1 = new recta();
        d1.length = 14;
        d1.breadth = 19;
        recta d2 = new recta();
        d2.length = 14;
        d2.breadth = 19;
        System.out.println("the length of rectangle one"+d1.length);
        System.out.println("the breadth of rectangle one"+d1.breadth);
        System.out.println("the length of rectangle two"+d2.length);
        System.out.println("the breadth of rectangle two"+d2.breadth);
        d1.area();
        d2.area();
        System.out.println("");

        
        // employee 
        employee e1 = new employee();
        e1.name ="ram";
        e1.salary=674623;
        e1.id=34;
        employee e2 = new employee();
        e2.name ="hari";
        e2.salary=6623;
        e2.id=3;
        employee e3 = new employee();
        e3.name ="ram";
        e3.salary=4623;
        e3.id=4;
        e1.details();
        e2.details();
        e3.details();
        if(e1.salary>e2.salary && e1.salary> e3.salary)
        {
            System.out.println("the highest salary is :"+e1.salary);
        }
        else if(e2.salary>e1.salary && e2.salary> e3.salary)
        {
            System.out.println("the highest salary is :"+e2.salary);
        }
        else
        {
            System.out.println("the highest salary is :"+e3.salary);
        }
        System.out.println("");

        // laptop 
        laptop l1=new laptop("HP",8,34000);
        laptop l2=new laptop("LENOVO",16,109000);
        laptop l3=new laptop("ASUS",32,560000);
        
        l1.great();
        l2.great();
        l3.great();
        System.out.println("");
        
        // moblile 
        mobile m1 = new mobile("samsung", 12000);
        mobile m2 = new mobile("Ramsung", 120000);
        mobile m3 = new mobile("Redmi", 8000);
        
        m1.afford();
        m2.afford();
        m3.afford();
        System.out.println("");
        
        // result
        
        result r1=new result(55,66,99);
        result r2=new result(55,96,99);
        result r3=new result(65,86,79);
        
        r1.calc();
        r2.calc();
        r3.calc();
        System.out.println("");
        
        //senario qn
        Scanner scan = new Scanner(System.in);
        BankAccount a1 = new BankAccount(1234676,"Ram",34566.8);
        BankAccount a2 = new BankAccount(1237889,"huhuh",346789.8);
        
        a1.deposit();
        a2.withdraw();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}