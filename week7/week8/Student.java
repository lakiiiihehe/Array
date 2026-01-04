package week7.week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // attributes 
    private String name;
    private int id;
    
    // CONSTRUCTORS
    public Student(String name, int id)
    {
        
    }
    
    //getters and setters method
    // sab ko xuttai hunu paryo with one excess modifier
    
    //SET 
    public void setName(String name)
    {
       this.name= name; 
    }
    
    public String getName()
    {
       return this.name; 
    }
    public void setId(int id)
    {
       this.id= id; 
    }
    
    public int getId()
    {
       return this.id; 
    }
    public void displayInfo()
    {
        int id = getId();
        String name= getName();
        System.out.println("the id is:"+id);
        System.out.println("the name is:"+name);
        
        
        
    }
}