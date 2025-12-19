package week7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        // <class name> variable name= new classname();
        // OBJECT CREATION
        student s1= new student("77yry", 474,"com"); // students() default niull constructor
        
        s1.study();
        
        System.out.println(s1.collegeID);
        System.out.println(s1.course);
        System.out.println(s1.age);
        
        student s2 = new student("HE6",98,"NEPALI");
       
        s2.laugh();
        
        System.out.println(s2.collegeID);
        System.out.println(s2.course);
        System.out.println(s2.age);
        
        
        /// car 
        car c1 = new car();
        c1.brand="tota";
        c1.price=123456;
        c1.model="attata";
        c1.brak();
        System.out.println(c1.brand);
        System.out.println(c1.price);
        System.out.println(c1.model);
        c1.brak();
        
        car c2 = new car();
        c2.brand="suuuki";
        c2.price=1456;
        c2.model="ata";
        
        System.out.println(c2.brand);
        System.out.println(c2.price);
        System.out.println(c2.model);
        c2.run();
        
        
        
        
        
        
        
        
    }
}