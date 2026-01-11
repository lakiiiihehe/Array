package weel10;


/**
 * Write a description of class science here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class science extends Student
{
    double grace;
    public science(int roll,String name,double marks,double grace)
    {
        super(roll,name,marks);
        this.grace=grace;
        
    }
    public void setgrace(int newgrace)
    {
        this.grace=newgrace ;
    }
    public double getgrace()
    {
        return this.grace;
    
    }
    @Override
    public String calculateResult(){
        if((getmark()+this.grace)>40)
        {
            return "pass";
        }
        else{
            return "fail";
        }
    }
    public String toString()
    {
        return"Name:"+getname();
    }
}