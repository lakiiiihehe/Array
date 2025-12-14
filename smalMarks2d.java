
/**
 * Write a description of class smalMarks2d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class smalMarks2d
{
    public static void main (String [] args)
    {
        int[][] stud= {{80,75},{80,65}};
        System.out.print("Students\t Nepali \t Maths");
        System.out.println("\n");
        for(int i=0;i<stud.length;i++)
        {
            int s=1;
                int sum=s+i;
                System.out.print("Studen"+sum+":"+""); 
            for (int j=0;j<stud[i].length;j++)
            {
                
        
             System.out.print("\t"+stud[i][j]+"\t"); 
              
              
            }
             
            System.out.println("\n");
        }
      
        
    }
}