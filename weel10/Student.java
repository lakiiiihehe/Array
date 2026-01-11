package weel10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int roll;
    private String name;
    private double marks;
    public Student(int roll,String name,double marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public void setroll(int newroll)
    {
        this.roll=newroll;
    }
    public int getroll()
    {
        return this.roll;
    
    }
    public void setname( String newname)
    {
        this.name=newname;
    }
    public String getname()
    {
        return this.name;
    
    }
    public void setmark(double newmark)
    {
        this.marks=newmark;
    }
    public double getmark()
    {
        return this.marks;
    
    }
    public String calculateResult(){
        if(this.marks>40)
        {
            return "pass";
        }
        else{
            return "fail";
        }
    }
}