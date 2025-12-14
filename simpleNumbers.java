import java.util.Scanner;

/**
 * Write a description of class simpleNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class simpleNumbers
{
    public static void main(String[] args)
    {
        int [] num ={10,20,30,40,50};
        int sum= 0;
        int avg=0;
        int high=num[0] ;
        int min =num[0];
        for (int i=0 ;i<num.length;i++)
        {
            
            System.out.println(num[i]);
            sum= sum+i;
            avg = sum / num.length;
            if (num[i]>high)
            {
                high=num[i];
            }
            else{}
            if(num[i]<min)
            {
                min= num[i];
            }
            else{}
        
            
        }
        System.out.println("the sum is "+sum);
        System.out.println("the avg is "+avg);
        System.out.println("the min is "+min);
        System.out.println("the high is "+high);
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the numbers of records");
        int a= scan.nextInt();
        int[] arr= new int[a];
        
        for(int i=0; i<arr.length;i++)
        {
           System.out.println("enter the records");
           int input= scan.nextInt();
           arr[i]=input;
            
        
        
        }
        for(int i=0; i<arr.length;i++)
        {
           System.out.println(arr[i]);
           
        
        
        }
    }
}
