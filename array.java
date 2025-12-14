
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array
{
    public static void main(String[] args)
    {
        int [] age; // array declaration
        age = new int[5]; // construct array
        System.out.println(age.length); // checking the legth of array
        // initializing the array
        age[0] =1;
        age[2] =6;
        age[1] =5;
        age[3] =4;
        age[4] =3;
        // asscessind a single element 
        System.out.println(age[2]);
        
        //TRAVERSING AN ARRAY 
        
        int[] agr= {1,2,3,4,5}; //* declaring and inilializing the array 
        
        for(int i=0; i<agr.length; i++)
        {
            
          System.out.println(agr[i]);  
        }
        
        //REVERSING THE ARRAY 
         for(int i=agr.length-1; i>=0; i--)
        {
            
          System.out.println(agr[i]);  
        }

        // 3d array 
        int[][][] matrix;
        matrix = new int[2][3][4];
        
        // 2D ARRAY 
        
        int[][]  mat;
        mat = new int[2][2];
        mat[0][0]=10;
        mat[0][1]=20;
        mat[1][0]=30;
        mat[1][1]=40;
        
        // in one line 
        int[][] matri={{1,2,4},{1,2,5},{1,2,4}};// {}{}{} le rows dekhauxa {1,3,5} le column 
        for(int i=0; i<mat.length; i++)
        {
          for(int j=0; i<mat[i].length; i++)
          {
            System.out.println(matri[i][j]);  
          }
        }
        
    }
}