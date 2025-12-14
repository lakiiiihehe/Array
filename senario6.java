import java.util.Scanner;

/**
 * Write a description of class senario6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario6
{
    public static void main(String[] args)
    {
        String[] catagories={"Fiction","Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices= new double[2][1];
        int [][] cat= new int[2][1];
        Scanner scan= new Scanner(System.in);
        for(int i=0 ; i <titles.length;i++)
        {
          for(int j=0;j<titles[i].length;j++)
          {
             System.out.println("Enter the titles");
             titles [i][j]=scan.nextLine(); 
             

             System.out.println("Enter the Price");
             prices [i][j]=scan.nextDouble(); 
             System.out.println("Enter the catagory(0 for fiction|1 for nepali)");
             cat[i][j] =scan.nextInt();
             scan.nextLine(); 
          }
        }
        System.out.print("Title\tPrice\tCatagory");
        System.out.print("\n"); 
        for(int i=0 ; i <titles.length;i++)
        {
          for(int j=0;j<titles[i].length;j++)
          {
             System.out.print(titles[i][j]+"\t");System.out.print(prices[i][j]);
             if(cat[i][j]==0)
             {
               System.out.print("\t"+catagories[0]);  
                 
             }
             else
             {
               System.out.print("\t"+catagories[1]);    
             }
             
        }
        
        System.out.print("\n");        
        
        }
}
}