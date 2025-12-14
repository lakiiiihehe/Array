import java.util.Scanner;

/**
 * Write a description of class week6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6
{
    public static void main(String[] args)
    {
      String[] stat={"saroj","Ram","Hari","siran","hihih"};
        for(int i=0;i< stat.length;i++)
        {
            System.out.println(stat[i]);

            
        }
        
        stat[4]="mamagahr";
        System.out.println(stat[2]);
        
        Scanner scan= new Scanner(System.in);
      
        for (int i=0 ;i<stat.length;i++)
        {
            String upd = scan.nextLine();
            stat[i]= upd;
            
            
            
        }
        for (int i=0 ;i<stat.length;i++)
        {
            
            System.out.println(stat[i]);
            
            
        }
        
    }
}