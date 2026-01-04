package week7.week8;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[] args)
    {
         Student s1 = new Student("lucky",45);
        
        s1.setName("Ljj");
        s1.setId(15);
        System.out.println(s1.getId());
        
        System.out.println(s1.getName());
        s1.displayInfo();
        
    }
}