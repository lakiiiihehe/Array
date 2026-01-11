package weel10;


public class hospitalapp
{
    public static void main(String[] args)
    {
        Person p1=new Person(101,"Sandesh");
        System.out.println(p1);  
        
        doctor d1=new doctor(1,"Suraj","Opthamologist",5000);
        System.out.println(d1); 
        d1.calculateSalary();
        
        System.out.println(d1.calculateSalary(2));
        nurse n1=new nurse(12,"huhu","day",500);
        System.out.println(n1);
        System.out.println(n1.calculateSalary());
    
       
    }
}




