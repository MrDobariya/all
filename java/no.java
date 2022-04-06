import java.util.Scanner;

public class no
{
   public static void main(String[] args)
   {
      int p=0, n=0, z=0, i;
      int[] arr = new int[10];
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter 10 Numbers : ");

      for(i=0; i<10; i++)
      {
         arr[i] = sc.nextInt();
      }
      
      for(i=0; i<10; i++)
      {
         if(arr[i]<0)
         {
            n++;
         }
         else if(arr[i]>0)
         {
            p++;
         }
         else
         {
            z++;
         }
      }
      
      System.out.println("Total Positive Number: " +p);
      System.out.println("Total Negative Number: " +n);
      System.out.println("Total Zero: " +z);
   }
}