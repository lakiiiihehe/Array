package week7;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    // attributes or proprties 
    String collegeID;
    int age;
    String course;
    // constructor
    
    public student (String collegeID,int agr, String cou)
    {
        this.collegeID= collegeID;
        this.age=agr ;
        this.course= cou; /// mathi j xa tei huna parxa
    }
    
    // behaviour or methods
    
    void study()// it must be a verb like study
    {
        System.out.println(collegeID+"is studing");
    }
    void laugh()
    {
        System.out.println(collegeID+"is laughing");
    }
}