
/**
 * Write a description of class w6q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q7
{
    public static void main(String[] args)
    {
        String[][] seat = new String[2][3];
        seat[0][1]="Ocuupy";
        seat[0][2]="Ocuupy";
        seat[0][0]="Ocuupy";
        for(int i=0;i<seat.length;i++)
        {
            
                System.out.print("Seat plan"); 
            for (int j=0;j<seat[i].length;j++)
            {
                if(seat[i][j]!= null)
                {
                    System.out.print("\t"+seat [i][j]+"\t");
                    
                }
                
        
              
             else if(seat[i][j]==null)
             {
                 System.out.print("\tempty\t");
                 
                }
             
              
              
            }
             
            System.out.println("\n");
        }
        
        
       
        
        
        
        
    
    
    
    
    
    }
}